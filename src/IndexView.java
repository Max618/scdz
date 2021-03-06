import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import org.jdesktop.layout.GroupLayout;
import org.jdesktop.layout.LayoutStyle;
/*
 * Created by JFormDesigner on Thu Jun 20 14:53:11 BRT 2019
 */



/**
 * @author MATHEUS CANDIDO CARVALHO
 */
public class IndexView extends JFrame {
	public IndexView() {
		initComponents();
	}

	private void btnemployeeMouseClicked(MouseEvent e) {
		java.awt.EventQueue.invokeLater(new Runnable() {
	          public void run() {
	               EmployeeView frame = new EmployeeView();
	               frame.setVisible(true);
	          }
	    });
	}

	private void btnemployeemenuMouseClicked(MouseEvent e) {
		java.awt.EventQueue.invokeLater(new Runnable() {
	          public void run() {
	               EmployeeView frame = new EmployeeView();
	               frame.setVisible(true);
	          }
	    });
	}

	private void thisWindowOpened(WindowEvent e) {
		txtcodigo.requestFocus();
	}

	private void menuItem5MouseClicked(MouseEvent e) {
		java.awt.EventQueue.invokeLater(new Runnable() {
	          public void run() {
	               ProviderView frame = new ProviderView();
	               frame.setVisible(true);
	          }
	    });
	}

	private void menuItem4MouseClicked(MouseEvent e) {
		java.awt.EventQueue.invokeLater(new Runnable() {
	          public void run() {
	               ProductView frame = new ProductView();
	               frame.setVisible(true);
	          }
	    });
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - MATHEUS CANDIDO CARVALHO
		menuBar1 = new JMenuBar();
		menuItem5 = new JMenuItem();
		menuItem4 = new JMenuItem();
		btnemployeemenu = new JMenuItem();
		txtcodigo = new JTextField();
		scrollPane1 = new JScrollPane();
		table1 = new JTable();
		label1 = new JLabel();
		button1 = new JButton();

		//======== this ========
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				thisWindowOpened(e);
			}
		});
		Container contentPane = getContentPane();

		//======== menuBar1 ========
		{

			//---- menuItem5 ----
			menuItem5.setText("Fornecedores");
			menuItem5.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					menuItem5MouseClicked(e);
				}
			});
			menuBar1.add(menuItem5);

			//---- menuItem4 ----
			menuItem4.setText("Produtos");
			menuItem4.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					menuItem4MouseClicked(e);
				}
			});
			menuBar1.add(menuItem4);

			//---- btnemployeemenu ----
			btnemployeemenu.setText("Funcionarios");
			btnemployeemenu.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					btnemployeemenuMouseClicked(e);
				}
			});
			menuBar1.add(btnemployeemenu);
		}
		setJMenuBar(menuBar1);

		//======== scrollPane1 ========
		{
			scrollPane1.setViewportView(table1);
		}

		//---- label1 ----
		label1.setText("Para adicionar um item a venda, coloque o Id do produto");
		label1.setFont(new Font("Tahoma", Font.PLAIN, 23));

		//---- button1 ----
		button1.setText("Adicionar Produto");

		GroupLayout contentPaneLayout = new GroupLayout(contentPane);
		contentPane.setLayout(contentPaneLayout);
		contentPaneLayout.setHorizontalGroup(
			contentPaneLayout.createParallelGroup()
				.add(contentPaneLayout.createSequentialGroup()
					.addContainerGap()
					.add(contentPaneLayout.createParallelGroup()
						.add(GroupLayout.TRAILING, contentPaneLayout.createSequentialGroup()
							.add(0, 0, Short.MAX_VALUE)
							.add(scrollPane1, GroupLayout.PREFERRED_SIZE, 366, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(LayoutStyle.RELATED)
							.add(contentPaneLayout.createParallelGroup(GroupLayout.LEADING, false)
								.add(txtcodigo, GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
								.add(button1, GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE))
							.add(19, 19, 19))
						.add(label1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap())
		);
		contentPaneLayout.setVerticalGroup(
			contentPaneLayout.createParallelGroup()
				.add(contentPaneLayout.createSequentialGroup()
					.addContainerGap()
					.add(contentPaneLayout.createParallelGroup()
						.add(scrollPane1, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
						.add(contentPaneLayout.createSequentialGroup()
							.add(txtcodigo, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(LayoutStyle.UNRELATED)
							.add(button1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
					.addPreferredGap(LayoutStyle.UNRELATED)
					.add(label1, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(35, Short.MAX_VALUE))
		);
		pack();
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - MATHEUS CANDIDO CARVALHO
	private JMenuBar menuBar1;
	private JMenuItem menuItem5;
	private JMenuItem menuItem4;
	private JMenuItem btnemployeemenu;
	private JTextField txtcodigo;
	private JScrollPane scrollPane1;
	private JTable table1;
	private JLabel label1;
	private JButton button1;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
