using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace L2Q1_Item_Class
{
    public delegate void PriceChangedEventHandler(double v);
    
    internal class Item
    {
        private string name;
        public double price;

        public event PriceChangedEventHandler PriceChanged;

        public double Price
        {
            get
            {
                return price;
            }
            set
            {
                price = value;
                if(PriceChanged != null)
                {
                    PriceChanged(value);
                }
            }
        }
    }

    class Program
    {
        static void PriceChangeDetected(double value)
        {
            Console.WriteLine("Price Change Detected! The new price is: " + value);
        }

        static void Main(string[] args)
        {
            double price = 10.0;

            Item item = new Item();

            item.PriceChanged += PriceChangeDetected;

            item.Price = 100.0;
            item.Price = 1000.0;
        }
    }
}
