//Douglas Cunha 2209373
//ADS 2024

public class Porco extends Animal implements CustoAbate {

    private String alimentacao;
    private float pesoAbate;
    private float precoPorKg;

    public String getAlimentacao() {
        return alimentacao;
    }

    // Método para definir a alimentação com validação
    public void setAlimentacao(String alimentacao) throws AlimentacaoException {
        if (alimentacao == null || alimentacao.trim().isEmpty()
                || (!alimentacao.equalsIgnoreCase("racao") && !alimentacao.equalsIgnoreCase("restos"))) {
            throw new AlimentacaoException(); // 
        }
        this.alimentacao = alimentacao;
    }

    public float getPesoAbate() {
        return pesoAbate;
    }

    // Método para definir o peso de abate com validação
    public void setPesoAbate(float pesoAbate) throws PesoAbateException {
        if (pesoAbate <= 0) {
            throw new PesoAbateException();
        }
        this.pesoAbate = pesoAbate;
    }

    public float getPrecoPorKg() {
        return precoPorKg;
    }

    public void setPrecoPorKg(float precoPorKg) {
        if (precoPorKg <= 0) {
            throw new NumberFormatException("O preço por kg deve ser maior que zero.");
        }
        this.precoPorKg = precoPorKg;
    }

    // Sobrescrita: Implementação do método da interface CustoAbate
    public double calcularLucroAbate() {
        double receitaTotal = pesoAbate * precoPorKg;
        double custoAlimentacao = 50.0;
        double custoTransporte = 30.0;
        double custoAbate = 20.0;
        double custoTotal = custoAlimentacao + custoTransporte + custoAbate;
        double lucro = receitaTotal - custoTotal;

        return lucro;
    }

}
