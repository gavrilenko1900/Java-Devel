package ua.gvv;
import java.util.Scanner;

public class Main {
	
	private static int chislitel, znamenatel;
	private static boolean on_off = true;
	
	public static void main(String[] args) {
		
		Scanner sn = new Scanner (System.in);
		
		for (;on_off;){
			System.out.println("Vvedite chislitel:");
			chislitel = sn.nextInt();
			System.out.println("Vvedite znamenatel:");
			znamenatel = sn.nextInt();
			CalcDelenieStolbikom cds = new CalcDelenieStolbikom(chislitel,znamenatel);
			System.out.println("Vu hotite esho zhtoto podelit'?");
			on_off = sn.nextBoolean();
		}
		
		System.out.println("Konez");
	}

}
