Console.Write("Введите трехзначное число: ");
String strValue = Console.ReadLine();
int value = Convert.ToInt32(strValue);

int s = (value % 100) / 10;

Console.Write($"Число под вторым номером {s}");