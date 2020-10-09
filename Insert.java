import java.util.Scanner;
public class Insert{
	public static void main(String[] args) {
       Insert ob=new Insert();

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
	  //for(int i=0;i<array.length;i++){
	  		//System.out.print("the sorted array:"+array[i]+" ");
	  //	}
	  
        System.out.print("the sorted array:");
        ob.Inserting(array);
	  
	}
	public static void Inserting(int array[]){
         int n = array.length; 
        for (int i = 1; i < n; ++i) { 
            int k = array[i]; 
            int j = i - 1; 
  
            
            while (j >= 0 && array[j] > k) { 
                array[j + 1] = array[j]; 
                j = j - 1;  
            } 
            array[j + 1] = k; 
        } 
         for(int k=0;k<array.length;k++){
	  		System.out.print(" " +array[k]+" ");
	  	}
	  }
	  
}