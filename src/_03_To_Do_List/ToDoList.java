package _03_To_Do_List;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ToDoList implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton add = new JButton("ADD Task");
	JButton remove = new JButton("REMOVE Task");
	JButton view = new JButton("VIEW Tasks");
	JButton save = new JButton("SAVE Tasks");
	JButton load = new JButton("LOAD Tasks");
	ArrayList<String> tasks = new ArrayList<String>();

	/*
	 * Create a program with five buttons, add task, view tasks, remove task, save
	 * list, and load list.
	 *
	 * When add task is clicked: Create a JOptionPane to ask the user for a task and
	 * add it to an ArrayList
	 * 
	 * When the view tasks button is clicked: show all the tasks in the list
	 * 
	 * When the remove task button is clicked: Create a JOptionPane to prompt the
	 * user for which task to remove and take it off of the list.
	 * 
	 * When the save list button is clicked: Save the list to a file
	 * 
	 * When the load list button is clicked: Create a JOptionPane to Prompt the user
	 * for the location of the file and load the list from that file
	 * 
	 * When the program starts, it should automatically load the last saved file
	 * into the list.
	 */
	void run() {

		add.addActionListener(this);
		remove.addActionListener(this);
		view.addActionListener(this);
		save.addActionListener(this);
		load.addActionListener(this);
		panel.add(add);
		panel.add(remove);
		panel.add(save);
		panel.add(load);
		panel.add(view);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new ToDoList().run();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == add) {
			String newTask = JOptionPane.showInputDialog("What is your new task");
			tasks.add(newTask);
			JOptionPane.showMessageDialog(null, newTask+" added");
		}
		else if(e.getSource()== view) {
			String complete="";
			for(int i=0; i<tasks.size();i++) {
				complete=complete+(i+1)+": "+tasks.get(i)+"\n";
			}
			JOptionPane.showMessageDialog(null, complete);
		}
		else if(e.getSource()== remove) {
			String complete="";
			for(int i=0; i<tasks.size();i++) {
				complete=complete+(i+1)+": "+tasks.get(i)+"\n";
			}
			String choose= JOptionPane.showInputDialog("which task do you want to remove,\n"+ complete+"\n give number");
			int num= Integer.parseInt(choose);
			tasks.remove(num-1);
		}
		else if(e.getSource()==save) {
			String complete="";
			for(int i=0; i<tasks.size();i++) {
				complete=complete+(i+1)+": "+tasks.get(i)+"\n";
			}
			try { FileWriter fw = new FileWriter("src/_03_To_Do_List/toDoList.txt") ;
			fw.write(complete);
			fw.close();
			}
			catch (IOException f) {
				// TODO Auto-generated catch block
				f.printStackTrace();
			}
		}
		
	}
}
