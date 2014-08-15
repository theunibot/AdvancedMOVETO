/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advancedmoveto;

import com.sun.glass.events.KeyEvent;
import javax.swing.text.DefaultCaret;

/**
 *
 * @author kyle
 */
public class GUI extends javax.swing.JFrame
{

    /**
     * Creates new form GUI
     */
    public GUI()
    {
        initComponents();
        DefaultCaret caret = (DefaultCaret) outputText.getCaret();
        caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        yTextField = new javax.swing.JTextField();
        xLabel = new javax.swing.JLabel();
        yLabel = new javax.swing.JLabel();
        xTextField = new javax.swing.JTextField();
        zLabel = new javax.swing.JLabel();
        zTextField = new javax.swing.JTextField();
        yawTextField = new javax.swing.JTextField();
        pitchLabel = new javax.swing.JLabel();
        yawLabel = new javax.swing.JLabel();
        pitchTextField = new javax.swing.JTextField();
        rollLabel = new javax.swing.JLabel();
        rollTextField = new javax.swing.JTextField();
        runButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        outputText = new javax.swing.JTextArea();
        homeButton = new javax.swing.JButton();
        calButton = new javax.swing.JButton();
        startButton = new javax.swing.JButton();
        gripButton = new javax.swing.JButton();
        ungripButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Advanced MOVETO");
        addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                formKeyPressed(evt);
            }
        });

        yTextField.setText("10");
        yTextField.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                yTextFieldActionPerformed(evt);
            }
        });
        yTextField.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                yTextFieldKeyPressed(evt);
            }
        });

        xLabel.setText("X:");

        yLabel.setText("Y:");

        xTextField.setText("10");
        xTextField.setAutoscrolls(false);
        xTextField.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                xTextFieldActionPerformed(evt);
            }
        });
        xTextField.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                xTextFieldKeyPressed(evt);
            }
        });

        zLabel.setText("Z:");

        zTextField.setText("10");
        zTextField.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                zTextFieldActionPerformed(evt);
            }
        });
        zTextField.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                zTextFieldKeyPressed(evt);
            }
        });

        yawTextField.setText("0");
        yawTextField.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                yawTextFieldActionPerformed(evt);
            }
        });
        yawTextField.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                yawTextFieldKeyPressed(evt);
            }
        });

        pitchLabel.setText("Pitch:");

        yawLabel.setText("Yaw:");

        pitchTextField.setText("-90.0");
        pitchTextField.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                pitchTextFieldActionPerformed(evt);
            }
        });
        pitchTextField.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                pitchTextFieldKeyPressed(evt);
            }
        });

        rollLabel.setText("Roll:");

        rollTextField.setText("0");
        rollTextField.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rollTextFieldActionPerformed(evt);
            }
        });
        rollTextField.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                rollTextFieldKeyPressed(evt);
            }
        });

        runButton.setText("Execute");
        runButton.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                runButtonMouseClicked(evt);
            }
        });

        outputText.setEditable(false);
        outputText.setColumns(20);
        outputText.setRows(5);
        jScrollPane1.setViewportView(outputText);

        homeButton.setText("Home");
        homeButton.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                homeButtonMouseClicked(evt);
            }
        });

        calButton.setText("Calibrate");
        calButton.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                calButtonMouseClicked(evt);
            }
        });

        startButton.setText("Start");
        startButton.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                startButtonMouseClicked(evt);
            }
        });

        gripButton.setText("Grip");
        gripButton.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                gripButtonMouseClicked(evt);
            }
        });

        ungripButton.setText("Ungrip");
        ungripButton.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                ungripButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(xLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(xTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(yLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(yTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(zLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(zTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(yawLabel)
                                    .addComponent(rollLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(yawTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(runButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(rollTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pitchLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                .addComponent(pitchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(homeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(calButton, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                            .addComponent(startButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(gripButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ungripButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(xLabel)
                    .addComponent(xTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yLabel)
                    .addComponent(homeButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zLabel)
                    .addComponent(calButton))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pitchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pitchLabel)
                    .addComponent(gripButton))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yawTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yawLabel)
                    .addComponent(ungripButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rollTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rollLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(runButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void yTextFieldActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_yTextFieldActionPerformed
    {//GEN-HEADEREND:event_yTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yTextFieldActionPerformed

    private void xTextFieldActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_xTextFieldActionPerformed
    {//GEN-HEADEREND:event_xTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xTextFieldActionPerformed

    private void zTextFieldActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_zTextFieldActionPerformed
    {//GEN-HEADEREND:event_zTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_zTextFieldActionPerformed

    private void yawTextFieldActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_yawTextFieldActionPerformed
    {//GEN-HEADEREND:event_yawTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yawTextFieldActionPerformed

    private void pitchTextFieldActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_pitchTextFieldActionPerformed
    {//GEN-HEADEREND:event_pitchTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pitchTextFieldActionPerformed

    private void rollTextFieldActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rollTextFieldActionPerformed
    {//GEN-HEADEREND:event_rollTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rollTextFieldActionPerformed

    private void runButtonMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_runButtonMouseClicked
    {//GEN-HEADEREND:event_runButtonMouseClicked
        execute();
    }//GEN-LAST:event_runButtonMouseClicked

    private void execute()
    {
        if (xTextField.getText() != null && !xTextField.getText().equals("")
                && yTextField.getText() != null && !yTextField.getText().equals("")
                && zTextField.getText() != null && !zTextField.getText().equals("")
                && pitchTextField.getText() != null && !pitchTextField.getText().equals("")
                && yawTextField.getText() != null && !yawTextField.getText().equals("")
                && rollTextField.getText() != null && !rollTextField.getText().equals(""))
        {
            synchronized (Main.commandsToAdd)
            {
                Main.commandsToAdd.add(new CommandObject(xTextField.getText(), yTextField.getText(), zTextField.getText(), pitchTextField.getText(), yawTextField.getText(), rollTextField.getText()));
                Main.commandsLatch.unlock();
            }
        }
        else
        {
            synchronized (Main.responsesToAdd)
            {
                Main.responsesToAdd.add(new ResponseObject(false, "Please enter correct coords"));
                Main.responsesLatch.unlock();
            }
        }
    }

    private void formKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_formKeyPressed
    {//GEN-HEADEREND:event_formKeyPressed

    }//GEN-LAST:event_formKeyPressed

    private void xTextFieldKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_xTextFieldKeyPressed
    {//GEN-HEADEREND:event_xTextFieldKeyPressed
        if (KeyEvent.VK_ESCAPE == evt.getKeyCode())
        {
            execute();
        }
    }//GEN-LAST:event_xTextFieldKeyPressed

    private void yTextFieldKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_yTextFieldKeyPressed
    {//GEN-HEADEREND:event_yTextFieldKeyPressed
        if (KeyEvent.VK_ESCAPE == evt.getKeyCode())
        {
            execute();
        }
    }//GEN-LAST:event_yTextFieldKeyPressed

    private void zTextFieldKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_zTextFieldKeyPressed
    {//GEN-HEADEREND:event_zTextFieldKeyPressed
        if (KeyEvent.VK_ESCAPE == evt.getKeyCode())
        {
            execute();
        }
    }//GEN-LAST:event_zTextFieldKeyPressed

    private void pitchTextFieldKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_pitchTextFieldKeyPressed
    {//GEN-HEADEREND:event_pitchTextFieldKeyPressed
        if (KeyEvent.VK_ESCAPE == evt.getKeyCode())
        {
            execute();
        }
    }//GEN-LAST:event_pitchTextFieldKeyPressed

    private void yawTextFieldKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_yawTextFieldKeyPressed
    {//GEN-HEADEREND:event_yawTextFieldKeyPressed
        if (KeyEvent.VK_ESCAPE == evt.getKeyCode())
        {
            execute();
        }
    }//GEN-LAST:event_yawTextFieldKeyPressed

    private void rollTextFieldKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_rollTextFieldKeyPressed
    {//GEN-HEADEREND:event_rollTextFieldKeyPressed
        if (KeyEvent.VK_ESCAPE == evt.getKeyCode())
        {
            execute();
        }
    }//GEN-LAST:event_rollTextFieldKeyPressed

    private void homeButtonMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_homeButtonMouseClicked
    {//GEN-HEADEREND:event_homeButtonMouseClicked
        synchronized (Main.commandsToAdd)
        {
            Main.commandsToAdd.add(new CommandHome());
            Main.commandsLatch.unlock();
        }
    }//GEN-LAST:event_homeButtonMouseClicked

    private void calButtonMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_calButtonMouseClicked
    {//GEN-HEADEREND:event_calButtonMouseClicked
        synchronized (Main.commandsToAdd)
        {
            Main.commandsToAdd.add(new CommandCalibrate());
            Main.commandsLatch.unlock();
        }
    }//GEN-LAST:event_calButtonMouseClicked

    private void startButtonMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_startButtonMouseClicked
    {//GEN-HEADEREND:event_startButtonMouseClicked
        synchronized (Main.commandsToAdd)
        {
            Main.commandsToAdd.add(new CommandStart());
            Main.commandsLatch.unlock();
        }
    }//GEN-LAST:event_startButtonMouseClicked

    private void gripButtonMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_gripButtonMouseClicked
    {//GEN-HEADEREND:event_gripButtonMouseClicked
        synchronized (Main.commandsToAdd)
        {
            Main.commandsToAdd.add(new CommandGrip());
            Main.commandsLatch.unlock();
        }
    }//GEN-LAST:event_gripButtonMouseClicked

    private void ungripButtonMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_ungripButtonMouseClicked
    {//GEN-HEADEREND:event_ungripButtonMouseClicked
        synchronized (Main.commandsToAdd)
        {
            Main.commandsToAdd.add(new CommandUngrip());
            Main.commandsLatch.unlock();
        }
    }//GEN-LAST:event_ungripButtonMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new GUI().setVisible(true);
            }
        });

    }

    public void addText(String s)
    {
        s = s + "\n";
        outputText.append(s);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calButton;
    private javax.swing.JButton gripButton;
    private javax.swing.JButton homeButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea outputText;
    private javax.swing.JLabel pitchLabel;
    private javax.swing.JTextField pitchTextField;
    private javax.swing.JLabel rollLabel;
    private javax.swing.JTextField rollTextField;
    private javax.swing.JButton runButton;
    private javax.swing.JButton startButton;
    private javax.swing.JButton ungripButton;
    private javax.swing.JLabel xLabel;
    private javax.swing.JTextField xTextField;
    private javax.swing.JLabel yLabel;
    private javax.swing.JTextField yTextField;
    private javax.swing.JLabel yawLabel;
    private javax.swing.JTextField yawTextField;
    private javax.swing.JLabel zLabel;
    private javax.swing.JTextField zTextField;
    // End of variables declaration//GEN-END:variables
}
