class MethodDemo{
    public static void main(String args[]){
        int z = 0;
       // MethodDemo m1 = new MethodDemo();  // Instantiate an object
       // z = MethodDemo.welcome(10, 20);
       z = welcome(10, 20);
        System.out.println("The Value is : " +z);
    }
    static int welcome(int x, int y)
    {
        return (x + y);
        // System.out.println("Welcome Method");
    }
}