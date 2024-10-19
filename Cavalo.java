//Douglas Cunha 2209373
//ADS 2024

public class Cavalo extends Animal {

    private String corPelagem;
    private String tipoAndamento;
    private String linhagem;

    // Getters
    public String getCorPelagem() {
        return corPelagem;
    }

    public String getTipoAndamento() {
        return tipoAndamento;
    }

    public String getLinhagem() {
        return linhagem;
    }

    // Setters
    public void setCorPelagem(String corPelagem) {
        this.corPelagem = corPelagem;
    }

    public void setTipoAndamento(String tipoAndamento) {
        this.tipoAndamento = tipoAndamento;
    }

    // Método setLinhagem com validação
    public void setLinhagem(String linhagem) throws LinhagemException {
        if (linhagem.equalsIgnoreCase("puro sangue") || linhagem.equalsIgnoreCase("lusitano")) {
            this.linhagem = linhagem;
        } else {
            throw new LinhagemException();
        }
    }

}
