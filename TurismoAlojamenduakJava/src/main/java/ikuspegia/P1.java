package ikuspegia;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import kontroladorea.MenuKontroladorea;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

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
		
		JButton btnNewButton = new JButton("Aterpeak Kargatu");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					menuKontroladorea.datuakKargatuAterpe();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(172, 30, 355, 78);
		contentPane.add(btnNewButton);
		
		JButton btnOstatuakKargatu = new JButton("Ostatuak Kargatu");
		btnOstatuakKargatu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					menuKontroladorea.datuakKargatuOstatu();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnOstatuakKargatu.setBounds(172, 157, 355, 78);
		contentPane.add(btnOstatuakKargatu);
		
		JButton btnKanpinakKargatu = new JButton("Kanpinak Kargatu");
		btnKanpinakKargatu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					menuKontroladorea.datuakKargatuKanpin();
				} catch (IOException e2) {
					// TODO Auto-generated catch block
					
				}
			}
		});
		btnKanpinakKargatu.setBounds(172, 283, 355, 78);
		contentPane.add(btnKanpinakKargatu);
	}
	
	public void nireMenukontroladorea(MenuKontroladorea menuKontroladorea) {
		this.menuKontroladorea = menuKontroladorea;
	}
}
