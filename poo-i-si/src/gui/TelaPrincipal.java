package gui;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import model.ModeloTablePessoas;

public class TelaPrincipal extends JFrame{

	private JPanel containerPrincipal;
	private JTextField campoNome;
	private JTextField campoSobreNome;
	private JLabel lblNome;
	private JLabel lblSobreNome;
	private JButton botaoSalvar;
	private JTable tblPessoas;
	private JScrollPane scrlPessoas;
	
	private final int ALTURA_COMPONENTE = 30;
	private final int LARGURA_COMPONENTE_TEXTO = 300;
	private final int COORDENADA_MAIS_A_ESQUERDA = 30;
	
	public TelaPrincipal() {
		inicializaTela();
	}

	private void inicializaTela() {
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("CRUD");
		containerPrincipal = new JPanel();
		containerPrincipal.setLayout(null);
		
		defineComponentesNaTela();
		
		
		botaoSalvar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Component component = (Component) e.getSource();
				JFrame frame = (JFrame) SwingUtilities.getRoot(component);
				JOptionPane.showMessageDialog(frame, 
						campoNome.getText().trim() + " " + campoSobreNome.getText().trim(),
						"POO I", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		
		
		add(containerPrincipal);
		setVisible(true);
	}

	private void defineComponentesNaTela() {
		lblNome = new JLabel("Nome");
		lblNome.setBounds(35, 10, 50, 30);
		containerPrincipal.add(lblNome);
		
		campoNome = new JTextField();
		campoNome.setBounds(COORDENADA_MAIS_A_ESQUERDA, 30, LARGURA_COMPONENTE_TEXTO, ALTURA_COMPONENTE);
		containerPrincipal.add(campoNome);
		
		lblSobreNome = new JLabel("Sobrenome");
		lblSobreNome.setBounds(355, 10, 100, 30);
		containerPrincipal.add(lblSobreNome);
		
		campoSobreNome = new JTextField();
		campoSobreNome.setBounds(350, 30, LARGURA_COMPONENTE_TEXTO, ALTURA_COMPONENTE);
		containerPrincipal.add(campoSobreNome);
		
		botaoSalvar = new JButton("salvar");
		botaoSalvar.setBounds(25, 60, 100, ALTURA_COMPONENTE);
		containerPrincipal.add(botaoSalvar);
		
		ModeloTablePessoas modeloTabela = new ModeloTablePessoas();
		tblPessoas = new JTable(modeloTabela);
		scrlPessoas = new JScrollPane(tblPessoas);
		scrlPessoas.setBounds(COORDENADA_MAIS_A_ESQUERDA, 100, 600, 200);
		containerPrincipal.add(scrlPessoas);
	}
	
	public static void main(String[] args) {
		new TelaPrincipal();
	}
}
