public class Calculadora {
    public int somar (int a, int b){
        return a+b;
    }


    public double somar(double a, double b){
        return a+b;
    }

    public int somar(int a, int b, int c){
        return a+b+c;
    }


    public static void main(String[] args) {
        Calculadora calculadora1 = new Calculadora();
        System.out.println(calculadora1.somar(1, 2));
        calculadora1.somar(2, 3);
        calculadora1.somar(3, 2, 9);
    }
}