package edu.ifg.lessons;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JComponent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableCellRenderer;

public class CustomStripedJTable extends JTable{

	private static final long serialVersionUID = 1L;
	private int x;
	private int y;
	private int width;
	private int height;
	private boolean striped = false;
	private boolean paint = false;
	
	private Border outside = new MatteBorder(1, 0, 1, 0, Color.RED);
	private Border inside = new EmptyBorder(0, 1, 0, 1);
	private Border highlight = new CompoundBorder(outside, inside);
	

	public CustomStripedJTable() {
	
	}
	
	public CustomStripedJTable inPosition(int x, int y) {
		this.x = x;
		this.y = y;
		return this;
	}
	
	public CustomStripedJTable withDimensions(int width, int height) {
		this.width = width;
		this.height = height;
		return this;
	}
	
	public CustomStripedJTable usingModel(AbstractTableModel model) {
		setModel(model);
		return this;
	}
	
	public CustomStripedJTable striped(boolean striped) {
		this.striped = striped;
		return this;
	}
	
	public CustomStripedJTable paintSelectedRow(boolean paint) {
		this.paint = paint;
		return this;
	}
	
	public CustomStripedJTable paintUsingColor(Color color) {
		outside = new MatteBorder(1, 0, 1, 0, color);
		return this;
	}
	
	
	@Override
	public Component prepareRenderer(TableCellRenderer renderer, int row, int column) {
		Component c = super.prepareRenderer(renderer, row, column);
		if (striped && !isRowSelected(row))
			c.setBackground(row % 2 == 0 ? getBackground() : Color.yellow);
		
		
		
		JComponent jc = (JComponent) c;
		if (paint && isRowSelected(row))
			jc.setBorder( highlight );
		return c;
	}
	
	public JScrollPane build() {
		setPreferredScrollableViewportSize(getPreferredSize());
		changeSelection(0, 0, false, false);
		setAutoResizeMode(JTable.WIDTH);
		setBorder(null);
		JScrollPane jScrollPane = new JScrollPane( this );
		jScrollPane.setBounds(x, y, width, height);
		return jScrollPane;	
	}
	
}
