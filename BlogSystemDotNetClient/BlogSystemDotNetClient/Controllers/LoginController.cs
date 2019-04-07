using BlogSystemDotNetClient.ServiceReference1;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace BlogSystemDotNetClient.Controllers
{
    public class LoginController : Controller
    {
        // GET: Login
        public ActionResult Index()
        {
            return View();
        }
        public ActionResult Register(string problem)
        {
            ViewData["prob"] = problem;
            return View();
        }
        public ActionResult DoLogin(string unm,string pass)
        {
            BlogClient service = new BlogClient();
            int uid = service.CheckUser(unm, pass);
            if (uid!=0)
            {
                Session["unm"] =unm;
                Session["uid"] = uid;
                return RedirectToAction("Index","Home");
            }
            return RedirectToAction("Index");
        }
        public ActionResult DoRegister(string unm,string pass , string repass)
        {
            BlogClient service = new BlogClient();
            if (pass != repass)
            {
                return RedirectToAction("Register");
            }
            bool a =service.AddUser(unm, pass);
            return RedirectToAction("Index");
        }

        public ActionResult Logout()
        {
            return RedirectToAction("Index", "Login");
        }
    }
}