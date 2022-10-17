import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> listaBairros = new ArrayList(Arrays.asList("Alphaville", "Cambuí", "Barra Funda", "Bela Vista", "Ibirapuera", "Lapa", "Moema", "Mooca", "Penha", "Pinheiros"));
        List<String> listaAlunos = new ArrayList(Arrays.asList("Danilo", "Fernanda", "Eduardo"));
        List<String> listaBairrosMissao1;
        List<String> listaBairrosMissao2;
        List<String> listaBairrosMissao3;

        Aluno primeiroAluno = new Aluno(listaAlunos.get(0));
        listaBairrosMissao1 = primeiroAluno.gerarMissao1(listaBairros);
        listaBairrosMissao2 = primeiroAluno.gerarMissao2(listaAlunos, listaBairros);
        listaBairrosMissao3 = primeiroAluno.gerarMissao3(listaAlunos, listaBairros);

        Aluno segundoAluno = new Aluno(listaAlunos.get(1));
        listaBairrosMissao2 = segundoAluno.gerarMissao2(listaAlunos, listaBairrosMissao2);
        listaBairrosMissao1 = segundoAluno.gerarMissao1(listaBairrosMissao1);
        listaBairrosMissao3 = segundoAluno.gerarMissao3(listaAlunos, listaBairrosMissao3);

        Aluno terceiroAluno = new Aluno(listaAlunos.get(2));
        terceiroAluno.gerarMissao3(listaAlunos, listaBairrosMissao3);
        terceiroAluno.gerarMissao2(listaAlunos, listaBairrosMissao2);
        terceiroAluno.gerarMissao1(listaBairrosMissao1);

        primeiroAluno.escreverMissoes();
        segundoAluno.escreverMissoes();
        terceiroAluno.escreverMissoes();
    }
}