import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.Window.Type;
import javax.swing.ImageIcon;
import java.awt.Dimension;

public class hasierakoPanela extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hasierakoPanela frame = new hasierakoPanela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public hasierakoPanela() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBorder(null);
		btnNewButton.setIcon(new ImageIcon(hasierakoPanela.class.getResource("/images/icons8_Maintenance_96px.png")));
		btnNewButton.setForeground(new Color(255, 102, 0));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 10));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				login_Admin login= new login_Admin();
				setVisible(false);
				login.setVisible(true);
				//login.main(null);
			}
		});
		btnNewButton.setBounds(29, 75, 137, 94);
		contentPane.add(btnNewButton);
		
		JButton btnErabiltzailea = new JButton("");
		btnErabiltzailea.setBorder(null);
		btnErabiltzailea.setMaximumSize(new Dimension(50, 20));
		btnErabiltzailea.setIcon(new ImageIcon(hasierakoPanela.class.getResource("/images/icons8_User_96px_2.png")));
		btnErabiltzailea.setForeground(new Color(255, 102, 0));
		btnErabiltzailea.setBackground(Color.WHITE);
		btnErabiltzailea.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 11));
		btnErabiltzailea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login_User luser= new login_User();
				luser.setVisible(true);
				setVisible(false);
				
				
			}
		});
		btnErabiltzailea.setBounds(271, 75, 137, 94);
		contentPane.add(btnErabiltzailea);
		
		JLabel lblNewLabel = new JLabel("Zer zara?");
		lblNewLabel.setForeground(new Color(255, 102, 0));
		lblNewLabel.setFont(new Font("Microsoft Tai Le", Font.BOLD, 18));
		lblNewLabel.setBounds(173, 35, 166, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Administratzailea");
		lblNewLabel_1.setForeground(new Color(255, 102, 0));
		lblNewLabel_1.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(39, 180, 120, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Erabiltzailea");
		lblNewLabel_1_1.setForeground(new Color(255, 102, 0));
		lblNewLabel_1_1.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(296, 180, 128, 14);
		contentPane.add(lblNewLabel_1_1);
		setLocationRelativeTo(null);
	}
}
