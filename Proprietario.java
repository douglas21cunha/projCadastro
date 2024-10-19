//Douglas Cunha 2209373
//ADS 2024

import javax.swing.JOptionPane;

public class Proprietario {

    private String cep;
    private String nome;
    private int codFazendeiro;

    // Construtor padrão
    public Proprietario() {
        this.cep = "";
        this.nome = "";
        this.codFazendeiro = 0;
    }

    public Proprietario(String cep, String nome, int codFazendeiro) {
        this.cep = cep;
        this.nome = nome;
        this.codFazendeiro = codFazendeiro;
    }

    // Getters e setters
    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {

        this.cep = cep;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodFazendeiro() {
        return codFazendeiro;
    }

    public void setCodFazendeiro(int codFazendeiro) {
        this.codFazendeiro = codFazendeiro;
    }

    public String toString() {
        return "Proprietario CEP: " + cep + ", Nome: " + nome + ", Código do Fazendeiro: " + codFazendeiro;

    }

    // Método para exibir as informações do proprietário
    public void mostrarInformacoes() {
        JOptionPane.showMessageDialog(null, this.toString(), "Informações do Proprietário", JOptionPane.INFORMATION_MESSAGE);
    }
}
