public class collapse{
	public static void main(String[] args){
		int list[] = {1, 2, 3, 4, 5};
		int collapse[] = new int[list.length];
		
		System.out.println(collapse[1]);
		
		for (int n = 0; n > list.length; n++){
				collapse[n] = list[n] + list[n+1];
				n+=1;
		System.out.println(collapse[n]);
		}
	}
}
