package finally_throw;

public class Exercise_2 {

	public static void main(String[] args) {
		try {
			
			int s = 0, m = 0, h = 0;
	
			do {
				Thread.sleep(1000);
				
				if(s < 0 || m < 0 || h < 0) {
					throw new IllegalArgumentException("O tempo não pode ser negativo!");
				}
				
				if(h > 2) {
					throw new IllegalArgumentException("O filme não possui mais do que 2 horas!");
				}
				
				s++;
				
				if(s == 60) {
					s = 0;
					m++;
				}
				
				if(m == 60) {
					m = 0;
					h++;
				}
	
				System.out.println(String.format("%sh:%sm:%ss", h, m, s));
			} while(h < 2);
			
			System.out.println("O filme acabou!");
			
		} catch(IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
