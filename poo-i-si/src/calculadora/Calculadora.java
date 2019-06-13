package calculadora;


import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculadora extends JFrame {

	private ServicoCalculadora servico = new ServicoCalculadora();
	
	
	private JPanel containerPrincipal;
	private JTextField txtDisplay;
	private JButton btn_1;
	private JButton btn_2;
	private JButton btn_3;
	private JButton btn_4;
	private JButton btn_5;
	private JButton btn_6;
	private JButton btn_7;
	private JButton btn_8;
	private JButton btn_9;
	private JButton btn_0;
	private JButton btnPonto;
	private JButton btnAdicionar;
	private JButton btnIgual;
	private JButton btnLimpar;
	private JButton btnDividir;
	private JButton btnMultiplicar;
	private JButton btnSubtrair;

	private final int Y_PRIMEIRA_LINHA_NUMERICO = 50;
	private final int Y_SEGUNDA_LINHA_NUMERICO = 101;
	private final int Y_TERCEIRA_LINHA_NUMERICO = 152;
	private final int Y_QUARTA_LINHA_NUMERICO = 203;

	private final int X_PRIMEIRA_COLUNA_NUMERICO = 0;
	private final int X_SEGUNDA_COLUNA_NUMERICO = 51;
	private final int X_TERCEIRA_COLUNA_NUMERICO = 102;

	private final int LARGURA_BOTAO_NUMERICO = 50;
	private final int ALTURA_BOTAO_NUMERICO = 50;

	private final int Y_PRIMEIRA_LINHA_OPERADOR = 50;
	private final int Y_SEGUNDA_LINHA_OPERADOR = 91;
	private final int Y_TERCEIRA_LINHA_OPERADOR = 132;
	private final int Y_QUARTA_LINHA_OPERADOR = 173;
	private final int Y_QUINTA_LINHA_OPERADOR = 214;

	private final int X_COLUNA_OPERADOR = 154;

	private final int LARGURA_BOTAO_OPERADOR = 50;
	private final int ALTURA_BOTAO_OPERADOR = 40;

	private String sDisplay = "";
	private List<String> expressao = new ArrayList<>();
	private boolean limparDisplay = false;

	public Calculadora() {
		KeyboardFocusManager manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
		manager.addKeyEventDispatcher(new DispatcherFrameCalculadora());
		inicializaInterface();
	}

	private void inicializaInterface() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 300, 600);
		setTitle("Calculadora");
		containerPrincipal = new JPanel(null);
		
		defineDisplay();
		defineTecladoNumerico();
		defineTecladoOperacoes();
		defineListenersTecladoNumerico();
		defineListenersTecladoOperacoes();
		
		add(containerPrincipal);
		setVisible(true);
	}

	private void defineListenersTecladoOperacoes() {
		btnAdicionar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				operadorPressionado("+");
			}
		});

		btnSubtrair.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				operadorPressionado("-");
			}
		});

		btnIgual.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				igualPressionado();
			}
		});

		btnLimpar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				sDisplay = "";
				atualizaDisplay();
				expressao = new ArrayList<>();
			}
		});
	}

	private void defineListenersTecladoNumerico() {
		btn_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!limparDisplay) {
					sDisplay += "1";
					atualizaDisplay();
				} else {
					sDisplay = "1";
					atualizaDisplay();
					limparDisplay = false;
				}
			}
		});
		btn_2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!limparDisplay) {
					sDisplay += "2";
					atualizaDisplay();
				} else {
					sDisplay = "2";
					atualizaDisplay();
					limparDisplay = false;
				}
			}
		});
		btn_3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!limparDisplay) {
					sDisplay += "3";
					atualizaDisplay();
				} else {
					sDisplay = "3";
					atualizaDisplay();
					limparDisplay = false;
				}
			}
		});
		btn_4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!limparDisplay) {
					sDisplay += "4";
					atualizaDisplay();
				} else {
					sDisplay = "4";
					atualizaDisplay();
					limparDisplay = false;
				}
			}
		});
		btn_5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!limparDisplay) {
					sDisplay += "5";
					atualizaDisplay();
				} else {
					sDisplay = "5";
					atualizaDisplay();
					limparDisplay = false;
				}
			}
		});
		btn_6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!limparDisplay) {
					sDisplay += "6";
					atualizaDisplay();
				} else {
					sDisplay = "6";
					atualizaDisplay();
					limparDisplay = false;
				}
			}
		});
		btn_7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!limparDisplay) {
					sDisplay += "7";
					atualizaDisplay();
				} else {
					sDisplay = "7";
					atualizaDisplay();
					limparDisplay = false;
				}
			}
		});
		btn_8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!limparDisplay) {
					sDisplay += "8";
					atualizaDisplay();
				} else {
					sDisplay = "8";
					atualizaDisplay();
					limparDisplay = false;
				}
			}
		});
		btn_9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!limparDisplay) {
					sDisplay += "9";
					atualizaDisplay();
				} else {
					sDisplay = "9";
					atualizaDisplay();
					limparDisplay = false;
				}
			}
		});
		btn_0.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!limparDisplay) {
					sDisplay += "0";
					atualizaDisplay();
				} else {
					sDisplay = "0";
					atualizaDisplay();
					limparDisplay = false;
				}
			}
		});
	}

	private void defineTecladoOperacoes() {
		btnLimpar = new JButton("c");
		btnLimpar.setBounds(X_COLUNA_OPERADOR, Y_PRIMEIRA_LINHA_OPERADOR, LARGURA_BOTAO_OPERADOR,
				ALTURA_BOTAO_OPERADOR);

		btnDividir = new JButton("/");
		btnDividir.setBounds(X_COLUNA_OPERADOR, Y_SEGUNDA_LINHA_OPERADOR, LARGURA_BOTAO_OPERADOR,
				ALTURA_BOTAO_OPERADOR);

		btnMultiplicar = new JButton("X");
		btnMultiplicar.setBounds(X_COLUNA_OPERADOR, Y_TERCEIRA_LINHA_OPERADOR, LARGURA_BOTAO_OPERADOR,
				ALTURA_BOTAO_OPERADOR);

		btnSubtrair = new JButton("-");
		btnSubtrair.setBounds(X_COLUNA_OPERADOR, Y_QUARTA_LINHA_OPERADOR, LARGURA_BOTAO_OPERADOR,
				ALTURA_BOTAO_OPERADOR);

		btnAdicionar = new JButton("+");
		btnAdicionar.setBounds(X_COLUNA_OPERADOR, Y_QUINTA_LINHA_OPERADOR, LARGURA_BOTAO_OPERADOR,
				ALTURA_BOTAO_OPERADOR);

		containerPrincipal.add(btnAdicionar);
		containerPrincipal.add(btnLimpar);
		containerPrincipal.add(btnDividir);
		containerPrincipal.add(btnMultiplicar);
		containerPrincipal.add(btnSubtrair);
	}

	private void defineTecladoNumerico() {
		btn_1 = new JButton("1");
		btn_2 = new JButton("2");
		btn_3 = new JButton("3");
		btn_4 = new JButton("4");
		btn_5 = new JButton("5");
		btn_6 = new JButton("6");
		btn_7 = new JButton("7");
		btn_8 = new JButton("8");
		btn_9 = new JButton("9");
		btn_0 = new JButton("0");
		btnPonto = new JButton(".");
		btnIgual = new JButton("=");

		btn_1.setBounds(X_PRIMEIRA_COLUNA_NUMERICO, Y_TERCEIRA_LINHA_NUMERICO, LARGURA_BOTAO_NUMERICO,
				ALTURA_BOTAO_NUMERICO);
		btn_2.setBounds(X_SEGUNDA_COLUNA_NUMERICO, Y_TERCEIRA_LINHA_NUMERICO, LARGURA_BOTAO_NUMERICO,
				ALTURA_BOTAO_NUMERICO);
		btn_3.setBounds(X_TERCEIRA_COLUNA_NUMERICO, Y_TERCEIRA_LINHA_NUMERICO, LARGURA_BOTAO_NUMERICO,
				ALTURA_BOTAO_NUMERICO);
		btn_4.setBounds(X_PRIMEIRA_COLUNA_NUMERICO, Y_SEGUNDA_LINHA_NUMERICO, LARGURA_BOTAO_NUMERICO,
				ALTURA_BOTAO_NUMERICO);
		btn_5.setBounds(X_SEGUNDA_COLUNA_NUMERICO, Y_SEGUNDA_LINHA_NUMERICO, LARGURA_BOTAO_NUMERICO,
				ALTURA_BOTAO_NUMERICO);
		btn_6.setBounds(X_TERCEIRA_COLUNA_NUMERICO, Y_SEGUNDA_LINHA_NUMERICO, LARGURA_BOTAO_NUMERICO,
				ALTURA_BOTAO_NUMERICO);
		btn_7.setBounds(X_PRIMEIRA_COLUNA_NUMERICO, Y_PRIMEIRA_LINHA_NUMERICO, LARGURA_BOTAO_NUMERICO,
				ALTURA_BOTAO_NUMERICO);
		
		btn_8.setBounds(X_SEGUNDA_COLUNA_NUMERICO, Y_PRIMEIRA_LINHA_NUMERICO, LARGURA_BOTAO_NUMERICO,
				ALTURA_BOTAO_NUMERICO);
		btn_9.setBounds(X_TERCEIRA_COLUNA_NUMERICO, Y_PRIMEIRA_LINHA_NUMERICO, LARGURA_BOTAO_NUMERICO,
				ALTURA_BOTAO_NUMERICO);
		btn_0.setBounds(X_PRIMEIRA_COLUNA_NUMERICO, Y_QUARTA_LINHA_NUMERICO, LARGURA_BOTAO_NUMERICO,
				ALTURA_BOTAO_NUMERICO);
		btnPonto.setBounds(X_SEGUNDA_COLUNA_NUMERICO, Y_QUARTA_LINHA_NUMERICO, LARGURA_BOTAO_NUMERICO,
				ALTURA_BOTAO_NUMERICO);
		btnIgual.setBounds(X_TERCEIRA_COLUNA_NUMERICO, Y_QUARTA_LINHA_NUMERICO, LARGURA_BOTAO_NUMERICO,
				ALTURA_BOTAO_NUMERICO);

		containerPrincipal.add(txtDisplay);
		containerPrincipal.add(btn_1);
		containerPrincipal.add(btn_2);
		containerPrincipal.add(btn_3);
		containerPrincipal.add(btn_4);
		containerPrincipal.add(btn_5);
		containerPrincipal.add(btn_6);
		containerPrincipal.add(btn_7);
		containerPrincipal.add(btn_8);
		containerPrincipal.add(btn_9);
		containerPrincipal.add(btn_0);
		containerPrincipal.add(btnPonto);
		containerPrincipal.add(btnIgual);
	}

	private void defineDisplay() {
		txtDisplay = new JTextField();
		txtDisplay.setBounds(1, 1, 298, 40);
		txtDisplay.setEnabled(false);
		txtDisplay.setHorizontalAlignment(JTextField.RIGHT);
	}

	

	private void igualPressionado() {
		if (!sDisplay.isEmpty() && expressao.size() == 2)
			expressao.add(sDisplay);
		if (servico.eUmaExpressao(expressao)) {
			Integer resultado = servico.executaOperacao(expressao);
			expressao.clear();
			expressao.add(resultado.toString());
			sDisplay = resultado.toString();
			atualizaDisplay();
		}

	}
	
	private void operadorPressionado(String operador) {
		if (!sDisplay.isEmpty()) {

			if (servico.ePossivelIncrementarAExpressao(expressao)) {
				expressao.add(sDisplay);
			}
		}
		if (servico.eUmaExpressao(expressao)) {
			Integer resultado = servico.executaOperacao(expressao);
			expressao.clear();
			expressao.add(resultado.toString());
			sDisplay = resultado.toString();
			atualizaDisplay();
		}
		expressao.add(operador);
		limparDisplay = true;
	}

	private void atualizaDisplay() {
		txtDisplay.setText(sDisplay);
	}

	
	public static void main(String[] args) {
		new Calculadora();
	}

	
	private class DispatcherFrameCalculadora implements KeyEventDispatcher {
		@Override
		public boolean dispatchKeyEvent(KeyEvent e) {
			if (e.getID() == KeyEvent.KEY_PRESSED) {
				if (e.getKeyCode() == KeyEvent.VK_1) {
					btn_1.doClick();
				}
				if (e.getKeyCode() == KeyEvent.VK_2) {
					btn_2.doClick();
				}
				if (e.getKeyCode() == KeyEvent.VK_3) {
					btn_3.doClick();
				}
				if (e.getKeyCode() == KeyEvent.VK_4) {
					btn_4.doClick();
				}
				if (e.getKeyCode() == KeyEvent.VK_5) {
					btn_5.doClick();
				}
				if (e.getKeyCode() == KeyEvent.VK_6) {
					btn_6.doClick();
				}
				if (e.getKeyCode() == KeyEvent.VK_7) {
					btn_7.doClick();
				}
				if (e.getKeyCode() == KeyEvent.VK_8) {
					btn_8.doClick();
				}
				if (e.getKeyCode() == KeyEvent.VK_9) {
					btn_9.doClick();
				}
				if (e.getKeyCode() == KeyEvent.VK_0) {
					btn_0.doClick();
				}
				if (e.getKeyCode() == KeyEvent.VK_PERIOD) {
					btnPonto.doClick();
				}
				if (e.getKeyCode() == KeyEvent.VK_ADD) {
					btnAdicionar.doClick();
				}
				if (e.getKeyCode() == KeyEvent.VK_SUBTRACT) {
					btnSubtrair.doClick();
				}
				if (e.getKeyCode() == KeyEvent.VK_MULTIPLY) {
					btnMultiplicar.doClick();
				}
				if (e.getKeyCode() == KeyEvent.VK_SLASH) {
					btnDividir.doClick();
				}
				if (e.getKeyCode() == KeyEvent.VK_EQUALS) {
					btnIgual.doClick();
				}
				if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
					btnLimpar.doClick();
				}
				if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
					btnLimpar.doClick();
				}

			}
			return false;
		}
	}

	

	

	
	
	

	
}
