using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;

namespace WcfBlogServiceLibrary
{
    // NOTE: You can use the "Rename" command on the "Refactor" menu to change the interface name "IService1" in both code and config file together.
    [ServiceContract]
    public interface IBlog
    {
        [OperationContract]
        string GetData(int value);

        [OperationContract]
        bool AddUser(string unm, string pass);

        [OperationContract]
        int CheckUser(string unm , string pass);

        
        [OperationContract]
        string AddBlog(MyBlog s);

        [OperationContract]
        List<MyBlog> GetAllBlog();

        [OperationContract]
        List<MyBlog> GetAllMyBlog(string unm);

        [OperationContract]
        MyBlog GetBlogById(int id);

        [OperationContract]
        string UpdateBlog(MyBlog s);

        [OperationContract]
        string DeleteBlog(int id);


        // TODO: Add your service operations here
    }

    // Use a data contract as illustrated in the sample below to add composite types to service operations.
    // You can add XSD files into the project. After building the project, you can directly use the data types defined there, with the namespace "WcfBlogServiceLibrary.ContractType".
    [DataContract]
    public class MyBlog
    {
        int _blogNO;
        string _blogby;
        string _title;
        DateTime _doc;
        string _content;
        int _uid;


        [DataMember]
        public int blogNO
        {
            get { return _blogNO; }
            set { _blogNO = value; }
        }

        [DataMember]
        public int uid
        {
            get { return _uid; }
            set { _uid = value; }
        }

        [DataMember]
        public string title
        {
            get { return _title; }
            set { _title = value; }
        }

        [DataMember]
        public DateTime doc
        {
            get { return _doc; }
            set { _doc = value; }
        }

        [DataMember]
        public string blogby
        {
            get { return _blogby; }
            set { _blogby = value; }
        }
        
        [DataMember]
        public string content
        {
            get { return _content; }
            set { _content = value; }
        }

        
    }

    [DataContract]
    public class User
    {
        int _uid;
        string _username;
        string _password;


        [DataMember]
        public int uid
        {
            get { return _uid; }
            set { _uid = value; }
        }

        [DataMember]
        public string username
        {
            get { return _username; }
            set { _username = value; }
        }

        

        [DataMember]
        public string password
        {
            get { return _password; }
            set { _password = value; }
        }
        

    }
}
