using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;
using BlogSystemDotNetClient.ServiceReference1;

namespace BlogSystemDotNetClient.Controllers
{
    public class BlogController : Controller
    {
        // GET: Blog
        public ActionResult AddBlog()
        {
            return View();
        }

        public ActionResult Blog(string title , string content , string blogby , string password)
        {
            BlogClient service = new BlogClient();            
            MyBlog stu = new MyBlog();
            stu.blogby = blogby;
            stu.content = content;
            stu.title = title;
            stu.password = password;
            string p=service.AddBlog(stu);
            return View();
        }
        public ActionResult AllBlog()
        {
            BlogClient service = new BlogClient();
            MyBlog[] arr = service.GetAllBlog();
            return View(arr);
        }

        public ActionResult View(string para)
        {
            Int32 id = Int32.Parse(para);
            BlogClient service = new BlogClient();
            MyBlog stu = service.GetBlogById(id);
            return View(stu);
        }

        public ActionResult Update(string updateblogNO )
        {
            Int32 id = Int32.Parse(updateblogNO);
            BlogClient service = new BlogClient();
            MyBlog stu = service.GetBlogById(id);
            return View(stu);
        }

        public ActionResult Delete(string deleteblogNO)
        {
            Int32 id = Int32.Parse(deleteblogNO);
            BlogClient service = new BlogClient();
            string message = service.DeleteBlog(id);
            return View();
        }

        public ActionResult UpdateBlog(string blog , string title , string content )
        {
            
            BlogClient service = new BlogClient();
            MyBlog stu = new MyBlog();
            stu.blogNO = Int32.Parse(blog);
            stu.title = title;
            stu.content = content;
            string mess = service.UpdateBlog(stu);
            return RedirectToAction("Update", new { updateblogNO = blog });
        }

    }
}