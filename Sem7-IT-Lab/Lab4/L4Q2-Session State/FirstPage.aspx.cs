using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace L4Q2_Session_State
{
    public partial class FirstPage : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            if (!this.IsPostBack)
            {
                dpdSub.Items.Add("Maths");
                dpdSub.Items.Add("Physics");
                dpdSub.Items.Add("Chem");
                dpdSub.Items.Add("Bio");
                dpdSub.Items.Add("English");
                dpdSub.Items.Add("Computers");
            }

        }

        protected void dpdSub_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        protected void btnPage1_Click(object sender, EventArgs e)
        {
            Session["Name"] = txtName.Text;
            Session["Roll"] = txtRNO.Text;
            Session["Subject"] = dpdSub.SelectedItem.ToString();

            Response.Redirect("SecondPage.aspx");
        }

    }
}