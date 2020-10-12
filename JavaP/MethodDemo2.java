class MethodDemo3{
    int x = 20;
    void PrintingValue(){
        System.out.println("Printing a value:");
    }
}

class MethodDemo2 extends MethodDemo3{
    public static void main(String args[]){
        int z = 0;
        MethodDemo2 m1 = new MethodDemo2();
       // z = MethodDemo.welcome(10, 20);
       z = welcome(10, 20);
        System.out.println("The Value is : " +z);
        m1.PrintingValue();
        System.out.println("The parent value is:"+m1.x);
    }
    static int welcome(int x, int y)
    {
        return (x + y);
        // System.out.println("Welcome Method");
    }
}

