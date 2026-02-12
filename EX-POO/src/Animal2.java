// Polimorfismo de Sobreescrita

public class Animal2 {
    public void fazersom(){
        System.out.println("O animal faz som!");
    }


    class Cachorro extends Animal2  {
        @Override
        public void fazersom(){
            System.out.println("O cachorro late. AU AU");
        }
    }


    class Gato extends Animal2 {
        @Override  
        public void fazersom(){
            System.out.println("O gato mia. Miau Miau");
        } 
    }  
        
}
