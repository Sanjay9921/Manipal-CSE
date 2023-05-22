using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace L2Q3_Traffice_Delegate
{
    public delegate void TrafficDel();

    internal class TrafficSignal
    {
        public void Red()
        {
            Console.WriteLine("Stop.");
        }

        public void Yellow()
        {
            Console.WriteLine("Wait.....");
        }

        public void Green()
        {
            Console.WriteLine("GO!!!");
        }

    }

    class Program
    {
        static void Main(string[] args)
        {
            TrafficSignal signal = new TrafficSignal();

            Console.WriteLine("Using one del....\n");
            TrafficDel del = new TrafficDel(signal.Red);
            del();

            del = new TrafficDel(signal.Yellow);
            del();

            del = new TrafficDel(signal.Red);
            del();

            Console.WriteLine("\n\nUsing multiple dels...\n");
            TrafficDel red = new TrafficDel(signal.Red);
            TrafficDel yel = new TrafficDel(signal.Yellow);
            TrafficDel grn = new TrafficDel(signal.Green);

            red();
            yel();
            grn();
        }
    }

}
