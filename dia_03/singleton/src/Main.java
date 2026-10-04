package dia_03.singleton.src;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("camila", 1234);
        Aluno aluno2 = new Aluno("maria", 123456);
        Aluno aluno3 = new Aluno("millena", 1234567);

        CadastroAlunos cadastro = CadastroAlunos.getInstance();
        CadastroAlunos cadastro1 = CadastroAlunos.getInstance();
        cadastro.adicionar(aluno1);
        cadastro.adicionar(aluno2);
        cadastro.adicionar(aluno3);
        cadastro.listar();

        // irão ser iguais devido o getInstance()
        System.out.println(cadastro == cadastro1);

    }
}
