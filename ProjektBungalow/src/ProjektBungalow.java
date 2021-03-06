import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.DropMode;

@SuppressWarnings("serial")
public class ProjektBungalow extends JFrame implements ActionListener {

	double zahl1 = 0, zahl2 = 0, ergebnis = 0;
	public int[][] Buchungen = new int[10][3];
	private JPanel contentPane;
	private JTextField txtNumberOne;
	private JLabel lblNumberOne;
	private JLabel lblNumberTwo;
	private JTextField txtNumberTwo;
	private JTextField txtNumberThree;
	private JButton btnBuchen;
	private JLabel lblWieVielePersonen;
	private JTextField txtNumberFour;
	private JLabel lblWelcherBungalowSoll;
	private JTextField txtNumberFive;
	private JTextField txtNumberSix;
	private JButton btnAnzeigen;
	private JTextField txtNumberSeven;
	private JTextField txtNumberEight;
	private JButton btnBeenden;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProjektBungalow frame = new ProjektBungalow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ProjektBungalow() {//Da wird gezeigt wie wir die einzelnen Felder erstellt haben (Groe�e,Farbe etc...)

		setBackground(new Color(0, 0, 0));
		setForeground(new Color(255, 255, 255));
		setTitle("Buchung");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 100, 600, 350);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 51, 51));
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblNumberOne = new JLabel("Nummer des Bungalows(1-10):");
		lblNumberOne.setForeground(Color.WHITE);
		lblNumberOne.setBackground(Color.WHITE);
		lblNumberOne.setBounds(27, 35, 200, 23);
		contentPane.add(lblNumberOne);

		txtNumberOne = new JTextField();
		txtNumberOne.setHorizontalAlignment(SwingConstants.CENTER);
		txtNumberOne.setForeground(new Color(255, 255, 255));
		txtNumberOne.setBackground(Color.BLACK);
		txtNumberOne.setBounds(220, 36, 118, 20);
		contentPane.add(txtNumberOne);
		txtNumberOne.setColumns(10);

		lblNumberTwo = new JLabel("Start Kalenderwoche (1-51):");
		lblNumberTwo.setForeground(Color.WHITE);
		lblNumberTwo.setBounds(27, 69, 200, 25);
		contentPane.add(lblNumberTwo);

		txtNumberTwo = new JTextField();
		txtNumberTwo.setHorizontalAlignment(SwingConstants.CENTER);
		txtNumberTwo.setForeground(new Color(255, 255, 255));
		txtNumberTwo.setBackground(Color.BLACK);
		txtNumberTwo.setBounds(220, 71, 118, 20);
		contentPane.add(txtNumberTwo);
		txtNumberTwo.setColumns(10);

		JLabel lblEndeKalenderwoche = new JLabel("Ende Kalenderwoche (1-51):");
		lblEndeKalenderwoche.setForeground(Color.WHITE);
		lblEndeKalenderwoche.setBounds(27, 104, 200, 25);
		contentPane.add(lblEndeKalenderwoche);

		txtNumberThree = new JTextField();
		txtNumberThree.setHorizontalAlignment(SwingConstants.CENTER);
		txtNumberThree.setForeground(Color.WHITE);
		txtNumberThree.setColumns(10);
		txtNumberThree.setBackground(Color.BLACK);
		txtNumberThree.setBounds(220, 107, 118, 20);
		contentPane.add(txtNumberThree);

		btnBuchen = new JButton("Buchen");
		btnBuchen.setForeground(Color.WHITE);
		btnBuchen.addActionListener(this);
		btnBuchen.setBackground(Color.GREEN);
		btnBuchen.setBounds(110, 190, 110, 25);
		contentPane.add(btnBuchen);

		lblWieVielePersonen = new JLabel("Wie viele Personen:");
		lblWieVielePersonen.setForeground(Color.WHITE);
		lblWieVielePersonen.setBounds(27, 139, 200, 25);
		contentPane.add(lblWieVielePersonen);

		txtNumberFour = new JTextField();
		txtNumberFour.setHorizontalAlignment(SwingConstants.CENTER);
		txtNumberFour.setForeground(Color.WHITE);
		txtNumberFour.setColumns(10);
		txtNumberFour.setBackground(Color.BLACK);
		txtNumberFour.setBounds(220, 142, 118, 20);
		contentPane.add(txtNumberFour);

		lblWelcherBungalowSoll = new JLabel("Bungalow Reservierung");
		lblWelcherBungalowSoll.setForeground(Color.WHITE);
		lblWelcherBungalowSoll.setBackground(Color.WHITE);
		lblWelcherBungalowSoll.setBounds(405, 40, 200, 35);
		contentPane.add(lblWelcherBungalowSoll);

		txtNumberFive = new JTextField();
		txtNumberFive.setHorizontalAlignment(SwingConstants.CENTER);
		txtNumberFive.setForeground(Color.WHITE);
		txtNumberFive.setColumns(10);
		txtNumberFive.setBackground(Color.BLACK);
		txtNumberFive.setBounds(411, 72, 118, 20);
		contentPane.add(txtNumberFive);

		txtNumberSix = new JTextField();
		txtNumberSix.setDropMode(DropMode.INSERT);
		txtNumberSix.setEditable(false);
		txtNumberSix.setHorizontalAlignment(SwingConstants.CENTER);
		txtNumberSix.setForeground(Color.BLACK);
		txtNumberSix.setColumns(10);
		txtNumberSix.setBackground(Color.WHITE);
		txtNumberSix.setBounds(411, 142, 118, 20);
		contentPane.add(txtNumberSix);

		btnAnzeigen = new JButton("Anzeigen");
		btnAnzeigen.setForeground(Color.WHITE);
		btnAnzeigen.setBackground(Color.BLACK);
		btnAnzeigen.setBounds(411, 106, 118, 25);
		contentPane.add(btnAnzeigen);
		btnAnzeigen.addActionListener(this);

		txtNumberSeven = new JTextField();
		txtNumberSeven.setHorizontalAlignment(SwingConstants.CENTER);
		txtNumberSeven.setForeground(Color.BLACK);
		txtNumberSeven.setColumns(10);
		txtNumberSeven.setBackground(Color.WHITE);
		txtNumberSeven.setBounds(411, 172, 118, 20);
		contentPane.add(txtNumberSeven);

		txtNumberEight = new JTextField();
		txtNumberEight.setHorizontalAlignment(SwingConstants.CENTER);
		txtNumberEight.setForeground(Color.BLACK);
		txtNumberEight.setColumns(10);
		txtNumberEight.setBackground(Color.WHITE);
		txtNumberEight.setBounds(411, 202, 118, 20);
		contentPane.add(txtNumberEight);
		
		btnBeenden = new JButton("Beenden");
		btnBeenden.setForeground(Color.WHITE);
		btnBeenden.addActionListener(this);
		btnBeenden.setBackground(Color.RED);
		btnBeenden.setBounds(30, 270, 90, 20);
		contentPane.add(btnBeenden);
	}

	@Override
	public void actionPerformed(ActionEvent e) { 
		if (e.getSource() == btnBuchen) {			//da wird es gebucht und gespeichert 
			Buchungen[Integer.parseInt(txtNumberOne.getText())][0] = Integer.parseInt(txtNumberTwo.getText());
			Buchungen[Integer.parseInt(txtNumberOne.getText())][1] = Integer.parseInt(txtNumberThree.getText());
			Buchungen[Integer.parseInt(txtNumberOne.getText())][2] = Integer.parseInt(txtNumberFour.getText());
		}
		if (e.getSource() == btnAnzeigen) {			//Da wird es angezeigt(DieBuchung)
			txtNumberSix.setText("Anfangsmonat: " + Buchungen[Integer.parseInt(txtNumberFive.getText())][0]);
			txtNumberSeven.setText("Endemonat: " + Buchungen[Integer.parseInt(txtNumberFive.getText())][1]);
			txtNumberEight.setText("Anzahl Personen: " + Buchungen[Integer.parseInt(txtNumberFive.getText())][2]);
		}
		if (e.getSource() == btnBeenden) {
			System.exit(0);
		}
	}
}//hallo //hallo //hallo

