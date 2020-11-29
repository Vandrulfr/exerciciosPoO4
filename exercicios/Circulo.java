package exercicios;

public class Circulo extends Quadrado{ //Isso pode parecer não fazer muito sentido,
                                       //mas usei para poder fazer polimorfismo no calculo de area
    public Circulo(int raio){
        super(raio);
    }
    int raio = super.lado;

    @Override
    int calculaArea() {
        return (super.calculaArea() * 3);//arredondando Pi
    }
}
