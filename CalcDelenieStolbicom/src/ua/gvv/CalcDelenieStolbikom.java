package ua.gvv;

import java.util.ArrayList;

public class CalcDelenieStolbikom {
	
	private int znamenatel, colProbelov, colShtrihov,povtorZikla;
	private String chislitel, resultat,chisloVMasiv;
	private double stepen;
	private ArrayList<String> list =new ArrayList<String>();
	
	public CalcDelenieStolbikom(int a, int b){
		
		System.out.println("Vse zaebis rabotaet"+a+b);
		chislitel = String.valueOf(a);
		znamenatel +=b;
		resultat = String.valueOf(Math.round(a/b));
		colProbelov = chislitel.length();
		povtorZikla = resultat.length();
		colShtrihov = chislitel.length();
		
		for (int i=0;i<povtorZikla;i++){
			
			chisloVMasiv=String.valueOf((Integer.valueOf(String.valueOf(resultat.charAt(i))))*znamenatel);
			list.add(chisloVMasiv);
			System.out.println("Huyok"+list.get(i));
		}
	}
	
}
