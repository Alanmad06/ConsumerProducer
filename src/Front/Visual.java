/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Front;

import Back.PlanificadorProcesos;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.Timer;

/**
 *
 * @author alanm
 */
public class Visual extends javax.swing.JFrame {

    PlanificadorProcesos PlanificadorProcesos = new PlanificadorProcesos();
    ImageIcon iconProducerWorking = new ImageIcon("C:\\Users\\alanm\\OneDrive\\Documentos\\NetBeansProjects\\ConsumerProducer\\src\\images\\produciendo.gif");
    ImageIcon iconProducer = new ImageIcon("C:\\Users\\alanm\\OneDrive\\Documentos\\NetBeansProjects\\ConsumerProducer\\src\\images\\worker.png");
    ImageIcon iconConsumer = new ImageIcon("C:\\Users\\alanm\\OneDrive\\Documentos\\NetBeansProjects\\ConsumerProducer\\src\\images\\consumer.png");
    ImageIcon iconConsumerWorking = new ImageIcon("C:\\Users\\alanm\\OneDrive\\Documentos\\NetBeansProjects\\ConsumerProducer\\src\\images\\consumiendo.gif");
    ImageIcon iconZZZ = new ImageIcon("C:\\Users\\alanm\\OneDrive\\Documentos\\NetBeansProjects\\ConsumerProducer\\src\\images\\zzz.gif");
    boolean Action = false;
    /**
     * Creates new form Visual
     */
    public Visual() {
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

        jPanel2 = new javax.swing.JPanel();
        Produccion1 = new javax.swing.JButton();
        Produccion2 = new javax.swing.JButton();
        Produccion3 = new javax.swing.JButton();
        Produccion4 = new javax.swing.JButton();
        Produccion5 = new javax.swing.JButton();
        Produccion6 = new javax.swing.JButton();
        Produccion7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        IniciarProduccion = new javax.swing.JButton();
        producer6 = new javax.swing.JLabel();
        producer1 = new javax.swing.JLabel();
        producer2 = new javax.swing.JLabel();
        producer3 = new javax.swing.JLabel();
        producer4 = new javax.swing.JLabel();
        producer5 = new javax.swing.JLabel();
        consumer4 = new javax.swing.JLabel();
        consumer1 = new javax.swing.JLabel();
        consumer2 = new javax.swing.JLabel();
        consumer3 = new javax.swing.JLabel();
        consumer5 = new javax.swing.JLabel();
        consumer6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 51));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 102, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Produccion1.setText("ㅤㅤㅤㅤ");
        Produccion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Produccion1ActionPerformed(evt);
            }
        });
        jPanel2.add(Produccion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 70, 20));

        Produccion2.setText("ㅤㅤㅤㅤ");
        Produccion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Produccion2ActionPerformed(evt);
            }
        });
        jPanel2.add(Produccion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, -1, 20));

        Produccion3.setText("ㅤㅤㅤㅤ");
        jPanel2.add(Produccion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, -1, 20));

        Produccion4.setText("ㅤㅤㅤㅤ");
        Produccion4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Produccion4ActionPerformed(evt);
            }
        });
        jPanel2.add(Produccion4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, -1, 20));

        Produccion5.setText("ㅤㅤㅤㅤ");
        jPanel2.add(Produccion5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, -1, 20));

        Produccion6.setText("ㅤㅤㅤㅤ");
        jPanel2.add(Produccion6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, -1, 20));

        Produccion7.setText("ㅤㅤㅤㅤ");
        Produccion7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Produccion7ActionPerformed(evt);
            }
        });
        jPanel2.add(Produccion7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, -1, 20));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("ALMACEN");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, -1, -1));

        IniciarProduccion.setText("Iniciar Produccion");
        IniciarProduccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarProduccionActionPerformed(evt);
            }
        });
        jPanel2.add(IniciarProduccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, -1, -1));

        producer6.setForeground(new java.awt.Color(0, 0, 0));
        producer6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/worker.png"))); // NOI18N
        jPanel2.add(producer6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        producer1.setForeground(new java.awt.Color(0, 0, 0));
        producer1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/worker.png"))); // NOI18N
        jPanel2.add(producer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 90, -1));

        producer2.setForeground(new java.awt.Color(0, 0, 0));
        producer2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/worker.png"))); // NOI18N
        jPanel2.add(producer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        producer3.setForeground(new java.awt.Color(0, 0, 0));
        producer3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/worker.png"))); // NOI18N
        jPanel2.add(producer3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, -1, -1));

        producer4.setForeground(new java.awt.Color(0, 0, 0));
        producer4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/worker.png"))); // NOI18N
        jPanel2.add(producer4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        producer5.setForeground(new java.awt.Color(0, 0, 0));
        producer5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/worker.png"))); // NOI18N
        jPanel2.add(producer5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, -1, -1));

        consumer4.setForeground(new java.awt.Color(0, 0, 0));
        consumer4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/consumer.png"))); // NOI18N
        jPanel2.add(consumer4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, -1, -1));

        consumer1.setForeground(new java.awt.Color(0, 0, 0));
        consumer1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/consumer.png"))); // NOI18N
        jPanel2.add(consumer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 70, -1));

        consumer2.setForeground(new java.awt.Color(0, 0, 0));
        consumer2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/consumer.png"))); // NOI18N
        jPanel2.add(consumer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, -1, -1));

        consumer3.setForeground(new java.awt.Color(0, 0, 0));
        consumer3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/consumer.png"))); // NOI18N
        jPanel2.add(consumer3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, -1, -1));

        consumer5.setForeground(new java.awt.Color(0, 0, 0));
        consumer5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/consumer.png"))); // NOI18N
        jPanel2.add(consumer5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, -1, -1));

        consumer6.setForeground(new java.awt.Color(0, 0, 0));
        consumer6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/consumer.png"))); // NOI18N
        jPanel2.add(consumer6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, -1, -1));

        jPanel1.setBackground(new java.awt.Color(146, 147, 215));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 57, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Produccion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Produccion1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Produccion1ActionPerformed

    private void Produccion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Produccion2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Produccion2ActionPerformed

    private void Produccion7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Produccion7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Produccion7ActionPerformed

    private void IniciarProduccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarProduccionActionPerformed

        this.PlanificadorProcesos.startProcess();

        
        Thread hilo = new Thread(){
            public void run(){
                while(true){
                    colorBotons();
                }
            }
        };
        hilo.start();
        Timer colorTimer = new Timer(100, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                
               
                
                setProducersConsumers();
                setSleep();
                

            }
        });
        colorTimer.start();

    }//GEN-LAST:event_IniciarProduccionActionPerformed

    private void Produccion4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Produccion4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Produccion4ActionPerformed

    public void colorBotons() {
        switch (this.PlanificadorProcesos.Almacen.viewPapas().size()) {

            case 1:
                Produccion1.setBackground(Color.red);
                break;
            case 2:
                Produccion1.setBackground(Color.red);
                Produccion2.setBackground(Color.red);
                break;
            case 3:
                Produccion1.setBackground(Color.red);
                Produccion2.setBackground(Color.red);
                Produccion3.setBackground(Color.red);
                break;
            case 4:
                Produccion1.setBackground(Color.red);
                Produccion2.setBackground(Color.red);
                Produccion3.setBackground(Color.red);
                Produccion4.setBackground(Color.red);
                break;
            case 5:
                Produccion1.setBackground(Color.red);
                Produccion2.setBackground(Color.red);
                Produccion3.setBackground(Color.red);
                Produccion4.setBackground(Color.red);
                Produccion5.setBackground(Color.red);
                break;
            case 6:
                Produccion1.setBackground(Color.red);
                Produccion2.setBackground(Color.red);
                Produccion3.setBackground(Color.red);
                Produccion4.setBackground(Color.red);
                Produccion5.setBackground(Color.red);
                Produccion6.setBackground(Color.red);
                break;
            case 7:
                Produccion1.setBackground(Color.red);
                Produccion2.setBackground(Color.red);
                Produccion3.setBackground(Color.red);
                Produccion4.setBackground(Color.red);
                Produccion5.setBackground(Color.red);
                Produccion6.setBackground(Color.red);
                Produccion7.setBackground(Color.red);
                break;
            default:
                setAllDefault();
                break;

        }
    }

    public void setAllDefault() {
        Color defaultColor = new Color(187 / 255f, 187 / 255f, 187 / 255f);

        Produccion1.setBackground(defaultColor);
        Produccion2.setBackground(defaultColor);
        Produccion3.setBackground(defaultColor);
        Produccion4.setBackground(defaultColor);
        Produccion5.setBackground(defaultColor);
        Produccion6.setBackground(defaultColor);
        Produccion7.setBackground(defaultColor);
    }

    public void setProducersConsumers() {
    setAllIconsDefault();
        switch (this.PlanificadorProcesos.getUsingAlmacen()) {
            case "Productor 1":
                
                producer1.setIcon(iconProducerWorking);
                break;

            case "Consumidor 1":
               
                consumer1.setIcon(iconConsumerWorking);
                break;

            case "Productor 2":
                
                producer2.setIcon(iconProducerWorking);
                break;

            case "Consumidor 2":
                
                consumer2.setIcon(iconConsumerWorking);
                break;

            case "Productor 3":
                
                producer3.setIcon(iconProducerWorking);
                break;

            case "Consumidor 3":
               
                consumer3.setIcon(iconConsumerWorking);
                break;

            case "Productor 4":
                
                producer4.setIcon(iconProducerWorking);
                break;

            case "Consumidor 4":
              
                consumer4.setIcon(iconConsumerWorking);
                break;

            case "Productor 5":
             
                producer5.setIcon(iconProducerWorking);
                break;

            case "Consumidor 5":
               
                consumer5.setIcon(iconConsumerWorking);
                break;

            case "Productor 6":
                
                producer6.setIcon(iconProducerWorking);
                break;

            case "Consumidor 6":
             
                consumer6.setIcon(iconConsumerWorking);
                break;
            default:
                setAllIconsDefault();

        }
    }

    public void changeStatus() {
        if (this.PlanificadorProcesos.getAlmacen().size() == 1 || this.PlanificadorProcesos.getAlmacen().size() == 6) {
            setAllTextsDefault();
        }
    }

    public void setAllIconsDefault() {
        producer1.setIcon(iconProducer);
        consumer1.setIcon(iconConsumer);

        producer2.setIcon(iconProducer);
        consumer2.setIcon(iconConsumer);

        producer3.setIcon(iconProducer);
        consumer3.setIcon(iconConsumer);

        producer4.setIcon(iconProducer);
        consumer4.setIcon(iconConsumer);

        producer5.setIcon(iconProducer);
        consumer5.setIcon(iconConsumer);

        producer6.setIcon(iconProducer);
        consumer6.setIcon(iconConsumer);
    }

    public void setSleep() {
            changeStatus();
            setAllDefault();
            

        for (String i : this.PlanificadorProcesos.getSleep()) {
            switch (i) {

                case "Productor 1":
                     
                    producer1.setIcon(iconZZZ);

                    break;

                case "Consumidor 1":
                     
                    consumer1.setIcon(iconZZZ);

                    break;

                case "Productor 2":
                     
                    producer2.setIcon(iconZZZ);

                    break;

                case "Consumidor 2":
                     
                    consumer2.setIcon(iconZZZ);

                    break;

                case "Productor 3":
                  
                    producer3.setIcon(iconZZZ);

                    break;

                case "Consumidor 3":
                 
                    consumer3.setIcon(iconZZZ);

                    break;

                case "Productor 4":
                   
                    producer4.setIcon(iconZZZ);

                    break;

                case "Consumidor 4":
                    
                    consumer4.setIcon(iconZZZ);

                    break;

                case "Productor 5":
                     
                    producer5.setIcon(iconZZZ);

                    break;

                case "Consumidor 5":
                    
                    consumer5.setIcon(iconZZZ);

                    break;

                case "Productor 6":
                     
                    producer6.setIcon(iconZZZ);

                    break;

                case "Consumidor 6":
                     
                    consumer6.setIcon(iconZZZ);

                    break;

                

            }
        }
    }

    public void setAllTextsDefault() {
        this.PlanificadorProcesos.clearSleepingList();
     

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
            java.util.logging.Logger.getLogger(Visual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Visual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Visual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Visual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Visual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton IniciarProduccion;
    private javax.swing.JButton Produccion1;
    private javax.swing.JButton Produccion2;
    private javax.swing.JButton Produccion3;
    private javax.swing.JButton Produccion4;
    private javax.swing.JButton Produccion5;
    private javax.swing.JButton Produccion6;
    private javax.swing.JButton Produccion7;
    private javax.swing.JLabel consumer1;
    private javax.swing.JLabel consumer2;
    private javax.swing.JLabel consumer3;
    private javax.swing.JLabel consumer4;
    private javax.swing.JLabel consumer5;
    private javax.swing.JLabel consumer6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel producer1;
    private javax.swing.JLabel producer2;
    private javax.swing.JLabel producer3;
    private javax.swing.JLabel producer4;
    private javax.swing.JLabel producer5;
    private javax.swing.JLabel producer6;
    // End of variables declaration//GEN-END:variables
}
