/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package com.rrhh.feria_virtual.interfaz_grafica;
import java.sql.SQLException;
import ws.Calibre;
import javax.swing.JOptionPane;
import java.util.HashMap;
import javax.swing.JFrame;
import ws.AgregarNuevoProducto;
import ws.WSFERIAVIRTUAL;
import ws.WebServiceFV;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import ws.ProductorProducto;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import ws.ListarCalibre;
import javax.swing.JComboBox;


public class Productost extends javax.swing.JFrame {
    
    private WebServiceFV servicioWeb;
    private HashMap<String, String> productosMap;
    private String rut;
    private String nombre;
    private String apellidop;

    public Productost(String rut, String nombre) {
        initComponents();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        DefaultTableModel model = (DefaultTableModel) tblProductosProductor.getModel();
        tblProductosProductor.setDefaultEditor(Object.class, null);
        tblProductosProductor.setRowSelectionAllowed(false);
        
        WSFERIAVIRTUAL servicio = new WSFERIAVIRTUAL();
        servicioWeb = servicio.getWebServiceFVPort(); 
        
        
        
        
      
        productosMap = new HashMap<>();
        productosMap.put("Arándano", "prod_001");
        productosMap.put("Frambuesa", "prod_002");
        productosMap.put("Fresa", "prod_003");
        productosMap.put("Grosella espinosa", "prod_004");
        productosMap.put("Grosella negra", "prod_005");
        productosMap.put("Grosella roja", "prod_006");
        productosMap.put("Zarzamora", "prod_007");
        productosMap.put("Limón", "prod_008");
        productosMap.put("Mandarina", "prod_009");
        productosMap.put("Naranja", "prod_010");
        productosMap.put("Pomelo", "prod_011");
        productosMap.put("Melón", "prod_012");
        productosMap.put("Sandía", "prod_013");
        productosMap.put("Aguacate", "prod_014");
        productosMap.put("Carambola", "prod_015");
        productosMap.put("Chirimoya", "prod_016");
        productosMap.put("Coco", "prod_017");
        productosMap.put("Dátil", "prod_018");
        productosMap.put("Fruta de la pasión", "prod_019");
        productosMap.put("Kiwi", "prod_020");
        productosMap.put("Litchi", "prod_021");
        productosMap.put("Mango", "prod_022");
        productosMap.put("Papaya", "prod_023");
        productosMap.put("Piña", "prod_024");
        productosMap.put("Plátano", "prod_025");
        productosMap.put("Albaricoque", "prod_026");
        productosMap.put("Cereza", "prod_027");
        productosMap.put("Higo", "prod_029");
        productosMap.put("Kaki", "prod_030");
        productosMap.put("Manzana roja", "prod_031");
        productosMap.put("Manzana verde", "prod_032");
        productosMap.put("Melocotón", "prod_033");
        productosMap.put("Nectarina", "prod_034");
        productosMap.put("Níspero", "prod_035");
        productosMap.put("Pera", "prod_036");
        productosMap.put("Uva", "prod_037");
        productosMap.put("Almendra", "prod_038");
        productosMap.put("Avellana", "prod_039");
        productosMap.put("Cacahuete", "prod_040");
        productosMap.put("Castaña", "prod_041");
        productosMap.put("Nuez", "prod_042");
        productosMap.put("NuezPecan", "prod_043");
        productosMap.put("Pistacho", "prod_044");
        this.rut = rut;
        this.nombre = nombre;
  
        
        // Lógica para mostrar el rut y el nombre en txtAreaProductor
        txtAreaProductor.setText("RUT: " + rut + "\nNombre: " + nombre );
         txtAreaProductor.setEditable(false);
         int rutProductor = Integer.parseInt(rut); // Convierte el rut a entero
    

    
    }
     
   
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaProductor = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnAgregarProducto = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProductosProductor = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        cmbCalibre = new javax.swing.JComboBox<>();
        cmbProducto = new javax.swing.JComboBox<>();
        txtImg = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();
        txtRut = new javax.swing.JTextField();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Samuel Antunez\\Desktop\\logo_v3-removebg-preview (3).png")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Productos");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Ingresar productos de :");

        txtAreaProductor.setBackground(new java.awt.Color(204, 204, 204));
        txtAreaProductor.setColumns(20);
        txtAreaProductor.setRows(5);
        jScrollPane1.setViewportView(txtAreaProductor);

        jLabel7.setText("Producto");

        jLabel8.setText("Precio ");

        jLabel10.setText("Calibre");

        btnAgregarProducto.setText("Agregar producto");
        btnAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProductoActionPerformed(evt);
            }
        });

        jLabel4.setText("Stock");

        tblProductosProductor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre producto", "Stock producto", "Precio", "Tipo producto", "Calibre", "img"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblProductosProductor);

        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        cmbCalibre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6" }));
        cmbCalibre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCalibreActionPerformed(evt);
            }
        });

        cmbProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arándano", "Frambuesa", "Fresa", "Grosella espinosa", "Grosella negra", "Grosella roja", "Zarzamora", "Limón", "Mandarina", "Naranja", "Pomelo", "Melón", "Sandía", "Aguacate", "Carambola", "Chirimoya", "Coco", "Dátil", "Fruta de la pasión", "Kiwi", "Litchi", "Mango", "Papaya", "Piña", "Plátano", "Albaricoque", "Cereza", "Higo", "Kaki", "Manzana roja", "Manzana verde", "Melocotón", "Nectarina", "Níspero", "Pera", "Uva", "Almendra", "Avellana", "Cacahuete", "Castaña", "Nuez", "NuezPecan", "Pistacho" }));
        cmbProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProductoActionPerformed(evt);
            }
        });

        jLabel5.setText("Img");

        btnActualizar.setText("Listar productos");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3)
                            .addComponent(jLabel10)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtImg, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStock, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addComponent(cmbCalibre, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbProducto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAgregarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(117, 117, 117)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(jLabel2)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnActualizar)
                        .addGap(158, 158, 158)
                        .addComponent(jLabel1))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnActualizar)
                            .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(cmbCalibre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cmbProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtImg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addComponent(btnAgregarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(81, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void formWindowClosing(java.awt.event.WindowEvent evt) {
     this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
}
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Productort pantalla = new Productort();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
        
       dispose(); 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cmbProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbProductoActionPerformed

    private void btnAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProductoActionPerformed
    String precioString = txtPrecio.getText();
    String stockString = txtStock.getText();
    String img = txtImg.getText(); // Obtiene la URL de la imagen desde el campo de texto txtImg

    // Obtiene el nombre del calibre seleccionado en el JComboBox
    String calibreNombre = cmbCalibre.getSelectedItem().toString();

    // Obtiene el nombre del producto seleccionado en el JComboBox
    String productoNombre = cmbProducto.getSelectedItem().toString();

    // Verifica si los campos obligatorios están llenos
    if (precioString.isEmpty() || stockString.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, llena todos los campos obligatorios antes de intentar agregar el producto.", "Error", JOptionPane.ERROR_MESSAGE);
    } else {
        try {
            // Convierte el precio y el stock a enteros
            int precio = Integer.parseInt(precioString);
            int stock = Integer.parseInt(stockString);

            // Llama a una función para obtener el ID del calibre basado en su nombre
            int calibreId = obtenerIdCalibrePorNombre(calibreNombre);

            // Llama a una función para obtener el ID del producto basado en su nombre
            String productoId = obtenerIdProductoPorNombre(productoNombre);

            // Llama a la función para agregar un nuevo producto
            boolean registrado = servicioWeb.agregarNuevoProducto(precio, stock, String.valueOf(calibreId), productoId, Integer.parseInt(rut), img);

            if (registrado) {
                // El producto se registró correctamente
                JOptionPane.showMessageDialog(this, "Producto registrado correctamente.");
                // Puedes limpiar los campos después de registrar el producto si lo deseas
            } else {
                // Hubo un error al registrar el producto
                JOptionPane.showMessageDialog(this, "Error al registrar el producto. Inténtalo de nuevo.");
            }
        } catch (NumberFormatException e) {
            // Si el precio o el stock no son números válidos, muestra un mensaje de error
            JOptionPane.showMessageDialog(this, "El precio y el stock deben ser números válidos.", "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace(); // Imprime la traza del error para depuración
        }
    }
}

// Función para obtener el ID del calibre basado en su nombre
private int obtenerIdCalibrePorNombre(String calibreNombre) {
    // Aquí puedes implementar la lógica para obtener el ID del calibre basado en su nombre
    // Retorna el ID correspondiente al nombre del calibre
    return 0; // Cambia esto con la lógica real para obtener el ID del calibre
}

// Función para obtener el ID del producto basado en su nombre
private String obtenerIdProductoPorNombre(String productoNombre) {
    // Aquí puedes implementar la lógica para obtener el ID del producto basado en su nombre
    // Retorna el ID correspondiente al nombre del producto
    return "0"; // Cambia esto con la lógica real para obtener el ID del producto

    }//GEN-LAST:event_btnAgregarProductoActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

    }//GEN-LAST:event_btnActualizarActionPerformed

    private void cmbCalibreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCalibreActionPerformed
  try {
        // Obtener la lista de calibres del servicio web
        List<Calibre> calibres = servicioWeb.listarCalibre();

        // Limpiar el ComboBox antes de agregar nuevos elementos
        cmbCalibre.removeAllItems();

        // Verificar si la lista de calibres no está vacía
        if (calibres != null && !calibres.isEmpty()) {
            // Agregar los nombres de los calibres (primera columna) al ComboBox
            for (Calibre calibre : calibres) {
                // Obtener el valor de la primera columna y agregarlo al ComboBox
                String nombrePrimeraColumna = calibre.getIdcalibre(); // Reemplaza esto con el método real para obtener el valor de la primera columna
                cmbCalibre.addItem(nombrePrimeraColumna);
            }
        } else {
            // No hacer nada si la lista de calibres está vacía
        }
    } catch (Exception ex) {
        // Manejar cualquier excepción que pueda ocurrir durante la obtención de datos
        ex.printStackTrace(); // Imprimir el rastreo de la pila en la consola para depuración
    }

    

    
    }//GEN-LAST:event_cmbCalibreActionPerformed
    
   
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
            java.util.logging.Logger.getLogger(Productost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Productost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Productost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Productost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregarProducto;
    private javax.swing.JComboBox<String> cmbCalibre;
    private javax.swing.JComboBox<String> cmbProducto;
    private javax.swing.JButton jButton2;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblProductosProductor;
    private javax.swing.JTextArea txtAreaProductor;
    private javax.swing.JTextField txtImg;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtRut;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
