package exercicios;

public class ArvoreGenealogica { //Faria uma implementacao usando arvores binarias se estivesse com menos dor de cabeça
    Pessoa pessoa;
    Pessoa pai;
    Pessoa mae;
    Pessoa avô_paterno;
    Pessoa avó_paterna;
    Pessoa avô_materno;
    Pessoa avó_materna;

    ArvoreGenealogica(Pessoa pessoa){
        this.pessoa = pessoa;
        this.pai = pessoa.pai;
        this.mae  = pessoa.mae;
        this.avó_materna = pessoa.mae.mae;
        this.avô_paterno = pessoa.pai.pai;
        this.avó_paterna = pessoa.pai.mae;
        this.avô_materno = pessoa.mae.pai;
    }

    @Override
    public String toString() {
        return "{" +
            " pessoa='" + pessoa + "'" +
            ", pai='" + pai + "'" +
            ", mae='" + mae + "'" +
            ", avô_paterno='" + avô_paterno + "'" +
            ", avó_paterna='" + avó_paterna + "'" +
            ", avô_materno='" + avô_materno + "'" +
            ", avó_materna='" + avó_materna + "'" +
            "}";
    }

}
