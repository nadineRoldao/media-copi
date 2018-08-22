package br.com.media_copi.teste;

import br.com.media_copi.impl.CalculoMedia;

public class TesteMedia {
	
		
		
		public static void main(String[] args) {
			
			Double ac = CalculoMedia.getDouble("Informe o valor da AC:");
				
			Double agh = CalculoMedia.getDouble("Informe o valor da AGH:");
			
			Double at = CalculoMedia.getDouble("Informe o valor da AT:");
			
			Double media = CalculoMedia.calculoMedia(at, ac, agh);
			
			boolean emRecuperacao = CalculoMedia.isAlunoRec(media);
			
			System.out.println("Sua média é: " + media);
			System.out.println();
			
			if(emRecuperacao) {
				System.out.println("Infelizmente você ficou de REC... Informe o valor da REC:");
				Double rec = CalculoMedia.getDouble("Informe o valor da REC:");
				
				if(rec > at) {
					media = CalculoMedia.calculoMedia(rec, ac, agh);
				}else {
					System.out.println("A média continua a anterior");
				}	
			}
			System.out.println("Sua média final é: " + media);
			
			boolean passou = CalculoMedia.passou(media);
			if(passou) {
				System.out.println("Você foi aprovado!");
			}else {
				System.out.println("Você foi reprovado");
			}
			
		}

}
