public class Check_Palindrome{
    public static void main(String[] args)
    {
        String test="Madam";
        String rev="";
        for(int i=test.length()-1;i>=0;i--)
        {
            rev+=test.charAt(i);
        }
        if(test.equalsIgnoreCase(rev))
        {
            System.out.println("String is Palindrome");
        }
        else{
            System.out.println("String is not Palindrome");
        }
    }
}