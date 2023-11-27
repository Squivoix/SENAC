package do_while;

public class Exercise_4 {

	public static void main(String[] args) {
		double[] prices = {12, 13.99f, 15.45f, 29.99f, 30, 399.98f, 425.75f}; 
		double sum = 0;
		
		int i = 0;
		
		while(i < prices.length) {
			sum += prices[i];
			
			i++;
		}
		
		System.out.println(String.format("O valor total dos itens é: R$%.2f", sum));
	}

}
