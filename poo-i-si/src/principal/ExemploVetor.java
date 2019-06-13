package principal;


public class ExemploVetor {

	
	public static void main(String[] args) {
		String[] vetor = new String[5];
		vetor[0] = "10";
		vetor[1] = "20";
		vetor[2] = "30";
		vetor[3] = "40";
		vetor[4] = "50";
		
		System.out.println("Vetor completo");
		for(int i=0; i<vetor.length; i++){
			System.out.println(vetor[i]);
		}
		
		vetor[2] = null;
		System.out.println("Vetor após remoção");
		for(int i=0; i<vetor.length; i++){
			if(vetor[i]!=null) {
				System.out.println(vetor[i]);
			}
		}
	}
}
