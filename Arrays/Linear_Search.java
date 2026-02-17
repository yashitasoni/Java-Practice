public class Linear_Search{
    public static int LinearSearch(int[] arr,int key)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key) return i;
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int arr[]={1,3,7,5,99,27,87};
        int key=70;
        int result=LinearSearch(arr,key);
        if(result!=-1)
        {
            System.out.println("Element found at index "+result);
        }
        else{
            System.out.println("Element not found");
        }
    }
}