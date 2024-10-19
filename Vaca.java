//Douglas Cunha 2209373
//ADS 2024

public class Vaca extends Animal {

    private int leite;
    private int partos;
    private float prodCarne;

    // Getters
    public int getLeite() {
        return leite;
    }

    public int getPartos() {
        return partos;
    }

    public float getProdCarne() {
        return prodCarne;
    }

    // Setters
    public void setLeite(int quantidade) {
        this.leite = quantidade;
    }

    public void setPartos(int partos) {
        this.partos = partos;
    }

    public void setProdCarne(float prodCarne) {
        this.prodCarne = prodCarne;
    }
}
