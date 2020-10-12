class Loop1{
    public static void main(String arg[]){
            int i = 2;
            int sum = 0;
            do
            {
                sum = sum + i;
                System.out.println("Sum is: "+sum);
                i = i + 2;     
            }while(i<=10);

            System.out.println("At last the value of sum is:"+sum);
    }
}