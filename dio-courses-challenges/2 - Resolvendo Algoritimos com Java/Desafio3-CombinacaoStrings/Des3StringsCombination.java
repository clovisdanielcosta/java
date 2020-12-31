import java.io.IOException;
import java.util.*;
import java.lang.String;

public class StringsCombination {

    public static void main(String[] args) throws IOException {
      
      Scanner reader = new Scanner(System.in,"ISO-8859-1");
       
       while (true) {
        
            int cases = reader.nextInt();
            if (cases == 0) break;

            for (int i = 0; i < cases; i++) {    
      
                String primeiraPalavra = reader
                                            .nextLine()
                                            .trim()
                                            .toLowerCase()
                                            .replaceAll("\n", " ")
                                            .replaceAll("\t", " ");
                
                String segundaPalavra = reader
                                            .nextLine()
                                            .trim()
                                            .toLowerCase()
                                            .replaceAll("\n", " ")
                                            .replaceAll("\t", " ");
            }
            
            int maisLonga = 0;

            List<String> listaRecebida = new ArrayList(Arrays.asList(frase.split(" ")));
            List<String> listaOrdenada = new ArrayList(listaRecebida);
            
            System.out.println(maisLonga);
            System.out.println(primeiraPalvra);
            System.out.println(segundaPalvra);

        }
			    	
    }

}