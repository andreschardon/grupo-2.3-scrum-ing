/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scrum23.GUI;

import com.scrum23.importer.Importer;
import com.scrum23.io.FileOperations;
import com.scrum23.model.Attribute;
import com.scrum23.model.Edge;
import com.scrum23.model.Graph;
import com.scrum23.model.Vertex;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.table.TableModel;

/**
 *
 * @author Andres
 */
public class MainWindow extends javax.swing.JFrame {
    private JScrollPane graphPanel;
    private GraphPanel graphDisplay;
    private Graph currentGraph;

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        //seteo el look and feel para Windows
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        initComponents();
    }
    
    public MainWindow(Graph graph) {
        //this.jInternalFrame1 = graph;
        this.currentGraph = graph;
        this.graphDisplay = graph.getDisplay();
        this.graphPanel = this.graphDisplay.getPanel();
        //seteo el look and feel para Windows
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestor de cursos");
        setLocationByPlatform(true);

        jScrollPane1 = graphPanel;

        jButton1.setText("Editar curso o dep.");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Nueva dependencia");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Nuevo curso");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setText("Eliminar curso o dep.");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jMenu1.setText("Abrir desde la BD");
        jMenuBar1.add(jMenu1);

        jMenu3.setText("Guardar a la BD");
        jMenuBar1.add(jMenu3);

        jMenu2.setText("Importar");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText(".viz");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Exportar");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText(".viz");
        jMenu4.add(jMenuItem2);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Acerca de");
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 784, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addGap(4, 4, 4)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        FileOperations op = new FileOperations();
        File f = op.openFile();
        Importer imp = new Importer();
        try {
            Graph imported;
            imported = imp._import(f.getCanonicalPath());
            //currentGraph=imported; esto creo que deberia andar, braian testealo
            //update();
        } catch (IOException e) {e.printStackTrace();}

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        EditSelectorWindow esw = new EditSelectorWindow(this);
        esw.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        NewEdgeWindow nedw = new NewEdgeWindow(this);
        nedw.setVisible(true);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        NewVertexWindow nvw = new NewVertexWindow(this);
        nvw.setVisible(true);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // borrar elemento
        DeleteSelectorWindow dsw = new DeleteSelectorWindow(this);
        dsw.setVisible(true);
        
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    void newVertex(TableModel table) {
        //analizo la tabla y creo el nuevo curso
        Vertex toAdd = new Vertex();
        for (int i=0; i < 6; i++) {
            String name = (String)table.getValueAt(i, 0);
            if (name != null) {
                String value = (String)table.getValueAt(i, 1);
                if (value != null) {
                    Attribute newAt = new Attribute(name, value); 
                    toAdd.addAttribute(newAt);
                }
            }
        }
        toAdd.setId(0);
        currentGraph.addVertex(toAdd); 
        update();
    }
    
    void newEdge(TableModel table, int origin, int destiny) {
        //analizo la tabla, chequeo origen y destino, y creo la nueva dependencia
        Vertex originV = currentGraph.getVertexById(origin);
        Vertex destinyV = currentGraph.getVertexById(destiny);
                        
        if (originV != null && destinyV != null) {
            Edge toAdd = new Edge(originV, destinyV);
            for (int i=0; i < table.getRowCount(); i++) {
                String name = (String)table.getValueAt(i, 0);
                if (name != null) {
                    String value = (String)table.getValueAt(i, 1);
                    if (value != null) {
                        Attribute newAt = new Attribute(name, value); 
                        toAdd.addAttribute(newAt);
                    }
                }
            }
            currentGraph.addEdge(toAdd); 
            update();
        }
    }
    
    void editVertex(int vertexId) {
        Vertex toEdit = currentGraph.getVertexById(vertexId);
        System.out.println(toEdit.toString());
        EditVertexWindow evw = new EditVertexWindow(this, toEdit);
        //evw.setVisible(true);
    }
    
    void editVertexAtts(TableModel table, Vertex toEdit) {
        toEdit.removeAtts();
        for (int i=0; i < table.getRowCount(); i++) {
            String name = (String)table.getValueAt(i, 0);
            if (name != null) {
                String value = (String)table.getValueAt(i, 1);
                if (value != null) {
                    Attribute newAt = new Attribute(name, value); 
                    toEdit.addAttribute(newAt);
                }
            }
        }
        update();
    }
    
    void editEdgeAtts(TableModel table, Edge toEdit, int origin, int destiny) {
        //cambio el origen y el destino
        Vertex originV = currentGraph.getVertexById(origin);
        Vertex destinyV = currentGraph.getVertexById(destiny);
        if (originV != null && destinyV != null) {
            toEdit.setOrigin(originV);
            toEdit.setDestiny(destinyV);
        }
        //borro los atributos y agrego los nuevos
        toEdit.removeAtts();
        for (int i=0; i < table.getRowCount(); i++) {
            String name = (String)table.getValueAt(i, 0);
            if (name != null) {
                String value = (String)table.getValueAt(i, 1);
                if (value != null) {
                    Attribute newAt = new Attribute(name, value); 
                    toEdit.addAttribute(newAt);
                }
            }
        }
        update();
    }

    void editEdge(int edgeId) {
        Edge toEdit = currentGraph.getEdgeById(edgeId);
        
        EditEdgeWindow eew = new EditEdgeWindow(this, toEdit);
    }
    
    void update() {
        this.graphDisplay = currentGraph.getDisplay();
        this.graphPanel = this.graphDisplay.getPanel();
        jScrollPane1.setViewport(graphPanel.getViewport());
        jScrollPane1.revalidate();
        jScrollPane1.repaint();        
    }

    void deleteVertex(int vertexId) {
        Vertex toDelete = currentGraph.getVertexById(vertexId);
        currentGraph.removeVertex(toDelete);
        update();
    }

    void deleteEdge(int edgeId) {
        Edge toDelete = currentGraph.getEdgeById(edgeId);
        System.out.println(toDelete);
        currentGraph.removeEdge(toDelete.getDestiny(), toDelete.getOrigin(), toDelete);
        update();
    }
}
