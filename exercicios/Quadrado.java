package exercicios;

public class Quadrado {
    int lado;

    int calculaArea(){
        return(lado*lado);
    }

    public Quadrado(int lado) {
        this.lado = lado;
    }
}
