package atividade1;
import java.util.ArrayList;
//import java.util.List;
import java.util.Scanner;

// 1° resposta e tentativas de teste comentadas no final:

public class Agenda {
        public static void main(String[] args) {
            ArrayList<Contato> AgendaDeContatos;
            AgendaDeContatos = new ArrayList();
            Scanner scanner = new Scanner(System.in);
            int opcao;
            do {
                System.out.println("menu");
                System.out.println("1-cadastrar contato");
                System.out.println("2-Buscar contato");
                System.out.println("3-Excluir contato");
                System.out.println("4-Imprimir agenda");
                System.out.println("5-Sair");
                opcao = scanner.nextInt();
    
                switch (opcao) {
                    case 1:
                        Cadastrar(AgendaDeContatos, scanner);
                        break;
                    case 2:
                        BuscarContato(AgendaDeContatos, scanner);
                        break;
                    case 3:
                        Excluir(AgendaDeContatos, scanner);
                        break;
                    case 4:
                        ImprimirContato(AgendaDeContatos, scanner);
                        break;
                    default:
                        System.out.println("Opcao invalida. tente novamente");
    
                }
            } while (opcao != 5);
            scanner.close();
        }
    
        private static void Cadastrar(ArrayList<Contato> AgendaDeContatos, Scanner scanner) {
            System.out.println("entre com o nome");
            String nome = scanner.next();
            System.out.print("Digite o telefone do contato: ");
            String telefone = scanner.next();
            AgendaDeContatos.add(new Contato(nome, telefone));
            System.out.println("Contato cadastrado com sucesso!");
        }
    
        private static void BuscarContato(ArrayList<Contato> AgendaDeContatos, Scanner scanner) {
            System.out.print("Digite o nome do contato que deseja buscar: ");
            String nome = scanner.next();
            for (Contato contato : AgendaDeContatos) {
                if (contato.getNome().equals(nome)) {
                    System.out.println("Telefone do contato: " + contato.getContato());
                    return;
                } else {
                    System.out.println("erro");
                }
            }
            System.out.println("Contato não encontrado na agenda.");
        }
    
        private static void Excluir(ArrayList<Contato> AgendaDeContatos, Scanner scanner) {
            System.out.print("Digite o nome do contato que deseja excluir: ");
            String nome = scanner.next();
            Contato contatoRemover = null; //criando uma variavel para receber o contaqto aser excluido
            for (Contato contato : AgendaDeContatos) { // andar pelo array até achar o contato
                if (contato.getNome().equals(nome)) { //equals compara duas strings para ver se elas são igual
                    contatoRemover = contato;
                    break;
                }
            }
            if (contatoRemover != null) {
                AgendaDeContatos.remove(contatoRemover);
                System.out.println("Contato removido com sucesso!");
            } else {
                System.out.println("Contato não encontrado na agenda.");
            }
        }
    
        private static void ImprimirContato(ArrayList<Contato> AgendaDeContatos, Scanner scanner) {
            if (AgendaDeContatos.isEmpty()) {
                System.out.println("A agenda está vazia.");
            } else {
                System.out.println("Agenda de Contatos:");
                for (Contato contato : AgendaDeContatos) {
                    System.out.println("Nome: " + contato.getNome() + ", Telefone: " + contato.getContato());
                }
            }
        }
    }

   // public static void main(String[] args) {
     //   List<Contato> users = new ArrayList<>();
     //   Scanner entrada = new Scanner(System.in);
     //   int i = 0; // se começa a contar do 0, ou seja, o 0 = 1, 1 = 2 ... 9=10
     //   while (i < 10) { // criaremos uma lista com 10 espaços
     //       Contato actual = new Contato("Nome: " + i ,"Contato: " + i);
      //      users.add(actual);
      //      i++
      //  System.out.println(users.get(9).getNome());
       // System.out.println(users.get(9).getContato());

        // para forçar a criação de um novo contato dentro da lista:
       // Contato contato11 = new Contato("nome 11", "contato 11");
       // users.add(contato11);

      //  System.out.println(users.get(10).getNome());
       // System.out.println(users.get(10).getContato());


        //outra forma:
        //public static void main(String[] args) {
           // Contato[] users = new Contato[]{
        //new Contato("teste","testinho"),
        //new Contato("flavinho", "flavio"),
        //new Contato("testa","testinha"),
        //};
        // System.out.println(users[2].getNome());
       //System.out.println(users[2].getContato());


        // forma nao pratica: 
         // |x|x|x|x|
       // for(int i = 0; i < users.length; i++ ){
       //     Contato actual = new Contato(null, null);
       //     actual.setNome("Nome: " + i);
        //    actual.setContato("Contato: " + i);
       //     users[i]=actual
       // }
       // System.out.println(users[2].getNome());
       // System.out.println(users[2].getContato());
    
    

