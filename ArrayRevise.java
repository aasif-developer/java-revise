public class ArrayRevise
{
    public static void main(String[] args) {
        int[] arr={10,8,17,5,7};
        int min =arr[0];
        for(int i=1;i<arr.length;i++)
        {
           if(arr[i]<min)
           min=arr[i];
        }
    System.out.println("SMALLEST NUMBER IS :"+min);

    int[] arr1={10,8,17,5,90};
        int max =arr1[0];
        for(int i=1;i<arr1.length;i++)
        {
           if(arr1[i]>max)
           max=arr1[i];
        }
    System.out.println("LARGEST NUMBER IS :"+max);
    }
}