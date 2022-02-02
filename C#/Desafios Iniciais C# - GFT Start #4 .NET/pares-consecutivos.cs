// Soma de Pares Consecutivos

/* O programa deve ler um valor inteiro D indefinidas vezes, ele só irá parar quando o valor de D for igual a 0. Para cada D lido, imprima a soma dos 5 pares consecutivos a partir de D, inclusive ele mesmo , se for par. Se o valor de entrada for 4, por exemplo, a saída deve ser 40, que é o resultado da operação: 4+6+8+10+12, enquanto que se o valor de entrada for 11, por exempo, a saída deve ser 80, que é a soma de 12+14+16+18+20.

Entrada
O arquivo de entrada contém muitos valores inteiros. O último valor do arquivo é zero.

Saída
Imprima a saida conforme a explicação acima e o exemplo abaixo. */

using System;

namespace DIO {
    class Program {
        static void Main(string[] args) {
            int a = -1;
            while (a != 0) {
                a = int.Parse(Console.ReadLine());
                int i = a;
                int count = 0;
                int sum = 0;
                string str = "";
                while (str != null && a != 0) {
                    i = i + 1;
                    if (i % 2 == 0) {
                        sum = sum + i;
                        count = count + 1;
                    }
                    
                    if (a % 2 == 0 && count == 4) {
                        Console.WriteLine(sum + a);
                        break;
                    }
                    if (a % 2 != 0 && count == 5) {
                        Console.WriteLine(sum);
                        break;
                    }
                }
            }
        }
    }
}