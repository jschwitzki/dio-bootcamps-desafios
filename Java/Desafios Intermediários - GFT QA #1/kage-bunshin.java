// Kage Bunshin no Jutsu

/* Uma das técnicas mais poderosas usadas pelos ninjas, chamada de Kage Bunshin no Jutsu e conhecida também como "Técnica dos clones de sombra", é capas de produzir uma cópia idêntica da pessoa que utilizar essa técnica.

É como uma espécie de mitose, na qual um ninja vira dois, sem possibilidade de diferenciar qual é o original e qual é a cópia.

E por se tratar de uma cópia fidedigna, essa cópia por si só também é capaz de realizar a técnica de clone de sombra e, portanto, se o original e a cópia o fizeram, isso resultaria em 4 ninjas no total. E assim por diante, numa multiplicidade quase infinita a depender da habilidade do ninja.

Há N ninjas diante de você, mas ao invés de contá-los usando seus reflexos, o que seria muito difícil, você irá usar seus conhecimentos em programação para determinar quantos existem. */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        int n ;
        while(sc.hasNext()) {
            n = sc.nextInt();
            System.out.println((int) (Math.log10(n) / Math.log10(2)));
        }
        sc.close();
    }
}