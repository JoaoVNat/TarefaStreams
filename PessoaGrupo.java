package J.Martins;

import java.util.List;
import java.util.Objects;

public class PessoaGrupo{

    private String nome;
    private String genero;
    private int idade;

    public PessoaGrupo(String nome, String genero, int idade){
        this.genero = genero;
        this.idade = idade;
        this.nome = nome;
    }
    public PessoaGrupo(){}
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public List<PessoaGrupo> listaPessoaGP(){
        PessoaGrupo pessoa1 = new PessoaGrupo("Augusto", "Masculino",20);
        PessoaGrupo pessoa2 = new PessoaGrupo("Gisele", "Feminino",18);
        PessoaGrupo pessoa3 = new PessoaGrupo("Gabriel", "Masculino",29);
        PessoaGrupo pessoa4 = new PessoaGrupo("Andre", "Masculino",20);
        PessoaGrupo pessoa5 = new PessoaGrupo("Nicole", "Feminino",25);
        PessoaGrupo pessoa6 = new PessoaGrupo("lais", "Feminino",19);

        return List.of(pessoa1,pessoa2,pessoa3,pessoa4,pessoa5,pessoa6);


    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PessoaGrupo pessoa = (PessoaGrupo) o;
        return nome.equals(pessoa.nome) && genero.equals(pessoa.genero);
    }
    public int hashcode(){
        return Objects.hash(genero,nome);
    }
    public String toString(){
        return "Person{" +
                "name='" + nome+ '\'' +
                ", gender=" + genero +
                '}';
    }

}




