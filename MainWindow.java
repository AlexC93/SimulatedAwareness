package licenta;

/**
 *
 * @author Alex
 */
public class MainWindow extends javax.swing.JFrame {

    TextAnalyser textAnalyser;
    AvatarWindow avatarWindow;

    /**
     * Creates new form Window
     */
    public MainWindow() {
        initComponents();
        this.setLocation(120, 80);
        avatarWindow = new AvatarWindow();
        avatarWindow.setLocation(780, 80);
        avatarWindow.setVisible(true);
        textAnalyser = new TextAnalyser();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu = new javax.swing.JPopupMenu();
        jMenuItemHappy = new javax.swing.JMenuItem();
        jMenuItemSad = new javax.swing.JMenuItem();
        jMenuItemAngry = new javax.swing.JMenuItem();
        jTextFieldOutput = new javax.swing.JTextField();
        jLabelReaction = new javax.swing.JLabel();
        jButtonInput = new javax.swing.JButton();
        jTextFieldInput = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaChat = new javax.swing.JTextArea();
        jButtonHappy = new javax.swing.JButton();
        jButtonSad = new javax.swing.JButton();
        jButtonAngry = new javax.swing.JButton();
        jButtonReset = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jMenuItemHappy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/licenta/happyIcon.png"))); // NOI18N
        jMenuItemHappy.setText("Set as happy word");
        jMenuItemHappy.setToolTipText("The AI will react in a happy manner to this word");
        jMenuItemHappy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemHappyActionPerformed(evt);
            }
        });
        jPopupMenu.add(jMenuItemHappy);

        jMenuItemSad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/licenta/sadIcon.png"))); // NOI18N
        jMenuItemSad.setText("Set as sad word");
        jMenuItemSad.setToolTipText("The AI will react in a sad manner to this word");
        jMenuItemSad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSadActionPerformed(evt);
            }
        });
        jPopupMenu.add(jMenuItemSad);

        jMenuItemAngry.setIcon(new javax.swing.ImageIcon(getClass().getResource("/licenta/angryIcon.png"))); // NOI18N
        jMenuItemAngry.setText("Set as angry word");
        jMenuItemAngry.setToolTipText("The AI will react in an angry manner to this word");
        jMenuItemAngry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAngryActionPerformed(evt);
            }
        });
        jPopupMenu.add(jMenuItemAngry);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("More than a feeling");
        setName("mainFrame"); // NOI18N
        setPreferredSize(new java.awt.Dimension(650, 500));
        setResizable(false);

        jTextFieldOutput.setEditable(false);

        jLabelReaction.setText("Reaction:");

        jButtonInput.setText("Enter");
        jButtonInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInputActionPerformed(evt);
            }
        });

        jTextFieldInput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTextFieldInputMouseReleased(evt);
            }
        });
        jTextFieldInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldInputActionPerformed(evt);
            }
        });

        jTextAreaChat.setEditable(false);
        jTextAreaChat.setColumns(20);
        jTextAreaChat.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jTextAreaChat.setRows(5);
        jTextAreaChat.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextAreaChat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTextAreaChatMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jTextAreaChat);

        jButtonHappy.setText("Mark word as 'happy'");
        jButtonHappy.setToolTipText("The AI will react in a happy manner to this word");
        jButtonHappy.setMaximumSize(new java.awt.Dimension(133, 30));
        jButtonHappy.setMinimumSize(new java.awt.Dimension(133, 30));
        jButtonHappy.setPreferredSize(new java.awt.Dimension(133, 30));
        jButtonHappy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHappyActionPerformed(evt);
            }
        });

        jButtonSad.setText("Mark word as 'sad'");
        jButtonSad.setToolTipText("The AI will react in a sad manner to this word");
        jButtonSad.setMaximumSize(new java.awt.Dimension(121, 30));
        jButtonSad.setMinimumSize(new java.awt.Dimension(121, 30));
        jButtonSad.setPreferredSize(new java.awt.Dimension(121, 30));
        jButtonSad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSadActionPerformed(evt);
            }
        });

        jButtonAngry.setText("Mark word as 'angry'");
        jButtonAngry.setToolTipText("The AI will react in a angry manner to this word");
        jButtonAngry.setMaximumSize(new java.awt.Dimension(131, 30));
        jButtonAngry.setMinimumSize(new java.awt.Dimension(131, 30));
        jButtonAngry.setPreferredSize(new java.awt.Dimension(131, 30));
        jButtonAngry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAngryActionPerformed(evt);
            }
        });

        jButtonReset.setText("Reset");
        jButtonReset.setToolTipText("Resets the AI");
        jButtonReset.setMaximumSize(new java.awt.Dimension(61, 30));
        jButtonReset.setMinimumSize(new java.awt.Dimension(61, 30));
        jButtonReset.setPreferredSize(new java.awt.Dimension(61, 30));
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });

        jButton1.setText("Toggle Avatar");
        jButton1.setToolTipText("Enables / disables avatar window");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldInput)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonHappy, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonSad, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonAngry, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonReset, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                            .addComponent(jButtonInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelReaction)
                        .addGap(73, 73, 73)
                        .addComponent(jTextFieldOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addGap(59, 59, 59))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelReaction)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonHappy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonAngry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonReset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldInput, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonInput, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInputActionPerformed
        if (!this.jTextFieldInput.getText().isEmpty()) {
            StringBuilder chatText = new StringBuilder(this.jTextAreaChat.getText());
            String input = jTextFieldInput.getText();
            chatText.append("You: ").append(Character.toUpperCase(input.charAt(0)));
            chatText.append(input.substring(1));
            if (Character.isLetter(input.charAt(input.length() - 1))) {
                chatText.append(".");
            }
            chatText.append("\n");
            this.jTextAreaChat.setText(chatText.toString());
            chatText.append("Albert: ").append(textAnalyser.analyseText(jTextFieldInput.getText()));
            chatText.append("\n");
            this.jTextFieldInput.setText(null);
            this.jTextAreaChat.setText(chatText.toString());
            this.jTextFieldOutput.setText(textAnalyser.getLastReaction());
            avatarWindow.setState(textAnalyser.getLastReaction());
        }
    }//GEN-LAST:event_jButtonInputActionPerformed

    private void jTextFieldInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldInputActionPerformed
        if (!evt.getActionCommand().isEmpty()) {
            StringBuilder chatText = new StringBuilder(this.jTextAreaChat.getText());
            chatText.append("You: ").append(Character.toUpperCase(evt.getActionCommand().charAt(0)));
            chatText.append(evt.getActionCommand().substring(1));
            if (Character.isLetter(evt.getActionCommand().charAt(evt.getActionCommand().length() - 1))) {
                chatText.append(".");
            }
            chatText.append("\n");
            this.jTextAreaChat.setText(chatText.toString());
            this.jTextFieldInput.setText(null);
            chatText.append("Albert: ").append(textAnalyser.analyseText(evt.getActionCommand()));
            chatText.append("\n");
            this.jTextAreaChat.setText(chatText.toString());
            this.jTextFieldOutput.setText(textAnalyser.getLastReaction());
            avatarWindow.setState(textAnalyser.getLastReaction());
        }
    }//GEN-LAST:event_jTextFieldInputActionPerformed

    private void jMenuItemHappyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemHappyActionPerformed
        if (jTextAreaChat.getSelectedText() != null) {
            textAnalyser.saveNewWord(jTextAreaChat.getSelectedText(), "happy");
        } else if (jTextFieldInput.getSelectedText() != null) {
            textAnalyser.saveNewWord(jTextFieldInput.getSelectedText(), "happy");
        }
    }//GEN-LAST:event_jMenuItemHappyActionPerformed

    private void jTextAreaChatMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextAreaChatMouseReleased
        if (evt.isPopupTrigger()) {
            jPopupMenu.show(this, this.getMousePosition().x,
                    this.getMousePosition().y);
        }
    }//GEN-LAST:event_jTextAreaChatMouseReleased

    private void jMenuItemSadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSadActionPerformed
        if (jTextAreaChat.getSelectedText() != null) {
            textAnalyser.saveNewWord(jTextAreaChat.getSelectedText(), "sad");
        } else if (jTextFieldInput.getSelectedText() != null) {
            textAnalyser.saveNewWord(jTextFieldInput.getSelectedText(), "sad");
        }
    }//GEN-LAST:event_jMenuItemSadActionPerformed

    private void jMenuItemAngryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAngryActionPerformed
        if (jTextAreaChat.getSelectedText() != null) {
            textAnalyser.saveNewWord(jTextAreaChat.getSelectedText(), "angry");
        } else if (jTextFieldInput.getSelectedText() != null) {
            textAnalyser.saveNewWord(jTextFieldInput.getSelectedText(), "angry");
        }
    }//GEN-LAST:event_jMenuItemAngryActionPerformed

    private void jTextFieldInputMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldInputMouseReleased
        if (evt.isPopupTrigger()) {
            jPopupMenu.show(this, this.getMousePosition().x,
                    this.getMousePosition().y);
        }
    }//GEN-LAST:event_jTextFieldInputMouseReleased

    private void jButtonHappyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHappyActionPerformed
        if (jTextAreaChat.getSelectedText() != null) {
            textAnalyser.saveNewWord(jTextAreaChat.getSelectedText(), "happy");
        } else if (jTextFieldInput.getSelectedText() != null) {
            textAnalyser.saveNewWord(jTextFieldInput.getSelectedText(), "happy");
        }
    }//GEN-LAST:event_jButtonHappyActionPerformed

    private void jButtonSadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSadActionPerformed
        if (jTextAreaChat.getSelectedText() != null) {
            textAnalyser.saveNewWord(jTextAreaChat.getSelectedText(), "sad");
        } else if (jTextFieldInput.getSelectedText() != null) {
            textAnalyser.saveNewWord(jTextFieldInput.getSelectedText(), "sad");
        }
    }//GEN-LAST:event_jButtonSadActionPerformed

    private void jButtonAngryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAngryActionPerformed
        if (jTextAreaChat.getSelectedText() != null) {
            textAnalyser.saveNewWord(jTextAreaChat.getSelectedText(), "angry");
        } else if (jTextFieldInput.getSelectedText() != null) {
            textAnalyser.saveNewWord(jTextFieldInput.getSelectedText(), "angry");
        }
    }//GEN-LAST:event_jButtonAngryActionPerformed

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed
        textAnalyser = new TextAnalyser();
        jTextAreaChat.setText("");
        jTextFieldInput.setText("");
        jTextFieldOutput.setText("");
    }//GEN-LAST:event_jButtonResetActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(avatarWindow.isVisible()) {
            avatarWindow.setVisible(false);
        } else {
            avatarWindow.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAngry;
    private javax.swing.JButton jButtonHappy;
    private javax.swing.JButton jButtonInput;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JButton jButtonSad;
    private javax.swing.JLabel jLabelReaction;
    private javax.swing.JMenuItem jMenuItemAngry;
    private javax.swing.JMenuItem jMenuItemHappy;
    private javax.swing.JMenuItem jMenuItemSad;
    private javax.swing.JPopupMenu jPopupMenu;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaChat;
    private javax.swing.JTextField jTextFieldInput;
    private javax.swing.JTextField jTextFieldOutput;
    // End of variables declaration//GEN-END:variables
}
