// Combinação de strings

/* Crie um algoritmo que receba dois inputs que sejam strings e combine-as alternando as letras de cada string. 

Deve começar pela primeira letra da primeira string, seguido pela primeira letra da segunda string, em seguida pela segunda letra da primeira string e continuar dessa forma sucessivamente.

As letras restantes da cadeia mais longa devem ser adicionadas ao fim da string resultante e retornada. */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder strResult = new StringBuilder();
        String[] strArray;
        String readLine;
        int minLength;

        StringTokenizer st = new StringTokenizer(br.readLine());
        int testCases = Integer.parseInt(st.nextToken());
        
        for (int i = 0; i < testCases; i++) {
            readLine = br.readLine();
            strArray = readLine.split(" ");

            minLength = Math.min(strArray[0].length(), strArray[1].length());

            for (int j = 0; j < minLength; j++) {
                strResult.append(strArray[0], j, j + 1).append(strArray[1], j, j + 1);
            }

            if (strArray[0].length() != strArray[1].length()) {
                if (strArray[0].length() < strArray[1].length()) {
                    strResult.append(strArray[1].substring(minLength));
                } else {
                    strResult.append(strArray[0].substring(minLength));
                }
            }
            System.out.println(strResult);
            strResult.delete(0, strResult.length());
        }
    }
}GFT Quality Assurance #1