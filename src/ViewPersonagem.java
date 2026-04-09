
/*public class Main {
   public static void main (String [] args){
       //Criando um objeto do tipo Personagem Mágico
       PersonagemMagico mago = new PersonagemMagico("Gandalf"); //Nome definido logo no início

       //Atribuindo valores aos atributos do objeto
       mago.nome = "Gandalf";
       mago.nivelEnergia = 100;
       mago.poderMagico = "Magia";

       //Exibindo valores dos atributos do objeto
       System.out.println(mago.nome + "; " + " Energia: " + mago.nivelEnergia + "; " + " Poder: " + mago.poderMagico);

       //Adicionando outro Personagem Mágico
       PersonagemMagico elfo = new PersonagemMagico(); //Sem nome definido no início e não da erro por causa do construtor vazio
       elfo.nome = "Legolas";
       elfo.nivelEnergia = 50;
       elfo.poderMagico = "Arqueira";

       //exibindo os valores do elfo
       System.out.println(elfo.nome + "; " + " Energia: " + elfo.nivelEnergia + "; " + " Poder: " + elfo.poderMagico);
   }
}*/

import java.sql.SQLOutput;
import java.util.Scanner;

public class ViewPersonagem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Cria um leitor chamado sc que vai ler o que eu digitar no meu teclado
        PersonagemMagico personagem = new PersonagemMagico();
        int op; //cria uma variavel chamada op que vai guardar um número inteiro
        do {
            System.out.println("Escolha uma opção: \n1 - Cadastrar personagem \n2 - Exibir Personagem \n3 - Realizar ataque \n4 - Aumentar nível de energia \n5 - Ativiar habilidade especial \n0 - Sair");
               op = sc.nextInt();//Pega o número inteiro que o usuário digitou e guarda dentro da variavel op

            switch (op) {
                case 1:
                    System.out.println("Digite o nome do personagem: ");
                     String nome = sc.next() + sc.nextLine();//sc.nextLine lê tudo o que o usuário digitar até ele dar enter

                    System.out.println("Digite o poder do personagem: ");
                     String poder = sc.next() + sc.nextLine();

                    System.out.println("Digite o nível de energia: ");
                     int energia = sc.nextInt();
                     personagem.nome = nome;
                     personagem.nivelEnergia = energia;
                     personagem.poderMagico = poder;

                    System.out.println("Digite o nome da habilidade do personagem: ");
                     String nomeHabilidade = sc.next() + sc.nextLine();

                    System.out.println("Digite o custo de energia para usar a habilidade especial: ");
                     int nivelEnergia = sc.nextInt();

                    System.out.println("A habilidade está ativada? (true/false): ");
                     boolean ativada = sc.nextBoolean();

                   //Criando o objeto que representa a habilidade  especial com valores informados pelo usuário
                   HabilidadeEspecial habilidadeEspecial = new HabilidadeEspecial(nomeHabilidade, nivelEnergia, ativada);

                   //Atribuindo o objeto habilidade especial ao personagem
                    personagem.habilidade = habilidadeEspecial;
                     break;

                case 2:
                    System.out.println("Nome: " + personagem.nome + "; " + "Poder: " + personagem.poderMagico + "; " + "Nível de nergia: " + personagem.nivelEnergia);

                    System.out.println("Habilidade: " + personagem.habilidade.nome + "; " + " Custo energia: " + personagem.habilidade.custoEnergia + "; " + "Habilitada: " + personagem.habilidade.habilidade);

                    break;

                case 3:
                    System.out.println("Digite o nome do ataque: ");
                    String nomeAtaque = sc.next() + sc.nextLine();
                    break;

                case 4:
                    System.out.println("Digite a quantidade de energia: ");
                    int qtd = sc.nextInt();
                    int nivelAtual = personagem.usarEnergia(qtd);
                    System.out.println("Nível de energia atual: " + nivelAtual);
                    break;

                case 5:
                    personagem.ativarHabilidadeEspecial();
                    break;

                case 0:
                    System.out.println("Finalizando o programa");
                    break;
                default://caso o usuário não digite nenhuma das opções
                    System.out.println("Opção invalida");

            }

        } while (op != 0);//Enquanto o usuario não digitar '0' o loop continua
        sc.close();

    }
}