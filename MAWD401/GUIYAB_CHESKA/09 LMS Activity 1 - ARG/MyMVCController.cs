using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace _09_LMS_Act1_CDG.Controllers
{
    public class MyMVCController : Controller
    {
        // GET: MyMVC
        public ActionResult Welcome(string name, int numTimes = 1)
        {
            ViewBag.Message = "Hello  " + name;
            ViewBag.NumTimes = numTimes;

            return View();
        }
    }
}
//Cheska Denisse D. Guiyab
