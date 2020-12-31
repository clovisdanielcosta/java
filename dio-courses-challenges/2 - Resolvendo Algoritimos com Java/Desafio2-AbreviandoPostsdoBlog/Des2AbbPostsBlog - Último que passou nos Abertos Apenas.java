import java.io.IOException;
import java.util.*;
import java.lang.String;

public class AbbPostsBlog {

    public static void main(String[] args) throws IOException {
      
      Scanner reader = new Scanner(System.in,"ISO-8859-1");
       
      while (true) {
      
        String frase = reader.nextLine();
        
        if(frase.length() > 10000){
        
        	frase = frase
        	        .substring(0, 10000)
            			.trim()
              		.toLowerCase()
                  .replaceAll("\n", " ")
                  .replaceAll("\t", " ");
    
        }else{
  
        	frase = frase
            			.trim()
            			.toLowerCase()
                  .replaceAll("\n", " ")
                  .replaceAll("\t", " ");
		    }
        
        if(frase.equals(".")) break;
        
        List<String> alfabeto = new ArrayList(Arrays.asList("abcdefghijklmnopqrstuvwxyz".split("")));
        List<String> listaRecebida = new ArrayList(Arrays.asList(frase.split(" ")));
        List<String> listaOrdenada = new ArrayList(listaRecebida);
        List<String> listaReversa = new ArrayList(Arrays.asList());
        List<String> listaBubbleSort = new ArrayList(Arrays.asList());     	
        List<String> listaChave = new ArrayList(Arrays.asList());
        List<String> palavrasEscolhidas = new ArrayList(Arrays.asList());
        List<String> listaLetras = new ArrayList(Arrays.asList());       
        
        Collections.sort(listaOrdenada);
        
		//juntando palavras repetidas        
        for (int a = 0; a < listaOrdenada.size(); a++) {

          String elemento = listaOrdenada.get(a);

            for (int b = 1; b < listaOrdenada.size(); b++) {
                if(b < listaOrdenada.size() && listaOrdenada.get(a).equals(listaOrdenada.get(b))) {
					      elemento += listaOrdenada.get(b);
                }
            }
          //Adicionando na lista Reversa   
          listaReversa.add(listaOrdenada.get(a).length()+" "+elemento);
        }
			    	
    	//Ordenando com BubbleSort	
        String trocaPosicao = "";
		for( int c = listaReversa.size() -1; c > 0 ; c--) {
    
            int d = c - 1;
            
            while (d >= 0) {
            
                String atual = listaReversa.get(c);
                String proxima = listaReversa.get(d);

                if(listaReversa.get(c).length() < listaReversa.get(d).length()){
                    trocaPosicao = proxima;
                        listaReversa.set(d, atual);
                        listaReversa.set(c, trocaPosicao);
                }
         
         		d--;
            }
        
        }

		//Invertendo o bubbleSort
        for( int f = listaReversa.size() -1; f >= 0 ; f--) {        	
        	listaBubbleSort.add(listaReversa.get(f));
        }
		
		//Separando palavras para preparar para incluir no listaRecebida
		listaRecebida.clear();
        
        for(int g = 0; g < listaBubbleSort.size(); g++){
        
            String chave = listaBubbleSort.get(g);
            List<String> listaSeparadas = new ArrayList(Arrays.asList(chave.split(" ")));
            int tamanho = Integer.parseInt(listaSeparadas.get(0));
            String novaChave = listaSeparadas.get(1).substring(0, tamanho);
        	listaRecebida.add(novaChave);    
		}
		
		//Escolhendo e abreviando as palavras
        for (int i = 0; i < listaRecebida.size(); i++) {
        	
            for (int j = 0; j < alfabeto.size(); j++) {
            
            	if (listaRecebida.get(i).substring(0,1).equals(alfabeto.get(j))) {
                    alfabeto.remove(j);
                    listaLetras.add(listaRecebida.get(i).substring(0,1));
                    palavrasEscolhidas.add(listaRecebida.get(i));            
                }
            }
        }
       
        Collections.sort(listaLetras);
        Collections.sort(palavrasEscolhidas);
        
        //Substituindo e imprimindo a frase final
        for (int w = 0; w < palavrasEscolhidas.size(); w++) {
        	
            String str1 = palavrasEscolhidas.get(w);
            String str2 = listaLetras.get(w)+".";
      		frase = frase.replaceAll(str1, str2);
            
  		}
        
    	System.out.println(frase);
        System.out.println(listaLetras.size());
    
        //Imprimindo a lista de abreviações e palavras
         palavrasEscolhidas.stream().forEach(palavra -> {
                System.out.println(palavra.substring(0,1) + ". = " + palavra );
		});
     }

  }
  
}
