package Extras;
import java.util.Scanner;
public class Chuva {

	public static void main(String[] args) {
		
		Scanner molham = new Scanner(System.in);
		int VetChuva[] = new int [3];
		int gotas;
		
		System.out.println("Entre com um valor: ");
		gotas = molham.nextInt();
		
		for(int i = 0; i < VetChuva.length; i++)
			if (gotas % 3 == 0) {
				System.out.println("Pling");
			}
			if (gotas % 5 == 0) {
				System.out.println("Plang");
			}
			if (gotas % 7 == 0) {
				System.out.println("Plong");
			}
	}
}