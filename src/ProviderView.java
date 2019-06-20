import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import org.jdesktop.layout.GroupLayout;
import org.jdesktop.layout.LayoutStyle;
/*
 * Created by JFormDesigner on Thu Jun 20 15:11:38 BRT 2019
 */



/**
 * @author MATHEUS CANDIDO CARVALHO
 */
public class ProviderView extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public ProviderView() {
		initComponents();
	}

	private void btncadMouseClicked(MouseEvent e) {
		String[] data = new String[6];
		data[0] = txtnome.getText();
		data[1] = txtemail.getText();
		data[2] = txtcnpj.getText();
		data[3] = txten.getText();
		data[4] = txttel.getText();
		Provider pr;
		pr = new Provider();
		pr.create(data);
		JOptionPane.showMessageDialog(null,"Fornecedor Cadastrado com Sucesso");
		txtnome.setText("");
		txtemail.setText("");
		txtcnpj.setText("");
		txten.setText("");
		txttel.setText("");
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - MATHEUS CANDIDO CARVALHO
		txtnome = new JTextField();
		txtemail = new JTextField();
		txten = new JTextField();
		txtcnpj = new JTextField();
		txttel = new JTextField();
		btncad = new JButton();
		label1 = new JLabel();
		label2 = new JLabel();
		label3 = new JLabel();
		label4 = new JLabel();
		label5 = new JLabel();

		//======== this ========
		Container contentPane = getContentPane();

		//---- btncad ----
		btncad.setText("Cadastrar");
		btncad.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btncadMouseClicked(e);
			}
		});

		//---- label1 ----
		label1.setText("Nome");

		//---- label2 ----
		label2.setText("CNPJ");

		//---- label3 ----
		label3.setText("E-mail");

		//---- label4 ----
		label4.setText("Telefone");

		//---- label5 ----
		label5.setText("Endereco");

		GroupLayout contentPaneLayout = new GroupLayout(contentPane);
		contentPane.setLayout(contentPaneLayout);
		contentPaneLayout.setHorizontalGroup(
			contentPaneLayout.createParallelGroup()
				.add(contentPaneLayout.createSequentialGroup()
					.add(24, 24, 24)
					.add(contentPaneLayout.createParallelGroup()
						.add(txten, GroupLayout.PREFERRED_SIZE, 247, GroupLayout.PREFERRED_SIZE)
						.add(txtemail, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
						.add(contentPaneLayout.createSequentialGroup()
							.add(contentPaneLayout.createParallelGroup()
								.add(label1)
								.add(txtnome, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
								.add(label3))
							.add(29, 29, 29)
							.add(contentPaneLayout.createParallelGroup()
								.add(label2)
								.add(txtcnpj, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
								.add(label4)
								.add(txttel, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)))
						.add(label5)
						.add(btncad, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap(22, Short.MAX_VALUE))
		);
		contentPaneLayout.setVerticalGroup(
			contentPaneLayout.createParallelGroup()
				.add(contentPaneLayout.createSequentialGroup()
					.addContainerGap()
					.add(contentPaneLayout.createParallelGroup(GroupLayout.BASELINE)
						.add(label1)
						.add(label2))
					.addPreferredGap(LayoutStyle.RELATED)
					.add(contentPaneLayout.createParallelGroup(GroupLayout.BASELINE)
						.add(txtnome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.add(txtcnpj, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.RELATED)
					.add(contentPaneLayout.createParallelGroup(GroupLayout.BASELINE)
						.add(label3)
						.add(label4))
					.addPreferredGap(LayoutStyle.RELATED)
					.add(contentPaneLayout.createParallelGroup(GroupLayout.BASELINE)
						.add(txtemail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.add(txttel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.add(5, 5, 5)
					.add(label5)
					.addPreferredGap(LayoutStyle.RELATED)
					.add(txten, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.RELATED)
					.add(btncad)
					.addContainerGap(8, Short.MAX_VALUE))
		);
		pack();
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - MATHEUS CANDIDO CARVALHO
	private JTextField txtnome;
	private JTextField txtemail;
	private JTextField txten;
	private JTextField txtcnpj;
	private JTextField txttel;
	private JButton btncad;
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JLabel label4;
	private JLabel label5;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
