/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Datos.DPersona;
import Datos.DTipoUsuario;
import Datos.DUsuarios;
import Datos.guardarDatos;
import Logica.LUsuarios;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author josug
 */
public class frmUsuario extends javax.swing.JInternalFrame {
    public static int control = 0;
    /**
     * Creates new form frmUsuario
     */
    String accion = null;
    
    public frmUsuario() {
        initComponents();
        mostrarBuscar("");
        txtId.setVisible(false);
        txtId.setEditable(false);
        txtUsuario.setVisible(false);
        txtClave.setVisible(false);
        txtNombre.setVisible(false);
        txtApellido.setVisible(false);
        txtCedula.setVisible(false);
        txtTelefono.setVisible(false);
        txtIdDireccion.setVisible(false);
        txtIdDireccion.setEditable(false);
        txtDireccion.setVisible(false);
        txtDireccion.setEditable(false);
        cmbTipo.setVisible(false);
        
        btnGuardar.setVisible(false);
        btnCancelar.setVisible(false);
        btnBuscarDireccion.setVisible(false);
        
        lblId.setVisible(false);
        lblUsuario.setVisible(false);
        lblContraseña.setVisible(false);
        lblNombres.setVisible(false);
        lblApellidos.setVisible(false);
        lblCedula.setVisible(false);
        lblTelefono.setVisible(false);
        lblDireccion.setVisible(false);
        lblTipo.setVisible(false);
    }
    
    public void mostrarBuscar(String buscar){
        try {
            DefaultTableModel miModelo;
            LUsuarios log = new LUsuarios();
            miModelo = log.mostrarUsuarios(buscar);
            tblUsuarios.setModel(miModelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void modificar(){
        txtId.setVisible(true);
        txtId.setEditable(false);
        txtUsuario.setVisible(true);
        txtClave.setVisible(true);
        txtNombre.setVisible(true);
        txtApellido.setVisible(true);
        txtCedula.setVisible(true);
        txtTelefono.setVisible(true);
        txtIdDireccion.setVisible(true);
        txtIdDireccion.setEditable(false);
        txtDireccion.setVisible(true);
        txtDireccion.setEditable(false);
        cmbTipo.setVisible(true);
        
        btnGuardar.setVisible(true);
        btnCancelar.setVisible(true);
        btnBuscarDireccion.setVisible(true);
        
        lblId.setVisible(true);
        lblUsuario.setVisible(true);
        lblContraseña.setVisible(true);
        lblNombres.setVisible(true);
        lblApellidos.setVisible(true);
        lblCedula.setVisible(true);
        lblTelefono.setVisible(true);
        lblDireccion.setVisible(true);
        lblTipo.setVisible(true);
        
        btnAgregar.setVisible(false);
        btnEditar.setVisible(false);
        btnCancelarForm.setVisible(false);
        btnEliminar.setVisible(false);
    }
    
    public void mostrarBotones(){
        txtId.setVisible(false);
        txtId.setEditable(false);
        txtUsuario.setVisible(false);
        txtClave.setVisible(false);
        txtNombre.setVisible(false);
        txtApellido.setVisible(false);
        txtCedula.setVisible(false);
        txtTelefono.setVisible(false);
        txtIdDireccion.setVisible(false);
        txtIdDireccion.setEditable(false);
        txtDireccion.setVisible(false);
        txtDireccion.setEditable(false);
        cmbTipo.setVisible(false);
        
        btnGuardar.setVisible(false);
        btnCancelar.setVisible(false);
        btnBuscarDireccion.setVisible(false);
        
        lblId.setVisible(false);
        lblUsuario.setVisible(false);
        lblContraseña.setVisible(false);
        lblNombres.setVisible(false);
        lblApellidos.setVisible(false);
        lblCedula.setVisible(false);
        lblTelefono.setVisible(false);
        lblDireccion.setVisible(false);
        lblTipo.setVisible(false);
        
        btnAgregar.setVisible(true);
        btnEditar.setVisible(true);
        btnCancelarForm.setVisible(true);
        btnEliminar.setVisible(true);
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
        btnAgregar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnCancelarForm = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        txtIdDireccion = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        txtClave = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        lblTipo = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        lblNombres = new javax.swing.JLabel();
        lblApellidos = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        lblCedula = new javax.swing.JLabel();
        cmbTipo = new javax.swing.JComboBox<>();
        lblDireccion = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        txtDireccion = new javax.swing.JTextField();
        lblTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        btnBuscarDireccion = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        buscar = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jScrollBar1 = new javax.swing.JScrollBar();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 104, 88));

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 104, 88));

        btnCancelarForm.setText("Cancelar");
        jPanel1.add(btnCancelarForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 104, 88));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 590, 104, 30));
        jPanel1.add(txtIdDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 60, -1));
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 60, -1));
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 250, -1));
        jPanel1.add(txtClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 250, -1));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 250, -1));
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 250, -1));

        lblTipo.setText("Tipo de Usuario:");
        jPanel1.add(lblTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, -1, -1));

        lblId.setText("ID:");
        jPanel1.add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        lblUsuario.setText("Usuario:");
        jPanel1.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        lblContraseña.setText("Contraseña:");
        jPanel1.add(lblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        lblNombres.setText("Nombres:");
        jPanel1.add(lblNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        lblApellidos.setText("Apellidos:");
        jPanel1.add(lblApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));
        jPanel1.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 250, -1));

        lblCedula.setText("Cédula de Identidad:");
        jPanel1.add(lblCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elija el Tipo de Usuario", "Administrador", "Encargado de Clientes", "Encargado de Cuadrillas", "Encargado de Atención al Cliente" }));
        jPanel1.add(cmbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 250, 20));

        lblDireccion.setText("Dirección");
        jPanel1.add(lblDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, -1));

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 590, 104, 30));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 104, 88));
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 490, 180, -1));

        lblTelefono.setText("Telefono:");
        jPanel1.add(lblTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 250, -1));

        btnBuscarDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarDireccionActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 480, 40, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 330, 630));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblUsuarios);

        jButton5.setText("Buscar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 11, 690, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        modificar();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void tblUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUsuariosMouseClicked
        int fila = tblUsuarios.rowAtPoint(evt.getPoint());
        txtId.setText(tblUsuarios.getValueAt(fila, 0).toString());
        txtUsuario.setText(tblUsuarios.getValueAt(fila, 1).toString());
        txtClave.setText(tblUsuarios.getValueAt(fila, 2).toString());
        txtNombre.setText(tblUsuarios.getValueAt(fila, 3).toString());
        txtApellido.setText(tblUsuarios.getValueAt(fila, 4).toString());
        txtCedula.setText(tblUsuarios.getValueAt(fila, 5).toString());
        txtDireccion.setText(tblUsuarios.getValueAt(fila, 6).toString());
        txtTelefono.setText(tblUsuarios.getValueAt(fila, 7).toString());
        cmbTipo.setSelectedItem(tblUsuarios.getValueAt(fila, 8).toString());
        
    }//GEN-LAST:event_tblUsuariosMouseClicked

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if(tblUsuarios.getSelectedRows().length > 0){
            accion = "modificar";
            modificar();
        }else{
            JOptionPane.showMessageDialog(null, "Se debe de Seleccionar un usuario");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String actualizar = null;
        if(txtNombre.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Campo Nombre obligatorio", "Validación", JOptionPane.WARNING_MESSAGE);
            txtNombre.requestFocusInWindow();
            return;
        }
        
        if(txtApellido.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Campo Apellido obligatorio", "Validación", JOptionPane.WARNING_MESSAGE);
            txtApellido.requestFocusInWindow();
            return;
        }
        
        if(txtCedula.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Campo Cedula obligatorio", "Validación", JOptionPane.WARNING_MESSAGE);
            txtCedula.requestFocusInWindow();
            return;
        }
        
        if(txtClave.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Campo Contraseña obligatorio", "Validación", JOptionPane.WARNING_MESSAGE);
            txtClave.requestFocusInWindow();
            return;
        }    
        
        if(cmbTipo.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(rootPane, "Campo Tipo de Usuario obligatorio", "Validación", JOptionPane.WARNING_MESSAGE);
            txtApellido.requestFocusInWindow();
            return;
        }          
        
        String msg = null;
        String msg1 = null;
        String msg2 = null;
        if(txtId.getText().equals("")){
            DUsuarios dts = new DUsuarios();
            LUsuarios fun = new LUsuarios();
            DPersona dtp = new DPersona();
            DTipoUsuario dtt = new DTipoUsuario();
            
            String tipo = String.valueOf(cmbTipo.getSelectedItem());
            dtp.setNombre(txtNombre.getText());
            dtp.setApellido(txtApellido.getText());
            dtp.setCedulaIdent(txtCedula.getText());
            dtp.setTelefono(txtTelefono.getText());
            dts.setLoginUsuario(txtUsuario.getText());
            dts.setPasswordUsuario(txtClave.getText());
            dtp.setDireccionId(Integer.parseInt(txtIdDireccion.getText()));
            dtt.setTipo(tipo);
            msg = fun.insertarUsuarios(dts, dtp, dtt);
            mostrarBuscar("");
            if(msg == "si"){
                JOptionPane.showMessageDialog(rootPane, "Se insertó de forma correcta", "Información", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(rootPane, "Ocurrió un problema al insertar", "Información", JOptionPane.ERROR);
            }
        }else if(accion.equals("modificar")){
            DUsuarios dts = new DUsuarios();
            LUsuarios fun = new LUsuarios();
            DPersona dtp = new DPersona();
            DTipoUsuario dtt = new DTipoUsuario();
            
            String tipo = String.valueOf(cmbTipo.getSelectedItem());
            dts.setIdUsuario(Integer.parseInt(txtId.getText()));
            dtp.setIdPersona(Integer.parseInt(txtId.getText()));
            dtt.setIdTipoUsuario(Integer.parseInt(txtId.getText()));
            dtp.setDireccionId(Integer.parseInt(txtIdDireccion.getText()));
            dtp.setNombre(txtNombre.getText());
            dtp.setApellido(txtApellido.getText());
            dtp.setCedulaIdent(txtCedula.getText());
            dtp.setTelefono(txtTelefono.getText());
            dts.setLoginUsuario(txtUsuario.getText());
            dts.setPasswordUsuario(txtClave.getText());
            dtt.setTipo(tipo);
            msg = fun.editarUsuarios(dts, dtp, dtt);
            mostrarBuscar("");
            modificar();
        }
        mostrarBotones();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(!txtId.getText().equals("")){
            int confirmacion = JOptionPane.showConfirmDialog(rootPane, "¿Desea eliminar el Usuario?", "Confirmación", 2);
            if(confirmacion == 0){
                LUsuarios func = new LUsuarios();
                DUsuarios dts = new DUsuarios();
                DPersona dtp = new DPersona();
                DTipoUsuario dtt = new DTipoUsuario();
                
                dts.setIdUsuario(Integer.parseInt(txtId.getText()));
                dtp.setIdPersona(Integer.parseInt(txtId.getText()));
                
                func.eliminarUsuarios(dts, dtp, dtt);
                mostrarBuscar("");
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        mostrarBotones();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnBuscarDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarDireccionActionPerformed
        frmVistaDireccion form = new frmVistaDireccion();
        form.setVisible(true);
        form.toFront();
        control = 2;
    }//GEN-LAST:event_btnBuscarDireccionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JToggleButton btnBuscarDireccion;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCancelarForm;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JTextField buscar;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JButton jButton5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNombres;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTable tblUsuarios;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtClave;
    public static javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtId;
    public static javax.swing.JTextField txtIdDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
