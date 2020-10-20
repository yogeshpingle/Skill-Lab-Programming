abstract class Animal{
   // abstract String nm;
    final String nm = "NN";
    abstract void bark(); //undefined method
    void eat()  //defined method
    {
        System.out.println("Both are nonveg");
    }
}

class Dog extends Animal{
//     nm = "Tom";
    void bark()
    {
        System.out.println("Bow Bow"+nm);
    }
}

class Cat extends Animal{
//    nm = "Jerry";
    void bark()
    {
        System.out.println("Mow Mow");
    }
}

class AbstractDemo{
    public static void main(String arg[]){
        Dog d = new Dog();
        d.bark();

        Cat c = new Cat();
        c.bark();

        d.eat();
        c.eat();
    }
}