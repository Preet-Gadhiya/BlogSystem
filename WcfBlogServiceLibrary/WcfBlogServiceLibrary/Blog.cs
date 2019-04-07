using System;
using System.Collections.Generic;
using System.Data;
using System.Data.SqlClient;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;

namespace WcfBlogServiceLibrary
{
    // NOTE: You can use the "Rename" command on the "Refactor" menu to change the class name "Service1" in both code and config file together.
    public class Blog : IBlog
    {
        public string GetData(int value)
        {
            return string.Format("You entered: {0}", value);
        }

        

        public int CheckUser(string unm , string pass)
        {
            SqlConnection con = new SqlConnection(@"Data Source=(LocalDB)\MSSQLLocalDB;AttachDbFilename=C:\Users\Rp\Documents\Blog.mdf;Integrated Security=True;Connect Timeout=30");
            con.Open();

            SqlCommand cmd = new SqlCommand(@"SELECT * FROM [User] WHERE username=@username", con);
            cmd.Parameters.AddWithValue("@username", unm);

            cmd.CommandType = CommandType.Text;



            using (SqlDataReader rdr = cmd.ExecuteReader())
            {

                
                if (rdr.Read())
                {
                  if(  rdr.GetString(2) ==  pass )
                    {
                        return rdr.GetInt32(0);
                    }
                    else
                    {
                        return 0;
                    }
                }
            }
            return 1;
            
        }

        public string UpdateBlog(MyBlog s)
        {
            string result = "";


            try
            {

                SqlConnection con = new SqlConnection(@"Data Source=(LocalDB)\MSSQLLocalDB;AttachDbFilename=C:\Users\Rp\Documents\Blog.mdf;Integrated Security=True;Connect Timeout=30");
                SqlCommand cmd = new SqlCommand();

                string Query = @"UPDATE [Table] SET title=@title,content=@content  
                                               WHERE blogNO=@blogNO";

                cmd = new SqlCommand(Query, con);
               

                cmd.Parameters.AddWithValue("@blogNO",s.blogNO);
                cmd.Parameters.AddWithValue("@title", s.title);
                cmd.Parameters.AddWithValue("@content", s.content);
                con.Open();
                cmd.ExecuteNonQuery();
                con.Close();
                result = "Blog Updated Successfully !";
            }
            catch (FaultException fex)
            {
                result = fex.ToString() + "Error:Add Operation Failed";
            }

            return result;
        }

        public string DeleteBlog(int id)
        {
            string result = "";
            try
            {

                SqlConnection con = new SqlConnection(@"Data Source=(LocalDB)\MSSQLLocalDB;AttachDbFilename=C:\Users\Rp\Documents\Blog.mdf;Integrated Security=True;Connect Timeout=30");
                SqlCommand cmd = new SqlCommand();

                string Query = @"DELETE FROM [Table] WHERE blogNO=@blogNO";

                cmd = new SqlCommand(Query, con);


                cmd.Parameters.AddWithValue("@blogNO", id);

                con.Open();
                cmd.ExecuteNonQuery();
                con.Close();
                result = "Blog Deleted Successfully for BLog Number " + id;
            }
            catch (FaultException fex)
            {
                result = "Error:Delete Operation for Blog Number " + id + " Failed.";
            }

            return result;
        }

        public MyBlog GetBlogById(int id)
        {

            MyBlog s = new MyBlog();
            try
            {
                SqlConnection con = new SqlConnection(@"Data Source=(LocalDB)\MSSQLLocalDB;AttachDbFilename=C:\Users\Rp\Documents\Blog.mdf;Integrated Security=True;Connect Timeout=30");
                con.Open();

                SqlCommand cmd = new SqlCommand(@"SELECT * FROM [Table] WHERE blogNO=@blogNO", con);
                cmd.Parameters.AddWithValue("@blogNO", id);

                cmd.CommandType = CommandType.Text;



                using (SqlDataReader rdr = cmd.ExecuteReader())
                {

                    if (rdr.HasRows)
                    {
                        rdr.Read(); // get the first row

                        s.blogNO = rdr.GetInt32(0);
                        s.title = rdr.GetString(1);
                        s.content = rdr.GetString(3);
                        s.blogby = rdr.GetString(4);
                        s.doc = rdr.GetDateTime(2);
                   
                    }
                }



            }
            catch (FaultException fex)
            {
                throw new FaultException<string>("Error:  " + fex);
            }
            return s;
        }
        public string AddBlog(MyBlog s)
        {
            string result = "";
            

            try
            {

                SqlConnection con = new SqlConnection(@"Data Source=(LocalDB)\MSSQLLocalDB;AttachDbFilename=C:\Users\Rp\Documents\Blog.mdf;Integrated Security=True;Connect Timeout=30");
                SqlCommand cmd = new SqlCommand();

                string Query = @"INSERT INTO [Table] (title,doc,blogby,content,uid)  
                                               Values(@title,@doc,@blogby,@content,@uid)";

                cmd = new SqlCommand(Query, con);
                s.doc = DateTime.Now;

                //cmd.Parameters.AddWithValue("@GRNO",s.GRNO);
                cmd.Parameters.AddWithValue("@title", s.title);
                cmd.Parameters.AddWithValue("@doc", s.doc.Date);
                cmd.Parameters.AddWithValue("@blogby", s.blogby);
                cmd.Parameters.AddWithValue("@content", s.content);
                cmd.Parameters.AddWithValue("@uid", s.uid);
                con.Open();
                cmd.ExecuteNonQuery();
                con.Close();
                result = "Blog Added Successfully !";
            }
            catch (FaultException fex)
            {
                result = fex.ToString() + "Error:Add Operation Failed";
            }

            return result;
        }

        public bool AddUser(string unm,string pass)
        {
            SqlConnection con = new SqlConnection(@"Data Source=(LocalDB)\MSSQLLocalDB;AttachDbFilename=C:\Users\Rp\Documents\Blog.mdf;Integrated Security=True;Connect Timeout=30");
            SqlCommand cmd = new SqlCommand();

            string Query = @"INSERT INTO [User] (username,password)  
                                               Values(@username,@password)";

            cmd = new SqlCommand(Query, con);



            cmd.Parameters.AddWithValue("@username", unm);
            cmd.Parameters.AddWithValue("@password", pass);
            con.Open();
            cmd.ExecuteNonQuery();
            con.Close();
            return true;
        }

        public List<MyBlog> GetAllBlog()
        {
            DataSet ds = new DataSet();
            try
            {
                SqlConnection con = new SqlConnection(@"Data Source=(LocalDB)\MSSQLLocalDB;AttachDbFilename=C:\Users\Rp\Documents\Blog.mdf;Integrated Security=True;Connect Timeout=30");

                string Query = "SELECT * FROM [Table]";

                SqlDataAdapter sda = new SqlDataAdapter(Query, con);
                sda.Fill(ds);
            }
            catch (FaultException fex)
            {
                throw new FaultException<string>("Error: " + fex);
            }

            List<MyBlog> objList = new List<MyBlog>();
            foreach (DataRow _dataRow in ds.Tables[0].Rows)
            {
                MyBlog obj = new MyBlog();
                obj.blogNO = Convert.ToInt32(_dataRow["blogNO"]);
                obj.title = Convert.ToString(_dataRow["title"]);
                obj.doc = Convert.ToDateTime(_dataRow["doc"]);
                obj.blogby = Convert.ToString(_dataRow["blogby"]);
                obj.content = Convert.ToString(_dataRow["content"]);
                obj.uid = Convert.ToInt32(_dataRow["uid"]);
                objList.Add(obj);
            }

            return objList;
        }

        public List<MyBlog> GetAllMyBlog(string unm)
        {
            SqlConnection con = new SqlConnection(@"Data Source=(LocalDB)\MSSQLLocalDB;AttachDbFilename=C:\Users\Rp\Documents\Blog.mdf;Integrated Security=True;Connect Timeout=30");
            con.Open();

            SqlCommand cmd = new SqlCommand(@"SELECT * FROM [User] WHERE username=@username", con);
            cmd.Parameters.AddWithValue("@username", unm);

            cmd.CommandType = CommandType.Text;

            int uuid=0;

            using (SqlDataReader rdr = cmd.ExecuteReader())
            {


                if (rdr.Read())
                {
                    uuid=rdr.GetInt32(0); 
                }
            }
            DataSet ds = new DataSet();
            try
            {
                SqlConnection con2 = new SqlConnection(@"Data Source=(LocalDB)\MSSQLLocalDB;AttachDbFilename=C:\Users\Rp\Documents\Blog.mdf;Integrated Security=True;Connect Timeout=30");

                string Query = "SELECT * FROM [Table] WHERE uid=@uid";

                SqlDataAdapter sda = new SqlDataAdapter(Query, con2);
                sda.SelectCommand.Parameters.AddWithValue("@uid",uuid);
                sda.Fill(ds);
            }
            catch (FaultException fex)
            {
                throw new FaultException<string>("Error: " + fex);
            }

            List<MyBlog> objList = new List<MyBlog>();
            foreach (DataRow _dataRow in ds.Tables[0].Rows)
            {
                MyBlog obj = new MyBlog();
                obj.blogNO = Convert.ToInt32(_dataRow["blogNO"]);
                obj.title = Convert.ToString(_dataRow["title"]);
                obj.doc = Convert.ToDateTime(_dataRow["doc"]);
                obj.blogby = Convert.ToString(_dataRow["blogby"]);
                obj.content = Convert.ToString(_dataRow["content"]);
                obj.uid = Convert.ToInt32(_dataRow["uid"]);
                objList.Add(obj);
            }

            return objList;
        }


    }
}
