package Program1;

class Fruit
{
   String name, taste, size;
   void eat()
   {
    System.out.println("Eating Fruits...");
   }
}

class Apple extends Fruit
{
   Apple()
   {
    name = "Apple";
    taste = "sweet and caramelized";
   }

   void eat()
   {
    System.out.println(name + " is "+ taste + " in taste.");
   }
}

class Orange extends Fruit
{
   Orange()
   {
    name = "Orange";
    taste = "sweet-tert";
   }
   void eat()
   {
    System.out.println(name + " is "+ taste + " in taste.");
   }
}

class Solution
{
    public static void main(String args[])
    {
    Apple apple = new Apple();
    Orange orange = new Orange();
    apple.eat();
    orange.eat();
   }
}
