Console.Write("Введите число: ");
String strValue = Console.ReadLine();
int value = Convert.ToInt32(strValue);
if (value>100)
{
    int s = (value % 100) / 10;
    Console.Write($"Число под третьем номером: {s}");
}
else
{
    Console.Write("У числа отсутствет третья цифра");
}