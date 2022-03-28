package Extras;
import java.util.Scanner;
public class Triangulo {

	public static void main(String[] args) {
		int ladoA, ladoB, ladoC;
		Scanner lados = new Scanner (System.in);

		System.out.println("Informe os 3 lados do triangulo:");
		ladoA = lados.nextInt();
		ladoB = lados.nextInt();
		ladoC = lados.nextInt();		
		
		if(ladoA<ladoB+ladoC && ladoB<ladoA+ladoC && ladoC<ladoA+ladoB)
			{
			if(ladoA == ladoB && ladoB == ladoC && ladoC == ladoA)
				System.out.println("EQUILÁTERO");
			else if(ladoA == ladoB || ladoB == ladoC || ladoA == ladoC)
				System.out.println("ISÓCELES");
			else
			System.out.println("ESCALENO");
			}
		else if(ladoA+ladoB==ladoC || ladoB+ladoA==ladoC || ladoC+ladoA==ladoB)
			System.out.println("TRIANGULO DEGENERADO");
		else
			System.out.println("NÃO É TRIANGULO");
	}

}
