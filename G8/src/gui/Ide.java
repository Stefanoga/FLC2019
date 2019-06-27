package gui;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ide {

	public JFrame frame;
	public String filename;
	public String dir;

	public Ide() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 696, 473);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 10, 660, 339);
		frame.getContentPane().add(textArea);
		
		JButton btnSalva = new JButton("Save");
		btnSalva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 JFileChooser c = new JFileChooser();
			      // Demonstrate "Save" dialog:
			      int rVal = c.showSaveDialog(frame);
			      if (rVal == JFileChooser.APPROVE_OPTION) {
			        filename=(c.getSelectedFile().getName());
			        dir=(c.getCurrentDirectory().toString());
			        System.out.println(filename);
					System.out.println(dir);
			      }
			      if (rVal == JFileChooser.CANCEL_OPTION) {
			        filename=("You pressed cancel");
			        dir=("");
			      }
			}
		});
		btnSalva.setBounds(46, 377, 99, 34);
		frame.getContentPane().add(btnSalva);
		
		JButton btnLoad = new JButton("Load");
		btnLoad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser c = new JFileChooser();
			      // Demonstrate "Open" dialog:
			      int rVal = c.showOpenDialog(frame);
			      if (rVal == JFileChooser.APPROVE_OPTION) {
			        filename=(c.getSelectedFile().getName());
			        dir=(c.getCurrentDirectory().toString());
			      }
			      if (rVal == JFileChooser.CANCEL_OPTION) {
			        filename=("You pressed cancel");
			        dir=("");
			      }
			}
		});
		btnLoad.setBounds(288, 377, 99, 34);
		frame.getContentPane().add(btnLoad);
		
		JButton btnDraw = new JButton("Draw");
		btnDraw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnDraw.setBounds(541, 377, 99, 34);
		frame.getContentPane().add(btnDraw);
		
	}
	
	
}
