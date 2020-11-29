package exercicios;

import java.util.ArrayList;

public class Pais {
    String nome;
    String capital;
    float dimensao;
    ArrayList<Pais> fronteiras = new ArrayList<Pais>();
    
    public Pais(String nome, String capital, float dimensao) {
        this.nome = nome;
        this.capital = capital;
        this.dimensao = dimensao;
    }

    ArrayList<Pais> getFronteiras(){
        return fronteiras;
    }

    ArrayList<Pais> comparaFronteiras(Pais pais){
        ArrayList<Pais>fronteiras_resultado = pais.getFronteiras();
        fronteiras_resultado.retainAll(this.fronteiras);
        return fronteiras_resultado;
    }

    static void imprimeFronteiras(ArrayList<Pais> fronteiras){
        fronteiras.forEach((pais) -> System.out.println(pais.nome));
    }

    void addFronteira(Pais pais){
        if(!pais.equals(this)){
            fronteiras.add(pais);
            if (!pais.fronteiras.contains(this)){
                pais.addFronteira(this);
            }
        }
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCapital() {
        return this.capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public float getDimensao() {
        return this.dimensao;
    }

    public void setDimensao(float dimensao) {
        this.dimensao = dimensao;
    }





    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Pais)) {
            return false;
        }
        Pais pais = (Pais) o;
        return nome.equals(pais.nome) && capital.equals(pais.capital) ;
    }

    
}
