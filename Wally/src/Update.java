/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wally;

import java.awt.Color;

/**
 *
 * @author shourabhmaloo
 */
public class Update extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Update() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        sidebar = new javax.swing.JPanel();
        dashboardP = new javax.swing.JPanel();
        dashboardL = new javax.swing.JLabel();
        addExpenseP = new javax.swing.JPanel();
        addExpenseL = new javax.swing.JLabel();
        expenseListP = new javax.swing.JPanel();
        expenseListL = new javax.swing.JLabel();
        updateP = new javax.swing.JPanel();
        updateL = new javax.swing.JLabel();
        analyticsP = new javax.swing.JPanel();
        analyticsL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1100, 855));

        jPanel1.setBackground(new java.awt.Color(0, 255, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(1100, 855));

        sidebar.setBackground(new java.awt.Color(54, 33, 89));
        sidebar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        sidebar.setInheritsPopupMenu(true);
        sidebar.setPreferredSize(new java.awt.Dimension(312, 855));

        dashboardP.setBackground(new java.awt.Color(54, 33, 89));

        dashboardL.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        dashboardL.setForeground(new java.awt.Color(255, 255, 255));
        dashboardL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dashboardL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wally/round_home_white_18dp.png"))); // NOI18N
        dashboardL.setText("     Dashboard");
        dashboardL.setMaximumSize(new java.awt.Dimension(97, 61));
        dashboardL.setMinimumSize(new java.awt.Dimension(97, 61));
        dashboardL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardLMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dashboardLMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dashboardLMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout dashboardPLayout = new javax.swing.GroupLayout(dashboardP);
        dashboardP.setLayout(dashboardPLayout);
        dashboardPLayout.setHorizontalGroup(
            dashboardPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dashboardL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dashboardPLayout.setVerticalGroup(
            dashboardPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dashboardL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, Short.MAX_VALUE)
        );

        addExpenseP.setBackground(new java.awt.Color(54, 33, 89));

        addExpenseL.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        addExpenseL.setForeground(new java.awt.Color(255, 255, 255));
        addExpenseL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addExpenseL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wally/baseline_add_box_white_18dp.png"))); // NOI18N
        addExpenseL.setText("  Add Expense");
        addExpenseL.setMaximumSize(new java.awt.Dimension(97, 61));
        addExpenseL.setMinimumSize(new java.awt.Dimension(97, 61));
        addExpenseL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addExpenseLMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addExpenseLMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addExpenseLMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout addExpensePLayout = new javax.swing.GroupLayout(addExpenseP);
        addExpenseP.setLayout(addExpensePLayout);
        addExpensePLayout.setHorizontalGroup(
            addExpensePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addExpenseL, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
        );
        addExpensePLayout.setVerticalGroup(
            addExpensePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addExpenseL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, Short.MAX_VALUE)
        );

        expenseListP.setBackground(new java.awt.Color(54, 33, 89));

        expenseListL.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        expenseListL.setForeground(new java.awt.Color(255, 255, 255));
        expenseListL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        expenseListL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wally/baseline_list_white_18dp.png"))); // NOI18N
        expenseListL.setText("  Expense List");
        expenseListL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                expenseListLMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                expenseListLMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                expenseListLMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout expenseListPLayout = new javax.swing.GroupLayout(expenseListP);
        expenseListP.setLayout(expenseListPLayout);
        expenseListPLayout.setHorizontalGroup(
            expenseListPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(expenseListL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        expenseListPLayout.setVerticalGroup(
            expenseListPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(expenseListL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
        );

        updateP.setBackground(new java.awt.Color(54, 33, 89));

        updateL.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        updateL.setForeground(new java.awt.Color(255, 255, 255));
        updateL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        updateL.setText("Update");
        updateL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateLMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateLMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateLMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout updatePLayout = new javax.swing.GroupLayout(updateP);
        updateP.setLayout(updatePLayout);
        updatePLayout.setHorizontalGroup(
            updatePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(updateL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        updatePLayout.setVerticalGroup(
            updatePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(updateL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
        );

        analyticsP.setBackground(new java.awt.Color(54, 33, 89));

        analyticsL.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        analyticsL.setForeground(new java.awt.Color(255, 255, 255));
        analyticsL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        analyticsL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wally/baseline_analytics_white_18dp.png"))); // NOI18N
        analyticsL.setText("      Analytics");
        analyticsL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                analyticsLMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                analyticsLMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                analyticsLMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout analyticsPLayout = new javax.swing.GroupLayout(analyticsP);
        analyticsP.setLayout(analyticsPLayout);
        analyticsPLayout.setHorizontalGroup(
            analyticsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(analyticsL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        analyticsPLayout.setVerticalGroup(
            analyticsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(analyticsL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout sidebarLayout = new javax.swing.GroupLayout(sidebar);
        sidebar.setLayout(sidebarLayout);
        sidebarLayout.setHorizontalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addExpenseP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(expenseListP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(updateP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(analyticsP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(dashboardP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        sidebarLayout.setVerticalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarLayout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(dashboardP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addExpenseP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(expenseListP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(updateP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(analyticsP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(382, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(sidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(794, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidebar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1106, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void expenseListLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_expenseListLMouseExited
        // TODO add your handling code here:
                expenseListP.setBackground(new Color(54,33,89));

    }//GEN-LAST:event_expenseListLMouseExited

    private void expenseListLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_expenseListLMouseEntered
        // TODO add your handling code here:
                expenseListP.setBackground(new Color(85,69,118));

    }//GEN-LAST:event_expenseListLMouseEntered

    private void addExpenseLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addExpenseLMouseEntered
        // TODO add your handling code here:
        addExpenseP.setBackground(new Color(85,69,118));
    }//GEN-LAST:event_addExpenseLMouseEntered

    private void addExpenseLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addExpenseLMouseExited
        // TODO add your handling code here:
        addExpenseP.setBackground(new Color(54,33,89));
    }//GEN-LAST:event_addExpenseLMouseExited

    private void addExpenseLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addExpenseLMouseClicked
        // TODO add your handling code here:
                new AddExpense().setVisible(true);
        this.dispose();

        
        
    }//GEN-LAST:event_addExpenseLMouseClicked

    private void expenseListLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_expenseListLMouseClicked
        // TODO add your handling code here:
                new ExpenseList().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_expenseListLMouseClicked

    private void updateLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateLMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_updateLMouseClicked

    private void updateLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateLMouseExited
        // TODO add your handling code here:
                updateP.setBackground(new Color(54,33,89));

    }//GEN-LAST:event_updateLMouseExited

    private void updateLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateLMouseEntered
        // TODO add your handling code here:
                updateP.setBackground(new Color(85,69,118));

    }//GEN-LAST:event_updateLMouseEntered

    private void analyticsLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_analyticsLMouseClicked
        // TODO add your handling code here:
                new Analytics().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_analyticsLMouseClicked

    private void analyticsLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_analyticsLMouseExited
        // TODO add your handling code here:
                        analyticsP.setBackground(new Color(54,33,89));

    }//GEN-LAST:event_analyticsLMouseExited

    private void analyticsLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_analyticsLMouseEntered
        // TODO add your handling code here:
                        analyticsP.setBackground(new Color(85,69,118));

    }//GEN-LAST:event_analyticsLMouseEntered

    private void dashboardLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardLMouseClicked
        // TODO add your handling code here:
               new Dashboard().setVisible(true);
       this.dispose();

        
        
    }//GEN-LAST:event_dashboardLMouseClicked

    private void dashboardLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardLMouseExited
        // TODO add your handling code here:
                                dashboardP.setBackground(new Color(54,33,89));

    }//GEN-LAST:event_dashboardLMouseExited

    private void dashboardLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardLMouseEntered
        // TODO add your handling code here:
                                dashboardP.setBackground(new Color(85,69,118));

    }//GEN-LAST:event_dashboardLMouseEntered

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addExpenseL;
    private javax.swing.JPanel addExpenseP;
    private javax.swing.JLabel analyticsL;
    private javax.swing.JPanel analyticsP;
    private javax.swing.JLabel dashboardL;
    private javax.swing.JPanel dashboardP;
    private javax.swing.JLabel expenseListL;
    private javax.swing.JPanel expenseListP;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel sidebar;
    private javax.swing.JLabel updateL;
    private javax.swing.JPanel updateP;
    // End of variables declaration//GEN-END:variables
}