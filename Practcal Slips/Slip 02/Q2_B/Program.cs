using System;

namespace Q2_B
{
    class Department
    {
        string? dept_name;
        public void accept_dept()
        {
            Console.WriteLine("Enter dept name: ");
            dept_name = Console.ReadLine();
        }
        
        public void display_dept()
        {
            Console.WriteLine("Department name: " + dept_name);
        }
    }
    
    class Sales: Department
    {
        int sales;
        public void accept_sales()
        {
            Console.WriteLine("Enter sales: ");
            sales = Convert.ToInt32(Console.ReadLine());
        }
        
        public void display_sales()
        {
            Console.WriteLine("Sales amount: " + sales);
        }
    }
    
    class Human_Resource: Department
    {
        string? empname;
        public void accept_name()
        {
            Console.WriteLine("Enter name of employee: ");
            empname = Console.ReadLine();
        }
        public void display_name()
        {
            Console.WriteLine("Employee name: " + empname);
        }
    }
    
    class Program
    {
        public static void Main (String[] args)
        {
            Sales s = new Sales();
            Human_Resource hr = new Human_Resource();

            hr.accept_name();
            hr.accept_dept();
            s.accept_sales();

            Console.WriteLine("\n---------------------------------------------------------");

            hr.display_name();
            hr.display_dept();
            s.display_sales();
        }
    }    
}
