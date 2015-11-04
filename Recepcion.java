/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iscomserca;

import static iscomserca.LogIn.*;

import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author COMPUTADOR
 */
public class Recepcion extends JFrameConFondo {
    public static String bus;
    private PreparedStatement stmt;
    Statement st = null;
    ResultSet rs = null;
    private int retorno;
    private String com;
     String vc = null;
        int vn;
    
    /**
     * Creates new form Recepcion
     */
    public Recepcion() {
        initComponents();
    }
    
      @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("imagenes/celeste.jpg"));
        return retValue;
    }
    
       public Image getIconImage1() {
        Image retValue = Toolkit.getDefaultToolkit().
        getImage(ClassLoader.getSystemResource("imagenes/LogoV.jpg"));
        return retValue;
}    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new JPanelConFondo();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jCheckBox3 = new javax.swing.JCheckBox();
        jTextField10 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Recepción de Equipos - Iscomserca");
        setIconImage(getIconImage1());
        setImagen(getIconImage());
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Iscomserca Text - copia.jpg"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(145, 184, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Validación", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        jLabel2.setText("CI:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "V", "E", "P", "J" }));

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombre:");

        jTextField2.setEditable(false);

        jLabel4.setText("Apellido:");

        jTextField3.setEditable(false);

        jLabel5.setText("Fecha:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField11)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Recepción de Equipos");

        jLabel8.setText("Tipo:");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cabezal", "Camaras", "Cargadores", "Cartuchos", "CD/DVD", "Computadoras", "Control Remoto", "Cornetas", "Disco Duro", "Fuentes", "Impresoras", "Laptos", "Modem", "Monitores", "Mouse", "Otro", "Placas", "Plantas", "Routers", "Tablet", "Tarjeta Logica", "Tarjeta Madres", "Teclados", "Telefono", "Televisor", "Video Beam" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel9.setText("Marca:");

        jLabel10.setText("Modelo:");

        jLabel11.setText("Serial:");

        jLabel12.setText("Descripción:");

        jLabel13.setText("Motivo de Ingreso:");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Recibido", "Diagnosticando", "En Proceso", "Sin Solución", "Listo para Retirar", "Retirado" }));

        jLabel14.setText("Estatus:");

        jButton2.setText("Ingresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Borrar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Salir");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel15.setText("Codigo:");

        jCheckBox3.setText("Terminos y Condiciones");

        jTextField10.setEditable(false);
        jTextField10.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(110, 110, 110))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField5)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField9))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jCheckBox1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCheckBox2))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(12, 12, 12)
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(1, 1, 1)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void formWindowActivated(java.awt.event.WindowEvent evt) {                                     
       Date fc = new Date();
       SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
       com = formato.format(fc);
       jLabel6.setText(com);
       jTextField10.setVisible(false);
       String sms = (String) jComboBox2.getSelectedItem();
     
       if(sms.equals("Cabezal")){
               jCheckBox1.setText("Cartucho Completo");
               jCheckBox2.setText("Adicional");
       }
       if(sms.equals("Camaras")){
               jCheckBox1.setText("Baterias/Pilas");
               jCheckBox2.setText("Estuche");
       }
       if(sms.equals("Cargadores")){
               jCheckBox1.setText("Cable de Corriente");
               jCheckBox2.setText("Adicional");
       }
       if(sms.equals("Cartuchos")){
               jCheckBox1.setText("Adicional");
               jCheckBox2.setVisible(false);
       }
       if(sms.equals("CD/DVD")){
               jCheckBox1.setText("Control Remoto");
               jCheckBox2.setText("Cargador");
       }
       if(sms.equals("Computadoras")){
               jCheckBox1.setText("Cable de Corriente");
               jCheckBox2.setText("Monitor");
       }
       if(sms.equals("Control Remoto")){
               jCheckBox1.setText("Pila");
               jCheckBox2.setText("Adicional");
       }
       if(sms.equals("Cornetas")){
               jCheckBox1.setText("Cargador");
               jCheckBox2.setText("Caja");
       }
       
       if(sms.equals("Disco Duro")){
               jCheckBox1.setText("Conector USB");
               jCheckBox2.setText("Estuche");
       }
       if(sms.equals("Impresoras")){
               jCheckBox1.setText("Cartucho");
               jCheckBox2.setText("Cargador");
       }
       if(sms.equals("Laptos")){
            jCheckBox1.setText("Cargador");
            jCheckBox2.setText("Estuche");
       }
       if(sms.equals("Modem")){
            jCheckBox1.setText("Cargador");
            jCheckBox2.setText("Adicional");
       }
       if(sms.equals("Routers")){
            jCheckBox1.setText("Cargador");
            jCheckBox2.setText("Adicional");
       }
       if(sms.equals("Tablet")){
            jCheckBox1.setText("Cargador");
            jCheckBox2.setText("Estuche");
       }
       if(sms.equals("Televisor")){
            jCheckBox1.setText("Control Remoto");
            jCheckBox2.setText("Caja");
       }
       if(sms.equals("Telefono")){
            jCheckBox1.setText("Cargador");
            jCheckBox2.setText("Estuche");
       }
       if(sms.equals("Otro")){
           jTextField10.show();
           jTextField10.setEnabled(true);
           jTextField10.setVisible(true);
           jTextField10.setEditable(true);
       }
       
       if (sms.equals("Cabezal")||sms.equals("Teclados")||sms.equals("Mouse")||sms.equals("Tarjetas Logical")||sms.equals("Cornetas")){
           jTextField7.setEnabled(false);
       }
       else
           jTextField7.setEnabled(true);
      
    }                                    

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        dispose();
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        jTextField1.setText("");jTextField2.setText("");jTextField3.setText("");jTextField10.setText("");jTextField5.setText("");jTextField6.setText("");jTextField7.setText("");jTextField8.setText("");jTextField9.setText("");
        jCheckBox1.setText("");jCheckBox2.setText("");
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
      
        String fecht= jTextField11.getText();
        String codigo= jTextField4.getText();
        String nombE =(String)jComboBox2.getSelectedItem();
        String marca = jTextField5.getText();
        String modelo = jTextField6.getText();
        String serial = jTextField7.getText();
        String descrip = jTextField8.getText();
        String descripc = jTextField9.getText();
        String estatus = (String)jComboBox3.getSelectedItem();
        boolean ad,ad2,cond=false;
        ad=jCheckBox1.isSelected();
        ad2=jCheckBox2.isSelected();
        cond=jCheckBox3.isSelected();
        try {
            Class.forName("com.mysql.jdbc.Driver");
              //Get a connection
              /*
              Connection conn = java.sql.DriverManager.getConnection(dbURL, usuario, password);
              st=conn.createStatement();
              rs=st.executeQuery("SELECT MAX(Caso) AS Caso From recepcion");
              if(rs.next())
                  vc= rs.getString(1);
              
              
              vn=Integer.parseInt(vc.substring(5,9));
              vn=vn+1;
              vc="0000-0"+String.valueOf(vn);*/
              
              
              stmt = conn.prepareStatement("INSERT INTO equipos (NombreE,Marca,Modelo,Serial,Descripcion,Perfiles_Usuario) values (?,?,?,?,?,?)");
              stmt.setString(1,nombE);
              stmt.setString(2,marca);
              stmt.setString(3,modelo);
              stmt.setString(4,serial);
              stmt.setString(5,descrip);
              stmt.setString(6,LogIn.user);
              retorno = stmt.executeUpdate();
              
              stmt = conn.prepareStatement("INSERT INTO recepcion (Caso,Fecha,DescripcionC,Ad,Ad2,Condiciones,Estatus,Prioridad,Cliente_CI,Perfiles_Usuario) values (?,?,?,?,?,?,?,?,?,?)");
              stmt.setString(1,codigo);
              stmt.setString(2,fecht);
              stmt.setString(3,descripc);
              stmt.setBoolean(4,ad);
              stmt.setBoolean(5,ad2);
              stmt.setBoolean(6,cond);
              stmt.setString(7,estatus);
              stmt.setString(8,"Prioridad 2");
              stmt.setString(9,bus);
              stmt.setString(10,LogIn.user);
              
              retorno = stmt.executeUpdate();
              JOptionPane.showMessageDialog(new JFrame(), "Ingreso del Equipo Exitoso con Numero de Caso: "+codigo, "Mensaje de Error", JOptionPane.INFORMATION_MESSAGE);
              int resp = JOptionPane.showConfirmDialog(new JFrame(), "¿Desea Imprimir la Recepción?", "Equipo Ingresado Correctamente", JOptionPane.YES_NO_OPTION);
              if (JOptionPane.YES_OPTION == resp){
                AbstractJasperReports.createReport( conn, "C:\\Users\\COMPUTADOR\\JaspersoftWorkspace\\ISCOMSERCA\\Blank_A4.jasper");
                AbstractJasperReports.showViewer();
              }
              
               } catch (SQLException sqle) {
              JOptionPane.showMessageDialog(new JFrame(), "Fallo el Ingreso de la Recepción \nSQLState: " +sqle.getSQLState()+"\nSQLErrorCode: "+sqle.getErrorCode()+sqle.getMessage(), "Mensaje de Error", JOptionPane.ERROR_MESSAGE);

              System.out.println("SQLState: " + sqle.getSQLState());
              System.out.println("SQLErrorCode: " + sqle.getErrorCode());
              sqle.printStackTrace();
          } catch (Exception e) {
              e.printStackTrace();
          }
    }                                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
         bus = (String)jComboBox1.getSelectedItem()+ jTextField1.getText();
       
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //Get a connection
            conn = java.sql.DriverManager.getConnection(dbURL,usuario,password);
            st = conn.createStatement();
            rs = st.executeQuery("SELECT NombreC,Apellido FROM cliente WHERE CI='"+ bus+"'");
            if (rs.next()) {
                jTextField2.setText(rs.getString(1));
                jTextField3.setText(rs.getString(2));
            } else {
                   JOptionPane.showMessageDialog(new JFrame(), "El cliente no esta Ingresado en el Sistema", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
                 }
                        
        } catch (SQLException sqle) {
            System.out.println("SQLState: " + sqle.getSQLState());
            System.out.println("SQLErrorCode: " + sqle.getErrorCode());
            sqle.printStackTrace();
            JOptionPane.showMessageDialog(new JFrame(), "SQLState: " + sqle.getSQLState() + "\nSQLErrorCode: " + sqle.getErrorCode() + "\n" + sqle.getMessage(), "Error en Sistema - Identificar", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        } catch (Exception e) {
            e.printStackTrace();
        }           
    }                                        

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {                                           
       String sms = (String) jComboBox2.getSelectedItem();
      
       if (sms.equals("Cabezal")||sms.equals("Teclados")||sms.equals("Mouse")||sms.equals("Tarjetas Logical")||sms.equals("Cornetas")){
           jTextField7.setEnabled(false);
       }
       else{
           jTextField7.setEnabled(true);}
       
       if(sms.equals("Cabezal")){
               jCheckBox2.setVisible(true);
               jCheckBox1.setText("Cartucho Completo");
               jCheckBox2.setText("Adicional");
               jTextField10.setVisible(false);
       }
       if(sms.equals("Camaras")){
           jCheckBox2.setVisible(true);
               jCheckBox1.setText("Baterias/Pilas");
               jCheckBox2.setText("Estuche");
               jTextField10.setVisible(false);
       }
       if(sms.equals("Cargadores")){
               jCheckBox2.setVisible(true);
               jCheckBox1.setText("Cable de Corriente");
               jCheckBox2.setText("Adicional");
               jTextField10.setVisible(false);
       }
       if(sms.equals("Cartuchos")){
               jCheckBox1.setText("Adicional");
               jCheckBox2.setVisible(false);
               jTextField10.setVisible(false);
       }
       if(sms.equals("CD/DVD")){
               jCheckBox2.setVisible(true);
               jCheckBox1.setText("Control Remoto");
               jCheckBox2.setText("Cargador");
               jTextField10.setVisible(false);
       }
       if(sms.equals("Computadoras")){
               jCheckBox2.setVisible(true);
               jCheckBox1.setText("Cable de Corriente");
               jCheckBox2.setText("Monitor");
               jTextField10.setVisible(false);
       }
       if(sms.equals("Control Remoto")){
               jCheckBox2.setVisible(true);
               jCheckBox1.setText("Pila");
               jCheckBox2.setText("Adicional");
               jTextField10.setVisible(false);
       }
       if(sms.equals("Cornetas")){
               jCheckBox2.setVisible(true);
               jCheckBox1.setText("Cargador");
               jCheckBox2.setText("Caja");
               jTextField10.setVisible(false);
       }
       if(sms.equals("Disco Duro")){
               jCheckBox2.setVisible(true);
               jCheckBox1.setText("Conector USB");
               jCheckBox2.setText("Estuche");
               jTextField10.setVisible(false);
       }
       if(sms.equals("Fuentes")){
               jCheckBox1.setText("Adicional");
               jCheckBox2.setVisible(false);
               jTextField10.setVisible(false);
       }
       if(sms.equals("Impresoras")){
               jCheckBox2.setVisible(true);
               jCheckBox1.setText("Cartucho");
               jCheckBox2.setText("Cargador");
               jTextField10.setVisible(false);
       }
       if(sms.equals("Laptos")){
            jCheckBox2.setVisible(true);
            jCheckBox1.setText("Cargador");
            jCheckBox2.setText("Estuche");
            jTextField10.setVisible(false);
       }
       if(sms.equals("Modem")){
            jCheckBox2.setVisible(true);
            jCheckBox1.setText("Cargador");
            jCheckBox2.setText("Adicional");
            jTextField10.setVisible(false);
       }
       if(sms.equals("Mouse")){
            jCheckBox2.setVisible(false);
            jCheckBox1.setText("Adicional");
            jCheckBox2.setText("Adicional");
            jTextField10.setVisible(false);
       }
       if(sms.equals("Routers")){
            jCheckBox2.setVisible(true);
            jCheckBox1.setText("Cargador");
            jCheckBox2.setText("Adicional");
            jTextField10.setVisible(false);
       }
       if(sms.equals("Tablet")){
            jCheckBox2.setVisible(true);
            jCheckBox1.setText("Cargador");
            jCheckBox2.setText("Estuche");
            jTextField10.setVisible(false);
       }
       if(sms.equals("Telefono")){
            jCheckBox2.setVisible(true);
            jCheckBox1.setText("Cargador");
            jCheckBox2.setText("Estuche");
            jTextField10.setVisible(false);
       }
       if(sms.equals("Televisor")){
            jCheckBox2.setVisible(true);
            jCheckBox1.setText("Control Remoto");
            jCheckBox2.setText("Caja");
            jTextField10.setVisible(false);
       }
       if(sms.equals("Otro")){
           jTextField10.show();
           jTextField10.setEnabled(true);
           jTextField10.setVisible(true);
           jTextField10.setEditable(true);
       }
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
            java.util.logging.Logger.getLogger(Recepcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Recepcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Recepcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Recepcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Recepcion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    public static javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    public static javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration                   
}
