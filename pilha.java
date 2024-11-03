/*Exercício 1*/
public class Pilha {

    public Object[] pilha;
    public int posicaoPilha;

    public Pilha() {
        this.posicaoPilha = -1;
// indica que esta nula, vazia, pois posição um indica que contém informação
        this.pilha = new Object[1000];
// criando uma pilha com 1000 posições
    }

    public boolean pilhaVazia() {
        //isEmpty
        if (this.posicaoPilha == -1) {
            return true;
        }
        return false;
    }

    public int tamanho() {
        //is
        if (this.pilhaVazia()) {
            return 0;
        }
        return this.posicaoPilha + 1;
    }

    public Object exibeUltimoValor() {
        //top
        if (this.pilhaVazia()) {
            return null;
        }
        return this.pilha[this.posicaoPilha];
    }

    public Object desempilhar() {
        //pop
        if (pilhaVazia()) {
            return null;
        }
        return this.pilha[this.posicaoPilha--];
    }

    public void empilhar(Object valor) {
        // push
        if (this.posicaoPilha < this.pilha.length - 1) {
            this.pilha[++posicaoPilha] = valor;
        }
    }

    public static void main(String args[]) {
        Pilha p = new Pilha();
        p.empilhar("Portuguesa ");
        p.empilhar("Frango com catupiry ");
        p.empilhar("Calabresa ");
        p.empilhar("Quatro queijos ");
        p.empilhar(10);
                while (p.pilhaVazia() == false) {
            System.out.println(p.desempilhar());
        }
    }
}

/*Exercício 2*/
Queue q = new Queue();

//Inserindo três elementos
q.Enqueue(1);
q.Enqueue(2);
q.Enqueue(3);

Console.WriteLine("Listando elementos da fila:");

//Enquanto houver elementos na lista, exibir e remover o primeiro
while (q.Count > 0)
{
    Console.WriteLine(q.Dequeue());
}

//Exibe a quantidade de elementos restantes, ou seja, zero
Console.WriteLine("A lista agora possui " + q.Count.ToString() + " elementos.");
Console.Read();


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Exemplo {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    // [ A ] declarando e instanciando uma agenda de contatos
    ArrayList<String> agenda = new ArrayList();

    // [ B ] usando o método add() para gravar 4 contatos na agenda
    agenda.add("Juca Bala;11 1111-1111");
    agenda.add("Marcos Paqueta;22 2222-2222");
    agenda.add("Maria Antonieta;33 3333-3333");
    agenda.add("Antônio Conselheiro;44 4444-4444");

    int i;

    // [ C ] mostrando os "n" contatos da agenda (usando o índice)
    // número de elementos da agenda: método size()
    System.out.printf("Percorrendo o ArrayList (usando o índice)\n");
    int n = agenda.size();
    for (i=0; i<n; i++) {
      System.out.printf("Posição %d- %s\n", i, agenda.get(i));
    }

    System.out.printf("\nInforme a posição a ser excluída:\n");
    i = ler.nextInt();

    try {
      // [ D ] remove o i-ésimo contato da agenda
      agenda.remove(i);
    } catch (IndexOutOfBoundsException e) {
        // exceção lançada para indicar que um índice (i)
        // está fora do intervalo válido (de 0 até agenda.size()-1)
        System.out.printf("\nErro: posição inválida (%s).",
          e.getMessage());
    }

    // [ E ] mostrando os "n" contatos da agenda (usando for-each)
    System.out.printf("\nPercorrendo o ArrayList (usando for-each)\n");
    i = 0;
    for (String contato: agenda) {
      System.out.printf("Posição %d- %s\n", i, contato);
      i++;
    }

    // [ F ] mostrando os "n" contatos da agenda (com iterator)
    System.out.printf("\nPercorrendo o ArrayList (usando iterator)\n");
    i = 0;
    Iterator<String> iterator = agenda.iterator();
    while (iterator.hasNext()) {
      System.out.printf("Posição %d- %s\n", i, iterator.next());
      i++;
    }
  }

}

/*Exercício 3*/

public class ListaDupEncadeada {
 // A classe que representa os nós da lista utiliza a classe Object
 para definir a referência ao dado associado à posição da lista que este nó representa.
 private class No{
       // Referência ao próximo elemento da lista
       No proximo;
       // Referência ao elemento anterior na lista
       No anterior;
       // Referência ao dado armazenado no nó atual da lista
       Object dado;

       // Constrói um nó para armazenar um objeto na lista
       No(Object obj) { ... }
       // Constrói um nó para armazenar um objeto na lista, indicando quais os
       // nós anterior e próximo
       No(Object obj, No prox, No ant) { ... }
 }
 // Implementação da interface Iterator, que define os métodos de navegação na lista
 private class IteratorLista implements Iterator {
       // Referência ao nó apontado pelo iterador da lista durante a navegação
       No noAtual;

       // Retorna o dado associado ao nó atual. Caso o iterador não seja válido
       // (noAtual é nulo), retorna um objeto nulo
       public Object dado() { ... }
       // Coloca o iterador no próximo elemento da lista e retorna o dado
       // associado ao nó atual. Caso o iterador não seja válido (noAtual é
       // nulo), retorna um objeto nulo
       public Object proximo() { ... }
       // Coloca o iterador no elemento anterior da lista e retorna o dado
       // associado ao nó atual. Caso o iterador não seja válido (noAtual é
       // nulo), retorna um objeto nulo
       public Object anterior() { ... }
       // Verifica se existe um nó após o nó atual
       public boolean temProximo() { ... }
       // Verifica se existe um nó antes do nó atual
       public boolean temAnterior() { ... }
       // Verifica se o nó atual existe e é válido
       public boolean eValido() { ... }
 }

 // Nó inicial (primeiro) da lista encadeada
 No     inicio;
 // Nó final (último) da lista encadeada
 No     fim;
 // Tamanho da lista encadeada (número de nós na lista)
 int    tamanho;

 // Construtor
 public ListaDupEncadeada() { ... }
 // Retorna uma instância de Iterator para o primeiro nó da lista
 public Iterator iteradorInicio() { ... }
 // Retorna uma instância de Iterator para o último nó da lista
 public Iterator iteradorFim() { ... }
 // Retorna o tamanho da lista
 public int getTamanho() { ... }
 // Insere um novo nó no início da lista
 public int insereInicio(Object obj { ... }
 // Insere um novo nó no final da lista
 public int insereFim(Object obj { ... }
 // Insere um novo nó na posição indicada
 public int insere(Object obj, int pos) { ... }
 // Remove o nó do início da lista - retira o primeiro elemento
 // Retorna o objeto armazenado no primeiro nó da lista - que foi removido.
 public Object removeInicio(){ ... }
 // Remove o nó do final da lista - retira o último elemento
 // Retorna o objeto do último nó da lista - que foi removido.
 public Object removeFim(){ ... }
 // Remove um nó do meio da lista - retira o elemento da posição indicada
 // Retorna o objeto armazenado na posição indicada - que foi removida.
 public Object remove(int pos) { ... }
 // Retorna o objeto armazenado na posição indicada, sem remover o mesmo da lista
 public Object consulta(int pos) { ... }
}




public class TesteLista {
public static void main(String[] args)  {
   // Lista encadeada
   ListaDupEncadeada lista = new ListaDupEncadeada();
   int val;

   // Strings a serem inseridas na lista
   String a = "str teste 01";
   String c = "str teste 03";
   String e = "str teste 05";

   // Inteiros a serem inseridos na lista
   int b = 2;
   int d = 4;
   int f = 6;

   // Mostra o tamanho atual da lista
   System.out.println("Tamanho: " + lista.getTamanho());

   // Insere uma String no início da lista
   val = lista.insereInicio(a);
   // Mostra o conteúdo da primeira posição da lista
   System.out.println("Inserindo: \"" + lista.consulta(1) + "\" -> Tamanho: " + val);
   // Insere um inteiro no início da lista
   val = lista.insereInicio(b);
   System.out.println("Inserindo: \"" + lista.consulta(1) + "\" -> Tamanho: " + val);
   // Insere uma String no início da lista
   val = lista.insereInicio(c);
   System.out.println("Inserindo: \"" + lista.consulta(1) + "\" -> Tamanho: " + val);
   // Insere um inteiro no início da lista
   val = lista.insereInicio(d);
   System.out.println("Inserindo: \"" + lista.consulta(1) + "\" -> Tamanho: " + val);
   // Insere uma String no início da lista
   val = lista.insereInicio(e);
   System.out.println("Inserindo: \"" + lista.consulta(1) + "\" -> Tamanho: " + val);
   // Insere um inteiro no início da lista
   val = lista.insereInicio(f);
   System.out.println("Inserindo: \"" + lista.consulta(1) + "\" -> Tamanho: " + val);

   // Mostra o tamanho atual da lista
   System.out.println("\nTamanho: " + lista.getTamanho());

   System.out.println("");

   // Iterador utilizado para percorrer a lista encadeada
   Iterator iterador = lista.iteradorInicio();

   // Contador de posições
   int i = 1;
   // Laço para percor ...
