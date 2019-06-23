import java.awt.*;
import java.util.List;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.*;
import org.jdesktop.beansbinding.*;
import org.jdesktop.beansbinding.AutoBinding.UpdateStrategy;
import org.jdesktop.layout.GroupLayout;
import org.jdesktop.layout.LayoutStyle;
import org.jdesktop.swingbinding.*;
/*
 * Created by JFormDesigner on Thu Jun 20 15:36:21 BRT 2019
 */



/**
 * @author MATHEUS CANDIDO CARVALHO
 */
public class ProductView extends JFrame {
	public ProductView() {
		initComponents();
	}

	private void thisWindowOpened(WindowEvent e) {
		
	}

	private void button1MouseClicked(MouseEvent e) {
		String[] data = new String[4];
		data[0] = txtproduto.getText();
		data[1] = txtqtd.getText();
		data[2] = txtpreco.getText();
		data[3] = txtfor.getText();
		Product pr;
		pr = new Product();
		pr.create(data);
		JOptionPane.showMessageDialog(null,"Produto Cadastrado com Sucesso");
		txtproduto.setText("");
		txtqtd.setText("");
		txtpreco.setText("");
		txtfor.setText("");
		}

	
	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - MATHEUS CANDIDO CARVALHO
		txtpreco = new JTextField();
		txtproduto = new JTextField();
		txtqtd = new JTextField();
		button1 = new JButton();
		label1 = new JLabel();
		label2 = new JLabel();
		label3 = new JLabel();
		label4 = new JLabel();
		txtfor = new JTextField();

		//======== this ========
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				thisWindowOpened(e);
			}
		});
		Container contentPane = getContentPane();

		//---- button1 ----
		button1.setText("Cadastrar");
		button1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				button1MouseClicked(e);
			}
		});

		//---- label1 ----
		label1.setText("Produto");

		//---- label2 ----
		label2.setText("Quantidade");

		//---- label3 ----
		label3.setText("Preco Unitario");

		//---- label4 ----
		label4.setText("Fornecedor");

		GroupLayout contentPaneLayout = new GroupLayout(contentPane);
		contentPane.setLayout(contentPaneLayout);
		contentPaneLayout.setHorizontalGroup(
			contentPaneLayout.createParallelGroup()
				.add(contentPaneLayout.createSequentialGroup()
					.add(35, 35, 35)
					.add(contentPaneLayout.createParallelGroup()
						.add(button1, GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
						.add(contentPaneLayout.createSequentialGroup()
							.add(contentPaneLayout.createParallelGroup()
								.add(label1)
								.add(contentPaneLayout.createSequentialGroup()
									.add(contentPaneLayout.createParallelGroup()
										.add(contentPaneLayout.createParallelGroup(GroupLayout.LEADING, false)
											.add(txtproduto, GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
											.add(txtpreco, GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
										.add(label3))
									.addPreferredGap(LayoutStyle.RELATED)
									.add(contentPaneLayout.createParallelGroup(GroupLayout.LEADING, false)
										.add(label4)
										.add(txtqtd, GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
										.add(label2)
										.add(txtfor, GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))))
							.add(0, 0, Short.MAX_VALUE)))
					.add(30, 30, 30))
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
						.add(txtproduto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.add(txtqtd, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.RELATED)
					.add(contentPaneLayout.createParallelGroup(GroupLayout.BASELINE)
						.add(label3)
						.add(label4))
					.addPreferredGap(LayoutStyle.RELATED)
					.add(contentPaneLayout.createParallelGroup(GroupLayout.BASELINE)
						.add(txtpreco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.add(txtfor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.RELATED, 27, Short.MAX_VALUE)
					.add(button1)
					.addContainerGap())
		);
		pack();
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}
	
	public void Conexao() {
		Provider pr = new Provider();
		
	}

	private void button2MouseClicked(MouseEvent e) {
		Conexao();
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - MATHEUS CANDIDO CARVALHO
	private JTextField txtpreco;
	private JTextField txtproduto;
	private JTextField txtqtd;
	private JButton button1;
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JLabel label4;
	private JTextField txtfor;
	private List cmbproviderList;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
