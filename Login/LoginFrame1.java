public class LoginFrame extends JFrame implements ActionListener {
 
  JButton loginButton = new JButton();
  Control control;
  public LoginFrame(Control control) {
	  this.control = control;
	  // expects ActionListener
      loginButton.addActionListener(this);
  }
  
  public void actionPerformed(ActionEvent e){
	  // handle Login using Control
	  // control.login(userID, password)
  }
  
}