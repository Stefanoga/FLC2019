package gui;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import org.antlr.runtime.RecognitionException;
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
		frame.setBounds(100, 100, 885, 647);
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
		btnSalva.setBounds(38, 375, 99, 34);
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
		btnLoad.setBounds(279, 375, 99, 34);
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
						
					} catch (IOException | RecognitionException | parser.G8Parser.SameNameError | parser.G8Parser.ShapeLayoutError e) {
						e.printStackTrace();
					}
			      }
			      if (rVal == JFileChooser.CANCEL_OPTION) {
			        filename=("You pressed cancel");
			        dir=("");
			      }
			}
		});
		btnDraw.setBounds(520, 375, 99, 34);
		frame.getContentPane().add(btnDraw);
		
		JButton btnBegin = new JButton("BEGIN");
		btnBegin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.setText(textArea.getText() + "TITLE Example DRAWSPACE WIDTH 500 DRAWSPACE HEIGTH 500\n");
			}
		});
		btnBegin.setBounds(714, 92, 117, 34);
		frame.getContentPane().add(btnBegin);
		
		JButton btnLine = new JButton("LINE");
		btnLine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.setText(textArea.getText() + "LINE: NAME Line1 XSTART 1 YSTART 1 XEND 2 YEND 2 COLOR #000000 WIDTH 1\n");
			}
		});
		btnLine.setBounds(714, 155, 117, 34);
		frame.getContentPane().add(btnLine);
		
		JButton btnTriangle = new JButton("TRIANGLE");
		btnTriangle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.setText(textArea.getText() + "TRIANGLE: NAME Triangle1 XA 1 YA 1 XB 2 YB 2 XC 3 YC 3 COLOR #000000 WIDTH 1 COLORBODY #FFFFFF\n");
			}
		});
		btnTriangle.setBounds(714, 218, 117, 34);
		frame.getContentPane().add(btnTriangle);
		
		JButton btnRectangle = new JButton("RECTANGLE");
		btnRectangle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.setText(textArea.getText() + "RECT: NAME Rectangle1 XSTART 1 YSTART 1 XEND 2 YEND 2 COLOR #000000 WIDTH 1 COLORBODY #FFFFFF\n");
			}
		});
		btnRectangle.setBounds(714, 281, 117, 34);
		frame.getContentPane().add(btnRectangle);
		
		JButton btnCurve = new JButton("CURVE");
		btnCurve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.setText(textArea.getText() + "CURV: NAME Curve1 XSTART 1 YSTART 1 XMIDDLE 2 YMIDDLE 2 XEND 3 YEND 3 COLOR #000000 WIDTH 1 COLORBODY #FFFFFF\n");
			}
		});
		btnCurve.setBounds(714, 344, 117, 34);
		frame.getContentPane().add(btnCurve);
		
		JButton btnCircle = new JButton("CIRCLE");
		btnCircle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.setText(textArea.getText() + "CIRC: NAME Circle1 XCENTER 10 YCENTER 10 RADIUS 1 STARTANGLE 0 ENDANGLE 360 COLOR #000000 WIDTH 1 COLORBODY #FFFFFF\n");
			}
		});
		btnCircle.setBounds(714, 407, 117, 34);
		frame.getContentPane().add(btnCircle);
		
		JButton btnEllipse = new JButton("ELLIPSE");
		btnEllipse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.setText(textArea.getText() + "ELLIPS: NAME Ellipse1 XCENTER 10 YCENTER 10 SEMIN 5 SEMAX 10 STARTANGLE 0 ENDANGLE 360 ROTATION +0 COLOR #000000 WIDTH 1 COLORBODY #FFFFFF\n");
			}
		});
		btnEllipse.setBounds(714, 470, 117, 34);
		frame.getContentPane().add(btnEllipse);
		
		JButton btnEnd = new JButton("END");
		btnEnd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.setText(textArea.getText() + "END");
			}
		});
		btnEnd.setBounds(714, 533, 117, 34);
		frame.getContentPane().add(btnEnd);
		
		JButton btnExample = new JButton("EXAMPLE");
		btnExample.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.setText(textArea.getText() + "TITLE Example DRAWSPACE WIDTH 500 DRAWSPACE HEIGTH 500\nLINE: NAME Line1 XSTART 1 YSTART 1 XEND 2 YEND 2 COLOR #000000 WIDTH 1\nTRIANGLE: NAME Triangle1 XA 1 YA 1 XB 2 YB 2 XC 3 YC 3 COLOR #000000 WIDTH 1 COLORBODY #FFFFFF\nRECT: NAME Rectangle1 XSTART 1 YSTART 1 XEND 2 YEND 2 COLOR #000000 WIDTH 1 COLORBODY #FFFFFF\nCURV: NAME Curve1 XSTART 1 YSTART 1 XMIDDLE 2 YMIDDLE 2 XEND 3 YEND 3 COLOR #000000 WIDTH 1 COLORBODY #FFFFFF\nCIRC: NAME Circle1 XCENTER 10 YCENTER 10 RADIUS 1 STARTANGLE 0 ENDANGLE 360 COLOR #000000 WIDTH 1 COLORBODY #FFFFFF\nELLIPS: NAME Ellipse1 XCENTER 10 YCENTER 10 SEMIN 5 SEMAX 10 STARTANGLE 0 ENDANGLE 360 ROTATION +0 COLOR #000000 WIDTH 1 COLORBODY #FFFFFF\nEND");
			}
		});
		btnExample.setBounds(714, 29, 117, 34);
		frame.getContentPane().add(btnExample);
		
		
		
	}
}
