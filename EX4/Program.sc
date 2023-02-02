Console.Write("Введите число: ");
int number = int.Parse(Console.ReadLine());
int digitsCount = (int)Math.Log10(number) + 1; // всего цифр в числе
int multiplier = (int)Math.Pow(10, digitsCount - 2); // множитель предпоследнего разряда
int result =number % multiplier + number /multiplier /10 * multiplier; // все что справа от разряда + все что слева, делённое на 10
Console.WriteLine(result);
