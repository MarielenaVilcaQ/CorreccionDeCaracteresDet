/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Button;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.lang.reflect.Field;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
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
public final class Main extends javax.swing.JFrame {
    FondoPanel fondo = new FondoPanel();
    /**
     * Creates new form Interfaz
     */
    public Main() {
        this.setContentPane(fondo);
        initComponents();
        setTitle("OCR");
    }
    class FondoPanel extends JPanel{
        private Image imagen;
        @Override
            public void paint(Graphics g){
                imagen = new ImageIcon(getClass().getResource("Imagenes/unsaback.png")).getImage();
                g.drawImage(imagen,0,0,getWidth(),getHeight(),this);
                setOpaque(false);
                super.paint(g);
            }
    }
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/icon.png"));
        return retValue;
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
        disminuirRuido = new javax.swing.JCheckBox();
        completarCaracteres = new javax.swing.JCheckBox();
        reducirExcesos = new javax.swing.JCheckBox();
        buttonInfo = new java.awt.Button();
        buttonResetear1 = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
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
        buttonProcesaraImagen.setBackground(new java.awt.Color(0, 51, 255));
        buttonProcesaraImagen.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonProcesaraImagen.setEnabled(false);
        buttonProcesaraImagen.setForeground(new java.awt.Color(255, 255, 255));
        buttonProcesaraImagen.setLabel("Procesar imagen");
        buttonProcesaraImagen.setName(""); // NOI18N
        buttonProcesaraImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonProcesaraImagenActionPerformed(evt);
            }
        });

        buttonConvertirImagen.setActionCommand("Convertir imagen a texto");
        buttonConvertirImagen.setBackground(new java.awt.Color(0, 102, 255));
        buttonConvertirImagen.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonConvertirImagen.setEnabled(false);
        buttonConvertirImagen.setForeground(new java.awt.Color(255, 255, 255));
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
        jTextArea1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        jScrollPane1.setViewportView(jTextArea1);

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

        buttonInfo.setActionCommand("Convertir imagen a texto");
        buttonInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonInfo.setLabel("Info+");
        buttonInfo.setName(""); // NOI18N
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonConvertirImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(46, 46, 46)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(disminuirRuido)
                                            .addComponent(reducirExcesos)
                                            .addComponent(completarCaracteres)))
                                    .addComponent(buttonProcesaraImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(149, 149, 149)
                                .addComponent(buttonResetear1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(disminuirRuido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reducirExcesos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(completarCaracteres)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(buttonProcesaraImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonResetear1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(buttonConvertirImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        buttonProcesaraImagen.getAccessibleContext().setAccessibleDescription("");
        buttonInfo.getAccessibleContext().setAccessibleName("Informacion");

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

        }

        //Codigo para disminuir Ruido en la imagen
        if (disminuirRuido.isSelected()) {

            //Poner Codigo para Disminuir Ruido
            if (listoProcesar == false) {
                result = new OptimizarImagen().optimizarBinarizacion(origin, false);
                listoProcesar = true;
            } else {
                result = new OptimizarImagen().optimizarBinarizacionSinRep(result, false);
            }

        }

        if (reducirExcesos.isSelected()) {
            jLabel2.setText("Reducir Excesos");
            if (listoProcesar == false) {
                //CODIGO para reducir excesos
                result = new OptimizarImagen().optimizarBinarizacion(origin, true);
                listoProcesar = true;
            } else {
                //Codigo para reducir excesos
                result = new OptimizarImagen().optimizarBinarizacionSinRep(result, true);
            }
        }
        
        jLabel2.setText("");
            ImageIcon imageIcon = new ImageIcon(new ImageIcon(result).getImage().
                    getScaledInstance(250, 250, Image.SCALE_DEFAULT));
            jLabel2.setIcon(imageIcon);

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
        //Borra la imagen procesada y desactiva el boton de convertirImagen
        listoProcesar = false;
        buttonConvertirImagen.setEnabled(listoProcesar);
        jLabel2.setIcon(null);
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JCheckBox reducirExcesos;
    private java.awt.TextField textField1;
    // End of variables declaration//GEN-END:variables
    private String result; //Imagen procesada
    private String origin; //Imagen Inicial
    private boolean listoProcesar = false;

}
