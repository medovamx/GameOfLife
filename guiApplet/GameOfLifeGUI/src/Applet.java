
public class Applet extends javax.swing.JApplet {
    
    private javax.swing.JButton createGridButton;
    private static javax.swing.JPanel gridPanel;
    private javax.swing.JTextField heightText;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton startButton;
    private javax.swing.JButton stopButton;
    private javax.swing.JPanel userPanel;
    private javax.swing.JTextField widthText;

    private static GuiGrid guiGrid;
    private static GuiTimer timer;
    /**
     * Initializes the applet GameOfLifeApplet
     */
    @Override
    public void init() {
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
            java.util.logging.Logger.getLogger(Applet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Applet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Applet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Applet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the applet */
        try {
            java.awt.EventQueue.invokeAndWait(new Runnable() {
                public void run() {
                    initComponents();
                }
            });
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * This method is called from within the init() method to initialize the
     * form. WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userPanel = new javax.swing.JPanel();
        createGridButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        widthText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        heightText = new javax.swing.JTextField();
        startButton = new javax.swing.JButton();
        stopButton = new javax.swing.JButton();
        gridPanel = new javax.swing.JPanel();

        setMaximumSize(new java.awt.Dimension(1000, 500));
        setMinimumSize(new java.awt.Dimension(1000, 500));
        setPreferredSize(new java.awt.Dimension(1000, 500));

        createGridButton.setText("Create Grid");
        createGridButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createGridButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Height:");

        widthText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                widthTextActionPerformed(evt);
            }
        });
        widthText.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                widthTextInputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });

        jLabel2.setText("Width:");

        heightText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                heightTextActionPerformed(evt);
            }
        });

        startButton.setText("Start");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        stopButton.setText("Stop");
        stopButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout userPanelLayout = new org.jdesktop.layout.GroupLayout(userPanel);
        userPanel.setLayout(userPanelLayout);
        userPanelLayout.setHorizontalGroup(
            userPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(userPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(userPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(userPanelLayout.createSequentialGroup()
                        .add(jLabel2)
                        .add(18, 18, 18)
                        .add(widthText, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 75, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(userPanelLayout.createSequentialGroup()
                        .add(jLabel3)
                        .add(12, 12, 12)
                        .add(heightText, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 75, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(createGridButton))
                .add(29, 29, 29)
                .add(userPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(startButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 91, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(stopButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 91, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(886, Short.MAX_VALUE))
        );
        userPanelLayout.setVerticalGroup(
            userPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(userPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(userPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2)
                    .add(widthText, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(startButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(userPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(userPanelLayout.createSequentialGroup()
                        .add(5, 5, 5)
                        .add(userPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel3)
                            .add(heightText, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(createGridButton))
                    .add(userPanelLayout.createSequentialGroup()
                        .add(18, 18, 18)
                        .add(stopButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        widthText.getAccessibleContext().setAccessibleParent(widthText);

        getContentPane().add(userPanel, java.awt.BorderLayout.PAGE_START);

        gridPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        gridPanel.setMaximumSize(new java.awt.Dimension(1000, 400));
        gridPanel.setMinimumSize(new java.awt.Dimension(1000, 400));
        gridPanel.setPreferredSize(new java.awt.Dimension(1000, 400));
        gridPanel.setLayout(new java.awt.GridLayout(1, 0));
        getContentPane().add(gridPanel, java.awt.BorderLayout.PAGE_END);

        getAccessibleContext().setAccessibleName("");
        getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents

    private void widthTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_widthTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_widthTextActionPerformed

    private void createGridButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createGridButtonActionPerformed
        
        byte width;
        byte height;      
        
        try {
            width = Byte.parseByte(widthText.getText());
            height = Byte.parseByte(heightText.getText());
            
            if (guiGrid != null) {
                gridPanel.remove(guiGrid);
                if (timer != null) {
                    timer.stopTimer();
                }
                
            }
            
            startButton.setEnabled(true);
            guiGrid = new GuiGrid(new Grid(width, height));
            gridPanel.add(guiGrid);

            gridPanel.revalidate();
        }
        catch (NumberFormatException nfe) {
        }
        
        
        
    }//GEN-LAST:event_createGridButtonActionPerformed

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        timer = new GuiTimer(guiGrid.getGrid()); 
    	startButton.setEnabled(false);
    	stopButton.setEnabled(true);
    	createGridButton.setEnabled(false);
    }//GEN-LAST:event_startButtonActionPerformed

    private void stopButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopButtonActionPerformed
        timer.stopTimer();
        startButton.setEnabled(true);
        stopButton.setEnabled(false);
        createGridButton.setEnabled(true);
    }//GEN-LAST:event_stopButtonActionPerformed

    private void heightTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_heightTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_heightTextActionPerformed

    private void widthTextInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_widthTextInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_widthTextInputMethodTextChanged

    public static void replaceGrid(GuiGrid g) {
        gridPanel.remove(guiGrid);
        guiGrid = g;
        gridPanel.add(guiGrid);
        gridPanel.revalidate();
        timer.setGrid(guiGrid.getGrid()); 
    }
/*
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createGridButton;
    private javax.swing.JPanel gridPanel;
    private javax.swing.JTextField heightText;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton startButton;
    private javax.swing.JButton stopButton;
    private javax.swing.JPanel userPanel;
    private javax.swing.JTextField widthText;
    // End of variables declaration//GEN-END:variables
*/
}
