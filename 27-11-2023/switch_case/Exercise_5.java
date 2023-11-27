package switch_case;

public class Exercise_5 {

	public static void main(String[] args) throws InterruptedException {
		int time = 0;
		
		do {
			Thread.sleep(1000);

			time++;
			
			switch(time) {
				case 72000 : {
					System.out.println("20h, Abrindo a porta!");
					break;
				}
				
				case 86400 : {
					System.out.println("Meia noite, resetando o temporizador!");
					time = 0;
					break;
				}
				
				default : {
					System.out.println("Se passaram " + time + " segundos!");
					break;
				}
			}
			
		} while(true);
	}

}
