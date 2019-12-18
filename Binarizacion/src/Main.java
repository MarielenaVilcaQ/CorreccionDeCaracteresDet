/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Image;
import java.io.File;
import java.lang.reflect.Field;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import static org.opencv.imgcodecs.Imgcodecs.imread;
import static org.opencv.imgcodecs.Imgcodecs.imwrite;

/**
 *
 * @author Marielena
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
    public Main() {
        initComponents();
    }

    static {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoRuido = new javax.swing.ButtonGroup();
        textField1 = new java.awt.TextField();
        button1 = new java.awt.Button();
        buttonProcesaraImagen = new java.awt.Button();
        buttonConvertirImagen = new java.awt.Button();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        disminuirRuido = new javax.swing.JCheckBox();
        completarCaracteres = new javax.swing.JCheckBox();
        reducirExcesos = new javax.swing.JCheckBox();
        jrbAgresivo = new javax.swing.JRadioButton();
        jrbNormal = new javax.swing.JRadioButton();
        buttonInfo = new java.awt.Button();
        buttonResetear1 = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        textField1.setName("ruta"); // NOI18N
        textField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField1ActionPerformed(evt);
            }
        });

        button1.setActionCommand("Seleccionar Imagen");
        button1.setLabel("Seleccionar Imagen");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        buttonProcesaraImagen.setActionCommand("Procesar imagen");
        buttonProcesaraImagen.setEnabled(false);
        buttonProcesaraImagen.setLabel("Procesar imagen");
        buttonProcesaraImagen.setName(""); // NOI18N
        buttonProcesaraImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonProcesaraImagenActionPerformed(evt);
            }
        });

        buttonConvertirImagen.setActionCommand("Convertir imagen a texto");
        buttonConvertirImagen.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonConvertirImagen.setEnabled(false);
        buttonConvertirImagen.setLabel("Convertir imagen a texto");
        buttonConvertirImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonConvertirImagenActionPerformed(evt);
            }
        });

        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setToolTipText("");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/una.png"))); // NOI18N
        jLabel4.setText("EPIS");
        jLabel4.setMaximumSize(new java.awt.Dimension(826, 800));

        disminuirRuido.setText("Disminuir Ruido");
        disminuirRuido.setEnabled(false);
        disminuirRuido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disminuirRuidoActionPerformed(evt);
            }
        });

        completarCaracteres.setText("Completar Caracteres");
        completarCaracteres.setEnabled(false);
        completarCaracteres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completarCaracteresActionPerformed(evt);
            }
        });

        reducirExcesos.setText("Reducir Excesos");
        reducirExcesos.setEnabled(false);
        reducirExcesos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reducirExcesosActionPerformed(evt);
            }
        });

        grupoRuido.add(jrbAgresivo);
        jrbAgresivo.setText("Agresivo");
        jrbAgresivo.setEnabled(false);

        grupoRuido.add(jrbNormal);
        jrbNormal.setText("Normal");
        jrbNormal.setEnabled(false);

        buttonInfo.setActionCommand("Convertir imagen a texto");
        buttonInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonInfo.setLabel("Información");
        buttonInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonInfoActionPerformed(evt);
            }
        });

        buttonResetear1.setActionCommand("Convertir imagen a texto");
        buttonResetear1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonResetear1.setLabel("Resetear");
        buttonResetear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonResetear1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(textField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(buttonProcesaraImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(disminuirRuido)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jrbAgresivo)
                                    .addComponent(jrbNormal)))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(completarCaracteres)
                                    .addGap(53, 53, 53)
                                    .addComponent(reducirExcesos))
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(buttonConvertirImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(button1, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                            .addComponent(buttonResetear1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(77, 77, 77))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(buttonInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(216, 216, 216))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(disminuirRuido)
                        .addComponent(reducirExcesos)
                        .addComponent(jrbNormal))
                    .addComponent(completarCaracteres, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jrbAgresivo)
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(buttonProcesaraImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonConvertirImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(buttonResetear1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        buttonProcesaraImagen.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField1ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
        //Cargar Imagen
        JFileChooser jf = new JFileChooser();
        FileNameExtensionFilter imageFilter = new FileNameExtensionFilter("png",
                ImageIO.getReaderFileSuffixes());
        jf.setFileFilter(imageFilter);

        jf.showOpenDialog(this);
        File file = jf.getSelectedFile();
        if (file != null) {
            textField1.setText(file.getAbsolutePath());
            //Activar check box
            disminuirRuido.setEnabled(true);
            completarCaracteres.setEnabled(true);
            reducirExcesos.setEnabled(true);

            jLabel1.setText("");
            ImageIcon imageIcon = new ImageIcon(new ImageIcon(file.
                    getAbsolutePath()).getImage().
                    getScaledInstance(250, 250, Image.SCALE_DEFAULT));
            jLabel1.setIcon(imageIcon);
            origin = textField1.getText();
            listoProcesar = false;
        }
    }//GEN-LAST:event_button1ActionPerformed

    private void buttonProcesaraImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonProcesaraImagenActionPerformed
        // TODO add your handling code here:
        //PROCESAR IMAGEN

        //Codigo para completar Caracteres
        if (completarCaracteres.isSelected()) {

            if (listoProcesar == false) {
                result = new CompletarCaracteres().completeCaracter(origin);
                listoProcesar = true;
            } else {
                result = new CompletarCaracteres().completeCaracterSinRep(result);
            }

            //System.out.println(result);
            jLabel2.setText("");
            ImageIcon imageIcon = new ImageIcon(new ImageIcon(result).getImage().
                    getScaledInstance(250, 250, Image.SCALE_DEFAULT));
            jLabel2.setIcon(imageIcon);

        }

        //Codigo para disminuir Ruido en la imagen
        if (disminuirRuido.isSelected()) {

            //Codigo para ver si la disminucion de ruido es agresivo.
            boolean ruido_b = false;
            if (jrbAgresivo.isSelected()) {
                ruido_b = true;
            }
            if (jrbNormal.isSelected()) {
                ruido_b = false;
            }

            //Poner Codigo para Disminuir Ruido
            if (listoProcesar == false) {
                result = new OptimizarImagen().optimizarBinarizacion(origin, ruido_b);
                listoProcesar = true;
            } else {
                result = new OptimizarImagen().optimizarBinarizacionSinRep(result, ruido_b);
            }

            //System.out.println(result);
            jLabel2.setText("");
            ImageIcon imageIcon = new ImageIcon(new ImageIcon(result).getImage().
                    getScaledInstance(250, 250, Image.SCALE_DEFAULT));
            jLabel2.setIcon(imageIcon);

        }

        if (reducirExcesos.isSelected()) {
            jLabel2.setText("Reducir Excesos");
            if (listoProcesar == false) {
                //CODIGO para reducir excesos
                listoProcesar = true;
            } else {
                //Codigo para reducir excesos
            }
        }

        //Activar boton 
        if (listoProcesar) {
            buttonConvertirImagen.setEnabled(true);
        } else {
            buttonConvertirImagen.setEnabled(false);
        }


    }//GEN-LAST:event_buttonProcesaraImagenActionPerformed

    private void buttonConvertirImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonConvertirImagenActionPerformed
        // TODO add your handling code here:
        //CONVERTIR A TEXTO
        Tesseract tesseract = new Tesseract();
        try {
            // TODO add your handling code here;

            tesseract.setDatapath("D:\\CorreccionDeCaracteresDet\\Binarizacion\\lib\\Tess4J\\tessdata");
            String text = tesseract.doOCR(new File(result)); // Aqui debe ir la imagen procesada 
            jTextArea1.setText(text);
        } catch (TesseractException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonConvertirImagenActionPerformed
    //Metodo para activar el boton de procesar
    private void seleccionados() {
        if ((disminuirRuido.isSelected() || reducirExcesos.isSelected() || completarCaracteres.isSelected())) {
            buttonProcesaraImagen.setEnabled(true);
        } else {
            buttonProcesaraImagen.setEnabled(false);
            buttonConvertirImagen.setEnabled(false);
        }
    }
    private void disminuirRuidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disminuirRuidoActionPerformed
        // TODO add your handling code here:
        seleccionados();
        if (disminuirRuido.isSelected()) {
            jrbAgresivo.setEnabled(true);
            jrbNormal.setEnabled(true);
            jrbNormal.setSelected(true);
        } else {
            jrbAgresivo.setEnabled(false);
            jrbNormal.setEnabled(false);
        }
    }//GEN-LAST:event_disminuirRuidoActionPerformed

    private void reducirExcesosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reducirExcesosActionPerformed
        // TODO add your handling code here:
        seleccionados();
    }//GEN-LAST:event_reducirExcesosActionPerformed

    private void completarCaracteresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completarCaracteresActionPerformed
        // TODO add your handling code here:
        seleccionados();
    }//GEN-LAST:event_completarCaracteresActionPerformed

    private void buttonInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInfoActionPerformed
        // TODO add your handling code here:

        JOptionPane.showMessageDialog(null, "Aplicación Desarrollada por los estudiantes de la EPIS:\n\t- Huayhua Paco Eleo Romario\n\t- Laura Barrios "
                + "Erick Andy\n\t- Perez Lima Marisol\n\t- Vilca Quispe Marielena\n\t- Zea Quispe Gerald", "\t\tSobre Nosotros", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_buttonInfoActionPerformed

    private void buttonResetear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonResetear1ActionPerformed
        // TODO add your handling code here:
        listoProcesar = false;
    }//GEN-LAST:event_buttonResetear1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IllegalArgumentException, NoSuchFieldException, IllegalAccessException {
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // Load OPENCV

                new Main().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private java.awt.Button buttonConvertirImagen;
    private java.awt.Button buttonInfo;
    private java.awt.Button buttonProcesaraImagen;
    private java.awt.Button buttonResetear1;
    private javax.swing.JCheckBox completarCaracteres;
    private javax.swing.JCheckBox disminuirRuido;
    private javax.swing.ButtonGroup grupoRuido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JRadioButton jrbAgresivo;
    private javax.swing.JRadioButton jrbNormal;
    private javax.swing.JCheckBox reducirExcesos;
    private java.awt.TextField textField1;
    // End of variables declaration//GEN-END:variables
    private String result; //Imagen procesada
    private String origin; //Imagen Inicial
    private boolean listoProcesar = false;

}
