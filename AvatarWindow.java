package licenta;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

/**
 *
 * @author Alex
 */
public class AvatarWindow extends javax.swing.JFrame {

    private String state;
    private long stateNumber;
    private Image avatarImage;

    /**
     * Creates new form AvatarWindow
     */
    public AvatarWindow() {
        initComponents();
        state = "normal";
        stateNumber = 0;
        loadImage();
    }

    public void setState(String newState) {
        if (newState.equals("happy") || newState.equals("sad")
                || newState.equals("angry") || newState.equals("confused")) {
            state = newState;
        } else {
            state = "normal";
        }
        stateNumber++;
        loadImage();
        new timerThread().start();
    }

    private class timerThread extends Thread {

        private long miliseconds;

        public timerThread() {
            miliseconds = 3000;
        }

        public timerThread(long miliseconds) {
            this.miliseconds = miliseconds;
        }
        
        @Override
        public void run() {
            try {
                long previousStateNumber = stateNumber;
                Thread.sleep(miliseconds);
                if(previousStateNumber == stateNumber && !state.equals("normal")) {
                    setState("normal");
                }
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    private void loadImage() {
        try {
            switch (state) {
                case "happy":
                    avatarImage = ImageIO.read(new File("happy.png"));
                    break;
                case "sad":
                    avatarImage = ImageIO.read(new File("sad.png"));
                    break;
                case "angry":
                    avatarImage = ImageIO.read(new File("angry.png"));
                    break;
                case "confused":
                    avatarImage = ImageIO.read(new File("confused.png"));
                    break;
                default:
                    avatarImage = ImageIO.read(new File("normal.png"));
                    break;
            }
            this.repaint();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.drawImage(avatarImage, 0, 0, this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setTitle("Albert");
        setAlwaysOnTop(true);
        setAutoRequestFocus(false);
        setFocusable(false);
        setMaximumSize(new java.awt.Dimension(400, 400));
        setMinimumSize(new java.awt.Dimension(400, 400));
        setName("avatarFrame"); // NOI18N
        setPreferredSize(new java.awt.Dimension(400, 400));
        setResizable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AvatarWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AvatarWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AvatarWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AvatarWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AvatarWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
