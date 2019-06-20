import java.awt.*;
import java.sql.ResultSet;

import javax.swing.*;
import org.jdesktop.layout.GroupLayout;
import org.jdesktop.layout.LayoutStyle;
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

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - MATHEUS CANDIDO CARVALHO
		textField1 = new JTextField();
		textField2 = new JTextField();
		textField3 = new JTextField();
		cmbprovider = new JComboBox();
		button1 = new JButton();
		label1 = new JLabel();
		label2 = new JLabel();
		label3 = new JLabel();
		label4 = new JLabel();

		//======== this ========
		Container contentPane = getContentPane();

		//---- button1 ----
		button1.setText("Cadastrar");

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
											.add(textField2, GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
											.add(textField1, GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
										.add(label3))
									.addPreferredGap(LayoutStyle.RELATED)
									.add(contentPaneLayout.createParallelGroup()
										.add(label4)
										.add(textField3, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
										.add(cmbprovider, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
										.add(label2))))
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
						.add(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.add(textField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.RELATED)
					.add(contentPaneLayout.createParallelGroup(GroupLayout.BASELINE)
						.add(label3)
						.add(label4))
					.addPreferredGap(LayoutStyle.RELATED)
					.add(contentPaneLayout.createParallelGroup(GroupLayout.BASELINE)
						.add(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.add(cmbprovider, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.add(button1)
					.addContainerGap())
		);
		pack();
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}
	
	private void FillCombo() {
		String sql = "select * from providers";
		pst = Conn.executeSelectQuery(sql);
		
		
		
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - MATHEUS CANDIDO CARVALHO
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	private JComboBox cmbprovider;
	private JButton button1;
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JLabel label4;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
