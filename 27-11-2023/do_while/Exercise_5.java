package do_while;

public class Exercise_5 {

	public static void main(String[] args) throws InterruptedException {
		float a = 0, v = 0, d = 0, dist = 10000;
		
		do {
			Thread.sleep(150);
			
			a++;
			v += a;
			d += v;
			
			System.out.println(String.format("Distância restante: %s", dist - d));
		} while(d < dist);
	}

}
