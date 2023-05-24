using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace L3Q4_Captcha
{
    public partial class Captcha : System.Web.UI.Page
    {
        private int count;

        protected void Page_Load(object sender, EventArgs e)
        {
            if (!this.IsPostBack)
            {
                count = 0;
                ViewState["count"] = count;
                lbl1.Text = "You have 3 attempts remaining.";

                imgCaptcha.ImageUrl = "captcha.jpg";
            }

        }

        protected void btn1_Click(object sender, EventArgs e)
        {
            if (txt2.Text != "gGphJD")
            {
                count = (int)ViewState["count"];
                count += 1;
                ViewState["count"] = count;
                lbl1.Text = "You have " + (3 - count) + " attempts remaining.";
            }
            else
            {
                count = 0;
                ViewState["count"] = count;
                lbl1.Text = "Successful!";
            }

            if (count == 3)
            {
                txt2.Enabled = false;
                lbl1.Text = "You have crossed the maximum attempts (3) !!! ;_;";
            }

        }

    }
}