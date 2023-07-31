// See https://aka.ms/new-console-template for more information
// Lab1
// Q2 - Datetime applications

Console.WriteLine("Enter a valid date as per the format (DD:MM:YY:hh:mm:ss): ");
string date = Console.ReadLine();

Console.WriteLine("\n Enter # of ticks [10^7 - 9.99 x 10^11]: ");
string ticks = Console.ReadLine();

long tick;
long.TryParse(ticks, out tick);

string[] strSeparator = date.Split(":");

long dt, mth, yr, hr, min, sec;

long.TryParse(strSeparator[0], out dt);
long.TryParse(strSeparator[1], out mth);
long.TryParse(strSeparator[2], out yr);
long.TryParse(strSeparator[3], out hr);
long.TryParse(strSeparator[4], out min);
long.TryParse(strSeparator[5], out sec);

//Bring down to the range 1-99999
tick /= 10000000;

dt += (tick / 3600) / 24;
hr += (tick / 3600) % 24;
min += (tick % 3600) / 60;
sec += (tick % 3600) % 60;

string newDate = dt + ":" + mth + ":" + yr + ":" + hr + ":" + min + ":" + sec;

Console.WriteLine("Old Date: {0} and New Date: {1} with ticks {2}. ", date, newDate, tick * 10000000);

