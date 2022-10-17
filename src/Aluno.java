import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Aluno {
    String nome;
    List<String> listaMissoes;

    public Aluno(String nome) {
        this.nome = nome;
        this.listaMissoes = new ArrayList();
    }

    public List gerarMissao1(List<String> listaBairros) {
        Random rand = new Random();
        List<String> bairrosEscohidos = new ArrayList();
        List<String> novaListaBairros = new ArrayList(listaBairros);
        int numeroDeBairrosParaEscolher = 2;

        for (int i = 0; i < numeroDeBairrosParaEscolher; i++) {
            int indexAleatorio = rand.nextInt(listaBairros.size());
            String elementoAleatorio = listaBairros.get(indexAleatorio);
            novaListaBairros.remove(elementoAleatorio);
            bairrosEscohidos.add(elementoAleatorio);
        }

        Integer numBaldeacoes = rand.nextInt(9)+1;
        listaMissoes.add(MessageFormat.format("- Você deve pegar um ônibus do bairro {0} ao bairro {1}, fazendo a baldeação no máximo {2} vezes.", bairrosEscohidos.get(0), bairrosEscohidos.get(1), numBaldeacoes));
        return novaListaBairros;
    }

    public List gerarMissao2(List<String> listaNomes, List<String> listaBairros) {
        Random rand = new Random();
        List<String> bairrosEscohidos = new ArrayList();
        List<String> novaListaBairros = new ArrayList(listaBairros);
        int numeroDeBairrosParaEscolher = 2;

        for (int i = 0; i < numeroDeBairrosParaEscolher; i++) {
            int indexAleatorio = rand.nextInt(listaBairros.size());
            String elementoAleatorio = listaBairros.get(indexAleatorio);
            novaListaBairros.remove(elementoAleatorio);
            bairrosEscohidos.add(elementoAleatorio);
        }

        List<String> copiaListaNomes = new ArrayList(listaNomes);
        copiaListaNomes.remove(this.nome);
        String jogadorDesafiado = copiaListaNomes.get(rand.nextInt(copiaListaNomes.size()));

        Integer numBaldeacoes = rand.nextInt(9)+1;
        listaMissoes.add(MessageFormat.format("- Você deve desafiar o jogador {0} a pegar um ônibus do bairro {1} ao bairro {2}, fazendo a baldeação no máximo {3} vezes.", jogadorDesafiado, bairrosEscohidos.get(0), bairrosEscohidos.get(1), numBaldeacoes));
        return novaListaBairros;
    }

    public List gerarMissao3(List<String> listaNomes, List<String> listaBairros) {
        Random rand = new Random();
        List<String> bairrosEscohidos = new ArrayList();
        List<String> novaListaBairros = new ArrayList(listaBairros);
        int numeroDeBairrosParaEscolher = 2;

        for (int i = 0; i < numeroDeBairrosParaEscolher; i++) {
            int indexAleatorio = rand.nextInt(listaBairros.size());
            String elementoAleatorio = listaBairros.get(indexAleatorio);
            novaListaBairros.remove(elementoAleatorio);
            bairrosEscohidos.add(elementoAleatorio);
        }

        List<String> copiaListaNomes = new ArrayList(listaNomes);
        copiaListaNomes.remove(this.nome);

        listaMissoes.add(MessageFormat.format("- Numa disputa entre você, {0} e {1}, você deve fazer a viagem com menos baldeações para pegar um ônibus do bairro {2} para o bairro {3}. ", copiaListaNomes.get(0), copiaListaNomes.get(1), bairrosEscohidos.get(0), bairrosEscohidos.get(1)));
        return novaListaBairros;
    }

    public void escreverMissoes() {
        System.out.println(MessageFormat.format("Usuário {0}", this.nome));
        for (int i = 0; i < listaMissoes.size(); i++) {
            System.out.println(listaMissoes.get(i));
        }
        System.out.println();
    }
}
