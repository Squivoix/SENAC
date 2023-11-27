package try_catch;

public class Exercise_5 {

	public static void main(String[] args) throws Exception {
		int n = 0;
		
		while(true) {
			System.out.println("Contador: " + n);
			if(n == 100) {
				throw new Exception();
			}			
			n++;
		}
		
	}

}
