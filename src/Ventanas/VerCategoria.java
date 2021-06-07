/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import listas.*;

/**
 *
 * @author LUIS POTTE
 */
public class VerCategoria extends javax.swing.JDialog {

    String NombreDeCategoria;
    Multilista aux;

    /**
     * Creates new form VerCategorias
     */
    public VerCategoria(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public VerCategoria(java.awt.Frame aThis, boolean b, String prod, Multilista stock) {
        super(aThis, b);
        initComponents();
        this.NombreDeCategoria = prod;
        this.aux = stock;
        this.setLocationRelativeTo(null);
        try {
            this.modelo();
            this.setVisible(true);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "El nombre de la categoría " + prod + " no existe, intente de nuevo");
            this.dispose();
        }
    }

    public JLabel getNom_cate() {
        return nom_cate;
    }

    public void setNom_cate(JLabel nom_cate) {
        this.nom_cate = nom_cate;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nom_cate = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaInfo = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nom_cate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nom_cate.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(nom_cate, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 39, 136, 14));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TablaInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Referencia", "Categoria", "SubCategoria", "Precio", "Cantidad "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TablaInfo);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 592, 263));

        jButton2.setText("Cancelar");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2cancelar(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 89, 32));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 50, 750, 380));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ELEMENTOS DE LA CATEGORÍA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(268, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(260, 260, 260))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2cancelar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2cancelar
        this.dispose();
    }//GEN-LAST:event_jButton2cancelar

    public void setNombreDeCategoria(Object NombreDeCategoria) {
        this.NombreDeCategoria = (String) NombreDeCategoria;
    }

    private void mostar_datos(DefaultTableModel tabla, int n, int m) {
        DefaultTableModel Tabla = (DefaultTableModel) TablaInfo.getModel();
        System.out.println("Entró a mostraar datos" + NombreDeCategoria);
        NodoPrincipal cats = aux.getNodo(NombreDeCategoria);
        System.out.println(": " + cats.getInfo());
        //imprime todos los productos de las subcategorias que se hicieron en la categoria
        NodoSegundario subnodo = cats.getNodos().getInicio();
        while (subnodo != null) {
            NodoSegundario u = (NodoSegundario) subnodo.getInfo();
            u = u.getSiguiente();
            int row = 0, column = 0;
            while (u != null) {
                // informacion del producto
                Producto infoProducto = (Producto) u.getInfo();
                tabla.setValueAt(infoProducto.getReferencia(), row, column);
                column++;
                tabla.setValueAt(infoProducto.getCategoria(), row, column);
                column++;
                tabla.setValueAt(infoProducto.getSubcategoria(), row, column);
                column++;
                tabla.setValueAt(infoProducto.getPrecio(), row, column);
                column++;
                tabla.setValueAt(infoProducto.getCantidad(), row, column);
                column++;
                u = u.getSiguiente();
                row++;
                column = 0;
            }
            subnodo = subnodo.getSiguiente();
        }
        TablaInfo.setModel(tabla);
    }

    private void modelo() {
        DefaultTableModel ModeloTabla = (DefaultTableModel) TablaInfo.getModel();
        System.out.println("Entró a mostraar datos" + NombreDeCategoria);
        NodoPrincipal cats = aux.getNodo(NombreDeCategoria);
        System.out.println(": " + cats.getInfo());
        //imprimo todos los productos de las subcategorias que se hicieron en la categoria
        NodoSegundario subnodo = cats.getNodos().getInicio();
        int contR = 0, contC = 5;
        while (subnodo != null) {
            NodoSegundario u = (NodoSegundario) subnodo.getInfo();
            System.out.println("  " + u.getInfo()); // nombre de la sublista
            u = u.getSiguiente();
            int filas = 0, colum = 0;
            while (u != null) {
                contR++;
                u = u.getSiguiente();
            }
            subnodo = subnodo.getSiguiente();
        }

        ModeloTabla.setRowCount(contR);
        ModeloTabla.setColumnCount(contC);
        mostar_datos(ModeloTabla, contR, contC);
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
            java.util.logging.Logger.getLogger(VerCategoria.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerCategoria.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerCategoria.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerCategoria.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VerCategoria dialog = new VerCategoria(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaInfo;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel nom_cate;
    // End of variables declaration//GEN-END:variables

}
