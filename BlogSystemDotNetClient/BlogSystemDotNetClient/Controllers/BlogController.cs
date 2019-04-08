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

        public bool Check()
        {
            if(Session["uid"]==null)
            {
                return true;
            }
            return false;
        }

        public ActionResult AddBlog()
        {
            if (Check())
            {
                return RedirectToAction("Index","Login");
            }
            return View();
        }

        public ActionResult Blog(string title , string content , string blogby)
        {
            if (Check())
            {
                return RedirectToAction("Index", "Login");
            }
            BlogClient service = new BlogClient();            
            MyBlog stu = new MyBlog();
            stu.blogby = blogby;
            stu.content = content;
            stu.title = title;
            stu.uid = (int)Session["uid"];
            string p=service.AddBlog(stu);
            return View();
        }
        public ActionResult AllBlog()
        {
            if (Check())
            {
                return RedirectToAction("Index", "Login");
            }
            BlogClient service = new BlogClient();
            MyBlog[] arr = service.GetAllBlog();
            return View(arr);
        }

        public ActionResult AllMyBlog()
        {
            if (Check())
            {
                return RedirectToAction("Index", "Login");
            }
            BlogClient service = new BlogClient();
            String id = (String)Session["unm"];
            MyBlog[] arr = service.GetAllMyBlog(id);
            return View(arr);
        }

        public ActionResult View(string para)
        {
            if (Check())
            {
                return RedirectToAction("Index", "Login");
            }
            Int32 id = Int32.Parse(para);
            BlogClient service = new BlogClient();
            MyBlog stu = service.GetBlogById(id);
            return View(stu);
        }

        public ActionResult ViewMy(string para)
        {
            if (Check())
            {
                return RedirectToAction("Index", "Login");
            }
            Int32 id = Int32.Parse(para);
            BlogClient service = new BlogClient();
            MyBlog stu = service.GetBlogById(id);
            return View(stu);
        }

        public ActionResult Update(string updateblogNO )
        {
            if (Check())
            {
                return RedirectToAction("Index", "Login");
            }
            Int32 id = Int32.Parse(updateblogNO);
            BlogClient service = new BlogClient();
            MyBlog stu = service.GetBlogById(id);
            return View(stu);
        }

        public ActionResult Delete(string deleteblogNO)
        {
            if (Check())
            {
                return RedirectToAction("Index", "Login");
            }
            Int32 id = Int32.Parse(deleteblogNO);
            BlogClient service = new BlogClient();
            string message = service.DeleteBlog(id);
            return View();
        }

        public ActionResult UpdateBlog(string blog , string title , string content )
        {
            if (Check())
            {
                return RedirectToAction("Index", "Login");
            }

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