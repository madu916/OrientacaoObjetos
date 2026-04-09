public class PersonagemMagico {
   //Atributos
    String nome;
    String poderMagico;
    int nivelEnergia;

    HabilidadeEspecial habilidade;

    public PersonagemMagico() {
        //É um construtor vazio para caso você não defina o nome logo no início, evitando dar erro no cód. ex. na linha 17
    }
    public PersonagemMagico(String nome) {
        this.nome = nome; //Obriga a colocar o nome do personagem logo no início ou da erro, ver ex. na linhas 6
    }
    public void atacar (String ataque){
        if (nivelEnergia >=10){
            System.out.println(nome + "realizou um ataque: " + ataque + "!");
            nivelEnergia -= 10;

        } else {
            System.out.println(nome + "Está sem energia para atacar.");
        }

    }
    public int usarEnergia (int qtd){
        nivelEnergia += qtd;
        return nivelEnergia;
    }
    public void ativarHabilidadeEspecial(){
        System.out.println("Habilidade ativada!");
    }
}
