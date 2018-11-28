package edu.ifg.lessons;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import edu.ifg.lessons.model.MyTableModel;
import edu.ifg.lessons.services.StudentService;

public class Main extends JFrame{

	private static final long serialVersionUID = 1L;
	private JPanel container;
	private JTable grid;
	private JScrollPane scrollPane;
	
	
	private StudentService studentService;
	
		
	public Main() {
		init();
	}
	
	private void init() {
		
		studentService = new StudentService();
		setDefaultLookAndFeelDecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(0, 0, 800, 600);
		container = new JPanel();
		container.setLayout(null);
		this.add(container);

		MyTableModel model = new MyTableModel(studentService.getStudents());
		grid = new JTable(model);
		scrollPane = new JScrollPane(grid);
		scrollPane.setBounds(10, 10, 700, 100);
		container.add(scrollPane);
		
		
		JScrollPane build = new CustomStripedJTable()
								.inPosition(10, 130)
								.withDimensions(700, 100)
								.usingModel(model)
								.striped(true)
								.build();
		container.add(build);
		
		
		
		//container.add(grid);
		setVisible(true);
	}
	

	
	public static void main(String[] args) {
		new Main();
	}
	
}
