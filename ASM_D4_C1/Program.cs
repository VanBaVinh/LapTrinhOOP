using System;

namespace PhanSoApp
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.OutputEncoding = System.Text.Encoding.UTF8;

            Console.WriteLine("===== BÀI 1 =====");

            PhanSo psA = new PhanSo(2, 4);
            PhanSo psB = new PhanSo(1, -3);

            Console.WriteLine("2/4 = " + psA);
            Console.WriteLine("1/-3 = " + psB);

            try
            {
                PhanSo psC = new PhanSo(1, 0);
                Console.WriteLine(psC);
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            }

            Console.WriteLine();

            Console.WriteLine("===== BÀI 2 =====");

            PhanSo ps1 = new PhanSo(1, 2);
            PhanSo ps2 = new PhanSo(1, 3);

            Console.WriteLine($"ps1 = {ps1}");
            Console.WriteLine($"ps2 = {ps2}");
            Console.WriteLine($"ps1 + ps2 = {ps1 + ps2}");
            Console.WriteLine($"ps1 - ps2 = {ps1 - ps2}");
            Console.WriteLine($"ps1 * ps2 = {ps1 * ps2}");
            Console.WriteLine($"ps1 / ps2 = {ps1 / ps2}");

            Console.WriteLine();

            Console.WriteLine("===== BÀI 3 =====");

            PhanSo ps3 = new PhanSo(1, 2);
            PhanSo ps4 = new PhanSo(2, 4);
            PhanSo ps5 = new PhanSo(1, 3);

            Console.WriteLine($"ps3 = {ps3}");
            Console.WriteLine($"ps4 = {ps4}");
            Console.WriteLine($"ps5 = {ps5}");

            Console.WriteLine();

            Console.WriteLine($"ps3 == ps4 : {ps3 == ps4}");
            Console.WriteLine($"ps3 != ps5 : {ps3 != ps5}");
            Console.WriteLine($"ps5 < ps3  : {ps5 < ps3}");
            Console.WriteLine($"ps3 > ps5  : {ps3 > ps5}");
        }
    }
}