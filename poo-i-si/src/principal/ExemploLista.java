package principal;

import java.util.ArrayList;
import java.util.List;

public class ExemploLista {
	
	public static void main(String[] args) {
		List<String> lista = new ArrayList<String>();
		lista.add("10");
		lista.add("20");
		lista.add("30");
		lista.add("40");
		
		System.out.println("Lista completa");
		for(int i=0; i<lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		lista.remove(2);
		System.out.println("Lista após remoção");
		for(int i=0; i<lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		
	}
}




//public static void main(String args[]) {
//int a = 1;
//int b = 1;
//int result = a+b;
//String label = "resultado: ";
//	
//System.out.println(a+b);
//System.out.println(label + result);
//}

//public static void main(String[] args) {
//double a = 1;
//double b = 5.4;
//
//double result = 0;
//
//if(a>b) {  //if true
//	result  = a/b;
//}else {    //was false
//	result = b/a;
//}
//
//System.out.println("o resultado é: " + result);

//}

//public static void main(String args[]) {
//double result = 1;
//int i = 21;
//for(i=21; i>=1; i--){        //   i-- equivale a i = i - 1
//	result = result * i;
//	System.out.println("resul: " + result + " i: " + i);
//}
//System.out.println("resultado final: " + result);
//}

//public static void doidera() {
//double a = 5.1 + 4.3;
//double b = 4.0 + 5.4;
//
//System.out.println(a);
//System.out.println(b);
//}


//public static void main(String args[]) {
//String[] nossoVetor = new String[10];
//nossoVetor[0] = "10";
//nossoVetor[1] = "20";
//nossoVetor[2] = "30";
//nossoVetor[3] = "40";
//nossoVetor[4] = "50";
//nossoVetor[5] = "60";
//nossoVetor[6] = "70";
//nossoVetor[7] = "80";
//nossoVetor[8] = "90";
//nossoVetor[9] = "100";
//
//System.out.println(nossoVetor[2]);
//}