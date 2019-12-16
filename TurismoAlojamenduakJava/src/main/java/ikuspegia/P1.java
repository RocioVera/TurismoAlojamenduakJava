package ikuspegia;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import kontroladorea.MenuKontroladorea;

import javax.swing.JButton;

public class P1 extends JFrame {
	private MenuKontroladorea menuKontroladorea;
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public P1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 711, 458);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Datuak Kargatu");
		btnNewButton.setBounds(172, 30, 355, 78);
		contentPane.add(btnNewButton);
	}
	
	public void nireMenukontroladorea(MenuKontroladorea menuKontroladorea) {
		this.menuKontroladorea = menuKontroladorea;
	}
	
}
