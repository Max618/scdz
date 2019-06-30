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
		
		 if(txtlogin.getText().equals("admin@scdz.com.br") && (String.valueOf(txtsenha.getPassword()).equals("admin"))){
				JOptionPane.showMessageDialog(null,"Bem vindo ao SCDZ");
			 IndexView frame = new IndexView();
		        frame.setVisible(true);
		        this.setVisible(false);
		    }    
		        else{
		                    JOptionPane.showMessageDialog(null, "Email ou senha incorretos");
		                    txtsenha.setText("");
		        }
		
		
		
		}
		
		/*Employee em = new Employee();
		Boolean x = em.Login(txtemail.getText(), txtsenha.getText());
		if(x == true) {
			
		          }
		          else {
			JOptionPane.showMessageDialog(null,"Usuario ou Senha Incorretos");
			txtemail.setText("");
			txtsenha.setText("");
		}*/
			 
	

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - MATHEUS CANDIDO CARVALHO
		button1 = new JButton();
		txtlogin = new JTextField();
		label1 = new JLabel();
		label2 = new JLabel();
		txtsenha = new JPasswordField();

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

		//---- label1 ----
		label1.setText("E-mail");

		//---- label2 ----
		label2.setText("Senha");

		GroupLayout contentPaneLayout = new GroupLayout(contentPane);
		contentPane.setLayout(contentPaneLayout);
		contentPaneLayout.setHorizontalGroup(
			contentPaneLayout.createParallelGroup()
				.add(contentPaneLayout.createSequentialGroup()
					.addContainerGap()
					.add(contentPaneLayout.createParallelGroup()
						.add(GroupLayout.TRAILING, contentPaneLayout.createSequentialGroup()
							.add(contentPaneLayout.createParallelGroup(GroupLayout.TRAILING)
								.add(txtlogin, GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
								.add(button1, GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
							.add(8, 8, 8))
						.add(contentPaneLayout.createSequentialGroup()
							.add(label1)
							.addContainerGap(277, Short.MAX_VALUE))
						.add(contentPaneLayout.createSequentialGroup()
							.add(txtsenha, GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
							.addContainerGap())
						.add(contentPaneLayout.createSequentialGroup()
							.add(label2)
							.add(0, 278, Short.MAX_VALUE))))
		);
		contentPaneLayout.setVerticalGroup(
			contentPaneLayout.createParallelGroup()
				.add(GroupLayout.TRAILING, contentPaneLayout.createSequentialGroup()
					.add(14, 14, 14)
					.add(label1)
					.addPreferredGap(LayoutStyle.RELATED)
					.add(txtlogin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.add(23, 23, 23)
					.add(label2)
					.addPreferredGap(LayoutStyle.RELATED)
					.add(txtsenha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.add(button1, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		pack();
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - MATHEUS CANDIDO CARVALHO
	private JButton button1;
	private JTextField txtlogin;
	private JLabel label1;
	private JLabel label2;
	private JPasswordField txtsenha;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
