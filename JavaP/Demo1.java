class Demo1
{
    String msg="";
    int in1 = 0;
    int in2 = 0;
    static int in3;
    static int in4;
    public static void main(String args[]){
        Demo1 d = new Demo1();
        d.welcome();   
        d.Demo1(30, 40);
        Demo2(50,60);
        Demo1 d1 = new Demo1(10,20);
        d1.welcome(); 
        int result = d.Demo1(60, 70, 80);
        System.out.println("The Result is: "+result);
    }
    Demo1() // Override the construtor
    {
        msg = "Hello";
    }
    Demo1(int x, int y) // Parameterized Constructor
    {
        in1 = x;
        in2 = y;
    }
    void Demo1(int x1, int y1)   // simple parameterized Method because of return type
    {
        in1 = x1;
        in2 = y1;
        System.out.println("In Demo1: " +in1+ " - " +in2);
    }
    // Problem is called as Ambiguity problem
    int Demo1(int p, int q, int r){        // Overloading the method (Polymorphism)
        return p + q + r;
    } 
    static void Demo2(int x1, int y1)
    {
        in3 = x1;
        in4 = y1;
        System.out.println("In Demo1: " +in3+ " - " +in4);
    }

    void welcome()
    {
        System.out.println("In Welcome: "+msg+ " In1: " +in1+ " in2: "+in2);
    }
}