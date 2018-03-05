/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productcipher;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author HP
 */
public class Encrypt extends javax.swing.JFrame {

    public JFileChooser fc;
    String filePath;
    String originalText;
    String newAlphabet;
    String key;
    String key2;
    int substitutionVal;
    int substitutionVal2;
    String permutatedString;
    
    public Encrypt() {
        initComponents();
        fc = new JFileChooser();
        originalText ="";
        newAlphabet = "";
        key = "";
        key2="";
        substitutionVal =0;
        substitutionVal2 =0;
        permutatedString = "";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        originalFile = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnSelect = new javax.swing.JButton();
        btnEncrypt = new javax.swing.JButton();
        btnKey = new javax.swing.JButton();
        txtKey = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtEncrypt = new javax.swing.JTextArea();
        jPasswordField1 = new javax.swing.JPasswordField();
        btnNewKey = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnDecrypt = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtOri = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        originalFile.setBackground(new java.awt.Color(255, 255, 255));
        originalFile.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        originalFile.setOpaque(true);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Encrypt Your File");

        btnSelect.setText("Select File");
        btnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectActionPerformed(evt);
            }
        });

        btnEncrypt.setText("Encrypt");
        btnEncrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncryptActionPerformed(evt);
            }
        });

        btnKey.setText("Enter Key");
        btnKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeyActionPerformed(evt);
            }
        });

        jLabel1.setText("Encrypted Text");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2)
                            .addComponent(originalFile, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtKey))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSelect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnKey, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(btnEncrypt))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(originalFile, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSelect))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKey)
                    .addComponent(txtKey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnEncrypt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        txtEncrypt.setColumns(20);
        txtEncrypt.setRows(5);
        jScrollPane1.setViewportView(txtEncrypt);

        btnNewKey.setText("Key");
        btnNewKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewKeyActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Decrypt the Text");

        btnDecrypt.setText("Decrypt");
        btnDecrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecryptActionPerformed(evt);
            }
        });

        jLabel4.setText("Decrypted text");

        txtOri.setColumns(20);
        txtOri.setRows(5);
        jScrollPane2.setViewportView(txtOri);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(btnDecrypt))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPasswordField1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnNewKey)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNewKey))
                .addGap(18, 18, 18)
                .addComponent(btnDecrypt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectActionPerformed

        //select a file to encrypt
        FileNameExtensionFilter filter = new FileNameExtensionFilter("TEXT FILES", "txt", "text");
        fc.setFileFilter(filter);
        
        int returnVal = fc.showOpenDialog(null);
        
        if(returnVal == JFileChooser.APPROVE_OPTION){
            File file = fc.getSelectedFile();
            filePath = file.getAbsolutePath();
            originalFile.setText(filePath);
            String line = "";
            
            try {
                FileReader fr = new FileReader(filePath);
                BufferedReader buffer = new BufferedReader(fr);
                
                while((line = buffer.readLine())!= null){
                    originalText += line.toLowerCase(); //get the text in the file 
                
                }
                buffer.close();
                
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Encrypt.class.getName()).log(Level.SEVERE, null, ex);
            }
            catch (IOException e){}
            
        }
        
        
    }//GEN-LAST:event_btnSelectActionPerformed

    private void btnEncryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncryptActionPerformed
        
        //do the encryption
        String substituted =substitute(originalText);   //do the substitution
        String encryptedText = permutate(substituted); //do the permutation
        
        txtEncrypt.setText(encryptedText);
        
    }//GEN-LAST:event_btnEncryptActionPerformed

    private void btnKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeyActionPerformed

        //get a value(substitutionVal) to do substitution and permutation
        
       key = txtKey.getText();
       int val=0;
       
       for(int i=0; i<key.length(); i++){
           val += key.charAt(i) - 96;
       }
       substitutionVal = val%26;
       System.out.println(val);
       System.out.println(substitutionVal);
       
    }//GEN-LAST:event_btnKeyActionPerformed

    private void btnNewKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewKeyActionPerformed
        
        // calculate a new substitution value to do decryption
        key = txtKey.getText();
        System.out.println("key "+key);
        int val=0;
       
        for(int i=0; i<key.length(); i++){
           val += key.charAt(i) - 96;
        }
        substitutionVal2 =val%26;
   
       System.out.println("substituion value "+substitutionVal2);
    }//GEN-LAST:event_btnNewKeyActionPerformed

    private void btnDecryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecryptActionPerformed
        // TODO add your handling code here:
        String x= txtEncrypt.getText();
        String txt = x.substring(1, x.length());
        
        String removePermutedTxt = removePermutation(txt); //remove the permutation
        String text = removeSubstituion(removePermutedTxt); //remove the substitution
        
        txtOri.setText(text); // show the decrypted text
        
    }//GEN-LAST:event_btnDecryptActionPerformed

    public String removePermutation(String originalTxt){
        
        //remove permutation
        
        String rePermutatedText ="";
        String newText="";
        
        for(int i=0; i<originalTxt.length(); i=i+substitutionVal2){
            
            rePermutatedText += new StringBuffer(originalTxt.substring(i, i+substitutionVal2)).reverse().toString(); // re-reverse the text
        }
        System.out.println(rePermutatedText);
        
        for(int i=0; i<rePermutatedText.length(); i++){
            if(rePermutatedText.charAt(i)!= '#'){
                newText += rePermutatedText.charAt(i);
            }
        }
        System.out.println(newText);
        return newText;
    }
    
     public String removeSubstituion(String text){ //remove the substitution
    
        String substituionRemovedTxt ="";
        for(int i=0; i<text.length(); i++){
            int val = text.charAt(i);
           
            char x= (char)(val- substitutionVal2);
            
            // System.out.println(val + substitutionVal);
             if((val+substitutionVal2)!=36){
                 substituionRemovedTxt += x;
             }
             else{
                 substituionRemovedTxt += " ";
             }
             
            // System.out.println(substitutedText);
            
        }
        System.out.println(substituionRemovedTxt);
        return substituionRemovedTxt;
    }
    
    
    public String substitute(String line){ //do the substitution
        String substitutedText = "";
        for(int i=0; i<line.length(); i++){
            int val = line.charAt(i);
           
            char x= (char)(val+ substitutionVal);
            
            // System.out.println(val + substitutionVal);
             if((val+substitutionVal)!=127){
                 substitutedText += x;
             }
             else{
                 substitutedText += '$';
             }
            
        }
        
        return substitutedText;
    }
    
    public String permutate(String line){ //do the permutation for the text
        
        String text="";
        String encryptedText= " ";
        for(int i=0; i< (substitutionVal - (line.length()%substitutionVal));i++){
            text += "#";
            
        }
         System.out.println(text);
        line += text;
         System.out.println(line.length());
        for(int i=0; i<line.length(); i=i+substitutionVal){
            encryptedText += new StringBuffer(line.substring(i, i+substitutionVal)).reverse().toString();
        }
        System.out.println(encryptedText);
        return encryptedText;
    }
    
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
            java.util.logging.Logger.getLogger(Encrypt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Encrypt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Encrypt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Encrypt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Encrypt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDecrypt;
    private javax.swing.JButton btnEncrypt;
    private javax.swing.JButton btnKey;
    private javax.swing.JButton btnNewKey;
    private javax.swing.JButton btnSelect;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel originalFile;
    private javax.swing.JTextArea txtEncrypt;
    private javax.swing.JPasswordField txtKey;
    private javax.swing.JTextArea txtOri;
    // End of variables declaration//GEN-END:variables
}
