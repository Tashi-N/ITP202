public class ArrayList
{
	double full_1over4 = 0.25;
	double full_3over4 = 0.75;
	int arr = 4;
	static int a;
	int remove;
	int top = 0;
	static double length;
	static int Array[];
	public ArrayList()
	{
		Array = new int[arr];
	}
	public void add(int e)
	{
		Array[top] = e;
		top++;
	}
	public void pop()
	{
		top--;
		remove = Array[top];
		Array[top] = 0;
		int count = 0;
		for(int i = 0; i < Array[i]; i++) {
			count++;
		}
		a = count;
		length = (double)a/arr;
		System.out.println("Remove Element " +remove);
	}
	
	public void resize()
	{
		if(length == full_1over4 ) {
			int newArray[] = new int[(arr/2)];
			for(int i = 0; i < (Array.length)/2; i++) {
				newArray[i] = Array[i];
			}
			Array = newArray;
			arr = arr/2;
			for(int n : newArray) {
				System.out.print(n + " ");
				}	
		}
		else if(length == full_3over4) {
			int newArray[] = new int[arr*2];
			for(int i = 0; i < Array.length; i++) {
				newArray[i] = Array[i];
			}
			arr = arr * 2;
			Array = newArray;
			for(int j : newArray) {
			System.out.print(j + " ");
			}
			System.out.println();
		}
		else {
			System.out.println("ArrayIndexOutOfBoundRange");
		}
	}
	public int size()
	{
		return arr;
	}
	public String toString()
	{
		String s = Integer.toString(arr);
		return s;
	}
     
	public static void main(String[] args) {
		ArrayList obj1 = new ArrayList();
		obj1.add(2);
		obj1.add(4);
		obj1.add(6);
		obj1.add(1);
		obj1.pop();
		obj1.resize();
		System.out.println("toString " +obj1.toString());
		System.out.println("The number of elements in the new Array is " +a);
		System.out.println("The Size of new Array is " +obj1.size());
	}
}