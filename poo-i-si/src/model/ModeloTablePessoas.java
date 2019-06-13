package model;

import java.util.Arrays;
import java.util.List;

import javax.swing.table.AbstractTableModel;

public class ModeloTablePessoas extends AbstractTableModel {

	private String cabecalho[] = {"Nome","Sobrenome"};
	private List<Pessoa> pessoas;
	
	public ModeloTablePessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}
	
	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return pessoas.size();
	}

	@Override
	public int getColumnCount() {
		return cabecalho.length;
	}
	
	@Override
	public String getColumnName(int posicao) {
		return cabecalho[posicao];
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		switch (columnIndex) {
		case 0:
			return pessoas.get(rowIndex).getNome();
		case 1:
			return pessoas.get(rowIndex).getSobreNome();
		default:
			break;
		}
		return null;
	}

}
