using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace L4Q1_Car_Manufacturer
{
    public partial class SecondPage : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            lblManu.Text = "The manufacturer is: " + Request.QueryString["Manu"] + " and the model is: " + Request.QueryString["Model"];
        }
    }
}