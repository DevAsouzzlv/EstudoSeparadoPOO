public class Carro {
    String modelo;
    int ano;
    int velocidadeAtual;
 
    public Carro(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeAtual = 0;
    }
 
    public void acelerar() {
        velocidadeAtual += 10;
    }
 
    public void frear() {
        if (velocidadeAtual >= 10) {
            velocidadeAtual -= 10;
        }
    }
 
    public void exibirEstado() {
        System.out.println("Modelo: " + modelo + " | Velocidade: " + velocidadeAtual + " km/h");
    }
 
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Toyota Corolla", 2024);
        meuCarro.exibirEstado();
        meuCarro.acelerar();
        meuCarro.acelerar();
        meuCarro.acelerar();
        meuCarro.acelerar();
        meuCarro.exibirEstado();
        meuCarro.frear();
        meuCarro.exibirEstado();
    }
}