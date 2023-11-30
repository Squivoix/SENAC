package finally_throw;

public class Exercise_3 {

	public static void main(String[] args) {
		
		try {
			
			float a = 0, v = 0, d = 0, dist = 10000;
			
			do {
				Thread.sleep(150);
				
				a++;
				v += a;
				d += v;
				
				System.out.println(String.format("Distância restante: %s", dist - d));
			} while(d < dist);
			
			if(d > dist) {
				throw new DistanceIsGreaterException("Você ultrapassou a sua distância!");
			} else if (d < dist) {
				throw new DistanceIsShorterException("Você não chegou ao seu destino!");
			}
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (DistanceIsGreaterException e) {
			e.printStackTrace();
		} catch (DistanceIsShorterException e) {
			e.printStackTrace();
		}
		
	}
	
}

