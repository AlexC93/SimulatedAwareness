package licenta;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

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
        avatarWindow.setSize(400, 400);
        avatarWindow.setLocation(830, 80);
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
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItemSynonyms = new javax.swing.JMenuItem();
        jMenuItemLearn = new javax.swing.JMenuItem();
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
        jButtonReloadReactions = new javax.swing.JButton();
        jButtonReloadWords = new javax.swing.JButton();
        jButtonOpenReactions = new javax.swing.JButton();
        jButtonOpenWords = new javax.swing.JButton();
        jCheckBoxReverse = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jSliderQuality = new javax.swing.JSlider();

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
        jPopupMenu.add(jSeparator1);

        jMenuItemSynonyms.setIcon(new javax.swing.ImageIcon(getClass().getResource("/licenta/dictionaryIcon.png"))); // NOI18N
        jMenuItemSynonyms.setText("Find synonyms");
        jMenuItemSynonyms.setToolTipText("Searches for synonyms for a selected word.");
        jMenuItemSynonyms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSynonymsActionPerformed(evt);
            }
        });
        jPopupMenu.add(jMenuItemSynonyms);

        jMenuItemLearn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/licenta/learnIcon.png"))); // NOI18N
        jMenuItemLearn.setText("Learn the word");
        jMenuItemLearn.setToolTipText("Tries to learn the selected word.");
        jMenuItemLearn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemLearnActionPerformed(evt);
            }
        });
        jPopupMenu.add(jMenuItemLearn);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simulated Awarness");
        setName("mainFrame"); // NOI18N
        setPreferredSize(new java.awt.Dimension(700, 500));
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

        jButtonReloadReactions.setText("Reload reactions");
        jButtonReloadReactions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReloadReactionsActionPerformed(evt);
            }
        });

        jButtonReloadWords.setText("Reload words");
        jButtonReloadWords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReloadWordsActionPerformed(evt);
            }
        });

        jButtonOpenReactions.setText("Reactions folder");
        jButtonOpenReactions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOpenReactionsActionPerformed(evt);
            }
        });

        jButtonOpenWords.setText("Known words folder");
        jButtonOpenWords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOpenWordsActionPerformed(evt);
            }
        });

        jCheckBoxReverse.setText("Reverse search");
        jCheckBoxReverse.setToolTipText("Changes how the program learns the selected word.");
        jCheckBoxReverse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxReverseActionPerformed(evt);
            }
        });

        jLabel1.setText("Search depth:");

        jSliderQuality.setMajorTickSpacing(1);
        jSliderQuality.setMaximum(3);
        jSliderQuality.setMinimum(1);
        jSliderQuality.setPaintTicks(true);
        jSliderQuality.setSnapToTicks(true);
        jSliderQuality.setToolTipText("Higher values returns more synonyms of the selected word.");
        jSliderQuality.setValue(1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonHappy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAngry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelReaction)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBoxReverse)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSliderQuality, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2)
                    .addComponent(jTextFieldInput))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonReloadReactions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonReloadWords, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonOpenReactions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonOpenWords, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSliderQuality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelReaction)
                                .addComponent(jTextFieldOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jCheckBoxReverse)
                                .addComponent(jLabel1)))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonReloadReactions, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonReloadWords, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonOpenReactions, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonOpenWords, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonHappy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonSad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonAngry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonReset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldInput, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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
        } else {
            JOptionPane.showMessageDialog(null, "Please select a word", "No word selected",
                JOptionPane.ERROR_MESSAGE);
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
        } else {
            JOptionPane.showMessageDialog(null, "Please select a word", "No word selected",
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItemSadActionPerformed

    private void jMenuItemAngryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAngryActionPerformed
        if (jTextAreaChat.getSelectedText() != null) {
            textAnalyser.saveNewWord(jTextAreaChat.getSelectedText(), "angry");
        } else if (jTextFieldInput.getSelectedText() != null) {
            textAnalyser.saveNewWord(jTextFieldInput.getSelectedText(), "angry");
        } else {
            JOptionPane.showMessageDialog(null, "Please select a word", "No word selected",
                JOptionPane.ERROR_MESSAGE);
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
        } else {
            JOptionPane.showMessageDialog(null, "Please select a word", "No word selected",
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonHappyActionPerformed

    private void jButtonSadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSadActionPerformed
        if (jTextAreaChat.getSelectedText() != null) {
            textAnalyser.saveNewWord(jTextAreaChat.getSelectedText(), "sad");
        } else if (jTextFieldInput.getSelectedText() != null) {
            textAnalyser.saveNewWord(jTextFieldInput.getSelectedText(), "sad");
        } else {
            JOptionPane.showMessageDialog(null, "Please select a word", "No word selected",
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonSadActionPerformed

    private void jButtonAngryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAngryActionPerformed
        if (jTextAreaChat.getSelectedText() != null) {
            textAnalyser.saveNewWord(jTextAreaChat.getSelectedText(), "angry");
        } else if (jTextFieldInput.getSelectedText() != null) {
            textAnalyser.saveNewWord(jTextFieldInput.getSelectedText(), "angry");
        } else {
            JOptionPane.showMessageDialog(null, "Please select a word", "No word selected",
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonAngryActionPerformed

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed
        textAnalyser = new TextAnalyser();
        jTextAreaChat.setText("");
        jTextFieldInput.setText("");
        jTextFieldOutput.setText("");
    }//GEN-LAST:event_jButtonResetActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (avatarWindow.isVisible()) {
            avatarWindow.setVisible(false);
        } else {
            avatarWindow.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonReloadReactionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReloadReactionsActionPerformed
        textAnalyser.reloadReactions();
    }//GEN-LAST:event_jButtonReloadReactionsActionPerformed

    private void jButtonReloadWordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReloadWordsActionPerformed
        textAnalyser.reloadVocabulary();
    }//GEN-LAST:event_jButtonReloadWordsActionPerformed

    private void jButtonOpenReactionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOpenReactionsActionPerformed
        try {
            Desktop.getDesktop().open(new File("resources/reactions"));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_jButtonOpenReactionsActionPerformed

    private void jButtonOpenWordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOpenWordsActionPerformed
        try {
            Desktop.getDesktop().open(new File("resources/vocabulary"));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_jButtonOpenWordsActionPerformed

    private void jMenuItemSynonymsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSynonymsActionPerformed
        StringBuilder message = new StringBuilder();
        String selectedWord = new String();
        int numberOfNewlines = 0;
        if (jTextAreaChat.getSelectedText() != null) {
            selectedWord = jTextAreaChat.getSelectedText();
        } else if (jTextFieldInput.getSelectedText() != null) {
            selectedWord = jTextFieldInput.getSelectedText();
        } else {
            JOptionPane.showMessageDialog(null, "Please select a word", "No word selected",
                JOptionPane.ERROR_MESSAGE);
            return;
        }
        ArrayList<String> synonyms = textAnalyser.getSynonyms(selectedWord,
                jSliderQuality.getValue());
        if (synonyms.isEmpty()) {
            message.append("No synonyms have been found for the selected word");
        } else {
            if (synonyms.size() == 1) {
                message.append("Synonym found:");
            } else {
                message.append("Synonyms found:");
            }
            for (String synonym : synonyms) {
                message.append(' ').append(synonym).append(',');
                if (message.length() >= (numberOfNewlines + 1) * 80) {
                    message.append('\n');
                    numberOfNewlines++;
                }
            }
            message.delete(message.lastIndexOf(","), message.length());
            message.append('.');
        }
        JOptionPane.showMessageDialog(null, message.toString(), "Synonyms found",
                JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_jMenuItemSynonymsActionPerformed

    private void jCheckBoxReverseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxReverseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxReverseActionPerformed

    private void jMenuItemLearnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLearnActionPerformed
        String selectedWord = new String();
        String reactionGeneratedByWord = "confused";
        if (jTextAreaChat.getSelectedText() != null) {
            selectedWord = jTextAreaChat.getSelectedText();
        } else if (jTextFieldInput.getSelectedText() != null) {
            selectedWord = jTextFieldInput.getSelectedText();
        } else {
            JOptionPane.showMessageDialog(null, "Please select a word", "No word selected",
                JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!selectedWord.isEmpty() && !textAnalyser.isReactionWord(selectedWord)) {
            if (!jCheckBoxReverse.isSelected()) {
                reactionGeneratedByWord = textAnalyser.learnWord(selectedWord,
                        jSliderQuality.getValue());
            } else {
                reactionGeneratedByWord = textAnalyser.reverseLearnWord(selectedWord,
                        jSliderQuality.getValue());
            }
            String message;
            switch (reactionGeneratedByWord) {
                case "happy":
                    message = "Learned \"" + selectedWord + "\" as a happiness"
                            + " generating word";
                    break;
                case "sad":
                    message = "Learned \"" + selectedWord + "\" as a sadness"
                            + " generating word";
                    break;
                case "angry":
                    message = "Learned \"" + selectedWord + "\" as a angriness"
                            + " generating word";
                    break;
                default:
                    message = "Could not learn the selected word";
                    break;
            }
            JOptionPane.showMessageDialog(null, message.toString(),
                    reactionGeneratedByWord.equals("confused") ? "Word has not "
                            + "been learned" : "Word has been learned",
                    JOptionPane.PLAIN_MESSAGE);
        } else if (textAnalyser.isReactionWord(selectedWord)) {
            JOptionPane.showMessageDialog(null, "The word you have selected is "
                    + "already known",
                    "Word already known",
                    JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItemLearnActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
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
    private javax.swing.JButton jButtonOpenReactions;
    private javax.swing.JButton jButtonOpenWords;
    private javax.swing.JButton jButtonReloadReactions;
    private javax.swing.JButton jButtonReloadWords;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JButton jButtonSad;
    private javax.swing.JCheckBox jCheckBoxReverse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelReaction;
    private javax.swing.JMenuItem jMenuItemAngry;
    private javax.swing.JMenuItem jMenuItemHappy;
    private javax.swing.JMenuItem jMenuItemLearn;
    private javax.swing.JMenuItem jMenuItemSad;
    private javax.swing.JMenuItem jMenuItemSynonyms;
    private javax.swing.JPopupMenu jPopupMenu;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JSlider jSliderQuality;
    private javax.swing.JTextArea jTextAreaChat;
    private javax.swing.JTextField jTextFieldInput;
    private javax.swing.JTextField jTextFieldOutput;
    // End of variables declaration//GEN-END:variables
}
