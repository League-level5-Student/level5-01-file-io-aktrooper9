package _03_To_Do_List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ToDoList {
	/*
	 * Create a program with five buttons, add task, view tasks, remove task, save list, and load list. 
	 *
	 * When add task is clicked:
	 * 		Create a JOptionPane to ask the user for a task and add it to an ArrayList
	 * 
	 * When the view tasks button is clicked:
	 *		show all the tasks in the list
	 * 
	 * When the remove task button is clicked:
	 * 		Create a JOptionPane to prompt the user for which task to remove and take it off of the list.
	 * 
	 * When the save list button is clicked:
	 * 		Save the list to a file
	 * 
	 * When the load list button is clicked:
	 * 		Create a JOptionPane to Prompt the user for the location of the file and load the list from that file
	 * 
	 * When the program starts, it should automatically load the last saved file into the list. 
	 */
	public static void main(String[] args) {
		JFrame frame= new JFrame();
		JPanel panel= new JPanel();
		JButton add = new JButton("ADD Task");
		JButton remove = new JButton("REMOVE Task");
		JButton view = new JButton("VIEW Tasks");
		JButton save = new JButton("SAVE Tasks");
		JButton load = new JButton("LOAD Tasks");
		add.addActionListener(null);
		remove.addActionListener(null);
		view.addActionListener(null);
		save.addActionListener(null);
		load.addActionListener(null);
		panel.add(add);
		panel.add(remove);
		panel.add(save);
		panel.add(load);
		panel.add(view);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		



	}
}
