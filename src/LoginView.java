import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import org.jdesktop.layout.GroupLayout;
import org.jdesktop.layout.LayoutStyle;
/*
 * Created by JFormDesigner on Sat Jun 22 21:26:10 BRT 2019
 */



/**
 * @author MATHEUS CANDIDO CARVALHO
 */
public class LoginView extends JFrame {
	public LoginView() {
		initComponents();
	}

	private void button1MouseClicked(MouseEvent e) {
		JOptionPane.showMessageDialog(null,"Bem vindo ao SCDZ");
        IndexView frame = new IndexView();
        frame.setVisible(true);
        this.setVisible(false);
		/*Employee em = new Employee();
		Boolean x = em.Login(txtemail.getText(), txtsenha.getText());
		if(x == true) {
			
		          }
		          else {
			JOptionPane.showMessageDialog(null,"Usuario ou Senha Incorretos");
			txtemail.setText("");
			txtsenha.setText("");
		}*/
			 
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - MATHEUS CANDIDO CARVALHO
		button1 = new JButton();

		//======== this ========
		Container contentPane = getContentPane();

		//---- button1 ----
		button1.setText("Entrar");
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
				.add(GroupLayout.TRAILING, contentPaneLayout.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.add(button1, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE)
					.add(8, 8, 8))
		);
		contentPaneLayout.setVerticalGroup(
			contentPaneLayout.createParallelGroup()
				.add(contentPaneLayout.createSequentialGroup()
					.addContainerGap()
					.add(button1, GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
					.addContainerGap())
		);
		pack();
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - MATHEUS CANDIDO CARVALHO
	private JButton button1;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
