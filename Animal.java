//Douglas Cunha 2209373
//ADS 2024

public abstract class Animal {

    private int id;
    private int idade;
    private float peso;

    Proprietario proprietario;

    // Sobrecarga: Construtor sem parâmetros (inicialização padrão)rga
    public Animal() {
        id = 0;
        idade = 0;
        peso = 0;

        proprietario = new Proprietario();
    }

    // Sobrecarga: Construtor com parâmetros  
    public Animal(int id, int idade, float peso, String raca, Proprietario proprietario) {
        this.id = id;
        this.idade = idade;
        this.peso = peso;
        this.proprietario = proprietario;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

}
