import java.util.Scanner;

public class Item {
    String nome;
    String descricao;
    boolean raro;
    int nivelPoder;

    //Construtor
    public Item(String nome, String descricao, boolean raro, int nivelPoder) {
        this.nome = nome;
        this.descricao = descricao;
        this.raro = raro;
        this.nivelPoder = nivelPoder;
    }

    public class ViewItem {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Item item = null;
            int op;

            do {
                System.out.println("Escolha uma opção: \n1-Casdastrar item \n2-Exibir item \n0-Sair");
                op = sc.nextInt();
                switch (op) {
                    case 1:
                        System.out.println("Digite o nome do item: ");
                        String nome = sc.next() + sc.nextLine();

                        System.out.println("Digite o descricao do item: ");
                        String descricao = sc.next() + sc.nextLine();

                        System.out.println("O item é raro: ");
                        boolean raro = sc.nextBoolean();

                        System.out.println("Digite o nivel de poder: ");
                        int nivelPoder = sc.nextInt();
                        item = new Item(nome, descricao, raro, nivelPoder);
                        break;
                    case 2:
                        if (item != null) {
                            System.out.println("Nome: " + "; " + item.nome + "; " + "Descrição: " + item.descricao + "; " + "Raro: " + item.raro + "; " + "Nivel de poder: " + item.nivelPoder);
                        } else {
                            System.out.println("Nenhum item cadastrado ainda.");
                        }
                        break;
                    case 0:
                        System.out.println("Finalizando o programa.");
                    default:
                        System.out.println("Opção inválida.");
                }


            }while (op != 0) ;
            sc.close();
        }
    }
}

