import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class wordIntoNumberPt {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Map <String, Integer> wordNumber= new HashMap <String, Integer>();
		wordNumber.put("ZERO",0);
		wordNumber.put("UM",1);
		wordNumber.put("DOIS", 2);
		wordNumber.put("TRÊS", 3);
		wordNumber.put("QUATRO", 4);
		wordNumber.put("CINCO", 5);
		wordNumber.put("SEIS", 6);
		wordNumber.put("SETE", 7);
		wordNumber.put("OITO", 8);
		wordNumber.put("NOVE", 9);
		wordNumber.put("DEZ", 10);
		wordNumber.put("ONZE", 11);
		wordNumber.put("DOZE", 12);
		wordNumber.put("TREZE", 13);
		wordNumber.put("CATORZE", 14);
		wordNumber.put("QUINZE", 15);
		wordNumber.put("DEZASSEIS", 16);
		wordNumber.put("DEZASSETE", 17);
		wordNumber.put("DEZOITO", 18);
		wordNumber.put("DEZANOVE", 19);
		wordNumber.put("VINTE", 20);
		wordNumber.put("TRINTA", 30);
		wordNumber.put("QUARENTA", 40);
		wordNumber.put("CINQUENTA", 50);
		wordNumber.put("SESSENTA", 60);
		wordNumber.put("SETENTA", 70);
		wordNumber.put("OITENTA", 80);
		wordNumber.put("NOVENTA", 90);
		wordNumber.put("CEM", 100);
		wordNumber.put("DUZENTOS", 200);
		wordNumber.put("TREZENTOS", 300);
		wordNumber.put("QUATROCENTOS", 400);
		wordNumber.put("QUINHENTOS", 500);
		wordNumber.put("SEISCENTOS", 600);
		wordNumber.put("SETECENTOS", 700);
		wordNumber.put("OITOCENTOS", 800);
		wordNumber.put("NOVECENTOS", 900);
		
		// Brazilian version
				wordNumber.put("DEZESSEIS", 16);
				wordNumber.put("QUATORZE", 14);
				wordNumber.put("DEZESSETE", 17);
				wordNumber.put("DEZENOVE", 19);
				wordNumber.put("CINCOENTA", 50);
				
		
		System.out.print("Escreva em extenso um número de 0 a 999: ");
		
		String line = scan.nextLine();
		line = line.toUpperCase();
		line = line.replace(" E ", " ");
		scan.close();
		
		String [] word = line.split(" ");
		
		Integer first = null, second = null, third = null;
		
		first = wordNumber.get(word[0]);
		if (word.length > 1) {
			if (first == null && word[0].equals("CENTO")){
				first = 100;
			}else {
				first = wordNumber.get(word[0]);
			}
			second = wordNumber.get(word[1]);
			
			if (word.length > 2)
				third = wordNumber.get(word[2]);
		}
		
		boolean correct = true;
		
		if (first == null) {
			correct = false;
		} else if (second == null && word.length > 1) {
			correct = false;
		} else if (third == null && word.length > 2) {
			correct = false;
		}
		
		if (correct){
			Integer total = first;
			if (second != null)
				total += second;
			if (third != null)
				total += third;
			
			System.out.println(String.valueOf(total));
		} else {
			
			System.out.println("Ups... Não foi reconhecido.\nEscreva correctamente o número. ");
			}
		}
		

	



}
