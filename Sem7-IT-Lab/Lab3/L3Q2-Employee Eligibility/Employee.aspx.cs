using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace L3Q2_Employee_Eligibility
{
    public partial class Employee : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            if (!this.IsPostBack)
            {
                dpdID.Items.Add("1001001");
                dpdID.Items.Add("1001002");
                dpdID.Items.Add("1001003");
            }
        }

        protected void dpdID_SelectedIndexChanged(object sender, EventArgs e)
        {
            img.ImageUrl = "~/imgs/" + dpdID.SelectedItem.Text + ".png";
        }

        protected void btnAIE_Click(object sender, EventArgs e)
        {
            DateTime doj = DateTime.Parse(txtDOJ.Text);
            if (DateTime.Now.Subtract(doj).Days > 1825)
            {
                lblMsg.Text = "Yes";
            }
            else
            {
                lblMsg.Text = "No";
            }
        }


    }
}