package dia_03.singleton.src;

import java.util.ArrayList;
import java.util.List;

public class CadastroAlunos {
    private static CadastroAlunos instancia;
    private final List<Aluno> alunos = new ArrayList<>();

    private CadastroAlunos() {}

    public static CadastroAlunos getInstance() {
        if (instancia == null) {
            instancia = new CadastroAlunos();
        }
        return instancia;
    }

    public void adicionar(Aluno a) {
        alunos.add(a);
    }

    public void listar() {
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }
}
