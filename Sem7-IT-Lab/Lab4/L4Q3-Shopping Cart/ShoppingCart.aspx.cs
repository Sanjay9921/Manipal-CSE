using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace L4Q3_Shopping_Cart
{
    public partial class FirstPage : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            HttpCookie cookie;

            if (!this.IsPostBack)
            {
                dpdProds.Items.Add("Mobile");
                dpdProds.Items.Add("Laptop");
                dpdProds.Items.Add("Pendrive");

                if (Request.Cookies["Cart"] == null)
                {
                    cookie = new HttpCookie("Cart");
                    cookie["Name"] = "-";
                    cookie["mobile"] = "0";
                    cookie["laptop"] = "0";
                    cookie["pendrive"] = "0";

                    cookie.Expires = DateTime.Now.AddYears(2);

                    Response.Cookies.Add(cookie);
                }
                else
                {
                    cookie = Request.Cookies["Cart"];
                    lblCart.Text = "Welcome back " + cookie["Name"] + "\n";
                    lblCart.Text += "Your shopping cart is as follows: \n";
                    lblCart.Text += "Mobiles: " + cookie["mobile"];
                    lblCart.Text += "\nLaptops: " + cookie["laptop"];
                    lblCart.Text += "\nPendrives: " + cookie["pendrive"];
                }
            }
            else
            {
                cookie = Request.Cookies["Cart"];
                lblCart.Text = "Welcome back " + cookie["Name"] + "\n";
                lblCart.Text += "Your shopping cart is as follows: \n";
                lblCart.Text += "Mobiles: " + cookie["mobile"];
                lblCart.Text += "\nLaptops: " + cookie["laptop"];
                lblCart.Text += "\nPendrives: " + cookie["pendrive"];
            }
        }

        protected void btnSubmit_Click(object sender, EventArgs e)
        {
            HttpCookie cookie = Request.Cookies["Cart"];
            string name = txtName.Text;
            cookie["Name"] = name;

            if (dpdProds.SelectedItem.ToString().Equals("Mobile"))
            {
                cookie["mobile"] = (int.Parse(cookie["mobile"]) + int.Parse(txtQuant.Text)).ToString();
            }
            else if (dpdProds.SelectedItem.ToString().Equals("Laptop"))
            {
                cookie["laptop"] = (int.Parse(cookie["laptop"]) + int.Parse(txtQuant.Text)).ToString(); ;
            }
            else if (dpdProds.SelectedItem.ToString().Equals("Pendrive"))
            {
                cookie["pendrive"] = (int.Parse(cookie["pendrive"]) + int.Parse(txtQuant.Text)).ToString(); ;
            }

            cookie.Expires = DateTime.Now.AddYears(2);

            Response.Cookies.Add(cookie);

            lblCart.Text = "Welcome back " + cookie["Name"] + "\n";
            lblCart.Text += "Your shopping cart is as follows: \n";
            lblCart.Text += "Mobiles: " + cookie["mobile"];
            lblCart.Text += "\nLaptops: " + cookie["laptop"];
            lblCart.Text += "\nPendrives: " + cookie["pendrive"];
        }


    }
}