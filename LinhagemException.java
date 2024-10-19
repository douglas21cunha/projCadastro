//Douglas Cunha 2209373
//ADS 2024

import javax.swing.JOptionPane;

public class LinhagemException extends Exception {

    public void impLinhagemInvalida() {
        JOptionPane.showMessageDialog(null,
                "A linhagem deve ser 'puro sangue' ou 'lusitano",
                "Linhagem Inválida",
                JOptionPane.ERROR_MESSAGE);
    }

    public Cavalo corLinhagem(Cavalo c1) {
        try {
            String linhagem = JOptionPane.showInputDialog(null,
                    "Digite o tipo de linhagem (puro sangue ou lusitano ).",
                    "Entrada de Linhagem",
                    JOptionPane.QUESTION_MESSAGE);

            // Verifica se a entrada é válida
            if (!linhagem.equalsIgnoreCase("puro sangue") && !linhagem.equalsIgnoreCase("lusitano ")) {
                throw new LinhagemException();
            }

            c1.setLinhagem(linhagem);

        } catch (LinhagemException le) {
            le.impLinhagemInvalida();
            c1 = le.corLinhagem(c1);
        }

        return c1;
    }
}
