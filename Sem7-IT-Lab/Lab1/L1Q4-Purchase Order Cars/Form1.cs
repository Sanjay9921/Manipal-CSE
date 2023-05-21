namespace L1Q4_Purchase_Order_Cars
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();

            //Car Names
            comboBox1.Items.Add("Lamborghini");
            comboBox1.Items.Add("Bugatti");
            comboBox1.Items.Add("Mercedes-Benz");

            //Colors
            comboBox2.Items.Add("White");
            comboBox2.Items.Add("Black");
            comboBox2.Items.Add("Red");
            comboBox2.Items.Add("Blue");
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            
        }

        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
            //ADds Model Names for the car selected
            string cbCar = comboBox1.Text.ToString();

            //Clear the Model list and Price text box
            listBox1.Items.Clear();
            textBox1.Text = "";

            if (cbCar == "Lamborghini")
            {
                listBox1.Items.Add("Aventador");
                listBox1.Items.Add("Urus");
                listBox1.Items.Add("Huracan");
            }
            else if (cbCar == "Bugatti")
            {
                listBox1.Items.Add("Veyron");
                listBox1.Items.Add("Chiron");
                listBox1.Items.Add("Divo");
            }
            else if (cbCar == "Mercedes-Benz")
            {
                listBox1.Items.Add("S-Class");
                listBox1.Items.Add("A-Class");
                listBox1.Items.Add("E-Class");
            }
        }

        private void listBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
            int model = listBox1.SelectedIndex;
            string price = "0.0";

            if (model == 0)
            {
                price = "10,000,000";
            }
            else if (model == 1)
            {
                price = "8,000,000";
            }
            else if (model == 2)
            {
                price = "5,000,000";
            }

            textBox1.Text = price;
        }

        private void button1_Click(object sender, EventArgs e)
        {
            //Confirm the purchase
            string car = comboBox1.Text.ToString();
            string model = listBox1.Text.ToString();
            string color = comboBox2.Text.ToString();
            string price = textBox1.Text;

            label5.Text = "Thank you for purchasing " + car + " for $" + price + "! Your model is " + model + " and color is " + color + ".";
        }

        private void button2_Click(object sender, EventArgs e)
        {
            //Reset all fields
            comboBox1.SelectedItem = comboBox2.SelectedItem = listBox1.SelectedItem = null;
            label5.Text = "";
        }
    }
}