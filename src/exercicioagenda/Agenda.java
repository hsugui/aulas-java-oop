package exercicioagenda;

import java.util.Arrays;

public class Agenda {

    private int qtdContatos = 0;
    public Pessoa[] pessoas = new Pessoa[10];
    private int totalContatos = pessoas.length;

    public Agenda() {

    }

    public void armazenarPessoa(int posicao, String nome, int idade, double altura) {
        if(qtdContatos < totalContatos && this.pessoas[posicao] == null) {
            Pessoa p =  new Pessoa(nome, idade, altura);
            this.pessoas[posicao] = p;
            qtdContatos++;
        } else {
            System.out.println("Posição ocupada. Insira em outra posição.");
        }
    }

    public void removerPessoa(String nome) {
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i] != null && nome.equals(pessoas[i].getNome())) {
                System.out.println("Removendo o contato '" + pessoas[i].getNome() + "' da agenda...");
                pessoas[i] = null;
                System.out.println("Contato removido com sucesso!");
                qtdContatos--;
                break;
            }
        }
    }

    public int buscaPessoa(String nome) {
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].getNome().equals(nome)) {
                return i;
            }
        }
        return -1;
    }

    public void imprimirPessoa(int indice) {
        for (int i = 0; i < pessoas.length; i++) {
            if(i == indice) {
                System.out.println("Estas são as informações sobre o contato que se encontra na posição " + indice + ":");
                System.out.println("Nome: " + pessoas[i].getNome());
                System.out.println("Idade: " + pessoas[i].getIdade());
                System.out.println("Altura: " + pessoas[i].getAltura());
                System.out.printf("Altura: %.2f\n", pessoas[i].getAltura());
            }
        }
    }


    public int getQtdContatos() {
        return qtdContatos;
    }

    public void setQtdContatos(int qtdContatos) {
        this.qtdContatos = qtdContatos;
    }

    public int getTotalContatos() {
        return totalContatos;
    }

    public void setTotalContatos(int totalContatos) {
        this.totalContatos = totalContatos;
    }

    public Pessoa[] getPessoas() {
        return pessoas;
    }

    public void setPessoas(Pessoa[] pessoas) {
        this.pessoas = pessoas;
    }

}
