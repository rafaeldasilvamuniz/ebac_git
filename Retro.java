/*Exercício 1:*/

package retrocesso;

import java.util.Scanner;

public class Retro {

    public static void subconjuntos(int[] x) {

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                if (i != j && j > i) {
                    System.out.print("{" + x[i] + "," + x[j] + "}");
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        //n--> número de elementos
        System.out.print("Insira o nº de elementos do conjunto: ");
        int n = keyboard.nextInt();

        int[] X = new int[n];

        System.out.println("Insira os valores do conjunto: ");

        for (int i = 0; i < X.length; i++) {
            System.out.print((i + 1) + "º Elemento ");
            X[i] = keyboard.nextInt();
        }

        subconjuntos(X);
    }
}


/*Exercicio 2:*/

package retrocesso;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Troco {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    double conta, pago;

    try {
      System.out.printf("Informe o Valor da Conta: ");
      conta = ler.nextDouble();

      System.out.printf("Informe o Valor Pago....: ");
      pago = ler.nextDouble();

      System.out.printf("%s", calculaTroco(conta, pago));
    }
    catch (InputMismatchException e) {
      System.err.printf("\nErro: dados informados inválidos !!!\n");
    }
  }
 
  public static String calculaTroco(double conta, double pago) {
    DecimalFormat formatador = new DecimalFormat("###,##0.00");
    if (pago < conta)
       return("\nPagamento insuficiente, faltam R$"+
         formatador.format(conta - pago) +"\n");
   else {
      int nota[] = {100, 50, 20, 10, 5, 2};
      int centavos[] = {50, 25, 10, 5};

      String result;
      double troco;
      int i, vlr, ct;

      troco = pago - conta;
      result ="\nTroco = R$"+ formatador.format(troco) +"\n\n";

// definindo as notas do troco (parte inteira)
      vlr = (int)troco;
      i = 0;
      while (vlr != 0) {
        ct = vlr / nota[i]; // calculando a qtde de notas
        if (ct != 0) {
           result = result + (ct +"nota(s) de R$"+ nota[i] +"\n");
           vlr = vlr % nota[i]; // sobra
        }
        i = i + 1; // próxima nota
      }

      result = result +"\n";

// definindo os centavos do troco (parte fracionária)
      vlr = (int)Math.round((troco - (int)troco) * 100);
      i = 0;
      while (vlr != 0) {
        ct = vlr / centavos[i]; // calculando a qtde de moedas
        if (ct != 0) {
           result = result + (ct +"moeda(s) de"+ centavos[i] +
           "centavo(s)\n");
           vlr = vlr % centavos[i]; // sobra
        }
        i = i + 1; // próximo centavo
      }

      return(result);
    }
  }

}

