import java.io.DataInputStream;

class Getting{
    void get(){
        DataInputStream in = new DataInputStream(System.in);
        int num = 0;
        try {
            System.out.println("ENter the value: ");
            num = Integer.parseInt(in.readLine());
            System.out.println("The enetered value is: "+num);

        } catch (Exception e) {
            //TODO: handle exception
        }
    }

    void m1()
    {

    }
}
class UserInput extends Getting{
    public static void main(String args[]) {
        UserInput u1 = new UserInput();
        u1.get();
    }
    
}