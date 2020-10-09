import java.util.Scanner;
public class Selection{
	public static void main(String[] args) {
		Selection obj=new Selection();
		Scanner cin= new Scanner (System.in);
		System.out.print("enter the length of array:");
		int length= cin.nextInt();
        int array[]=new int[length];

		for(int i=0;i<length;i++){
			System.out.print("enter the element");
		    int x =cin.nextInt();
		    array[i]=x;

	  }
	  System.out.print("the unsorted array");
	  for (int j=0;j<array.length ;j++ ) {
	  	System.out.print(" "+array[j]+" ");
	  }
	  System.out.print("the sorted array:");
	  obj.Select(array);
	 }
	  public static void Select(int []array){
	  	for (int i = 0; i <array.length-1;i++)
		{
			int smallest = i;
			for (int j = i+1; j<array.length;j++){
				if (array[j]<array[smallest]){
					smallest=j;
				}
			}

			int snumber = array[smallest];
			array[smallest] = array[i];
			array[i] = snumber;
		}
		for(int k=0;k<array.length;k++){
	  		System.out.print(" " +array[k]+" ");
	  }
	}
}