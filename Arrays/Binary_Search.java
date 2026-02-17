public class Binary_Search{
    public static int BinarySearch(int arr[],int key)
    {
        int left=0;
        int right=arr.length-1;
     
        while(left<=right)
        {
         int mid =(left+right)/2;;
         if(key==arr[mid]) return mid;
         else if(key<arr[mid])
         {
           right=mid-1;
         }
         else 
         {
            left=mid+1;
         }
         
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int arr[]={10,12,45,99,177,200};
        int key=120;
        int result= BinarySearch(arr,key);
        if(result!=-1)
        {
            System.out.println("Element found at index "+result);
        }
        else{
            System.out.println("Element not found");
        }
    }
}