//Douglas Cunha 2209373
//ADS 2024

import javax.swing.JOptionPane;

public class PesoAbateException extends Exception {

    public PesoAbateException() {
        super("O peso deve ser positivo, maior que zero!");
    }

    public void impPesoAbate() {
        JOptionPane.showMessageDialog(null,
                getMessage(),
                "Erro de Peso Abate",
                JOptionPane.ERROR_MESSAGE);
    }
}
