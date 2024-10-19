//Douglas Cunha 2209373
//ADS 2024

import javax.swing.JOptionPane;

public class AlimentacaoException extends Exception {

    public AlimentacaoException() {
        super("A alimentação deve ser 'racao' ou 'restos'.");
    }

    public void impAlimentacaoInvalida() {
        JOptionPane.showMessageDialog(null,
                getMessage(),
                "Erro de Alimentação",
                JOptionPane.ERROR_MESSAGE);
    }
}
