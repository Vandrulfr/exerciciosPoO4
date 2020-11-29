package exercicios;

import java.util.ArrayList;

public class Agenda {
    ArrayList<PessoaFisica> pessoas = new ArrayList<PessoaFisica>();

    void addPessoa(PessoaFisica pessoa){
        pessoas.add(pessoa);
    }
    
    void exibePessoas(){
        pessoas.forEach((pessoa) -> System.out.println(pessoa.toString()));
    }

    void selecionaPessoa(String cpf){
        pessoas.forEach((pessoa) -> {if(pessoa.cpf == cpf){System.out.println(pessoa.toString());}});
    }
}
