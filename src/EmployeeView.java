import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import org.jdesktop.layout.GroupLayout;
import org.jdesktop.layout.LayoutStyle;
/*
 * Created by JFormDesigner on Thu Jun 20 14:18:10 BRT 2019
 */



/**
 * @author MATHEUS CANDIDO CARVALHO
 */
public class EmployeeView extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public EmployeeView() {
		initComponents();
	}

	private void button1MouseClicked(MouseEvent e) {
		String[] data = new String[6];
		data[0] = txtnome.getText();
		data[1] = txtemail.getText();
		data[2] = txtsenha.getPassword().toString();
		data[3] = txten.getText();
		data[4] = txtcpf.getText();
		data[5] = txtsalario.getText();
		Employee em;
		em = new Employee();
		em.create(data);
		JOptionPane.showMessageDialog(null,"Funcionario Cadastrado com Sucesso");
		txtnome.setText("");
		txtemail.setText("");
		txtsenha.setText("");
		txten.setText("");
		txtcpf.setText("");
		txtsalario.setText("");
		// TODO add your code here
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - MATHEUS CANDIDO CARVALHO
		txtnome = new JTextField();
		txtemail = new JTextField();
		txten = new JTextField();
		label1 = new JLabel();
		label2 = new JLabel();
		label3 = new JLabel();
		label4 = new JLabel();
		txtcpf = new JTextField();
		label5 = new JLabel();
		txtsalario = new JTextField();
		label6 = new JLabel();
		button1 = new JButton();
		txtsenha = new JPasswordField();

		//======== this ========
		Container contentPane = getContentPane();

		//---- label1 ----
		label1.setText("Nome:");

		//---- label2 ----
		label2.setText("Email:");

		//---- label3 ----
		label3.setText("Senha");

		//---- label4 ----
		label4.setText("Endere\u00e7o:");

		//---- label5 ----
		label5.setText("CPF:");

		//---- label6 ----
		label6.setText("Sal\u00e1rio:");

		//---- button1 ----
		button1.setText("Cadastrar");
		button1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				button1MouseClicked(e);
			}
		});

		GroupLayout contentPaneLayout = new GroupLayout(contentPane);
		contentPane.setLayout(contentPaneLayout);
		contentPaneLayout.setHorizontalGroup(
			contentPaneLayout.createParallelGroup()
				.add(contentPaneLayout.createSequentialGroup()
					.addContainerGap()
					.add(contentPaneLayout.createParallelGroup(GroupLayout.TRAILING, false)
						.add(button1, GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
						.add(contentPaneLayout.createSequentialGroup()
							.add(contentPaneLayout.createParallelGroup(GroupLayout.TRAILING)
								.add(contentPaneLayout.createSequentialGroup()
									.add(contentPaneLayout.createParallelGroup(GroupLayout.LEADING, false)
										.add(txtnome, GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
										.add(label1, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
										.add(txtemail, GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
										.add(label2, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE))
									.add(51, 51, 51))
								.add(GroupLayout.LEADING, contentPaneLayout.createSequentialGroup()
									.add(contentPaneLayout.createParallelGroup(GroupLayout.TRAILING)
										.add(GroupLayout.LEADING, txtsenha, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
										.add(GroupLayout.LEADING, label3, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(LayoutStyle.RELATED)))
							.add(contentPaneLayout.createParallelGroup()
								.add(txten, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
								.add(label4, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
								.add(txtcpf, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
								.add(label5, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
								.add(txtsalario, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
								.add(label6, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(13, Short.MAX_VALUE))
		);
		contentPaneLayout.setVerticalGroup(
			contentPaneLayout.createParallelGroup()
				.add(contentPaneLayout.createSequentialGroup()
					.add(contentPaneLayout.createParallelGroup(GroupLayout.BASELINE)
						.add(label1)
						.add(label4))
					.addPreferredGap(LayoutStyle.RELATED)
					.add(contentPaneLayout.createParallelGroup(GroupLayout.BASELINE)
						.add(txtnome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.add(txten, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.UNRELATED)
					.add(contentPaneLayout.createParallelGroup(GroupLayout.BASELINE)
						.add(label2)
						.add(label5))
					.add(3, 3, 3)
					.add(contentPaneLayout.createParallelGroup(GroupLayout.BASELINE)
						.add(txtemail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.add(txtcpf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.UNRELATED)
					.add(contentPaneLayout.createParallelGroup(GroupLayout.BASELINE)
						.add(label6)
						.add(label3))
					.add(1, 1, 1)
					.add(contentPaneLayout.createParallelGroup(GroupLayout.BASELINE)
						.add(txtsalario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.add(txtsenha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.add(16, 16, 16)
					.add(button1)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JLabel label4;
	private JTextField txtcpf;
	private JLabel label5;
	private JTextField txtsalario;
	private JLabel label6;
	private JButton button1;
	private JPasswordField txtsenha;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
