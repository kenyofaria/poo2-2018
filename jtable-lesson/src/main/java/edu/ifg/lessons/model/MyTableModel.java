package edu.ifg.lessons.model;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import edu.ifg.lessons.entity.Student;

public class MyTableModel extends AbstractTableModel{

	private static final long serialVersionUID = 1L;
	
	private List<Student> students = new ArrayList<Student>();
	private String[] columnNames = { "Number", "Name"};
	
	public MyTableModel() {
		super();
	}
	
	public MyTableModel(List<Student> students) {
		this.students = students; 
	}
	
	public int getRowCount() {
		return students.size();
	}

	public int getColumnCount() {
		return columnNames.length;
	}
	
	public String getColumnName(int col) {
		return columnNames[col];
	}

	public Student get(int rowIndex) {
		return students.get(rowIndex);
	}
	
	public void add(Student s) {
		this.students.add(s);
		fireTableDataChanged();
	}
	
	public void remove(int index) {
		this.students.remove(index);
		fireTableDataChanged();
	}
	
	public Object getValueAt(int rowIndex, int columnIndex) {
		Student student = students.get(rowIndex);
		switch (columnIndex) {
			case 0:
				return student.getRegistrationNumber();
			case 1: 
				return student.getName();
			default:
				return null;
		}
	}
}
