package exercicios;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nCampo de Futebol\n");
        CampoFutebol campo = new CampoFutebol();
        campo.converte_area();
        
        System.out.println("\nArea Geometrica\n");
        Quadrado quadrado = new Quadrado(2);
        System.out.println("Quadrado: " +quadrado.calculaArea());
        Circulo circulo = new Circulo(3);
        System.out.println("Circulo: " +circulo.calculaArea());
        Triangulo triangulo = new Triangulo(4, 3);
        System.out.println("Triangulo: "+triangulo.calculaArea());

        System.out.println("\nAgenda\n");
        Agenda agenda = new Agenda();
        agenda.addPessoa( new PessoaFisica("Fulano", 25, "12345678912", "endereco", "aniversario"));
        agenda.addPessoa(new PessoaJuridica("Amazon", "14725836914", "endereco", 99999));
        agenda.exibePessoas();
        agenda.selecionaPessoa("12345678912");

        System.out.println("\nPais\n");
        Pais pais0 = new Pais("Brasil", "Brasilia", 3);
        Pais pais1 = new Pais("Argetina", "Argentilia", 2);
        Pais pais2 = new Pais("Chile", "Chillia", 1);
        pais0.addFronteira(pais1);
        pais2.addFronteira(pais1);
        Pais.imprimeFronteiras(pais0.comparaFronteiras(pais2));
    }
}
