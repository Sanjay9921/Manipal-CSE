using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace L4Q1_Car_Manufacturer
{
    public partial class FirstPage : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            if (!this.IsPostBack)
            {
                dpdManu.Items.Add("");
                dpdManu.Items.Add("Tesla");
                dpdManu.Items.Add("Mercedes");
                dpdManu.Items.Add("BMW");
            }

        }

        protected void dpdManu_SelectedIndexChanged(object sender, EventArgs e)
        {

            string manu = dpdManu.SelectedItem.ToString();

            if (manu == "Tesla")
            {
                txtModel.Text = "Model S";
            }
            else if (manu == "Mercedes")
            {
                txtModel.Text = "S-Class";
            }
            else if (manu == "BMW")
            {
                txtModel.Text = "Model X1";
            }

            Console.WriteLine("Here");
            Response.Redirect("SecondPage.aspx?Manu=" + dpdManu.SelectedItem.ToString() + "&Model=" + txtModel.Text);
        }

    }
}