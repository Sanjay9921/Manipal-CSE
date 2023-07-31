using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace L4Q2_Session_State
{
    public partial class SecondPage : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

            lblFirst.Text = "Name: " + Session["Name"] + "\n";
            lblFirst.Text += "\nRoll: " + Session["Roll"] + "\n";
            lblFirst.Text += "\nSubject: " + Session["Subject"] + "\n";

            HttpCookie cookie = new HttpCookie("CookieTest");

            cookie["counter"] = "0";
            //cookie["test"] = "1";
            lblCounter.Text = "0";

            Response.Cookies.Add(cookie);

        }

        protected void btnSecond_Click(object sender, EventArgs e)
        {
            HttpCookie cookie = Request.Cookies["CookieTest"];
            if (cookie != null)
            {
                int counter = int.Parse(cookie["counter"]);
                counter += 1;
                cookie["counter"] = counter.ToString();

                Response.Cookies.Add(cookie);

                lblCounter.Text = cookie["counter"];
            }

        }

    }
}