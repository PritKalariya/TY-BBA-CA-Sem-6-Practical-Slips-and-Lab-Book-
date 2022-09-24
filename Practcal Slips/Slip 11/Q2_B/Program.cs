/* 
 * Write C# program to make a class named Fruit with a data member to calculate the number of fruits in a basket.
 * Create two other class named Apples and Mangoes to calculate the number of apples and mangoes in the basket.
 * Display total number of fruits in the basket.
*/


using System;

public class Program
{
    class Fruit
    {
        public int numOfFruits;
        public Fruit(int numOfFruits)
        {
            this.numOfFruits = numOfFruits;
        }
    }
    class Apples : Fruit
    {
        public Apples(int numOfFruits) : base(numOfFruits)
        {
        }
    }

    class Mangoes : Fruit
    {
        public Mangoes(int numOfFruits) : base(numOfFruits)
        {            
        }
    }


    public static void Main()
    {
        Fruit fruit = new Fruit(10);
        Apples apples = new Apples(5);
        Mangoes mangoes = new Mangoes(3);
        Console.WriteLine("Total number of fruits in the basket: " + (fruit.numOfFruits + apples.numOfFruits + mangoes.numOfFruits));
    }
}