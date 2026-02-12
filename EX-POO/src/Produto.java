public class Produto {
    private String nome;
    private Double preco;
    private int quantidade = 0;

    public Produto(String nome, Double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void setReporestoque(int quantidade){
        if (quantidade > 0){
            System.out.println("Vc repos " + quantidade + " no estoque ");
        }
    }


    public void setVender(int quantidade){
        if (quantidade < 0){
            System.out.println("Vc vendeu " + quantidade + " do estoque ");
        }
    }

    public static void main(String[] args) {
        Produto produto1 = new Produto("sabao", 10.0, 2);
        produto1.setReporestoque(2);
        produto1.setVender(-1);
    }

}