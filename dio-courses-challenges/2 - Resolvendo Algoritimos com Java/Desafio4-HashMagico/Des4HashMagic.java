import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class HashMagic {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        
        int cases = reader.nextInt();
        int hash = 0;
        String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int posAlfabeto = 0;
        int elemento = 0;
        int posicaoNaString = 0;

        for ( int i = 0; i < cases; i++){

            int lines = reader.nextInt();

            for (int h = 0; h < lines; h++) {

                String str = reader.nextLine().toUpperCase();

                for (int j = 0; j < str.length(); j++){

                    for ( int k = 0; k < alfabeto.length(); k++) {

                        if (str.substring(j, k+1).equals(alfabeto.substring(k,k+1))) {
                            posAlfabeto = k;
                            posicaoNaString = j;
                        }
                    }
                elemento = h;
                hash = hash + posAlfabeto + elemento + posicaoNaString;
                }
                    
            }

        }
        System.out.println(hash);
        System.out.println(hash);
        System.out.println(hash);

    }

}