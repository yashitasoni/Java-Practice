public class Count_the_digits{
    public static void main(String[] args)
    {
        int number=1883758;
        int test=number;
        int count=0;
        while(test!=0)
        {
          test=test/10;
          count++;
        }
        System.out.println("The total number of digits in the number "+number+" is "+count);
    }
}