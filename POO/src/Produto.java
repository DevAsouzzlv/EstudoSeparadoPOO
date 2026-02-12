public class Produto {
    public String nome;
    public double preco;

    public Produto (String nome, double preco){
        this.nome = nome;
        this.preco = preco;
        
    }

    public Produto (){
        this.nome = "desconhecido";
        this.preco = 0;
    }


     public void Mostrarprecos() {
        System.out.println( nome + preco);
    }


    public static void main(String[] args) {
        Produto p1 = new Produto("Sabao ", 10);
        p1.Mostrarprecos();
        Produto p2 = new Produto("Bola ", 50);
        p2.Mostrarprecos();

    }
}

