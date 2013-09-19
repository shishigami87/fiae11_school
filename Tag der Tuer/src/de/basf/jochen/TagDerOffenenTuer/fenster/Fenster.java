package de.basf.jochen.TagDerOffenenTuer.fenster;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Fenster extends JFrame {

	private static final long serialVersionUID = 7641416303578373489L;
	private JPanel contentPane;
	public Dimension screensize;
	public JButton buttonToHunt;
	private Random random;

	public static void main(String[] args) {
		Fenster fenster = new Fenster();
		fenster.setVisible(true);
	}

	public Fenster() {
		screensize = Toolkit.getDefaultToolkit().getScreenSize();
		setDefaultCloseOperation(3);
		setBounds(100, 100, 450, 300);
		setLocation(0, 0);
		setSize(screensize);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		random = new Random();
		new Random();
		buttonToHunt = new JButton("Klick mich!");
		buttonToHunt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				gewonnen();
			}
		});
		buttonToHunt.setBounds(122, 182, 123, 23);
		contentPane.add(buttonToHunt);
		buttonToHunt.setFocusable(false);
		buttonToHunt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				moveButton();
			}
		});
		addComponentListener(new ComponentAdapter() {
			public void componentResized(ComponentEvent arg0) {
				checkFairness();
			}
		});
	}

	private void moveButton() {
		buttonToHunt.setLocation(random.nextInt(contentPane.getWidth() - 200), random.nextInt(getHeight() - 100));
	}
	
	private void gewonnen(){
		JOptionPane.showMessageDialog(this, "Du hast gewonnen!");
	}

	private void checkFairness() {
		if ((getHeight() < 400) || (getWidth() < 400)) {
			JOptionPane.showMessageDialog(this, "Bitte fair bleiben!");
			repaint();
		}
	}
}