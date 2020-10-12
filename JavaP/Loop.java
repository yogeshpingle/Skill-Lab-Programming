class Loop{
    public static void main(String args[])
    {
        int i = Integer.parseInt(args[0]);

//        while(i<=10)
  //      {
            if((i%2) == 0)
            {
                System.out.println("The Value of i is:" +i);
                System.out.println("The Number is Even");
            }
            else
            {
                System.out.println("The Number is ODD: "+i);
            }
      //      i = i + 1;
    //    }
    }
}