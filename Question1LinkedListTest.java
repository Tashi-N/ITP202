public class Question1LinkedListTest
{
	public static void main(String[] args)
    {
		Q1linklist obj = new Q1linklist();
		obj.push(2);
		obj.push(4);
		obj.push(1);
		assert(obj.isEmpty() == false);
		assert(obj.size() == 2);
		System.out.println(obj.isEmpty());
		System.out.println(obj.pop());
		System.out.println(obj.size());
		System.out.println("All are successfully tested!");
	}
}
