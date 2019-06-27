package gui;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import org.antlr.runtime.RecognitionException;

import parser.G8Parser.SameNameError;
import parser.G8Parser.ShapeLayoutError;

import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.event.ActionEvent;

import start.G8;
import javax.swing.JScrollPane;

public class Ide {

	public JFrame frame;
	public String filename;
	public String dir;

	public Ide() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 692, 638);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea textArea = new JTextArea();
		JScrollPane scroll = new JScrollPane(textArea);
		scroll.setBounds(10, 10, 660, 339);
		scroll.setVisible(true);
		frame.getContentPane().add(scroll);
		
		JTextArea console = new JTextArea();
		JScrollPane scroll2 = new JScrollPane(console);
		scroll2.setBounds(10, 436, 656, 155);
		scroll2.setVisible(true);
		frame.getContentPane().add(scroll2);
		MessageConsole mc = new MessageConsole(console);
		mc.redirectOut();
		mc.redirectErr(Color.RED, null);
		mc.setMessageLines(100);
		
		JButton btnSalva = new JButton("Save");
		btnSalva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 JFileChooser c = new JFileChooser();
			      // Demonstrate "Save" dialog:
			      int rVal = c.showSaveDialog(frame);
			      if (rVal == JFileChooser.APPROVE_OPTION) {
			        filename=(c.getSelectedFile().getName());
			        dir=(c.getCurrentDirectory().toString());
					try {
						G8.save(filename, dir, textArea.getText());
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
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
			      try {
					textArea.setText(G8.load(filename, dir));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnLoad.setBounds(288, 377, 99, 34);
		frame.getContentPane().add(btnLoad);
		
		JButton btnDraw = new JButton("Draw");
		btnDraw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				console.setText("");
				JFileChooser c = new JFileChooser();
			      // Demonstrate "Save" dialog:
			      int rVal = c.showSaveDialog(frame);
			      if (rVal == JFileChooser.APPROVE_OPTION) {
			        filename=(c.getSelectedFile().getName());
			        dir=(c.getCurrentDirectory().toString());

					if (!filename.contains(".html")) {
						filename=filename + ".html"; 
					} 
										
					try {
						File outputFile = new File(dir+"\\"+filename);
						outputFile.delete();
						outputFile.createNewFile();
						G8.draw(filename, dir, textArea.getText());
						File htmlFile = new File(dir+"\\"+filename);
						Desktop.getDesktop().browse(htmlFile.toURI());
						
					} catch (IOException | RecognitionException | SameNameError | ShapeLayoutError | parser.G8ParserGui.SameNameError | parser.G8ParserGui.ShapeLayoutError e) {
						e.printStackTrace();
					}
			      }
			      if (rVal == JFileChooser.CANCEL_OPTION) {
			        filename=("You pressed cancel");
			        dir=("");
			      }
			}
		});
		btnDraw.setBounds(541, 377, 99, 34);
		frame.getContentPane().add(btnDraw);
		
		
		
	}
}
