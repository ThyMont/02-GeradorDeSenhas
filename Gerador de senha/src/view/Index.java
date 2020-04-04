package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JDesktopPane;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.SoftBevelBorder;

import control.Gerador;

import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JCheckBox;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class Index extends JFrame {

	private JPanel contentPane;
	private String codigoWallpaper;
	private JLabel lblBackground;
	private JLabel lblCaracteresEspeciais;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Index frame = new Index();
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
	public Index() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 375, 630);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setResizable(false);
		setContentPane(contentPane);
		
		JDesktopPane desktopPane = new JDesktopPane();
		contentPane.add(desktopPane, BorderLayout.CENTER);
		
		codigoWallpaper = "#001";
		
		JComboBox<String> cmbWallpaper = new JComboBox<String>();
		cmbWallpaper.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				codigoWallpaper = cmbWallpaper.getSelectedItem().toString();
				lblBackground
				.setIcon(new ImageIcon((new ImageIcon(Index.class.getResource("/img/"+codigoWallpaper+".png")))
						.getImage().getScaledInstance(lblBackground.getWidth(), lblBackground.getHeight(),
								java.awt.Image.SCALE_SMOOTH)));
			}
		});
		
		JLabel lblNewLabel = new JLabel("Feito por: ThyMont");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Consolas", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel.setBounds(176, 552, 158, 14);
		desktopPane.add(lblNewLabel);
		
		JLabel lblTitulo = new JLabel("Gerador de Senhas");
		lblTitulo.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblTitulo.setBackground(new Color(0, 153, 255));
		lblTitulo.setForeground(new Color(255, 255, 255));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Consolas", Font.BOLD, 24));
		lblTitulo.setBounds(65, 84, 237, 40);
		desktopPane.add(lblTitulo);
		
		JTextPane txtSenha = new JTextPane();
		txtSenha.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtSenha.setBounds(28, 184, 306, 30);
		desktopPane.add(txtSenha);
		cmbWallpaper.setModel(new DefaultComboBoxModel<String>(new String[] {"#001", "#002", "#003"}));
		cmbWallpaper.setBounds(10, 11, 110, 20);
		desktopPane.add(cmbWallpaper);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255, 90));
		panel.setBounds(65, 272, 237, 263);
		desktopPane.add(panel);
		panel.setLayout(null);
		
		JCheckBox chckbxLetrasMaiusculas = new JCheckBox("");
		chckbxLetrasMaiusculas.setBounds(186, 60, 20, 20);
		panel.add(chckbxLetrasMaiusculas);
		
		JCheckBox chckbxLetrasMinusculas = new JCheckBox("New check box");
		chckbxLetrasMinusculas.setBounds(186, 100, 20, 20);
		panel.add(chckbxLetrasMinusculas);
		
		JCheckBox chckbxAlgarismos = new JCheckBox("New check box");
		chckbxAlgarismos.setBounds(186, 139, 20, 20);
		panel.add(chckbxAlgarismos);
		
		JCheckBox chckbxCaracteresEspeciais = new JCheckBox("New check box");
		chckbxCaracteresEspeciais.setBounds(186, 180, 20, 20);
		panel.add(chckbxCaracteresEspeciais);
		
		JSpinner spnTamanhoSenha = new JSpinner();
		spnTamanhoSenha.setModel(new SpinnerNumberModel(1, 1, 20, 1));
		spnTamanhoSenha.setFont(new Font("Consolas", Font.PLAIN, 12));
		spnTamanhoSenha.setBounds(157, 20, 49, 23);
		
		panel.add(spnTamanhoSenha);
		
		JLabel lblTamanhoSenha = new JLabel("Tamanho da senha ");
		lblTamanhoSenha.setLabelFor(spnTamanhoSenha);
		lblTamanhoSenha.setFont(new Font("Consolas", Font.BOLD, 15));
		lblTamanhoSenha.setBounds(10, 25, 137, 14);
		panel.add(lblTamanhoSenha);
		
		JLabel lblLetrasMaiusculas = new JLabel("Letras Mai\u00FAsculas");
		lblLetrasMaiusculas.setFont(new Font("Consolas", Font.BOLD, 15));
		lblLetrasMaiusculas.setBounds(10, 66, 153, 14);
		panel.add(lblLetrasMaiusculas);
		
		JLabel lblLetrasMinúsculas = new JLabel("letras Min\u00FAsculas");
		lblLetrasMinúsculas.setLabelFor(chckbxLetrasMinusculas);
		lblLetrasMinúsculas.setFont(new Font("Consolas", Font.BOLD, 15));
		lblLetrasMinúsculas.setBounds(10, 103, 137, 14);
		panel.add(lblLetrasMinúsculas);
		
		JLabel lblAlgarismos = new JLabel("Algarismos");
		lblAlgarismos.setFont(new Font("Consolas", Font.BOLD, 15));
		lblAlgarismos.setBounds(10, 142, 137, 14);
		panel.add(lblAlgarismos);
		
		lblCaracteresEspeciais = new JLabel("Caracteres Especiais");
		lblCaracteresEspeciais.setLabelFor(chckbxCaracteresEspeciais);
		lblCaracteresEspeciais.setFont(new Font("Consolas", Font.BOLD, 15));
		lblCaracteresEspeciais.setBounds(10, 183, 170, 14);
		panel.add(lblCaracteresEspeciais);
		
		JButton btnGerar = new JButton("Gerar");
		btnGerar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (!chckbxCaracteresEspeciais.isSelected()&& !chckbxLetrasMinusculas.isSelected()&& !chckbxLetrasMaiusculas.isSelected()&& !chckbxAlgarismos.isSelected()) {
					JOptionPane.showMessageDialog(null, "Por favor, marque pelo menos 1 das opções", "Erro",
							JOptionPane.WARNING_MESSAGE);
				} else {
					Gerador g = new Gerador();
					String senha;
					senha = g.geradorDeSenhas((int) spnTamanhoSenha.getValue(), chckbxCaracteresEspeciais.isSelected(), chckbxLetrasMinusculas.isSelected(), chckbxLetrasMaiusculas.isSelected(), chckbxAlgarismos.isSelected());
					txtSenha.setText(senha);
				}
				
			}
		});
		btnGerar.setFont(new Font("Consolas", Font.BOLD, 14));
		btnGerar.setBounds(74, 216, 89, 23);
		panel.add(btnGerar);
		lblBackground = new JLabel("");
		lblBackground.setBounds(0, 0, 360, 582);
		lblBackground.setBorder(null);
		lblBackground
				.setIcon(new ImageIcon((new ImageIcon(Index.class.getResource("/img/"+codigoWallpaper+".png")))
						.getImage().getScaledInstance(lblBackground.getWidth(), lblBackground.getHeight(),
								java.awt.Image.SCALE_SMOOTH)));
		desktopPane.add(lblBackground);
		
		
	}
}
