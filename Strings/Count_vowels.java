public class Count_vowels
{
    public static void main(String[] args)
    {
    String test ="Hello everyone welcome to the java practice session";
    int vowel_count=0;
     for(int i=0;i<test.length();i++)
     {
        char curr=Character.toLowerCase(test.charAt(i));
       if(curr== 'a' || curr=='e'  || curr=='i'  || curr== 'o' || curr=='u' )
       {
        vowel_count++;
       }
     }
     System.out.println("Total vowel count is "+vowel_count);
    }
}