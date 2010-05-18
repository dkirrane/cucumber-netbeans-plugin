/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package qubit.cucumber.editor.panels;

import org.openide.util.NbPreferences;

public final class CucumberFeaturesPanel extends javax.swing.JPanel {

    private final CucumberFeaturesOptionsPanelController controller;

    CucumberFeaturesPanel(CucumberFeaturesOptionsPanelController controller) {
        this.controller = controller;
        initComponents();
        // TODO listen to changes in form fields and call controller.changed()
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        executionOptionsButtonGroup = new javax.swing.ButtonGroup();
        rubyVersionButtonGroup = new javax.swing.ButtonGroup();
        executionOptionsPanel = new javax.swing.JPanel();
        defaultExecutionRadioButton = new javax.swing.JRadioButton();
        customOptionsTextField = new javax.swing.JTextField();
        defaultOptionsTextField = new javax.swing.JTextField();
        customExecutionRadioButton = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        recursiveCheckBox = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        rubyRadioButton = new javax.swing.JRadioButton();
        jRubyRadioButton = new javax.swing.JRadioButton();

        executionOptionsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(CucumberFeaturesPanel.class, "CucumberFeaturesPanel.executionOptionsPanel.border.title"))); // NOI18N

        executionOptionsButtonGroup.add(defaultExecutionRadioButton);
        defaultExecutionRadioButton.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(defaultExecutionRadioButton, org.openide.util.NbBundle.getMessage(CucumberFeaturesPanel.class, "CucumberFeaturesPanel.defaultExecutionRadioButton.text")); // NOI18N

        customOptionsTextField.setText(org.openide.util.NbBundle.getMessage(CucumberFeaturesPanel.class, "CucumberFeaturesPanel.customOptionsTextField.text")); // NOI18N

        defaultOptionsTextField.setEditable(false);
        defaultOptionsTextField.setText(org.openide.util.NbBundle.getMessage(CucumberFeaturesPanel.class, "CucumberFeaturesPanel.defaultOptionsTextField.text")); // NOI18N

        executionOptionsButtonGroup.add(customExecutionRadioButton);
        org.openide.awt.Mnemonics.setLocalizedText(customExecutionRadioButton, org.openide.util.NbBundle.getMessage(CucumberFeaturesPanel.class, "CucumberFeaturesPanel.customExecutionRadioButton.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(CucumberFeaturesPanel.class, "CucumberFeaturesPanel.jLabel1.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(CucumberFeaturesPanel.class, "CucumberFeaturesPanel.jLabel2.text")); // NOI18N

        recursiveCheckBox.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(recursiveCheckBox, org.openide.util.NbBundle.getMessage(CucumberFeaturesPanel.class, "CucumberFeaturesPanel.recursiveCheckBox.text")); // NOI18N

        javax.swing.GroupLayout executionOptionsPanelLayout = new javax.swing.GroupLayout(executionOptionsPanel);
        executionOptionsPanel.setLayout(executionOptionsPanelLayout);
        executionOptionsPanelLayout.setHorizontalGroup(
            executionOptionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(executionOptionsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(executionOptionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(defaultExecutionRadioButton)
                    .addComponent(customExecutionRadioButton)
                    .addComponent(recursiveCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(executionOptionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(customOptionsTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                    .addComponent(defaultOptionsTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE))
                .addContainerGap())
        );
        executionOptionsPanelLayout.setVerticalGroup(
            executionOptionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(executionOptionsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(executionOptionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(defaultExecutionRadioButton)
                    .addComponent(defaultOptionsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(executionOptionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customOptionsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customExecutionRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(executionOptionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(recursiveCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(CucumberFeaturesPanel.class, "CucumberFeaturesPanel.jPanel1.border.title"))); // NOI18N

        rubyVersionButtonGroup.add(rubyRadioButton);
        rubyRadioButton.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(rubyRadioButton, org.openide.util.NbBundle.getMessage(CucumberFeaturesPanel.class, "CucumberFeaturesPanel.rubyRadioButton.text")); // NOI18N

        rubyVersionButtonGroup.add(jRubyRadioButton);
        org.openide.awt.Mnemonics.setLocalizedText(jRubyRadioButton, org.openide.util.NbBundle.getMessage(CucumberFeaturesPanel.class, "CucumberFeaturesPanel.jRubyRadioButton.text")); // NOI18N
        jRubyRadioButton.setToolTipText(org.openide.util.NbBundle.getMessage(CucumberFeaturesPanel.class, "CucumberFeaturesPanel.jRubyRadioButton.toolTipText")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rubyRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jRubyRadioButton)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rubyRadioButton)
                    .addComponent(jRubyRadioButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(executionOptionsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(executionOptionsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    void load() {
        // TODO read settings and initialize GUI
        // Example:        
        // someCheckBox.setSelected(Preferences.userNodeForPackage(CucumberFeaturesPanel.class).getBoolean("someFlag", false));
        // or for org.openide.util with API spec. version >= 7.4:
        // someCheckBox.setSelected(NbPreferences.forModule(CucumberFeaturesPanel.class).getBoolean("someFlag", false));
        // or:
        // someTextField.setText(SomeSystemOption.getDefault().getSomeStringProperty());
        recursiveCheckBox.setSelected(NbPreferences.forModule(CucumberFeaturesPanel.class).getBoolean("recursiveOption", true));
        defaultOptionsTextField.setText("-s");
        customOptionsTextField.setText(NbPreferences.forModule(CucumberFeaturesPanel.class).get("customOptionsTextField", ""));
        customExecutionRadioButton.setSelected(NbPreferences.forModule(CucumberFeaturesPanel.class).getBoolean("customRadioButton", false));
        jRubyRadioButton.setSelected(NbPreferences.forModule(CucumberFeaturesPanel.class).getBoolean("jRubyRadioButton", false));
        //defaultOptionsTextField.setText(NbPreferences.forModule(CucumberFeaturesPanel.class).get("defaultOptions", ""));
    }

    void store() {
        // TODO store modified settings
        // Example:
        // Preferences.userNodeForPackage(CucumberFeaturesPanel.class).putBoolean("someFlag", someCheckBox.isSelected());
        // or for org.openide.util with API spec. version >= 7.4:
        // NbPreferences.forModule(CucumberFeaturesPanel.class).putBoolean("someFlag", someCheckBox.isSelected());
        // or:
        // SomeSystemOption.getDefault().setSomeStringProperty(someTextField.getText());
        NbPreferences.forModule(CucumberFeaturesPanel.class).putBoolean("recursiveOption", recursiveCheckBox.isSelected());
        NbPreferences.forModule(CucumberFeaturesPanel.class).putBoolean("customRadioButton", customExecutionRadioButton.isSelected());
        NbPreferences.forModule(CucumberFeaturesPanel.class).putBoolean("jRubyRadioButton", jRubyRadioButton.isSelected());
        NbPreferences.forModule(CucumberFeaturesPanel.class).put("customOptionsTextField", customOptionsTextField.getText());
    }

    boolean valid() {
        // TODO check whether form is consistent and complete
        return true;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton customExecutionRadioButton;
    private javax.swing.JTextField customOptionsTextField;
    private javax.swing.JRadioButton defaultExecutionRadioButton;
    private javax.swing.JTextField defaultOptionsTextField;
    private javax.swing.ButtonGroup executionOptionsButtonGroup;
    private javax.swing.JPanel executionOptionsPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRubyRadioButton;
    private javax.swing.JCheckBox recursiveCheckBox;
    private javax.swing.JRadioButton rubyRadioButton;
    private javax.swing.ButtonGroup rubyVersionButtonGroup;
    // End of variables declaration//GEN-END:variables
}