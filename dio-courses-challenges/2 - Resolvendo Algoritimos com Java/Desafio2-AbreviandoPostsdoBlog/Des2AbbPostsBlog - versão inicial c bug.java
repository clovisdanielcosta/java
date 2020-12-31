import java.util.*;
import java.lang.String;
import java.util.Scanner;
import java.text.Collator;

public class AbbPostsBlog {

    public static void main(String[] args) {

      List<String> alfabeto = new ArrayList(Arrays.asList("abcdefghijklmnopqrstuvwxyz".split("")));
      
      Scanner reader = new Scanner(System.in,"ISO-8859-1");

        String frase = "";
        
        while (true) {
        
            frase = reader.nextLine()
                          .trim()
                          .toLowerCase()
                          .replaceAll("\n", " ")
                          .replaceAll("\t", " ");
            if(frase.equals(".")) break;
      			if(!frase.equals(".")){
            
                List<String> fraseRecebida = Arrays.asList(frase.split(" "));
                String fraseFinal = "";
                String maiorPalavra = fraseRecebida.get(0);
                String abrev = "";
                int cont = 0;

                for (int i = 0; i < fraseRecebida.size(); i++) {

                  int k = i + 1;

                  if (k < fraseRecebida.size()) {

                    String palavraAtual = fraseRecebida.get(i);
                    String palavraSeguinte = fraseRecebida.get(k);

                    int int1 = Collator.getInstance().compare(palavraSeguinte, palavraAtual);
                  
                  	if (int1 > 0) {
                  		maiorPalavra = palavraSeguinte;
                  	}
                  }	
                }
                
                if (maiorPalavra.length() > 2) {
                  abrev = maiorPalavra.substring(0,1) + ".";
                  for (int j = 0; j < fraseRecebida.size(); j++) {
                    if (fraseRecebida.get(j).equals(maiorPalavra)) cont++;
                    fraseFinal = frase.replaceAll(maiorPalavra, abrev);
                  }
                  System.out.println(fraseFinal);
                  System.out.println(cont);
                  System.out.println(abrev + " = " + maiorPalavra);
                }
        	  }
        }
    }
}