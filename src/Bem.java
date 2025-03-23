import javax.swing.*;
import java.util.Arrays;
import java.util.Calendar;

public class Bem {

    private Integer codigo;
    private String descricao;
    private Integer tipo;
    private String localRetirada;
    private String dataRetirada;
    private String pessoaContato;
    private String telefoneContato;
    private String emailContato;
    private Boolean doado = Boolean.FALSE;


    public void setaDescricao(Bem bem) {

        bem.setDescricao(JOptionPane.showInputDialog("Insira a descrição do Bem!"));

        if (bem.getDescricao() == null || "".equals(bem.getDescricao())) {

            setaDescricao(bem);
        }
    }

    public void setaTipo(Bem bem) {
        //TODO - Trocar para cadastro de tipo...
        bem.setTipo(Integer.parseInt(JOptionPane.showInputDialog("Insira o Tipo do do Bem!\n" + "1 - Cama\n" + "2 - Roupa\n" + "3 - Móvel\n" + "4 - Cozinha\n" + "5 - Eletrodomésticos\n" + "6 - Bebê\n" + "7 - Higiene\n" + "8 - Alimentos")));

        if (bem.getTipo() == null || !Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8).contains(bem.getTipo())) {

            setaTipo(bem);
        }
    }

    public void setaLocalRetirada(Bem bem) {

        bem.setLocalRetirada(JOptionPane.showInputDialog("Insira o Local de Retirada do Bem!"));

        if (bem.getLocalRetirada() == null || "".equals(bem.getLocalRetirada())) {

            setaLocalRetirada(bem);
        }
    }

    public void setaDataRetirada(Bem bem) {

        bem.setDataRetirada(JOptionPane.showInputDialog("Insira a Data de Retirada do Bem!"));

        if (bem.getDataRetirada() == null || "".equals(bem.getDataRetirada())) {

            setaDataRetirada(bem);
        }
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {

        this.descricao = descricao;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    public String getLocalRetirada() {
        return localRetirada;
    }

    public void setLocalRetirada(String localRetirada) {
        this.localRetirada = localRetirada;
    }

    public String getDataRetirada() {
        return dataRetirada;
    }

    public void setDataRetirada(String dataRetirada) {
        this.dataRetirada = dataRetirada;
    }

    public String getPessoaContato() {
        return pessoaContato;
    }

    public void setPessoaContato(String pessoaContato) {
        this.pessoaContato = pessoaContato;
    }

    public String getTelefoneContato() {
        return telefoneContato;
    }

    public void setTelefoneContato(String telefoneContato) {
        this.telefoneContato = telefoneContato;
    }

    public String getEmailContato() {
        return emailContato;
    }

    public void setEmailContato(String emailContato) {
        this.emailContato = emailContato;
    }

    public Boolean getDoado() {
        return doado;
    }

    public void setDoado(Boolean doado) {
        this.doado = doado;
    }
}
