// Caracteristicas

// public - a classe e publica
// class - palavra reservada pra criar classe
// Pessoa - nome da classe

public class Pessoa {

    // atributos == caracteristicas
    // metodos == acoes

    // criacao de atributos

    public String nome;
    public int idade;

    // metodo construtor = ajuda na criacao de objetos e inicializacao de atributos
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;

    }

    public void Apresentar() {
        System.out.println("Ola meu nome e " + nome + " tenho " + idade + " de idade! ");
    }

  public static void main(String[] args) {
     Pessoa p1 = new Pessoa("Vitor", 18);
     p1.Apresentar();

     Pessoa p2 = new Pessoa("Pedro", 14);
     p2.Apresentar();

     Pessoa p3 = new Pessoa("Zelandia", 42);
     p3.Apresentar();
  } 
  
}