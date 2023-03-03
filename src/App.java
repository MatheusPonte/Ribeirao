import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
      

        int INDICE = 13, SOMA = 0, K = 0;

    while (K < INDICE) {
    K = K + 1;
    SOMA = SOMA + K;
}

   System.out.println(SOMA); // 91

   //questão 2:

   System.out.print("Digite um número inteiro positivo: ");
   int numero = sc.nextInt();

   int anterior = 0;
   int atual = 1;

   while (atual < numero) {
       int proximo = anterior + atual;
       anterior = atual;
       atual = proximo;
   }

   if (atual == numero) {
       System.out.printf("%d pertence à sequência de Fibonacci.", numero);
   } else {
       System.out.printf("%d não pertence à sequência de Fibonacci.", numero);
   }
    }

   // 3 questão :   a) A lógica é adicionar 2 ao número anterior. Portanto, o próximo elemento seria 9
   // b) A lógica é multiplicar o número anterior por 2. Portanto, o próximo elemento seria 128.
   // c) A lógica é elevar o índice atual ao quadrado. Portanto, o próximo elemento seria 49.
   //   d) A lógica é adicionar 12 ao número anterior. Portanto, o próximo elemento seria 100.
   // e) A lógica é somar os dois números anteriores. Portanto, o próximo elemento seria 13.

        //5 questão:

        public class InverteString {
            public static void main(String[] args) {
                Scanner sc= new Scanner(System.in);
        
                System.out.print("Digite a string que deseja inverter: ");
                String string = sc.nextLine();
        
                
                char[] caracteres = string.toCharArray();
        
                for (int i = 0; i < caracteres.length / 2; i++) {
                    char temp = caracteres[i];
                    caracteres[i] = caracteres[caracteres.length - i - 1];
                    caracteres[caracteres.length - i - 1] = temp;
                }
        
                String stringInvertida = new String(caracteres);
        
                System.out.println("String invertida: " + stringInvertida);
            }
        }
   
}
