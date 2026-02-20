public class Factorial{

public static int fact(int num)
{
    if(num==0 || num==1) return 1;
    int factorial=num*fact(num-1);
    return factorial;

}
public static void main(String[] args)
{
    int num=6;
    int ans=fact(num);
    System.out.println("Factorial of "+num+" is "+ ans);
}
}