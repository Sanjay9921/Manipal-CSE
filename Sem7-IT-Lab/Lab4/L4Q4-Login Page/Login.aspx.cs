using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace L4Q4_Login_Page
{
    public partial class Login : System.Web.UI.Page
    {
        private int count;
        protected void Page_Load(object sender, EventArgs e)
        {
            if (!this.IsPostBack)
            {
                Session["login_success"] = 0;
                Application["login_fail"] = 0;
            }
        }

        protected void btnLogin_Click(object sender, EventArgs e)
        {
            string uname = txtUName.Text;
            string pswd = txtPswd.Text;

            if (uname.Equals("seanprobe@hotmail.com") && pswd.Equals("1729DamDasCrazy"))
            {
                count = (int)Session["login_success"];
                count += 1;
                Session["login_success"] = count;
                Application["login_fail"] = 0;

                lblLoginCnt.Text = "You have logged in successfully! Login count: " + count.ToString();
                lblLoginCnt.ForeColor = System.Drawing.Color.Green;
            }
            else
            {
                count = (int)Application["login_fail"];
                count++;

                lblLoginCnt.Text = "Username and password mismatch! You have: " + (3 - count).ToString() + " attempts left!";
                lblLoginCnt.ForeColor = System.Drawing.Color.Red;

                Application["login_fail"] = count;
                if (count == 3)
                {
                    txtUName.Enabled = false;
                    txtPswd.Enabled = false;
                }
            }
        }
    }
}