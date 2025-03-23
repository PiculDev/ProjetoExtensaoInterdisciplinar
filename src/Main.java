import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Bem> bens = new ArrayList<>();

        Integer opcao = 0;
        Integer codigo = 0;

        do {
            opcao = escolherOpcao();

            if (opcao == 1) {
                codigo++;
                cadastrarBem(bens, codigo);
            } else if (opcao == 2) {
                exibirBensCadastrados(bens);
            } else if (opcao == 3) {
                marcarBemDoado(bens);
            }

        } while (opcao != 6);
    }

    private static void cadastrarBem(List<Bem> bens, Integer codigo) {

        Bem bem = new Bem();

        bem.setCodigo(codigo);
        bem.setaDescricao(bem);
        bem.setaTipo(bem);
        bem.setaLocalRetirada(bem);
        bem.setaDataRetirada(bem);

        bem.setPessoaContato(JOptionPane.showInputDialog("Insira seu Nome para Contato (Opcional)"));
        bem.setTelefoneContato(JOptionPane.showInputDialog("Insira seu Telefone para Contato (Opcional)"));
        bem.setEmailContato(JOptionPane.showInputDialog("Insira seu E-mail para Contato (Opcional)"));

        bens.add(bem);
    }

    private static void exibirBensCadastrados(List<Bem> bens) {

        JOptionPane.showMessageDialog(null, getBensCadastrados(bens));
    }

    private static String getBensCadastrados(List<Bem> bens) {

        String bensCadastrados = "Lista de Bens: \n" +
                "===============================\n";

        for (Bem bem : bens) {

            bensCadastrados +=
                    "• Código: " + bem.getCodigo() + "\n" +
                            "• Descrição: " + bem.getDescricao() + "\n" + "• Tipo: " + getBemTipos(bem.getTipo()) + "\n" +
                            "===============================\n";
        }

        return bens.isEmpty() ? "Nenhum Bem cadastrado, verifique!" : bensCadastrados;
    }

    private static void marcarBemDoado(List<Bem> bens) {

        Integer codigo = Integer.parseInt(JOptionPane.showInputDialog("Qual o código do Bem que deseja marcar como Doado?"));

        Bem bemDoado = bens.stream().filter(i -> i.getCodigo().compareTo(codigo) == 0).findFirst().orElse(null);

        if (bemDoado != null) {

            bemDoado.setDoado(Boolean.TRUE);

            JOptionPane.showMessageDialog(null, String.format("Bem %s marcado como Doado!", codigo));
        } else {

            JOptionPane.showMessageDialog(null, String.format("Nenhum Bem cadastrado com o código %s!", codigo));
        }
    }

    private static String getBemTipos(Integer tipo) {

        if (tipo == 1) {
            return "1 - Cama";
        } else if (tipo == 2) {
            return "2 - Roupa";
        } else if (tipo == 3) {
            return "3 - Móvel";
        } else if (tipo == 4) {
            return "4 - Cozinha";
        } else if (tipo == 5) {
            return "5 - Eletrodomésticos";
        } else if (tipo == 6) {
            return "6 - Bebê";
        } else if (tipo == 7) {
            return "7 - Higiene";
        } else if (tipo == 8) {
            return "8 - Alimentos";
        }
        return "";
    }

    private static Integer escolherOpcao() {

        String opcoes = "1 - Cadastrar Bem\n" + "2 - Exibir Bens Cadastrados\n" + "3 - Marcar Bem como Doado\n" + "6 - Sair";

        return Integer.parseInt(JOptionPane.showInputDialog(opcoes));
    }

}
