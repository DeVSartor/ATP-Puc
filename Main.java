/*
 *ATP Métodos de Pesquisa e Ordenação em Estruturas de Dados
 
 GRUPO 141
 PROFESSOR: FELLIPE MEDEIROS VEIGA
 ACADÊMICOS:
            ALESSANDOR SARTOR
            FERNANDA TEIXEIRA
            THIAGO CESAR
            NATHAN DE OLIVEIRA
 */

//CLASSE PRINCIPAL
public class Main {
    public static void main(String[] args) {
    
        //INSTANCIAR O OBJETO LISTA
        Lista l = new Lista();

        // INSERIR O PRIMEIRO ITEM NA LISTA =1
        l.inserePrimeiro(1);

        // INSERIR PRÓXIMOS ITENS NA LISTA = 5
        l.inserePrimeiro(5);

        //INSERIR O ÚLITMO ITEM NA LISTA = 10
        l.insereUltimo(10);

        // MOSTRAR A LISTA ATUAL
        l.mostrar();

        // BUSCAR O NÓ ITEM PARA EXCLUIR DA LISTA =1
        //Instanciado o objeto Nó em "n" 
        No n = l.BuscarNo(1);

        // INSERIR ITEM NA POSIÇÃO ESCOLHIDA "N"
        l.insereDepois(n, 2);

        l.mostrar();

        // INSERIR ITEM NA POSIÇÃO ESCOLHIDA "N"
        l.insereDepois(n, 7);

        l.mostrar();

        // REMOVER ÚLTIMO ITEM
        l.removeUltimo();
        l.mostrar();
        System.out.println("===========");

        // REMOVER PRIMEIRO ITEM
        l.removePrimeiro();
        l.mostrar();
        System.out.println("===========");

         // REMOVER  ITEM ESCOLHIDO
        n = l.BuscarNo(7);
        l.remove(n);

        System.out.println("===========");

        l.mostrar();

    }
}
