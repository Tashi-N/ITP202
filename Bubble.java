import java.util.Scanner;
public class Bubble{
    public static void main(String[] args) {
       Bubble ob=new Bubble();

        Scanner cin= new Scanner (System.in);
        System.out.print("enter the length of array:");
        int length= cin.nextInt();
        int []array=new int[length];

        System.out.print("enter the element");
        for(int i=0;i<length;i++){
            int x =cin.nextInt();
            array[i]=x;

      }
      System.out.print("the unsorted array are:");
      for (int j=0;j<array.length ;j++ ) {
        System.out.print(" "+array[j]+" ");

      }

      
        System.out.print("the sorted array:");
        ob.bubbleSort(array);

      
    }
    void bubbleSort(int array[]) 
    { 
        int n = array.length; 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (array[j] > array[j+1]) 
                { 
                    // swap arr[j+1] and arr[j] 
                    int temp = array[j]; 
                    array[j] = array[j+1]; 
                    array[j+1] = temp; 
                } 
                for (int i=0; i<n; ++i) 
            System.out.print(array[i] + " "); 
            //System.out.println(); 
    } 
  
    /* Prints the array */
    //void printArray(int arr[]) 
    //{ 
        //int n = arr.length; 
        //for (int i=0; i<n; ++i) 
            //System.out.print(arr[i] + " "); 
        //System.out.println(); 
   // } 
}