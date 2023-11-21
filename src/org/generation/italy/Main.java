package org.generation.italy;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int mese;
		String risposta;
		
		do {
			System.out.println("inserisci numero del mese");
			mese=Integer.parseInt(sc.nextLine());			
			
			switch (mese) {
			case 3, 4, 5:
				System.out.println("primavera");
			break;
			
			case 6, 7, 8:
				System.out.println("estate");
				break;
			
			case 9:
			case 10:
			case 11:
				System.out.println("autunno");
				break;
			
			case 12:
				System.out.println("inverno");
				break;
			case 1:
				System.out.println("inverno");
				break;
			case 2:
				System.out.println("inverno");
				break;
				default: 
				System.out.println("mese errato");
				break;
				}
			System.out.println("Vuoi inserire un nuovo mese? (si/no)");
			risposta=sc.nextLine();
		}
		while(risposta.equals("si"));
		System.out.println("ARRIVEDERCI CARO");
		sc.close();
	}

}
