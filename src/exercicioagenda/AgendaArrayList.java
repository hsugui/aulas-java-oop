package exercicioagenda;

import java.util.ArrayList;

public class AgendaArrayList {
    private int qtdContatos = 0;
    private int totalContatos = 10;
    private ArrayList<Pessoa> list = new ArrayList<>();

    public AgendaArrayList() {
    }

    public void armazenarPessoa(String nome, int idade, float altura) {
        if (list.size() < totalContatos) {
            System.out.println("Armazenando o contato '" + nome + "'...");
            list.add(new Pessoa(nome, idade, altura));
            System.out.println("Contato armazenado com sucesso!");
            qtdContatos++;
        }
    }

    public void removerPessoa(String nome) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getNome() == nome) {
                System.out.println("Removendo o contato '" + list.get(i).getNome() + "' da agenda...");
                list.remove(i);
                System.out.println("Contato removido com sucesso!");
                qtdContatos--;
            }
        }
    }

    public int buscaPessoa(String nome) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getNome() == nome) {
                return i;
            }
        }
        return 0;
    }

    public void imprimirPessoa(int indice) {
        for (int i = 0; i < list.size(); i++) {
            if (i == indice) {
                System.out.println("Estas são as informações sobre o contato que se encontra na posição " + indice + ":");
                System.out.println("Nome: " + list.get(i).getNome());
                System.out.println("Idade: " + list.get(i).getIdade());
                System.out.printf("Altura: %.2f\n", list.get(i).getAltura());
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

    public ArrayList<Pessoa> getList() {
        return list;
    }

    public void setList(ArrayList<Pessoa> list) {
        this.list = list;
    }
}
