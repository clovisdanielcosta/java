// Teste no terminal do W3Schools
//#############################################################
/* RESULTADO DO TESTES DO CÓDIGO
a. abc abc abc
1
a. = abcdef
b. ala h. braga heja t. huja c. e. a. a. huja hoje d. h. h. p.
8
a. = ale
b. = banana
c. = carro
d. = dado
e. = ela
h. = hira
p. = prato
t. = teta
//#############################################################
*/

import java.io.IOException;
import java.util.stream.Collectors;
import java.util.*;

class Main {
    
    public static void main(String[] args) throws IOException {
        
        List<String> alfabeto = new ArrayList(Arrays.asList("abcdefghijklmnopqrstuvwxyz".split("")));
        Scanner sc = new Scanner(System.in,"ISO-8859-1");
        
        String frase = "abcdef abc abc abc";
        int cont = 0;
        
        while(!frase.equals(".")) {
          
          frase = frase.trim()
               .toLowerCase()
               .replaceAll("\n", " ")
               .replaceAll("\t", " ");
                  
          List<String> vetPalavrasFrase = new ArrayList(Arrays.asList(frase.split(" ")));
          Map<String, String> dicionario = new HashMap<String, String>();

          alfabeto.stream().forEach(letra -> {
              
            dicionario.put(letra, "");
            
        });

        Map<String, Map<String, Integer>> repeticaoPalavra = new HashMap<String, Map<String, Integer>>();

        alfabeto.stream().forEach(letra -> {
            
            repeticaoPalavra.put(letra, new HashMap<String, Integer>());
        
        });

        vetPalavrasFrase.stream().forEach(palavra -> {
            
            repeticaoPalavra.get(palavra.substring(0, 1)).put(palavra, 0);
        
        });

        vetPalavrasFrase.stream().forEach(palavra -> {
            
            int qt = repeticaoPalavra.get(palavra.substring(0, 1)).get(palavra);
            qt++;
            repeticaoPalavra.get(palavra.substring(0, 1)).put(palavra, qt);
        
        });


        alfabeto.stream().forEach(letra -> {
            
            Map<String, Integer> map = repeticaoPalavra.get(letra);
            List<String> chaves = new ArrayList<String>(map.keySet());

            int qtTotalCharPorLetra = 0;
            
            for (String chave : chaves) {
                
                qtTotalCharPorLetra += map.get(chave) * chave.length();

            }

            int qtTotalCharMelhorCenario;
            int qtTotalCharMelhorCenarioAux = 10000;

            for (String chave : chaves) { 
                
                qtTotalCharMelhorCenario = (qtTotalCharPorLetra - (map.get(chave) * chave.length())) + (map.get(chave) * 2);
                
                if((qtTotalCharMelhorCenarioAux > qtTotalCharMelhorCenario) && chave.length() > 2) {
                    
                    qtTotalCharMelhorCenarioAux = qtTotalCharMelhorCenario;
                    dicionario.put(letra, chave);
                
                }
            
            }
        
        });

        String fraseAbreviada = vetPalavrasFrase
            .stream()
            .map(palavra -> {

                String primeiraLetra = palavra.substring(0, 1);
                return dicionario.get(primeiraLetra).equals(palavra) ? primeiraLetra + "." : palavra;
            
            }).collect(Collectors.joining(" "));;

            System.out.println(fraseAbreviada);
            int quantidadeAbreviacoes = 0;
            
            for(String letra : alfabeto) {

                if(!dicionario.get(letra).equals("")) {

                    quantidadeAbreviacoes++;
                
                }
            
            }

            System.out.println(quantidadeAbreviacoes);

            alfabeto.stream().forEach(letra -> {
                
                if(!dicionario.get(letra).equals("")) {
                    
                    System.out.println(letra + ". = " + dicionario.get(letra) );
                
                }
            
            });
         	cont = cont + 1;
			if(cont > 1) {
            	frase = ".";
            } else {
            	frase = "Banana ala hira braga heja teta huja carro ela ale ale huja hoje dado hira hira prato";	
			}
        }
        
    }

}