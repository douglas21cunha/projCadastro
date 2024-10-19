//Douglas Cunha 2209373
//ADS 2024
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class BDAnimais { 

    // Lista genérica para armazenar objetos de qualquer classe que herde de Animal
    private List<Animal> bdAnimais = new ArrayList<>();

    // MÉTODO SINGLETON
    private static BDAnimais instance;

    public static BDAnimais getInstance() {
        if (instance == null) {
            instance = new BDAnimais();
        }
        return instance;
    }

    // Método para cadastrar um novo animal
    public Animal cadAnimal(Animal animal) {
        if (consAnimalPorId(animal.getId()) == null) {
            bdAnimais.add(animal);
            return animal;
        } else {
            return null; 
        }
    }

    // Método para consultar um animal pelo ID
    public Animal consAnimalPorId(int id) {
        for (Animal a : bdAnimais) {
            if (a.getId() == id) {
                return a;
            }
        }
        return null; 
    }

    // Método para remover um animal pelo ID
    public Animal removeAnimal(int id) {
        Animal animal = consAnimalPorId(id);
        if (animal != null) {
            bdAnimais.remove(animal);
        }
        return animal; // Retorna o animal removido ou null se não encontrou
    }

   
    // Método para atualizar os dados de um animal existente
    public Animal atualizaAnimalPorId(Animal animal) {
        for (int i = 0; i < bdAnimais.size(); i++) {
            if (animal.getId() == bdAnimais.get(i).getId()) {
                // Solicita os novos dados comuns através de JOptionPane
                String novoPeso = JOptionPane.showInputDialog(null, "Informe o NOVO peso", "Atualização", JOptionPane.QUESTION_MESSAGE);
                String novaIdade = JOptionPane.showInputDialog(null, "Informe a NOVA idade", "Atualização", JOptionPane.QUESTION_MESSAGE);

                try {
                    animal.setPeso(Float.parseFloat(novoPeso));
                    animal.setIdade(Integer.parseInt(novaIdade));

                    // Verifica o tipo de animal e solicita os dados específicos
                    if (animal instanceof Vaca) {
                        Vaca vaca = (Vaca) animal;
                        String novoLeite = JOptionPane.showInputDialog(null, "Informe a NOVA quantidade de leite", "Atualização", JOptionPane.QUESTION_MESSAGE);
                        String novosPartos = JOptionPane.showInputDialog(null, "Informe o NOVO número de partos", "Atualização", JOptionPane.QUESTION_MESSAGE);
                        String novaProdCarne = JOptionPane.showInputDialog(null, "Informe a NOVA produção de carne", "Atualização", JOptionPane.QUESTION_MESSAGE);

                        vaca.setLeite(Integer.parseInt(novoLeite));
                        vaca.setPartos(Integer.parseInt(novosPartos));
                        vaca.setProdCarne(Float.parseFloat(novaProdCarne));

                    } else if (animal instanceof Cavalo) {
                        Cavalo cavalo = (Cavalo) animal;

                        // Solicita os novos dados específicos do cavalo
                        String novaCorPelagem = JOptionPane.showInputDialog(null, "Informe a NOVA cor da pelagem", "Atualização", JOptionPane.QUESTION_MESSAGE);
                        String novoTipoAndamento = JOptionPane.showInputDialog(null, "Informe o NOVO tipo de andamento", "Atualização", JOptionPane.QUESTION_MESSAGE);
                        String novaLinhagem = JOptionPane.showInputDialog(null, "Informe a NOVA linhagem", "Atualização", JOptionPane.QUESTION_MESSAGE);

                        cavalo.setCorPelagem(novaCorPelagem.trim());
                        cavalo.setTipoAndamento(novoTipoAndamento.trim());

                        try {
                            cavalo.setLinhagem(novaLinhagem.trim());
                        } catch (LinhagemException le) {
                            JOptionPane.showMessageDialog(null, "Linhagem inválida. Deve ser 'puro sangue' ou 'lusitano'.", "Erro de Linhagem", JOptionPane.ERROR_MESSAGE);
                            return null;
                        }

                    } else if (animal instanceof Porco) {
                        Porco porco = (Porco) animal;

                        // Solicita a nova alimentação do porco
                        String novaAlimentacao = JOptionPane.showInputDialog(null, "Informe a NOVA alimentação ('racao' ou 'restos')", "Atualização", JOptionPane.QUESTION_MESSAGE);

                        // Tenta definir a nova alimentação usando a exceção de validação
                        try {
                            porco.setAlimentacao(novaAlimentacao.trim());
                        } catch (AlimentacaoException ae) {
                            JOptionPane.showMessageDialog(null, "Alimentação inválida. Deve ser 'racao' ou 'restos'.", "Erro de Alimentação", JOptionPane.ERROR_MESSAGE);
                            return null;
                        }

                        // Solicita os outros dados específicos do porco
                        String novoPesoAbate = JOptionPane.showInputDialog(null, "Informe o NOVO peso de abate", "Atualização", JOptionPane.QUESTION_MESSAGE);
                        String novoPrecoPorKg = JOptionPane.showInputDialog(null, "Informe o NOVO preço por kg", "Atualização", JOptionPane.QUESTION_MESSAGE);

                        // Valida as entradas e lança exceção se forem inválidas
                        if (novoPesoAbate == null || novoPesoAbate.trim().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Peso de abate inválido. Por favor, insira um valor.", "Erro de Peso de Abate", JOptionPane.ERROR_MESSAGE);
                            return null;
                        }
                        if (novoPrecoPorKg == null || novoPrecoPorKg.trim().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Preço por kg inválido. Por favor, insira um valor.", "Erro de Preço por Kg", JOptionPane.ERROR_MESSAGE);
                            return null;
                        }

                        // Converte e define os valores após validar
                        try {
                            porco.setPesoAbate(Float.parseFloat(novoPesoAbate.trim()));
                        } catch (NumberFormatException nfe) {
                            JOptionPane.showMessageDialog(null, "Peso de abate inválido. O peso deve ser numérico.", "Erro de Peso de Abate", JOptionPane.ERROR_MESSAGE);
                            return null;
                        }

                        try {
                            porco.setPrecoPorKg(Float.parseFloat(novoPrecoPorKg.trim()));
                        } catch (NumberFormatException nfe) {
                            JOptionPane.showMessageDialog(null, "Preço por kg inválido. Por favor, insira um valor numérico válido.", "Erro de Preço por Kg", JOptionPane.ERROR_MESSAGE);
                            return null;
                        }
                    }

                    // Atualização bem-sucedida, retorna o animal atualizado
                    return animal;

                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(null, "Erro ao atualizar os dados: por favor, insira números válidos.", "Erro de Formato", JOptionPane.ERROR_MESSAGE);
                    return null;
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                    return null;
                }
            }
        }

        // Retorna null se o ID não for encontrado
        JOptionPane.showMessageDialog(null, "ID não encontrado. Nenhum animal foi atualizado.", "Erro", JOptionPane.ERROR_MESSAGE);
        return null;
    }

    public Animal atualizaAnimal(Animal animal) {
        for (int i = 0; i < bdAnimais.size(); i++) {
            if (bdAnimais.get(i).getId() == animal.getId()) {
                bdAnimais.set(i, animal);
                return animal;
            }
        }
        return null; 
    }

    // Método para obter todos os animais cadastrados (opcional, pode ser útil)
    public List<Animal> getBdAnimais() {
        return bdAnimais;
    }
}
