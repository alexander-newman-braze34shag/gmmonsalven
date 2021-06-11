/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LUIS POTTE
 */
import Ventanas.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import listas.*;

public class Stock extends javax.swing.JPanel {

    Menú_principal Menú;
    Multilista Stocklist = new Multilista();

    /**
     * Creates new form Stock
     */
    public Stock(Menú_principal p) {
        initComponents();
        this.Menú = p;
        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel3.setBackground(new java.awt.Color(153, 153, 255));
        jPanel4.setBackground(new java.awt.Color(153, 153, 255));
        jPanel5.setBackground(new java.awt.Color(153, 153, 255));
        jPanel6.setBackground(new java.awt.Color(153, 153, 255));
    }

    public Multilista getStocklist() {
        return Stocklist;
    }

    public void setStocklist(Multilista Stocklist) {
        this.Stocklist = Stocklist;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Combo_Categorias = new javax.swing.JComboBox<>();
        Combo_Subcategorias = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setText("X");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5Salir(evt);
            }
        });
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, -3, 30, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("S      T      O     C      K");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 280, 30));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel1MouseMoved(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel1MouseExited(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText(" VER TODOS LOS PRODUCTOS EN STOCK");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 220, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 290, 220, 50));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel2MouseMoved(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_subcategoria(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel2MouseExited(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("AGREGAR NUEVA SUBCATEGORIA");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 230, 50));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel3MouseMoved(evt);
            }
        });
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_producto(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel3MouseExited(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("AGREGAR UN NUEVO  PRODUCTO");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 180, 220, 50));

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel4MouseMoved(evt);
            }
        });
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_categoria(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel4MouseExited(evt);
            }
        });
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("AGREGAR NUEVA CATEGORIA");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 200, 50));

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));
        jPanel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel5MouseMoved(evt);
            }
        });
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminar_producto(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel5MouseExited(evt);
            }
        });
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText(" ELIMINAR PRODUCTOS DEL STOCK");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 200, 30));

        add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 200, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32306402.png"))); // NOI18N
        jLabel1.setToolTipText("");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-220, -200, -1, -1));

        jPanel6.setBackground(new java.awt.Color(204, 204, 255));
        jPanel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel6.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel6MouseMoved(evt);
            }
        });
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VerPorCategoria(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel6MouseExited(evt);
            }
        });
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("VER PRODUCTOS POR CATEGORIA");
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 230, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5Salir(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5Salir
        Menú.eliminar_de_tabbed(this);
    }//GEN-LAST:event_jLabel5Salir

    private void add_categoria(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_categoria
        categoria add = new categoria(Menú, true);
        add.setVisible(true);
        if(add.getNombre()!= null){
        Stocklist.add_nodoprincipal(add.getNombre());
        Stocklist.print();
        }else{
            System.out.println("Usuario ha cancelado el proceso add_categoria");
        }
        
    }//GEN-LAST:event_add_categoria

    private void add_subcategoria(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_subcategoria
        Subcategoria add = new Subcategoria(Menú, true);
        this.cargar_jcombobox();
        add.add_combocat(Combo_Categorias);
        add.setVisible(true);
         if(add.getNombre()!= null){
        Stocklist.add_sublista(add.getCategoria(), add.getNombre());
        Stocklist.print();       
         }else{
             System.out.println("El usuario ha cancelado el proceso:add_subcategoría");
         }
    }//GEN-LAST:event_add_subcategoria

    private void add_producto(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_producto
        Producto add = new Producto(Menú, true);
        this.cargar_jcombobox();
        add.add_combocat(Combo_Categorias);
        add.add_combosubcat(Combo_Subcategorias);
        add.setVisible(true);
        if (add.verificar_valores() == true) {
            try {
                Stocklist.add_elmento_sublist(add.getCategoria(), add.getSubcategoria(), add);
                Stocklist.print();
            } catch (NullPointerException e) {
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ha digitado un valor de forma incorrecta intente de nuevo");
            this.add_producto(evt);
        }
    }//GEN-LAST:event_add_producto

    private void eliminar_producto(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminar_producto
        EliminarProducto add = new EliminarProducto(Menú, true);
        this.cargar_jcombobox();
        try {
            add.add_combocat(Combo_Categorias);
            add.add_combosubcat(Combo_Subcategorias);
            add.setVisible(true);
            NodoSegundario producto_a_eliminar = Stocklist.getSubnodo(add.getCategoria(), add.getSubcategoria(), add.getNombre());
            if (add.verificar_valores() == true) {

                Stocklist.eliminar_subnodo(add.getCategoria(), add.getSubcategoria(), producto_a_eliminar);
                Stocklist.print();

            } else {
                JOptionPane.showMessageDialog(null, "Ha digitado un valor de forma incorrecta intente de nuevo");
                this.eliminar_producto(evt);
            }
        } catch (NullPointerException e) {
        }
    }//GEN-LAST:event_eliminar_producto

    private void VerPorCategoria(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VerPorCategoria
        String prod = JOptionPane.showInputDialog("Digite el nombre de la categria que desea ver");
        if (prod != null) {
            if (!prod.equals("")) {
                VerCategoria vcat = new VerCategoria(Menú, true, prod, Stocklist);
            } else {
                JOptionPane.showMessageDialog(null, "No ha digitado ninguna categoria, intente de nuevo");
                this.VerPorCategoria(evt);
            }
        } else {
            int op = JOptionPane.showConfirmDialog(null, "¿Seguro que desea cancelar el proceso?", "Alerta!", JOptionPane.YES_NO_OPTION);
            if (op != 0) {
                this.VerPorCategoria(evt);
            }
        }
    }//GEN-LAST:event_VerPorCategoria

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        VerStock add = new VerStock(Menú, true, Stocklist);
        add.setVisible(true);
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jPanel4MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseMoved
        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
    }//GEN-LAST:event_jPanel4MouseMoved

    private void jPanel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseExited
        jPanel4.setBackground(new java.awt.Color(153, 153, 255));
    }//GEN-LAST:event_jPanel4MouseExited

    private void jPanel2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseMoved
        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
    }//GEN-LAST:event_jPanel2MouseMoved

    private void jPanel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseExited
        jPanel2.setBackground(new java.awt.Color(153, 153, 255));    // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2MouseExited

    private void jPanel3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseMoved
        jPanel3.setBackground(new java.awt.Color(204, 204, 255));   // TODO add your handling code here:
    }//GEN-LAST:event_jPanel3MouseMoved

    private void jPanel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseExited
        jPanel3.setBackground(new java.awt.Color(153, 153, 255));  // TODO add your handling code here:
    }//GEN-LAST:event_jPanel3MouseExited

    private void jPanel5MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseMoved
        jPanel5.setBackground(new java.awt.Color(204, 204, 255));   // TODO add your handling code here:
    }//GEN-LAST:event_jPanel5MouseMoved

    private void jPanel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseExited
        jPanel5.setBackground(new java.awt.Color(153, 153, 255));  // TODO add your handling code here:
    }//GEN-LAST:event_jPanel5MouseExited

    private void jPanel6MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseMoved
        jPanel6.setBackground(new java.awt.Color(204, 204, 255));  // TODO add your handling code here:
    }//GEN-LAST:event_jPanel6MouseMoved

    private void jPanel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseExited
        jPanel6.setBackground(new java.awt.Color(153, 153, 255));  // TODO add your handling code here:
    }//GEN-LAST:event_jPanel6MouseExited

    private void jPanel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseMoved
        jPanel1.setBackground(new java.awt.Color(204, 204, 255));  // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseMoved

    private void jPanel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseExited
        jPanel1.setBackground(new java.awt.Color(153, 153, 255));  // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseExited

    public void cargar_jcombobox() {
        NodoPrincipal p = Stocklist.getInicioMulti();
        while (p != null) {
            Combo_Categorias.addItem(p.getInfo());
            NodoSegundario q = p.getNodos().getInicio();
            while (q != null) {
                NodoSegundario u = (NodoSegundario) q.getInfo();
                Combo_Subcategorias.addItem(u.getInfo().toString());
                q = q.getSiguiente();
            }
            p = p.getSiguiente();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Combo_Categorias;
    private javax.swing.JComboBox<String> Combo_Subcategorias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables
}
