
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;




public class User {
    public int uId;
    public char un;
    private char pwd;
    public char fullName;
    public char nwi;
    public char dob;
    public int contact;
    public char designation;
    public char remarks;
    public char gender;
    public char address;
    public JTextField txt_username;
    public JPasswordField txt_password;
    
    // database URL
	static final String DB_URL = "jdbc:mysql://localhost:3306/inconsys";
	
	//  Database credentials
	static final String USER = "root";
	static final String PASS = "";
	protected static final String String = null;
    
    
    
    public void login() throws SQLException
    {
        try  //try block
                                {
        String username = "";
	String password = "";
        
        username = txt_username.getText().trim();
	password = txt_password.getText().trim();
    
        if (username.equals("")|| password.equals(""))
				{
					JOptionPane.showMessageDialog(null," name or password or Role is wrong","Error",JOptionPane.ERROR_MESSAGE);
				}
				else  //else insert query is run properly
                                {
					String IQuery = "INSERT INTO `inconsys`.`userdetails`(`userName`,`password`) VALUES('"+username+"', '"+password+"')";
					System.out.println(IQuery);//print on console
					System.out.println("Connecting to a selected database...");
				
                                }
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
					System.out.println("Connected database successfully...");
        java.lang.String IQuery = null;
					  
				((Connection)conn).createStatement().execute(IQuery);//select the rows
					// define SMessage variable
					String SMessage = "Record added for "+username;
					
                                       // create dialog ox which is print message
	                    JOptionPane.showMessageDialog(null,SMessage,"Message",JOptionPane.PLAIN_MESSAGE);
					//close connection
					((java.sql.Connection)conn).close();
                                        }				
			
		   catch (SQLException | HeadlessException se) 
			{
            //handle errors for JDBC

			}
        //catch block

		    }
					
				
    public void logout()
    {
    
    }
    
    public void newUser()
    {
      new newUser().setVisible(true);
     
    }
    
    public void forgotPassword()
    {
        
    }
    
    public void registerUser()
    {
        
    }
    
    public void clearUser()
    {
        
    }
    
    public void registerAnotherUser()
    {
        
    }
}	

        
        
        
    


