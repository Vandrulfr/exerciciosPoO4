package exercicios;

public class PessoaJuridica extends PessoaFisica{
   String cnpj = super.cpf;
   String razao_social = super.nome;
   int faturamento;

   public PessoaJuridica(String nome, String cpf, String endereco, int faturamento){
       super(nome, 0, cpf, endereco, "");
       this.faturamento = faturamento;
   }

    @Override
    public String toString() {
        return 
            " cnpj='" + cnpj + "'" +
            ", razao_social='" + razao_social + "'" +
            ", faturamento='" + faturamento + "'" +
            ", endereco='" + endereco + "'" ;
    }
    
    
}
