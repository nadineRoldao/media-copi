package br.com.media_copi.impl;

import java.util.Scanner;

public class CalculoMedia {
	
	public static Double calculoMedia(Double atOuRec, Double ac, Double agh) {
		Double media = ((ac * 3) + (agh * 2) + (atOuRec * 5))/10;
		
		if((ac < 0) || (atOuRec < 0) || (agh < 0) || (media < 0)) {
			throw new IllegalArgumentException("As notas não podem ter valores menores que 0");
		}
		
		if((ac > 10) || (atOuRec > 10) || (agh > 10) || (media > 10)){
			throw new IllegalArgumentException("As notas não podem ter valores maiores que 10!");
		}
		
		return media;
	}
	
	public static Double getDouble(String msg) {
		Scanner sc = new Scanner(System.in);	
		Double valor = 0.0;
		
		try{
			System.out.println(msg);
			valor = sc.nextDouble();
			
		}catch(Exception e){
			valor = getDouble(msg);
		}
		
		return valor;
	}
	
	public static boolean isAlunoRec(Double media) {
		if(media < 5.75) {
			return true;
		}
	
		return false;
	}

	public static boolean passou(Double media) {
		// ! - inverte a operação
		return ! isAlunoRec(media);
	}

}

	