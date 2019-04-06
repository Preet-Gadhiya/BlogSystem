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
    }
}