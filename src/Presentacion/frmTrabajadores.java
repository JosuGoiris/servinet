/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Datos.DDireccion;
import Datos.DEstadoDireccion;
import Datos.DEstadoServicio;
import Datos.DPersona;
import Datos.DPuestos;
import Datos.DServicios;
import Datos.DTipoServicio;
import Datos.DTipoUsuario;
import Datos.DTrabajadores;
import Datos.DUsuarios;
import Datos.guardarDatos;
import Logica.LDireccion;
import Logica.LServicios;
import Logica.LTipoUsuario;
import Logica.LTrabajadores;
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
public class frmTrabajadores extends javax.swing.JInternalFrame {
    public static int control = 0;
    /**
     * Creates new form frmUsuario
     */
    String accion = null;
    
    public frmTrabajadores() {
        initComponents();
        mostrarBuscar("");
        txtId.setVisible(false);
        txtNombre.setVisible(false);
        txtApellido.setVisible(false);
        txtCedula.setVisible(false);
        txtTelefono.setVisible(false);
        txtIdPuesto.setVisible(false);
        txtPuesto.setVisible(false);
        cmbEstadoTrabajador.setVisible(false);
        txtIdDireccion.setVisible(false);
        txtDireccion.setVisible(false);
        
        btnGuardar.setVisible(false);
        btnCancelar.setVisible(false);
        btnBuscarDireccion.setVisible(false);
        btnBuscarPuesto.setVisible(false);
        
        lblId.setVisible(false);
        lblNombre.setVisible(false);
        lblCedula.setVisible(false);
        lblApellido.setVisible(false);
        lblTelefono.setVisible(false);
        lblPuesto.setVisible(false);
        lblEstadoTrabajador.setVisible(false);
        lblDireccion1.setVisible(false);
    }
    
    public void mostrarBuscar(String buscar){
        try {
            DefaultTableModel miModelo;
            LTrabajadores log = new LTrabajadores();
            miModelo = log.mostrarTrabajadores(buscar);
            tblUsuarios.setModel(miModelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void modificar(){
        txtId.setVisible(true);
        txtNombre.setVisible(true);
        txtApellido.setVisible(true);
        txtCedula.setVisible(true);
        txtTelefono.setVisible(true);
        txtIdPuesto.setVisible(true);
        txtPuesto.setVisible(true);
        cmbEstadoTrabajador.setVisible(true);
        txtIdDireccion.setVisible(true);
        txtDireccion.setVisible(true);
        
        btnGuardar.setVisible(true);
        btnCancelar.setVisible(true);
        btnBuscarDireccion.setVisible(true);
        btnBuscarPuesto.setVisible(true);
        
        lblId.setVisible(true);
        lblNombre.setVisible(true);
        lblCedula.setVisible(true);
        lblApellido.setVisible(true);
        lblPuesto.setVisible(true);
        lblEstadoTrabajador.setVisible(true);
        lblTelefono.setVisible(true);
        lblDireccion1.setVisible(true);
      
        btnAgregar.setVisible(false);
        btnEditar.setVisible(false);
        btnCancelarForm.setVisible(false);
        btnEliminar.setVisible(false);
    }
    
    public void mostrarBotones(){
        txtId.setVisible(false);
        txtNombre.setVisible(false);
        txtApellido.setVisible(false);
        txtCedula.setVisible(false);
        txtTelefono.setVisible(false);
        txtIdPuesto.setVisible(false);
        txtPuesto.setVisible(false);
        cmbEstadoTrabajador.setVisible(false);
        txtIdDireccion.setVisible(false);
        txtDireccion.setVisible(false);
        
        btnGuardar.setVisible(false);
        btnCancelar.setVisible(false);
        btnBuscarDireccion.setVisible(false);
        btnBuscarPuesto.setVisible(false);
        
        lblId.setVisible(false);
        lblNombre.setVisible(false);
        lblCedula.setVisible(false);
        lblApellido.setVisible(false);
        lblPuesto.setVisible(false);
        lblEstadoTrabajador.setVisible(false);
        lblTelefono.setVisible(false);
        lblDireccion1.setVisible(false);
        
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
        txtId = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        lblEstadoTrabajador = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        lblPuesto = new javax.swing.JLabel();
        cmbEstadoTrabajador = new javax.swing.JComboBox<>();
        txtNombre = new javax.swing.JTextField();
        lblCedula = new javax.swing.JLabel();
        txtPuesto = new javax.swing.JTextField();
        txtIdPuesto = new javax.swing.JTextField();
        btnBuscarPuesto = new javax.swing.JToggleButton();
        lblDireccion1 = new javax.swing.JLabel();
        txtIdDireccion = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
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
        jPanel1.add(btnCancelarForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 104, 88));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 104, 30));
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 50, -1));
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 220, -1));
        jPanel1.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 140, -1));
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 140, -1));

        lblEstadoTrabajador.setText("Estado del Trabajador:");
        jPanel1.add(lblEstadoTrabajador, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, -1));

        lblId.setText("ID:");
        jPanel1.add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        lblNombre.setText("Nombre:");
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        lblApellido.setText("Apellido:");
        jPanel1.add(lblApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        lblTelefono.setText("Teléfono:");
        jPanel1.add(lblTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 520, 104, 30));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 104, 88));

        lblPuesto.setText("Puesto:");
        jPanel1.add(lblPuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, -1));

        cmbEstadoTrabajador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elija el Estado del Trabajador", "Activo", "Inactivo" }));
        jPanel1.add(cmbEstadoTrabajador, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 170, 20));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 220, -1));

        lblCedula.setText("Cédula de Identidad:");
        jPanel1.add(lblCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));
        jPanel1.add(txtPuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 190, -1));
        jPanel1.add(txtIdPuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 50, -1));

        btnBuscarPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPuestoActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarPuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, 40, 30));

        lblDireccion1.setText("Dirección:");
        jPanel1.add(lblDireccion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));
        jPanel1.add(txtIdDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 50, -1));
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 190, -1));

        btnBuscarDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarDireccionActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 40, 30));

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
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 629, Short.MAX_VALUE)
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
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        btnAgregar.setVisible(false);
        btnEditar.setVisible(false);
        btnCancelarForm.setVisible(false);
        btnEliminar.setVisible(false);
        modificar();
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void tblUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUsuariosMouseClicked
        int fila = tblUsuarios.rowAtPoint(evt.getPoint());
        txtId.setText(tblUsuarios.getValueAt(fila, 0).toString());
        txtNombre.setText(tblUsuarios.getValueAt(fila, 1).toString());
        txtApellido.setText(tblUsuarios.getValueAt(fila, 2).toString());
        txtCedula.setText(tblUsuarios.getValueAt(fila, 3).toString());
        txtTelefono.setText(tblUsuarios.getValueAt(fila, 4).toString());
        cmbTipoServicio.setSelectedItem(tblUsuarios.getValueAt(fila, 5).toString());
        cmbEstadoTrabajador.setSelectedItem(tblUsuarios.getValueAt(fila, 6).toString());
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
        if(txtApellido.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Campo Velocidad obligatorio", "Validación", JOptionPane.WARNING_MESSAGE);
            txtApellido.requestFocusInWindow();
            return;
        }
        
        if(txtNombre.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Campo Nombre obligatorio", "Validación", JOptionPane.WARNING_MESSAGE);
            txtNombre.requestFocusInWindow();
            return;
        }
        
        if(txtTelefono.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Campo Descripción obligatorio", "Validación", JOptionPane.WARNING_MESSAGE);
            txtTelefono.requestFocusInWindow();
            return;
        }
        
        if(txtCedula.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Campo Contraseña obligatorio", "Validación", JOptionPane.WARNING_MESSAGE);
            txtCedula.requestFocusInWindow();
            return;
        }    
        
        if(cmbEstadoTrabajador.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(rootPane, "Campo Estado obligatorio", "Validación", JOptionPane.WARNING_MESSAGE);
            cmbEstadoTrabajador.requestFocusInWindow();
            return;
        }
        
        String msg = null;
        String msg1 = null;
        String msg2 = null;
        if(txtId.getText().equals("")){
            DTrabajadores dt = new DTrabajadores();
            LTrabajadores fun = new LTrabajadores();
            DPersona dts = new DPersona();
            
            String estado = String.valueOf(cmbEstadoTrabajador.getSelectedItem());
            dts.setNombre(txtNombre.getText());
            dts.setApellido(txtApellido.getText());
            dts.setCedulaIdent(txtCedula.getText());
            dts.setTelefono(txtTelefono.getText());
            dt.setEstado(estado);
            dt.setPuestotrabajadorId(Integer.parseInt(txtIdPuesto.getText()));
            dts.setDireccionId(Integer.parseInt(txtIdDireccion.getText()));
            msg = fun.insertarTrabajador(dt, dts);
            mostrarBuscar("");
            if(msg == "si"){
                JOptionPane.showMessageDialog(rootPane, "Se insertó de forma correcta", "Información", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(rootPane, "Ocurrió un problema al insertar", "Información", JOptionPane.ERROR);
            }
        }else if(accion.equals("modificar")){
            DTrabajadores dt = new DTrabajadores();
            LTrabajadores fun = new LTrabajadores();   
            DPersona dts = new DPersona();
            
            String estado = String.valueOf(cmbEstadoTrabajador.getSelectedItem());
            dts.setIdPersona(Integer.parseInt(txtId.getText()));
            dt.setIdTrabajador(Integer.parseInt(txtId.getText()));
            dts.setNombre(txtNombre.getText());
            dts.setApellido(txtApellido.getText());
            dts.setCedulaIdent(txtCedula.getText());
            dts.setTelefono(txtTelefono.getText());
            dt.setEstado(estado);
            dt.setPuestotrabajadorId(Integer.parseInt(txtIdPuesto.getText()));
            dts.setDireccionId(Integer.parseInt(txtIdDireccion.getText()));
            /*msg = fun.*/
            mostrarBuscar("");
            modificar();
        }
        mostrarBotones();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(!txtId.getText().equals("")){
            int confirmacion = JOptionPane.showConfirmDialog(rootPane, "¿Desea eliminar el Usuario?", "Confirmación", 2);
            if(confirmacion == 0){
                DServicios dts = new DServicios();
                LServicios fun = new LServicios();
                DTipoServicio dtS = new DTipoServicio();
                DEstadoServicio des = new DEstadoServicio();
                
                
                dts.setIdServicio(Integer.parseInt(txtId.getText()));
                dtS.setIdTipoServicio(Integer.parseInt(txtId.getText()));
                des.setIdestadoServicio(Integer.parseInt(txtId.getText()));
                
                fun.eliminarServicios(dts, dtS, des);
                mostrarBuscar("");
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        mostrarBotones();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnBuscarPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPuestoActionPerformed
        frmVistaPuestos form = new frmVistaPuestos();
        form.setVisible(true);
        form.toFront();
        control = 1;
    }//GEN-LAST:event_btnBuscarPuestoActionPerformed

    private void btnBuscarDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarDireccionActionPerformed
        frmVistaDireccion form = new frmVistaDireccion();
        form.setVisible(true);
        form.toFront();
        control = 1;
    }//GEN-LAST:event_btnBuscarDireccionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JToggleButton btnBuscarDireccion;
    private javax.swing.JToggleButton btnBuscarPuesto;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCancelarForm;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JTextField buscar;
    private javax.swing.JComboBox<String> cmbEstadoTrabajador;
    private javax.swing.JButton jButton5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblDireccion1;
    private javax.swing.JLabel lblEstadoTrabajador;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPuesto;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JTable tblUsuarios;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    public static javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtId;
    public static javax.swing.JTextField txtIdDireccion;
    public static javax.swing.JTextField txtIdPuesto;
    private javax.swing.JTextField txtNombre;
    public static javax.swing.JTextField txtPuesto;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
