// Super classe = pai

public  class Humano {
    // Metodo construtor
    public Humano (String nome, boolean pensar){
        this.nome = nome;
        this.pensar = pensar;
    }

    public String nome;
    public boolean pensar;


    // Metodo apresentar
public void apresentar(){
    System.out.println("Meu nome e " + nome);
}


// Sub classe = filho
public static class Brasileiro extends Humano{
    public String idioma;
    public String nacionalidade;

    // Metodo construtor
    public Brasileiro (String idoma, String nacionalidade, String nome, boolean pensar){

        super(nome,pensar);
        this.idioma = idoma;
        this.nacionalidade = nacionalidade;
    }

    public void Falar(){
        System.out.println("Ola meu nome e "+ nome +" eu sou " + nacionalidade + " e falo " + idioma + "!");
    }
}
public static void main(String[] args) {
    Brasileiro b1 = new Brasileiro("Portugues", "Brasileiro", "Vitor", true);
    b1.Falar();
    b1.apresentar();
}
}