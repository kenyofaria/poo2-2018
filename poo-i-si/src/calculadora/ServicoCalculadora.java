package calculadora;

import java.util.List;

public class ServicoCalculadora {
	
	public boolean ePossivelIncrementarAExpressao(List<String> expressao) {
		if(expressao.size()==0) {
			return true;
		}
		if(eUmOperador(expressao.get(expressao.size()-1))) {
			return true;
		}else return false;
	}
	
	private boolean eUmOperador(String s) {
		if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
			return true;
		}else return false;
	}
	
	public boolean eUmaExpressao(List<String> elementos) {
		if(elementos.size() == 3) {
			if(eUmOperador(elementos.get(1))) {
				return true;
			}else return false;
		}else return false;
	}
	
	public Integer executaOperacao(List<String> expressao) {
		if (expressao.get(1).equals("+"))
			return Integer.parseInt(expressao.get(0)) + Integer.parseInt(expressao.get(2));
		if (expressao.get(1).equals("-"))
			return Integer.parseInt(expressao.get(0)) - Integer.parseInt(expressao.get(2));
		return 0;
	}
}
