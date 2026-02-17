public class Factorial{
    public static void main(String[] args)
    {
        
        int num=6;
        int test=num;
        int fact=1;
        while(test!=0)
        {
            fact=test*fact;
            test--;
        }
        System.out.println("The factorial of the number "+num+" is "+fact);
    }
}