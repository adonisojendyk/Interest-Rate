import javax.swing.JOptionPane;

public class ChapterTwoAssignmentTwo {
    public static void main(String[] args) {
        
        String input = JOptionPane.showInputDialog("Enter the amount entered into your account each month: ");
        
        double amountpermonth = Double.parseDouble(input);
        
        input = JOptionPane.showInputDialog("What is the annual interest rate? \nWrite it in decimal (10% = 0.10)");
        
        double interestrate = Double.parseDouble(input);
        
        double account = interestrate/12; 
        
       double nextamount = amountpermonth * (1 + account);
       double accountafterone = (amountpermonth + nextamount) * (1 + account) ;
       double accountaftertwo = (amountpermonth + accountafterone) * (1 + account) ;
       double accountafterthree = (amountpermonth + accountaftertwo) * (1 + account) ;
       double accountafterfour = (amountpermonth + accountafterthree) * (1 + account) ;
       double accountafterfive = (amountpermonth + accountafterfour) * (1 + account) ;
       
       JOptionPane.showMessageDialog(null, "Your account amount in six months will be: " + accountafterfive);
    }
}
