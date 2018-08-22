package br.com.media_copi.teste;

import br.com.media_copi.impl.CalculoMedia;

public class TesteMedia {
	
		
		
		public static void main(String[] args) {
			
			Double ac = CalculoMedia.getDouble("Informe o valor da AC:");
				
			Double agh = CalculoMedia.getDouble("Informe o valor da AGH:");
			
			Double at = CalculoMedia.getDouble("Informe o valor da AT:");
			
			Double media = CalculoMedia.calculoMedia(at, ac, agh);
			
			boolean emRecuperacao = CalculoMedia.isAlunoRec(media);
			
			System.out.println("Sua m�dia �: " + media);
			System.out.println();
			
			if(emRecuperacao) {
				System.out.println("Infelizmente voc� ficou de REC... Informe o valor da REC:");
				Double rec = CalculoMedia.getDouble("Informe o valor da REC:");
				
				if(rec > at) {
					media = CalculoMedia.calculoMedia(rec, ac, agh);
				}else {
					System.out.println("A m�dia continua a anterior");
				}	
			}
			System.out.println("Sua m�dia final �: " + media);
			
			boolean passou = CalculoMedia.passou(media);
			if(passou) {
				System.out.println("Voc� foi aprovado!");
			}else {
				System.out.println("Voc� foi reprovado");
			}
			
		}

}
