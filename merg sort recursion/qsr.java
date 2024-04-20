import java.util.*;
public class qsr
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        solution(a);
        for(int nums:a)
        {
            System.out.print(nums+ " ");
        }
        
    }
    public static void solution(int arr[]) 
    {
        if(arr == null || arr.length <=1 )
        {
            return ;
        }
        sort(arr, 0 , arr.length -1 );
    }
    public static void sort(int arr[],int start, int end)
    {
        if(start < end)
        {
            int mid = start + (end - start)/2;
            sort(arr, start , mid);
            sort(arr, mid+1, end);
            merge(arr, start, mid, end);
        }
    } 
    public static void merge(int arr[],int start, int mid, int end)
    {
        int temp[]=new int [end-start+1];
        int i=0,j=0,k=0;
        while((i<=mid-start) && (j <= end-(mid+1)))
        {
            if(arr[start+i] < arr[mid+1+j])
            {
                temp [k++]=arr[start+i++];
            }
            else{
                temp [k++] = arr[mid+1+j++];
            }
        }
        while(i <= mid-start)
        {
            temp[k++]=arr[start+i++];
        }
        while(j <= end-(mid+1))
        {
            temp[k++]=arr[mid+1+j++];
        }
        for(int l=0;l<temp.length;l++)
        {
            arr[start+l]=temp[l];
        }
    }    
}