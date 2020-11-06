public class Linear{
	public static int Linear(int [] a , int key){
	for ( int i=0; i <a.length; i++ ){
		if (a[i]==key){
			return i;
		}
	}
	return -1;
}

	public static void main (String []args){
	int []a = { 4,5,7,8,9,3,2};
	int key = 8;
		System.out.println("number " +key+ " is at index " +Linear(a, key));
}
}