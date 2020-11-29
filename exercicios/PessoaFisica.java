package exercicios;

public class PessoaFisica extends Pessoa{
    String cpf;
    String endereco;
    String aniversario;
    public PessoaFisica(String nome, int idade, String cpf, String endereco, String aniversario){
        super(idade, nome);
        this.cpf = cpf;
        this.endereco = endereco;
        this.aniversario = aniversario;
    }

    @Override
    public String toString() {
        return 
            " nome='" + nome +"'" +
            " cpf='" + cpf + "'" +
            ", endereco='" + endereco + "'" +
            ", aniversario='" + aniversario + "'"
            ;
    }
    
}
