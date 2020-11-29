package exercicios;

public class Retangulo extends Quadrado {
    int lado2;
    
    @Override
    int calculaArea(){
        return (lado*lado2);
    }

    public Retangulo(int lado, int lado2) {
        super(lado);
        this.lado2 = lado2;
    }
    
}
