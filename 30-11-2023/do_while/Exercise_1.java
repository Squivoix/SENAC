package do_while;

public class Exercise_1 {

	public static void main(String[] args) throws InterruptedException {
		int s = 0, m = 0, h = 0;

		do {
			Thread.sleep(1000);
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
	}

}
