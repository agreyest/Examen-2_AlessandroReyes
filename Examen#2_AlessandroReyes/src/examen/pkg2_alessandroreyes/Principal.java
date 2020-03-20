package examen.pkg2_alessandroreyes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    public Principal() throws ParseException {
        initComponents();
        
        UClienteAdmi c = new UClienteAdmi("./Cliente.alo");
        c.cargarArchivo();
        clientes = c.getListaCliente();
        
        UMantenimientoAdmi  m = new UMantenimientoAdmi("./Mantenimiento.alo");
        m.cargarArchivo();
        mantenimientos = m.getListaMantenimiento();
        
        ATMAdmi  a = new ATMAdmi("./ATM.alo");
        a.cargarArchivo();
        atms = a.getListaATM();
        //-------------------------------------------------------------------------------------------------------------------
        atms.add(new ATM("Tegucigalpa, Diprova", "2 años", 11911220, new Date()));
        atms.add(new ATM("Tegucigalpa, Altia", "2 años", 11911229, new Date()));
        atms.add(new ATM("San Pedro Sula, Altia", "2 años", 11911111, new Date()));
        atms.add(new ATM("Tegucigalpa, City Mall", "2 años", 11911225, new Date()));
        atms.add(new ATM("San Pedro Sula, City Mall", "2 años", 11911222, new Date()));
        
        Date da1, da2;
        SimpleDateFormat fi = new SimpleDateFormat("dd/MM/yyyy");
        da1 = fi.parse("17/10/2000");
        da2 = fi.parse("14/07/2000");
        clientes.add(new UCliente(11911224, da1, new Date(), "Alessandro", "Giovanni", "Reyes", "1234", "Trimarchi"));
        clientes.add(new UCliente(11841181, da1, new Date(), "Adriana", null, "Parodi", "1234", "Turcios"));
        //-------------------------------------------------------------------------------------------------------------------
        DefaultComboBoxModel modelo = new DefaultComboBoxModel(atms.toArray());
        cb_ATMsLog.setModel(modelo);
        tf_idlog.setVisible(false);
        pf_pwlog.setVisible(false);
        jLabel1.setVisible(false);
        jLabel2.setVisible(false);
        btn_login.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_clientes = new javax.swing.JDialog();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jmi_LOcliente = new javax.swing.JMenuItem();
        jd_mantenimientos = new javax.swing.JDialog();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jd_CrearM = new javax.swing.JDialog();
        jd_CrearC = new javax.swing.JDialog();
        jd_CrearATM = new javax.swing.JDialog();
        tf_idlog = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pf_pwlog = new javax.swing.JPasswordField();
        btn_login = new javax.swing.JButton();
        btn_CrearC = new javax.swing.JButton();
        btn_CrearM = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cb_ATMsLog = new javax.swing.JComboBox<>();
        btn_CrearATM = new javax.swing.JButton();

        jMenu1.setText("Acciones");

        jMenuItem1.setText("jMenuItem1");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("jMenuItem2");
        jMenu1.add(jMenuItem2);

        jmi_LOcliente.setText("Log out");
        jMenu1.add(jmi_LOcliente);

        jMenuBar1.add(jMenu1);

        jd_clientes.setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout jd_clientesLayout = new javax.swing.GroupLayout(jd_clientes.getContentPane());
        jd_clientes.getContentPane().setLayout(jd_clientesLayout);
        jd_clientesLayout.setHorizontalGroup(
            jd_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 795, Short.MAX_VALUE)
        );
        jd_clientesLayout.setVerticalGroup(
            jd_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 517, Short.MAX_VALUE)
        );

        jMenu2.setText("Accion");

        jMenuItem3.setText("jMenuItem3");
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("jMenuItem4");
        jMenu2.add(jMenuItem4);

        jMenuBar2.add(jMenu2);

        jd_mantenimientos.setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout jd_mantenimientosLayout = new javax.swing.GroupLayout(jd_mantenimientos.getContentPane());
        jd_mantenimientos.getContentPane().setLayout(jd_mantenimientosLayout);
        jd_mantenimientosLayout.setHorizontalGroup(
            jd_mantenimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 794, Short.MAX_VALUE)
        );
        jd_mantenimientosLayout.setVerticalGroup(
            jd_mantenimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 514, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jd_CrearMLayout = new javax.swing.GroupLayout(jd_CrearM.getContentPane());
        jd_CrearM.getContentPane().setLayout(jd_CrearMLayout);
        jd_CrearMLayout.setHorizontalGroup(
            jd_CrearMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jd_CrearMLayout.setVerticalGroup(
            jd_CrearMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jd_CrearCLayout = new javax.swing.GroupLayout(jd_CrearC.getContentPane());
        jd_CrearC.getContentPane().setLayout(jd_CrearCLayout);
        jd_CrearCLayout.setHorizontalGroup(
            jd_CrearCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jd_CrearCLayout.setVerticalGroup(
            jd_CrearCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jd_CrearATMLayout = new javax.swing.GroupLayout(jd_CrearATM.getContentPane());
        jd_CrearATM.getContentPane().setLayout(jd_CrearATMLayout);
        jd_CrearATMLayout.setHorizontalGroup(
            jd_CrearATMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jd_CrearATMLayout.setVerticalGroup(
            jd_CrearATMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID_Cuenta");

        jLabel2.setText("Contraseña");

        btn_login.setText("log in");
        btn_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_loginMouseClicked(evt);
            }
        });

        btn_CrearC.setText("Crear cuenta cliente ");

        btn_CrearM.setText("Crear cuenta mantenimiento");

        jLabel3.setText("Elija el ATM en el que se encuentra");

        cb_ATMsLog.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cb_ATMsLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_ATMsLogActionPerformed(evt);
            }
        });

        btn_CrearATM.setText("Crear ATM");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btn_CrearC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 207, Short.MAX_VALUE)
                .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(186, 186, 186)
                .addComponent(btn_CrearM))
            .addGroup(layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pf_pwlog, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(tf_idlog))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(cb_ATMsLog, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_CrearATM, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_ATMsLog, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_CrearATM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_idlog, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pf_pwlog, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35))
                            .addComponent(btn_CrearM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_CrearC, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cb_ATMsLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_ATMsLogActionPerformed
        use = (ATM) cb_ATMsLog.getSelectedItem();
        tf_idlog.setVisible(true);
        pf_pwlog.setVisible(true);
        jLabel1.setVisible(true);
        jLabel2.setVisible(true);
        btn_login.setVisible(true);
        System.out.println(use);
    }//GEN-LAST:event_cb_ATMsLogActionPerformed

    private void btn_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_loginMouseClicked
        boolean v = false;
        try {
            if (tf_idlog.getText().isEmpty() && pf_pwlog.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Ingrese algo");
            } else {
                for (int i = 0; i < clientes.size(); i++) {
                    if (Integer.parseInt(tf_idlog.getText()) == clientes.get(i).getId_Usuario()
                            && pf_pwlog.getText().equals(clientes.get(i).getContraseña())) {
                        v = true;
                        u = true;
                        CIN = clientes.get(i);
                        tf_idlog.setText("");
                        pf_pwlog.setText("");
                        
                        this.setVisible(false);
                        jd_clientes.setModal(true);
                        jd_clientes.pack();
                        jd_clientes.setLocationRelativeTo(this);
                        jd_clientes.setVisible(true);
                        
                        break;
                    }
                }
                for (int i = 0; i < mantenimientos.size(); i++) {
                    if (Integer.parseInt(tf_idlog.getText()) == mantenimientos.get(i).getId_Usuario()
                            && pf_pwlog.getText().equals(mantenimientos.get(i).getContraseña())) {
                        v = true;
                        u = false;
                        MIN = mantenimientos.get(i);
                        tf_idlog.setText("");
                        pf_pwlog.setText("");
                        
                        this.setVisible(false);
                        jd_mantenimientos.setModal(true);
                        jd_mantenimientos.pack();
                        jd_mantenimientos.setLocationRelativeTo(this);
                        jd_mantenimientos.setVisible(true);
                        break;
                    }
                }
                
                if (v == false) {
                    JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrecta");
                    pf_pwlog.setText("");
                    tf_idlog.setText("");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Ocurrio un error");
            pf_pwlog.setText("");
            tf_idlog.setText("");
        }
    }//GEN-LAST:event_btn_loginMouseClicked

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Principal().setVisible(true);
                } catch (ParseException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_CrearATM;
    private javax.swing.JButton btn_CrearC;
    private javax.swing.JButton btn_CrearM;
    private javax.swing.JButton btn_login;
    private javax.swing.JComboBox<String> cb_ATMsLog;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JDialog jd_CrearATM;
    private javax.swing.JDialog jd_CrearC;
    private javax.swing.JDialog jd_CrearM;
    private javax.swing.JDialog jd_clientes;
    private javax.swing.JDialog jd_mantenimientos;
    private javax.swing.JMenuItem jmi_LOcliente;
    private javax.swing.JPasswordField pf_pwlog;
    private javax.swing.JTextField tf_idlog;
    // End of variables declaration//GEN-END:variables
    ArrayList<ATM> atms = new ArrayList();
    ArrayList<UCliente> clientes = new ArrayList();
    ArrayList<UMantenimiento> mantenimientos = new ArrayList();
    ATM use;
    UCliente CIN;
    UMantenimiento MIN;
    boolean u = false;
}