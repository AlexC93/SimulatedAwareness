package licenta;

import javax.swing.UIManager;

/**
 *
 * @author Alex
 */
public class Licenta {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(
                    UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
            ex.getStackTrace();
        }
        MainWindow applicationWindow = new MainWindow();
        applicationWindow.setVisible(true);
    }
    
}
