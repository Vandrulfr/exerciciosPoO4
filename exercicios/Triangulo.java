package exercicios;

public class Triangulo extends Retangulo{
    public Triangulo(int base, int altura){
        super(base, altura);
    }
    int base = super.lado;
    int altura = super.lado;
    
    @Override
    int calculaArea() {
        return (super.calculaArea()/2);
    }
}
