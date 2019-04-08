using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace BlogSystemDotNetClient.Controllers
{
    public class HomeController : Controller
    {
        public ActionResult Index()
        {
            if (Session["uid"]==null)
            {
                return RedirectToAction("Index", "Login");
            }
            return View();
        }

        
    }
}