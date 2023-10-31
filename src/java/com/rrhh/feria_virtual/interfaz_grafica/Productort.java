/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.rrhh.feria_virtual.interfaz_grafica;

import ws.Productor;
import java.util.Calendar;
import javax.swing.JOptionPane;
import ws.WSFERIAVIRTUAL;
import ws.WebServiceFV;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Productort extends javax.swing.JFrame {
 private void limpiarCampos() {
        txtRut.setText("");
        txtDV.setText("");
        txtNombre.setText("");
        txtApellidop.setText("");
        txtApellidom.setText("");
        txtComuna.setText("");
        txtDireccion.setText("");
        txtCorreo.setText("");
        txtFecha.setText("");
        txtContra.setText("");
 }
    private WebServiceFV servicioWeb;
    
    public Productort() {
        initComponents();
        WSFERIAVIRTUAL servicio = new WSFERIAVIRTUAL();
        servicioWeb = servicio.getWebServiceFVPort(); 
        DefaultTableModel model = (DefaultTableModel) tblProductor.getModel();
        tblProductor.setDefaultEditor(Object.class, null);
        tblProductor.setRowSelectionAllowed(false);
     
        
  tblProductor.addMouseListener(new MouseAdapter() {
    @Override
    public void mouseClicked(MouseEvent e) {
        int filaSeleccionada = tblProductor.getSelectedRow();
        int columnaRut = 0; // Índice de la columna del rut en la tabla
        int columnaNombre = 2; // Índice de la columna del nombre en la tabla
       
        // Verifica si se hizo clic en la columna del rut
        if (tblProductor.columnAtPoint(e.getPoint()) == columnaRut) {
            // Obtiene el valor del rut de la fila seleccionada
            Integer rutInt = (Integer) tblProductor.getValueAt(filaSeleccionada, columnaRut);
            String rut = String.valueOf(rutInt);

            // Obtiene el valor del nombre de la fila seleccionada
            String nombre = (String) tblProductor.getValueAt(filaSeleccionada, columnaNombre);

            // Abre la ventana Productos.java pasando el rut y el nombre como parámetros
            Productost productosVentana = new Productost(rut, nombre);
            productosVentana.setVisible(true);
        }
    }
});
     cargar_productores();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtRut = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProductor = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        btnBuscarProductor = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtApellidop = new javax.swing.JTextField();
        txtApellidom = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtComuna = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        txtDV = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        txtContra = new javax.swing.JPasswordField();
        txtDireccion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JToggleButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Samuel Antunez\\Desktop\\logo_v3-removebg-preview (3).png")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Productor");

        jLabel3.setText("Rut");

        jLabel4.setText("Nombre");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Ingresar datos");

        tblProductor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Rut ", "DV", "Nombre", "Apellido P", "Apellido M", "Fecha nacimiento", "Direccion", "Correo", "Contraseña", "Ciudad"
            }
        ));
        jScrollPane2.setViewportView(tblProductor);

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnBuscarProductor.setText("Buscar Productor");
        btnBuscarProductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProductorActionPerformed(evt);
            }
        });

        jLabel11.setText("Apellido paterno");

        jLabel12.setText("Apellido materno");

        jLabel13.setText("Direccion");

        jLabel14.setText("Correo");

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        jLabel15.setText("Fecha nacimiento");

        jLabel5.setText("Contraseña");

        jLabel7.setText("Comuna");

        btnEliminar.setBackground(new java.awt.Color(255, 102, 102));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel8.setText("-");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(416, 416, 416))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(508, 508, 508)
                .addComponent(jLabel1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(139, 139, 139))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(59, 59, 59)
                                    .addComponent(jLabel2))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(185, 185, 185)
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                    .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtDV, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(2, 2, 2))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(120, 120, 120)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel12)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel13)
                                        .addComponent(jLabel14)
                                        .addComponent(jLabel15)
                                        .addComponent(jLabel5))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtDireccion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                        .addComponent(txtComuna, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtApellidom, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtCorreo)
                                        .addComponent(txtApellidop, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtFecha)
                                        .addComponent(txtContra))))
                            .addGap(10, 10, 10))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jTextField3)
                        .addGap(92, 92, 92)
                        .addComponent(btnBuscarProductor, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(193, 193, 193))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 793, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(24, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnBuscarProductor)
                                .addComponent(btnEliminar)
                                .addComponent(jLabel3)
                                .addComponent(txtDV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtApellidop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(txtApellidom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtComuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
          Principal pantalla = new Principal();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
        
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
     String rutString = txtRut.getText();
    String dv = txtDV.getText();
    String nombre = txtNombre.getText();
    String apellidop = txtApellidop.getText();
    String apellidom = txtApellidom.getText();
    String fechaNacimiento = txtFecha.getText();
    String direccion = txtDireccion.getText();
    String correo = txtCorreo.getText();
    String contrasena = new String(txtContra.getPassword());
    String comuna_idcomuna = "1"; // Debes establecer el valor de comuna_idcomuna correctamente

    // Verifica si los campos obligatorios están llenos
    if (rutString.isEmpty() || dv.isEmpty() || nombre.isEmpty() || apellidop.isEmpty() || apellidom.isEmpty() || 
        fechaNacimiento.isEmpty() || direccion.isEmpty() || correo.isEmpty() || contrasena.isEmpty() || comuna_idcomuna.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, llena todos los campos obligatorios antes de intentar agregar el productor.", "Error", JOptionPane.ERROR_MESSAGE);
    } else {
        int rut;
        try {
            // Intenta convertir el RUT a un número entero
            rut = Integer.parseInt(rutString);
        } catch (NumberFormatException e) {
            // Si no se puede convertir a un número, muestra un mensaje de error y sale del método
            JOptionPane.showMessageDialog(this, "El RUT debe ser un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Llama al método del servicio web para agregar el productor
       boolean registrado = servicioWeb.agregarProductor(rut, dv, nombre, apellidop, apellidom, fechaNacimiento, direccion, correo, contrasena, comuna_idcomuna);

        if (registrado) {
            // El productor se registró correctamente
            JOptionPane.showMessageDialog(this, "Productor registrado correctamente.");
            // Puedes limpiar los campos después de registrar el productor si lo deseas
            limpiarCampos();
            // Actualiza la tabla después de registrar el productor
        } else {
            // Hubo un error al registrar el productor
            JOptionPane.showMessageDialog(this, "Error al registrar el productor. Inténtalo de nuevo.");
        }
    }
    cargar_productores();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
          String rutString = txtRut.getText();
    String nombre = txtNombre.getText();
    String apellidop = txtApellidop.getText();
    String apellidom = txtApellidom.getText();
    String fechaNacimiento = txtFecha.getText();
    String direccion = txtDireccion.getText();
    String correo = txtCorreo.getText();
    String contrasena = new String(txtContra.getPassword());
    String comuna_idcomuna = txtComuna.getText(); // Obtener el valor de la comuna
    
    // Verificar si los campos obligatorios están llenos
    if (rutString.isEmpty() || nombre.isEmpty() || apellidop.isEmpty() || apellidom.isEmpty() || 
        fechaNacimiento.isEmpty() || direccion.isEmpty() || correo.isEmpty() || 
        contrasena.isEmpty() || comuna_idcomuna.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, llena todos los campos obligatorios antes de intentar modificar el productor.", "Error", JOptionPane.ERROR_MESSAGE);
    } else {
        try {
            // Intentar convertir el RUT a un número entero
            int rutabuscar = Integer.parseInt(rutString);

            // Llamar al método del servicio web para modificar el productor
            boolean modificado = servicioWeb.modificarProductor(rutabuscar, nombre, apellidop, apellidom, fechaNacimiento, direccion, correo, contrasena, comuna_idcomuna);

            if (modificado) {
                // El productor se modificó correctamente
                JOptionPane.showMessageDialog(this, "Productor modificado correctamente.");
                // Puedes limpiar los campos después de modificar el productor si lo deseas
                limpiarCampos();
                // Actualizar la tabla después de modificar el productor
            } else {
                // Hubo un error al modificar el productor
                JOptionPane.showMessageDialog(this, "Error al modificar el productor. Inténtalo de nuevo.");
            }
        } catch (NumberFormatException e) {
            // Si no se puede convertir el RUT a un número, mostrar un mensaje de error
            JOptionPane.showMessageDialog(this, "El RUT debe ser un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    cargar_productores();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnBuscarProductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProductorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarProductorActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       String rutEliminar = txtRut.getText();
    
    // Verificar si el campo RUT está lleno
    if (rutEliminar.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, ingresa el RUT del productor que deseas eliminar.", "Error", JOptionPane.ERROR_MESSAGE);
    } else {
        try {
            // Intentar convertir el RUT a un número entero
            int rutAEliminar = Integer.parseInt(rutEliminar);
            
            // Llamar al método del servicio web para eliminar definitivamente el productor
            boolean eliminado = servicioWeb.eliminarDefinitivoProductor(rutAEliminar);
            
            if (eliminado) {
                // El productor se eliminó definitivamente correctamente
                JOptionPane.showMessageDialog(this, "Productor eliminado definitivamente correctamente.");
                // Puedes limpiar los campos después de eliminar el productor si lo deseas
                limpiarCampos();
                // Actualizar la tabla después de eliminar el productor
            } else {
                // Hubo un error al eliminar el productor
                JOptionPane.showMessageDialog(this, "Error al eliminar el productor. Verifica el RUT e inténtalo de nuevo.");
            }
        } catch (NumberFormatException e) {
            // Si no se puede convertir el RUT a un número, mostrar un mensaje de error
            JOptionPane.showMessageDialog(this, "El RUT debe ser un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    cargar_productores();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void cargar_productores(){
    // Llama al método del servicio web para obtener la lista de productores desde la base de datos
     List<ws.Productor> productores = servicioWeb.listarProductor();


    // Verifica si la lista de productores no está vacía
    if (productores != null && !productores.isEmpty()) {
        // Obtiene el modelo de la tabla
        DefaultTableModel model = (DefaultTableModel) tblProductor.getModel();

        // Limpia la tabla antes de agregar nuevos datos
        model.setRowCount(0);

        // Agrega los datos de los productores al modelo de datos de la tabla
        for (Productor productor : productores) {
            Object[] rowData = {productor.getRut(), productor.getDv(), productor.getNombre(), productor.getApellidopat(), productor.getApellidomat(), 
                                productor.getDireccion(), productor.getFechanacimiento(), productor.getCorreoelectronico(), productor.getContrasena(), 
                                productor.getComunaIdcomuna()};
            model.addRow(rowData);
        }
      } else {
        // Si la lista de productores está vacía o hay un error al obtener los datos, muestra un mensaje de error
        JOptionPane.showMessageDialog(this, "Error al obtener datos de productores desde la base de datos.", "Error", JOptionPane.ERROR_MESSAGE);}
      }
       
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
            java.util.logging.Logger.getLogger(Productor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Productor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Productor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Productor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Productort().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscarProductor;
    private javax.swing.JToggleButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTable tblProductor;
    private javax.swing.JTextField txtApellidom;
    private javax.swing.JTextField txtApellidop;
    private javax.swing.JTextField txtComuna;
    private javax.swing.JPasswordField txtContra;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDV;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRut;
    // End of variables declaration//GEN-END:variables
}
