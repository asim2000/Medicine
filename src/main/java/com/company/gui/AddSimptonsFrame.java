/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.gui;

import com.company.dao.IllnessRepository;
import com.company.dao.SymptomRepository;
import com.company.entity.Illness;
import com.company.entity.Symptom;
import java.awt.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Asim Babayev
 */
public class AddSimptonsFrame extends javax.swing.JFrame {
    private SymptomRepository symptomRepository;
    private IllnessRepository illnessRepository;

    /**
     * Creates new form AddSimptonsFrame
     */
    public AddSimptonsFrame() {
        initComponents();
    }
    public AddSimptonsFrame(SymptomRepository symptomRepository,IllnessRepository illnessRepository){
        this();
        this.symptomRepository = symptomRepository;
        this.illnessRepository = illnessRepository;
        loadIllness();
    }
    private void loadIllness(){
        DefaultComboBoxModel combo = new DefaultComboBoxModel();
        illnessCb.setModel(combo);
        ArrayList<Illness> illnesses = (ArrayList<Illness>) illnessRepository.findAll();
        if(illnesses!=null){
            for(Illness i:illnesses){
            combo.addElement(i);
        }
        }
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
        illnessCb = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        simptonsTxtArea = new javax.swing.JTextArea();
        addSimptonsBtn = new javax.swing.JButton();
        closeAddSymptonBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        simptonsTxtArea.setColumns(20);
        simptonsTxtArea.setRows(5);
        jScrollPane1.setViewportView(simptonsTxtArea);

        addSimptonsBtn.setText("Əlavə et");
        addSimptonsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSimptonsBtnActionPerformed(evt);
            }
        });

        closeAddSymptonBtn.setText("Bagla");
        closeAddSymptonBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeAddSymptonBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(illnessCb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(addSimptonsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(closeAddSymptonBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(illnessCb, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addSimptonsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(closeAddSymptonBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeAddSymptonBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeAddSymptonBtnActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_closeAddSymptonBtnActionPerformed

    private void save(String s,Illness illness){
//        Symptom symptom = new Symptom();
//        symptom.setName(s);
//        symptom.getIllnesses().add(illness);
//        Symptom addedSymptom = symptomRepository.save(symptom);
//        IllnessSymptom is = new IllnessSymptom();
//        is.setIllness(illness);
//        is.setSymptom(addedSymptom);
//        illnessSymptomRepository.save(is);
        
    }
    private void addSimptonsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSimptonsBtnActionPerformed
        String txt = simptonsTxtArea.getText();
        Illness illness = (Illness) illnessCb.getSelectedItem();
        if(txt!=null && !txt.isEmpty() && illness!=null){
            if(txt.contains(",")){
                String[] sypmtoms = txt.split(",");
            for(String s:sypmtoms){
                Symptom sym = new Symptom();
                sym.setName(s);
                sym.setIllness(illness);
                illness.getSymptoms().add(sym);
                
            }
            illnessRepository.save(illness);
                simptonsTxtArea.setText("");
            JOptionPane.showMessageDialog(null, "Əlavə olundu","Success",JOptionPane.OK_OPTION);
            }
            else{
                try{
                     Symptom sym = new Symptom();
                sym.setName(txt);
                sym.setIllness(illness);
                illness.getSymptoms().add(sym);
                illnessRepository.save(illness);
                    simptonsTxtArea.setText("");
                    JOptionPane.showMessageDialog(null, "Əlavə olundu","Success",JOptionPane.OK_OPTION);
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_addSimptonsBtnActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addSimptonsBtn;
    private javax.swing.JButton closeAddSymptonBtn;
    private javax.swing.JComboBox illnessCb;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea simptonsTxtArea;
    // End of variables declaration//GEN-END:variables
}
