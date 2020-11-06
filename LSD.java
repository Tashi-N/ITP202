public class LSD{
	public static void main(String[] args) {
		String []a={"tashi","sonam","karma","jigme","yeshi"};
		int W=5;
		int R=123;
		 int n = a.length;
      String[] aux = new String[n];
      for (int d = W-1; d >= 0; d--)
      { 
         int[] count = new int[R+1];     
         for (int i = 0; i < n; i++)
             count[a[i].charAt(d) + 1]++;
         for (int r = 0; r < R; r++)     
            count[r+1] += count[r];
         for (int i = 0; i < n; i++)     
            aux[count[a[i].charAt(d)]++] = a[i];
         for (int i = 0; i < n; i++)     
            a[i] = aux[i];
        }
       for(int i = 0;i<a.length;i++){
        System.out.println(" "+a[i]);
  }
  }
}