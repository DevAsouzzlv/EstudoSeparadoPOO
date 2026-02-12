public class Animal {
    String nome;
    String tipo;

    public Animal(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public void emitirsom(String som) {
        System.out.println("eu faco esse som o " + som);
    }

    public static class Gato extends Animal {
        public String tipo;
        public String nome;

        // Metodo construtor
        public Gato(String nome, String tipo) {

            super(nome, tipo);
            this.nome = nome;
            this.tipo = tipo;
        }

        public void emitirsom(String som) {
            System.out.println("eu faco esse som o " + som);
        }

        Cachorro cachorro1 = new Cachorro("Pedro", "Pitbull");
        {
            cachorro1.emitirsom("Au, Au");
        }

    }

    public static class Cachorro extends Animal {
        public String tipo;
        public String nome;

        // Metodo construtor
        public Cachorro(String nome, String tipo) {

            super(nome, tipo);
            this.nome = nome;
            this.tipo = tipo;
        }

        public void emitirsom(String som) {
            System.out.println("eu faco esse som o " + som);
        }
    }

    public static void main(String[] args) {
        Gato gato1 = new Gato("Vitor", "Siames");
        gato1.emitirsom("Miau, Miau");
        
    }
}