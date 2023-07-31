using System;
using System.Collections.Generic;
using System.Drawing.Text;
using System.Drawing;
using System.IO;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace L3Q1_Front_Cover
{
    public partial class Magazine : System.Web.UI.Page
    {
        private Style primaryStyle = new Style();
        protected void Page_Load(object sender, EventArgs e)
        {
            if (!this.IsPostBack)
            {
                //Entire collection of fonts

                InstalledFontCollection fontCollection = new InstalledFontCollection();
                FontFamily[] fonts = fontCollection.Families;
                for (int i = 0; i < fonts.Length; i++)
                {
                    dpdFontFam.Items.Add(fonts[i].Name);
                }


                //All colors for font and background

                ListItem item = new ListItem();

                foreach (KnownColor color in Enum.GetValues(typeof(KnownColor)))
                {
                    item = new ListItem(Enum.GetName(typeof(KnownColor), color), color.ToString());
                    dpdBG.Items.Add(item);
                    dpdFontColor.Items.Add(item);
                }


                //Radio Button List for Border Style

                item = new ListItem();
                item.Text = BorderStyle.None.ToString();
                item.Value = ((int)BorderStyle.None).ToString();
                rblBorder.Items.Add(item);

                item = new ListItem();
                item.Text = BorderStyle.Double.ToString();
                item.Value = ((int)BorderStyle.Double).ToString();
                rblBorder.Items.Add(item);

                item = new ListItem();
                item.Text = BorderStyle.Dotted.ToString();
                item.Value = ((int)BorderStyle.Dotted).ToString();
                rblBorder.Items.Add(item);

                item = new ListItem();
                item.Text = BorderStyle.Groove.ToString();
                item.Value = ((int)BorderStyle.Groove).ToString();
                rblBorder.Items.Add(item);

                //Selecting Images from imgs directory inside the c# project
                DirectoryInfo dir = new DirectoryInfo(Server.MapPath("~/imgs"));
                dpdImg.DataSource = dir.GetFiles("*.png");
                dpdImg.DataBind();
            }

        }

        protected void btnSubmit_Click(object sender, EventArgs e)
        {
            //Panel background color
            pnl.BackColor = Color.FromName(dpdBG.SelectedItem.Text);

            pnl.BorderStyle = (BorderStyle)Int32.Parse(rblBorder.SelectedItem.Value);

            //Font details on Label title
            lblTitle.Font.Name = dpdFontFam.SelectedItem.Text;
            lblTitle.Font.Size = FontUnit.Point(Int32.Parse(txtFontSize.Text));
            lblTitle.Text = txtInput.Text;
            primaryStyle.ForeColor = Color.FromName(dpdFontColor.SelectedItem.Text);
            lblTitle.ApplyStyle(primaryStyle);

            //Image
            img.ImageUrl = "~/imgs/" + dpdImg.SelectedItem.Text;
        }

    }
}