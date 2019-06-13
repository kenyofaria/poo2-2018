package model;

import java.util.Arrays;

import javax.swing.table.AbstractTableModel;

public class ModeloTablePessoas extends AbstractTableModel {

	private String cabecalho[] = {"Nome","Sobrenome"}; 
	
	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return 4;
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
		// TODO Auto-generated method stub
		return null;
	}

}
