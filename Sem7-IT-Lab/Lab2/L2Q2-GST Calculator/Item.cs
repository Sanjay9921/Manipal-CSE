using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace L2Q2_GST_Calculator
{

    public delegate void CostEventHandler();

    internal class Item
    {
        private string name;
        public Decimal cost;

        public event CostEventHandler CostEvent;

        public string Name
        {
            get;
            set;
        }

        public Decimal Cost
        {
            get
            {
                return cost;
            }

            set
            {
                if (value < 0)
                {
                    cost = 0;
                    if(CostEvent != null)
                    {
                        CostEvent();
                    }
                }
                else
                {
                    cost = value;
                }
            }
        }
    }

    class Program
    {
        public static void CostNegativeDetected()
        {
            Console.WriteLine("\nYou have entered negative cost. Reminder: Only Positive values allowed. Negative values will be reset to 0\n");
        }

        public static Decimal CalcGst(Decimal cost)
        {
            cost = 8 * cost;
            cost = cost / 100;

            return cost;
        }

        static void Main(string[] args)
        {
            Item item = new Item();
            item.Cost = 100;

            item.CostEvent += CostNegativeDetected;

            Console.WriteLine("Trial1\n");
            Console.WriteLine("Cost: " + item.Cost);
            Console.WriteLine("\nGST is: " + CalcGst(item.Cost));

            Console.WriteLine("--------------------");

            Console.WriteLine("\n\nTrial2\n");
            item.Cost = -10;
            Console.WriteLine("Cost: " + item.Cost);
            Console.WriteLine("\nGST is: " + CalcGst(item.Cost));

        }

    }
}
