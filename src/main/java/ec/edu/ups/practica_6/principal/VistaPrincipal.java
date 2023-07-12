/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ec.edu.ups.practica_6.principal;

import ec.edu.ups.practica_6.controlador.DirectoriosController;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

/**
 *
 * @author Usuario
 */
public class VistaPrincipal extends javax.swing.JFrame {

    private DirectoriosController directoriosController;
    private boolean activoCrear = true;
    private boolean activoEliminar = true;
    private boolean activoRenombrar = true;
    private DefaultTreeModel modelo;
    private boolean activoSalir = true;
    private DefaultMutableTreeNode root;

    /**
     * Creates new form VistaPirncipal
     */
    public VistaPrincipal() {
        initComponents();
        this.directoriosController = new DirectoriosController();
        if (activoCrear) {
            menuItemCrear.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_DOWN_MASK));
            menuItemCrear.addActionListener(this::menuItemCrearActionPerformed);
            menuGestionar.add(menuItemCrear);
        } else {
        }
        if (activoEliminar) {
            menuItemEliminar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, KeyEvent.CTRL_DOWN_MASK));
            menuItemEliminar.addActionListener(this::menuItemEliminarActionPerformed);
            menuGestionar.add(menuItemEliminar);
        } else {
        }

        if (activoRenombrar) {
            menuItemRenombrar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, KeyEvent.CTRL_DOWN_MASK));
            menuItemRenombrar.addActionListener(this::menuItemRenombrarActionPerformed);
            menuGestionar.add(menuItemRenombrar);
        } else {
        }

        if (activoSalir) {
            menuItemSalir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, KeyEvent.CTRL_DOWN_MASK));
            menuItemSalir.addActionListener(this::menuItemSalirActionPerformed);
            menuGestionar.add(menuItemSalir);
        } else {
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileseleccionarCarpeta = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree = new javax.swing.JTree();
        jScrollPane2 = new javax.swing.JScrollPane();
        jAreaInformacion = new javax.swing.JTextArea();
        txtRuta = new javax.swing.JTextField();
        btnMostrarInformacion = new javax.swing.JButton();
        btnListarDirectorios = new javax.swing.JButton();
        btnListarArchivos = new javax.swing.JButton();
        btnListarDirectoriosOcultos = new javax.swing.JButton();
        btnListarArchivosOcultos = new javax.swing.JButton();
        btnListarTodo = new javax.swing.JButton();
        bttnSeleccionarRuta = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuGestionar = new javax.swing.JMenu();
        menuItemCrear = new javax.swing.JMenuItem();
        menuItemRenombrar = new javax.swing.JMenuItem();
        menuItemEliminar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuItemSalir = new javax.swing.JMenuItem();

        fileseleccionarCarpeta.setFileSelectionMode(javax.swing.JFileChooser.FILES_AND_DIRECTORIES);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "GESTIONAR DIRECTORIO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 24))); // NOI18N

        jTree.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jScrollPane1.setViewportView(jTree);

        jAreaInformacion.setColumns(20);
        jAreaInformacion.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jAreaInformacion.setRows(5);
        jAreaInformacion.setText("Informacion:\n\nPath absoluto\nTamaño del archivo\nPermisos de lectura\nPermisos de escritura\nFecha de última modificaión");
        jScrollPane2.setViewportView(jAreaInformacion);

        txtRuta.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtRuta.setToolTipText("RUTA:");
        txtRuta.setBorder(null);

        btnMostrarInformacion.setText("Mostrar Informacion");
        btnMostrarInformacion.setBorder(null);
        btnMostrarInformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarInformacionActionPerformed(evt);
            }
        });

        btnListarDirectorios.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        btnListarDirectorios.setText("Listar Directorios");
        btnListarDirectorios.setBorder(null);
        btnListarDirectorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarDirectoriosActionPerformed(evt);
            }
        });

        btnListarArchivos.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        btnListarArchivos.setText("Listar Archivos");
        btnListarArchivos.setBorder(null);
        btnListarArchivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarArchivosActionPerformed(evt);
            }
        });

        btnListarDirectoriosOcultos.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        btnListarDirectoriosOcultos.setText("Listar Directorios Ocultos");
        btnListarDirectoriosOcultos.setBorder(null);
        btnListarDirectoriosOcultos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarDirectoriosOcultosActionPerformed(evt);
            }
        });

        btnListarArchivosOcultos.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        btnListarArchivosOcultos.setText("Listar Archivos Ocultos");
        btnListarArchivosOcultos.setBorder(null);
        btnListarArchivosOcultos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarArchivosOcultosActionPerformed(evt);
            }
        });

        btnListarTodo.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        btnListarTodo.setText("Listar Todo");
        btnListarTodo.setBorder(null);
        btnListarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarTodoActionPerformed(evt);
            }
        });

        bttnSeleccionarRuta.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        bttnSeleccionarRuta.setText("Seleecionar Ruta");
        bttnSeleccionarRuta.setBorder(null);
        bttnSeleccionarRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnSeleccionarRutaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnListarArchivos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnListarDirectorios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnListarTodo, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnListarArchivosOcultos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnListarDirectoriosOcultos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(bttnSeleccionarRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(351, 351, 351)
                        .addComponent(btnMostrarInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttnSeleccionarRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnListarDirectorios, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnListarArchivos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnListarDirectoriosOcultos, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnListarArchivosOcultos, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnListarTodo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMostrarInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menuGestionar.setText("Gestionar Directorios");

        menuItemCrear.setText("Crear");
        menuItemCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCrearActionPerformed(evt);
            }
        });
        menuGestionar.add(menuItemCrear);

        menuItemRenombrar.setText("Renombrar");
        menuItemRenombrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRenombrarActionPerformed(evt);
            }
        });
        menuGestionar.add(menuItemRenombrar);

        menuItemEliminar.setText("Eliminar");
        menuItemEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEliminarActionPerformed(evt);
            }
        });
        menuGestionar.add(menuItemEliminar);

        jMenuBar1.add(menuGestionar);

        jMenu2.setText("Opciones");

        menuItemSalir.setText("Salir");
        menuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSalirActionPerformed(evt);
            }
        });
        jMenu2.add(menuItemSalir);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListarDirectoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarDirectoriosActionPerformed

        String ruta = txtRuta.getText();

        DefaultMutableTreeNode nodoRaiz = new DefaultMutableTreeNode(ruta);
        directoriosController.listarDirectorios(new File(ruta), nodoRaiz);

        DefaultTreeModel modelo = new DefaultTreeModel(nodoRaiz);
        jTree.setModel(modelo);
    }//GEN-LAST:event_btnListarDirectoriosActionPerformed

    private void menuItemCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCrearActionPerformed
        String ruta = txtRuta.getText();
        if (ruta.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No se añadió una ruta");
        } else {
            Object[] opciones = {"Directorio", "Archivo"};
            int seleccion = JOptionPane.showOptionDialog(this, "¿Qué desea crear en la ruta especificada?", "Crear", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
            if (seleccion == JOptionPane.YES_OPTION) {
                String nombreDirectorio = JOptionPane.showInputDialog(this, "Ingrese el nombre del directorio a crear:", "Crear Directorio", JOptionPane.PLAIN_MESSAGE);

                if (nombreDirectorio != null && !nombreDirectorio.isEmpty()) {
                    directoriosController.crearDirectorio(ruta, nombreDirectorio);
                    JOptionPane.showMessageDialog(this, "Directorio creado: " + nombreDirectorio);
                } else {
                    JOptionPane.showMessageDialog(this, "No se ingresó un nombre de directorio válido.");
                }
            } else if (seleccion == JOptionPane.NO_OPTION) {
                String nombreArchivo = JOptionPane.showInputDialog(this, "Ingrese el nombre del archivo a crear:", "Crear Archivo", JOptionPane.PLAIN_MESSAGE);

                if (nombreArchivo != null && !nombreArchivo.isEmpty()) {
                    directoriosController.crearArchivo(ruta, nombreArchivo);
                    JOptionPane.showMessageDialog(this, "Archivo creado: " + nombreArchivo);
                } else {
                    JOptionPane.showMessageDialog(this, "No se ingresó un nombre de archivo válido.");
                }
            }
        }
        activoCrear = false;
    }//GEN-LAST:event_menuItemCrearActionPerformed

    private void bttnSeleccionarRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnSeleccionarRutaActionPerformed
        int seleccion = 0;
        fileseleccionarCarpeta.showOpenDialog(null);
        if (seleccion == fileseleccionarCarpeta.APPROVE_OPTION) {
            File fichero = fileseleccionarCarpeta.getSelectedFile();
            actualizar(fichero);
        } else {
            txtRuta.setText("No has seleccionado ninguna ruta");
        }
    }//GEN-LAST:event_bttnSeleccionarRutaActionPerformed

    private void menuItemEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEliminarActionPerformed
        DefaultMutableTreeNode nodoSeleccionado = (DefaultMutableTreeNode) jTree.getSelectionPath().getLastPathComponent();
        String rutaCompleta = obtenerRutaCompletaDesdeNodo(nodoSeleccionado);

        int confirmacion;
        if (nodoSeleccionado.getAllowsChildren()) {
            confirmacion = JOptionPane.showConfirmDialog(this, "¿Estás seguro de eliminar el directorio y su contenido?", "Confirmar Eliminación", JOptionPane.YES_NO_OPTION);
        } else {
            confirmacion = JOptionPane.showConfirmDialog(this, "¿Estás seguro de eliminar el archivo?", "Confirmar Eliminación", JOptionPane.YES_NO_OPTION);
        }

        if (confirmacion == JOptionPane.YES_OPTION) {
            boolean eliminado = directoriosController.eliminarArchivoODirectorio(rutaCompleta);
            if (eliminado) {
                DefaultMutableTreeNode nodoPadre = (DefaultMutableTreeNode) nodoSeleccionado.getParent();
                actualizarJTree(nodoPadre);
                if (nodoSeleccionado.getAllowsChildren()) {
                    JOptionPane.showMessageDialog(this, "Directorio eliminado: " + rutaCompleta);
                } else {
                    JOptionPane.showMessageDialog(this, "Archivo eliminado: " + rutaCompleta);
                }
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo eliminar el archivo o directorio: " + rutaCompleta);
            }
        }
        activoEliminar = false;
    }//GEN-LAST:event_menuItemEliminarActionPerformed

    private void btnListarArchivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarArchivosActionPerformed
        String ruta = txtRuta.getText();

        DefaultMutableTreeNode nodoRaiz = new DefaultMutableTreeNode(ruta);
        directoriosController.listarArchivos(new File(ruta), nodoRaiz);

        DefaultTreeModel modelo = new DefaultTreeModel(nodoRaiz);
        jTree.setModel(modelo);
    }//GEN-LAST:event_btnListarArchivosActionPerformed

    private void btnListarDirectoriosOcultosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarDirectoriosOcultosActionPerformed
        String ruta = txtRuta.getText();

        DefaultMutableTreeNode nodoRaiz = new DefaultMutableTreeNode(ruta);
        directoriosController.listarDirectoriosOcultos(new File(ruta), nodoRaiz);

        DefaultTreeModel modelo = new DefaultTreeModel(nodoRaiz);
        jTree.setModel(modelo);
    }//GEN-LAST:event_btnListarDirectoriosOcultosActionPerformed

    private void btnListarArchivosOcultosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarArchivosOcultosActionPerformed
        String ruta = txtRuta.getText();

        DefaultMutableTreeNode nodoRaiz = new DefaultMutableTreeNode(ruta);
        directoriosController.listarArchivosOcultos(new File(ruta), nodoRaiz);

        DefaultTreeModel modelo = new DefaultTreeModel(nodoRaiz);
        jTree.setModel(modelo);
    }//GEN-LAST:event_btnListarArchivosOcultosActionPerformed

    private void btnListarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarTodoActionPerformed
        String ruta = txtRuta.getText();

        DefaultMutableTreeNode nodoRaiz = new DefaultMutableTreeNode(ruta);
        directoriosController.listarTodo(new File(ruta), nodoRaiz);

        DefaultTreeModel modelo = new DefaultTreeModel(nodoRaiz);
        jTree.setModel(modelo);
    }//GEN-LAST:event_btnListarTodoActionPerformed

    private void menuItemRenombrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRenombrarActionPerformed
        DefaultMutableTreeNode nodoSeleccionado = (DefaultMutableTreeNode) jTree.getSelectionPath().getLastPathComponent();
        if (nodoSeleccionado != null) {
            String nombreAnterior = nodoSeleccionado.toString();

            int confirmacion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de renombrar '" + nombreAnterior + "'?", "Confirmar Renombrar", JOptionPane.YES_NO_OPTION);

            if (confirmacion == JOptionPane.YES_OPTION) {
                String nuevoNombre = JOptionPane.showInputDialog(null, "Ingrese el nuevo nombre para '" + nombreAnterior + "':", "Renombrar", JOptionPane.PLAIN_MESSAGE);

                if (nuevoNombre != null && !nuevoNombre.isEmpty()) {
                    directoriosController.renombrarArchivoODirectorio(nombreAnterior, nuevoNombre);

                    // Actualizar el nombre del nodo en el árbol
                    nodoSeleccionado.setUserObject(nuevoNombre);
                    DefaultTreeModel modelo = (DefaultTreeModel) jTree.getModel();
                    modelo.nodeChanged(nodoSeleccionado);
                } else {
                    JOptionPane.showMessageDialog(null, "No se ingresó un nombre válido.");
                }
            }
        }
        activoRenombrar = false;
    }//GEN-LAST:event_menuItemRenombrarActionPerformed

    private void btnMostrarInformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarInformacionActionPerformed
        TreePath selectionPath = jTree.getSelectionPath();

        if (selectionPath != null) {
            DefaultMutableTreeNode nodoSeleccionado = (DefaultMutableTreeNode) selectionPath.getLastPathComponent();
            String ruta = obtenerRutaCompletaDesdeNodo(nodoSeleccionado);
            File archivo = new File(ruta);

            if (archivo.exists()) {
                StringBuilder informacion = new StringBuilder();

                informacion.append("Información:\n");
                informacion.append("Path absoluto: ").append(archivo.getAbsolutePath()).append("\n");
                informacion.append("Tamaño del archivo: ").append(archivo.length()).append(" bytes\n");
                informacion.append("Permisos de lectura: ").append(archivo.canRead()).append("\n");
                informacion.append("Permisos de escritura: ").append(archivo.canWrite()).append("\n");
                informacion.append("Fecha de última modificación: ").append(new Date(archivo.lastModified())).append("\n");

                jAreaInformacion.setText(informacion.toString());
            } else {
                jAreaInformacion.setText("El archivo o directorio no existe.");
            }
        }
    }//GEN-LAST:event_btnMostrarInformacionActionPerformed

    private void menuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuItemSalirActionPerformed

    private void actualizar(File fichero) {
        txtRuta.setText(fichero.getAbsolutePath());
        root = new DefaultMutableTreeNode(fichero.getName());
        modelo = new DefaultTreeModel(root);

        crea(root, fichero);

        jTree.setModel(modelo);
    }

    private void crea(DefaultMutableTreeNode nodo, File carpeta) {
        File[] archivos = carpeta.listFiles();
        if (archivos != null) {
            int contador = 0;
            for (File archivo : archivos) {
                DefaultMutableTreeNode hijo = new DefaultMutableTreeNode(archivo.getName());
                modelo.insertNodeInto(hijo, nodo, contador);
                contador++;
                if (archivo.isDirectory()) {
                    crea(hijo, archivo);
                }
            }
        } else {
        }
    }

    private void actualizarJTree(DefaultMutableTreeNode nodoPadre) {
        DefaultTreeModel modelo = (DefaultTreeModel) jTree.getModel();
        modelo.reload(nodoPadre);
    }

    private String obtenerRutaCompletaDesdeNodo(DefaultMutableTreeNode nodo) {
        StringBuilder rutaCompleta = new StringBuilder();
        while (nodo != null) {
            Object objeto = nodo.getUserObject();
            if (objeto instanceof String) {
                String nombre = (String) objeto;
                rutaCompleta.insert(0, nombre);
                rutaCompleta.insert(0, "/");
            }

            nodo = (DefaultMutableTreeNode) nodo.getParent();
        }
        System.out.println(rutaCompleta.toString());
        return rutaCompleta.toString();
    }

    private String convertirTamaño(long tamañoBytes) {
        final int KILOBYTE = 1024;
        final String[] UNIDADES = {"bytes", "KB", "MB", "GB", "TB"};

        if (tamañoBytes <= 0) {
            return "0 bytes";
        }

        int exponente = (int) (Math.log(tamañoBytes) / Math.log(KILOBYTE));
        double tamañoConvertido = tamañoBytes / Math.pow(KILOBYTE, exponente);

        return String.format("%.2f %s", tamañoConvertido, UNIDADES[exponente]);
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
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnListarArchivos;
    private javax.swing.JButton btnListarArchivosOcultos;
    private javax.swing.JButton btnListarDirectorios;
    private javax.swing.JButton btnListarDirectoriosOcultos;
    private javax.swing.JButton btnListarTodo;
    private javax.swing.JButton btnMostrarInformacion;
    private javax.swing.JButton bttnSeleccionarRuta;
    private javax.swing.JFileChooser fileseleccionarCarpeta;
    private javax.swing.JTextArea jAreaInformacion;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTree jTree;
    private javax.swing.JMenu menuGestionar;
    private javax.swing.JMenuItem menuItemCrear;
    private javax.swing.JMenuItem menuItemEliminar;
    private javax.swing.JMenuItem menuItemRenombrar;
    private javax.swing.JMenuItem menuItemSalir;
    private javax.swing.JTextField txtRuta;
    // End of variables declaration//GEN-END:variables
}
