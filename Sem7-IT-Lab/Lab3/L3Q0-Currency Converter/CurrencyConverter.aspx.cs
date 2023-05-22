using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace L3Q0_Currency_Converter
{
    public partial class CurrencyConverter : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            if (!IsPostBack)
            {
                fromCurrencyDropDown.Items.Add(new ListItem("INR", "80.0"));
                fromCurrencyDropDown.Items.Add(new ListItem("Euro", "0.92"));
            }
        }

        protected void SubmitClickedEvent(object sender, EventArgs e)
        {
            string convertedValue = convertCurrency();
            labelAns.Text = convertedValue.ToString();
        }

        string convertCurrency()
        {
            double oldValue = 0;
            double newValue = 0;
            double.TryParse(inputCurrency.Text, out oldValue);

            ListItem temp = fromCurrencyDropDown.Items[fromCurrencyDropDown.SelectedIndex];
            newValue = oldValue * double.Parse(temp.Value);

            string s = oldValue.ToString() + " USD = " + newValue.ToString() + " " + temp.Text;
            return s;
        }
    }
}