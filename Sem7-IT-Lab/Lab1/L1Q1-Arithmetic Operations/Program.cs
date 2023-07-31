// See https://aka.ms/new-console-template for more information

// See https://aka.ms/new-console-template for more information

// Lab1
// Q1. Arithmetic Operators

Console.WriteLine("Enter a number 'a': ");
string a = Console.ReadLine();
double n1;
double.TryParse(a, out n1);

Console.WriteLine("Enter a number 'b': ");
string b = Console.ReadLine();
double n2;
double.TryParse(a, out n2);

Console.WriteLine("Calculator Application is beginning...");
string choice = "y"; //y = yes, will be used in the below while loop

while (choice == "y")
{
    Console.WriteLine("Press (1) to Add\t (2) to Subtract\t (3) to Multiply\t or (4) to Divide\n");
    string op = Console.ReadLine();

    double result;

    switch (op)
    {
        case "1":
            result = n1 + n2;
            Console.WriteLine("The result is {0}", result);
            break;
        case "2":
            result = n1 - n2;
            Console.WriteLine("The result is {0}", result);
            break;
        case "3":
            result = n1 * n2;
            Console.WriteLine("The result is {0}", result);
            break;
        case "4":
            try
            {
                result = n1 + n2;
                Console.WriteLine("The result is {0}", result);
            }
            catch (DivideByZeroException e)
            {
                Console.WriteLine(e.Message);
            }
            break;
    }

    Console.WriteLine("Press (y) to continue, (q) to quit.");

    choice = Console.ReadLine();
}

Console.WriteLine("End of Lab1 Q1.");
