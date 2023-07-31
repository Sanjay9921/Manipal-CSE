namespace L1Q3_Salary_Performance
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();

            //Comboxes with Levels of Performance
            comboBox1.Items.Add("Level1");
            comboBox1.Items.Add("Level2");
            comboBox1.Items.Add("Level3");
            comboBox1.Items.Add("Level4");
            comboBox1.Items.Add("Level5");
            comboBox1.Items.Add("Level6");
            comboBox1.Items.Add("Level7");
            comboBox1.Items.Add("Level8");
            comboBox1.Items.Add("Level9");
            comboBox1.Items.Add("Level10");

        }

        private void Form1_Load(object sender, EventArgs e)
        {


        }

        private void button1_Click(object sender, EventArgs e)
        {
            //Get the information from the form
            string txtSalary = textBox1.Text;
            string cbLevel = comboBox1.Text.ToString();

            double salary, bonus = 0.0;
            double.TryParse(txtSalary, out salary);

            if (cbLevel == "Level1")
            {
                bonus = 0.1 * salary;
            }
            else if (cbLevel == "Level2" || cbLevel == "Level3" || cbLevel == "Level4")
            {
                bonus = 0.09 * salary;
            }
            else if (cbLevel == "Level5" || cbLevel == "Level6" || cbLevel == "Level7")
            {
                bonus = 0.07 * salary;
            }
            else if (cbLevel == "Level8" || cbLevel == "Level9" || cbLevel == "Level10")
            {
                bonus = 0.05 * salary;
            }

            textBox2.Text = bonus.ToString();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            //Reset all the values
            textBox1.Text = textBox2.Text = "";
            comboBox1.SelectedItem = null;
        }
    }
}