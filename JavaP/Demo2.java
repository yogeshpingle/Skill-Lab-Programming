class D1{
    void Demo1(){
        System.out.println("In Class D1");
    }

    void Demo1(int x){
        int z = x;
        System.out.println("In Class D1: "+z);
    }
}

class D2 extends D1{
    void Demo1(){
        System.out.println("In Class D2");
    }
}
            
class Demo2 extends D2{             
    public static void main(String args[]){
        Demo2 d = new Demo2();
        d.Demo1();
        d.Demo1(10);
    }
}