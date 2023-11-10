package J.Martins;

import java.util.List;
import java.util.stream.Collectors;

public class AppPessoa {
    public static void main(String[] args) {
        List<PessoaGrupo> listPessoas = new PessoaGrupo().listaPessoaGP();
        System.out.println("Grupo Masculino; ");
        List<PessoaGrupo> listMain = listPessoas.stream()
                .filter(pessoaGrupo -> pessoaGrupo.getGenero().equals("Masculino"))
                .collect(Collectors.toList());

        listMain.forEach(System.out::println);

        System.out.println("*************");
        System.out.println("*************");
        System.out.println("*************");

        System.out.println("Grupo Feminino: ");
        listPessoas.stream()
                .filter(pessoaGrupo -> pessoaGrupo.getGenero().equals("Feminino"))
                .collect(Collectors.toList())
                .forEach(System.out::println);


    }
}
