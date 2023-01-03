package Strings;

import java.util.Locale;

public class Formatando {
    public static void main(String[] args) {
        String original = "abcde FGHI ABC abc DEFG";

        String s01 = original.toLowerCase(); // fazendo todas as letras ficarem minúsculas.
        String s02 = original.toUpperCase(); // Fazendo todas as letras ficarem maiúsculas.
        String s03 = original.trim();       // Vai iliminar os espaços embranco do final da String
        String s04 = original.substring(2); // pega a partir do começo contando o número
        String s05 = original.substring(2,9); // começa no caractere 2 e e vai ate o 9
        String s06= original.replace('a','x');// troca o 1 arg pelo segundo
        String s07= original.replace("abc","xy");
        int i  = original.indexOf("bc"); // busca aprimeira ocorrência da string selecionada e atribui a posição
        int j = original.lastIndexOf("bc");// busca ultima ocorrência da string selecionada e atribui a posição

        System.out.println("Original - " + original+ " -");
        System.out.println("toLowerCase -" + s01+ " -");
        System.out.println("toUpperCase -" + s02+ " -");
        System.out.println("trim -" + s03+ "-");
        System.out.println("substring(2) -" + s04+ " -");
        System.out.println("substring(2),(9) -" + s05+ " -");
        System.out.println("replace('a'),('x') -" + s06+ " -");
        System.out.println("replace('abc'),('xy') -" + s07+ " -");
        System.out.println("Index of 'bc' : " + i);
        System.out.println(" Last index of 'bc' : " + j);

        //SPLITE

        String s = "potato apple lemon";
        String[] vect = s.split(" "); // vai usar o espaço para definir o separador, colocando no vetor
        String word1 = vect[0];
        String word2 = vect[1];
        String word3 = vect[2];

    }
}
