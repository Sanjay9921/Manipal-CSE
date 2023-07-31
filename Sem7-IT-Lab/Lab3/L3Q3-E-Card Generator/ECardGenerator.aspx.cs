using System;
using System.Collections.Generic;
using System.Drawing.Text;
using System.Drawing;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace L3Q3_E_Card_Generator
{
    public partial class ECardGenerator : System.Web.UI.Page
    {
        private Style primaryStyle = new Style();

        protected void Page_Load(object sender, EventArgs e)
        {
            if (this.IsPostBack == false)
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

                // Select the first border option.
                rblBorder.SelectedIndex = 0;

                // Set the picture.
                imgDefault.ImageUrl = "defaultpic.png";
            }
        }

        protected void cmdUpdate_Click(object sender, System.EventArgs e)
        {
            // Update the color.
            pnlCard.BackColor = Color.FromName(dpdBG.SelectedItem.Text);

            // Update the font.
            lblGreeting.Font.Name = dpdFontFam.SelectedItem.Text;
            lblGreeting.Font.Size = FontUnit.Point(Int32.Parse(txtFontSize.Text));

            primaryStyle.ForeColor = Color.FromName(dpdFontColor.SelectedItem.Text);
            lblGreeting.ApplyStyle(primaryStyle);

            // Update the border style.
            pnlCard.BorderStyle = (BorderStyle)Int32.Parse(rblBorder.SelectedItem.Value);

            // Update the picture.
            if (chkPicture.Checked == true)
            {
                imgDefault.Visible = true;
            }
            else
            {
                imgDefault.Visible = false;
            }

            // Set the text.
            lblGreeting.Text = txtGreeting.Text;
        }

    }
}