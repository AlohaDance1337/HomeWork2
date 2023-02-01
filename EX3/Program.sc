Console.Write("Введите число: ");
String strValue = Console.ReadLine();
int value = Convert.ToInt32(strValue);
if (value < 8)
    if (value < 6 || value == 7 )
    {
        Console.Write("Этот день недели выходной");
    }
    else
    {
        Console.Write("Этот день являестя буднеми");
    }
