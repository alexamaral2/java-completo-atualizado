package br.com.alexjr.cursodjava.clientes.apresentacao;

import br.com.alexjr.cursodjava.clientes.dominio.Cliente;
import br.com.alexjr.cursodjava.clientes.dominio.enums.TipoSexo;
import br.com.alexjr.cursodjava.clientes.dominio.exceptions.CpfInvalidoException;
import br.com.alexjr.cursodjava.clientes.logicanegocio.Cadastro;
import br.com.alexjr.cursodjava.clientes.logicanegocio.LogicaCadastroClienteFake;
import br.com.alexjr.cursodjava.clientes.logicanegocio.LogicaCadastroMemoria;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCadastro extends JFrame {

    private JLabel labelNome;
    private JLabel labelCpf;
    private JLabel labelSexo;

    private JTextField campoNome;
    private JTextField campoCpf;
    private JComboBox<TipoSexo> campoSexo;

    private JButton botaoSalvar;

    private Cadastro<Cliente> logicaCadastro = new LogicaCadastroMemoria();

    public TelaCadastro(){
        construirTela();
        this.logicaCadastro = new LogicaCadastroMemoria();
    }

    private void construirTela(){
        setSize(600, 500);
        setTitle("Cadastro de Cliente");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);

        this.adicionarCampos();
        this.adicionarBotoes();
        this.adicionarComponentesFoto();
    }

    private void adicionarCampos(){
        labelNome = new JLabel("Nome:");
        labelNome.setBounds(20, 20, 200, 20);
        getContentPane().add(labelNome);

        campoNome = new JTextField();
        campoNome.setBounds(20, 40, 200, 20);
        getContentPane().add(campoNome);

        labelCpf = new JLabel("CPF:");
        labelCpf.setBounds(20, 60, 200, 20);
        getContentPane().add(labelCpf);

        campoCpf = new JTextField();
        campoCpf.setBounds(20, 80, 200, 20);
        getContentPane().add(campoCpf);

        labelSexo = new JLabel("Sexo:");
        labelSexo.setBounds(20, 100, 200, 20);
        getContentPane().add(labelSexo);

        TipoSexo[] tipoSexo = {null, TipoSexo.M, TipoSexo.F};
        campoSexo = new JComboBox<>(tipoSexo);
        campoSexo.setBounds(20, 120, 200, 20);
        getContentPane().add(campoSexo);
    }

    private void adicionarBotoes(){
        botaoSalvar = new JButton("Salvar");
        botaoSalvar.setBounds(20, 160, 100, 20);

        ActionListener acaoBotaoSalvar = this.botaoSalvarActionListener();

        botaoSalvar.addActionListener(acaoBotaoSalvar);

        getContentPane().add(botaoSalvar);
    }

    private void adicionarComponentesFoto(){

    }

    private ActionListener botaoSalvarActionListener() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cliente cliente = new Cliente();
                cliente.setNome(campoNome.getText());
                cliente.setCpf(campoCpf.getText());
                cliente.setSexo((TipoSexo) campoSexo.getSelectedItem());

                try {
                    logicaCadastro.salvar(cliente);
                    logicaCadastro.imprimirRegistros();
                } catch (CpfInvalidoException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        };
    }

}
