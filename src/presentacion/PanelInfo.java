package presentacion;



/**
 *
 * @author carlo
 */
public class PanelInfo extends javax.swing.JPanel{
/**
 * Creates new form NewJPanel
 */
	 /**
     * Creates new form NewJPanel
     */
    public PanelInfo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jTextFieldPoblacion = new javax.swing.JTextField();
        jLabelPoblacion = new javax.swing.JLabel();
        jLabelGeneraciones = new javax.swing.JLabel();
        jTextFieldGeneraciones = new javax.swing.JTextField();
        jLabelSeleccion = new javax.swing.JLabel();
        jComboBoxSeleccion = new javax.swing.JComboBox<>();
        jComboBoxCruce = new javax.swing.JComboBox<>();
        jLabelCruce = new javax.swing.JLabel();
        jLabelCruceporcentaje = new javax.swing.JLabel();
        jTextFieldCruceporcentaje = new javax.swing.JTextField();
        jTextFieldError = new javax.swing.JTextField();
        jLabelPrecisión = new javax.swing.JLabel();
        jLabelProbMutacion = new javax.swing.JLabel();
        jTextFieldProbMutacion = new javax.swing.JTextField();
        jTextFieldProbMutacion1 = new javax.swing.JTextField();
        jLabelElite = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jButtonRun = new javax.swing.JButton();

        setAutoscrolls(true);
        setPreferredSize(new java.awt.Dimension(400, 200));

        jTextFieldPoblacion.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jTextFieldPoblacion.setToolTipText("Introduce el tamaño de la poblacion (valor entero)");
        jTextFieldPoblacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPoblacionActionPerformed(evt);
            }
        });

        jLabelPoblacion.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabelPoblacion.setText("Tamaño de la poblacion");

        jLabelGeneraciones.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabelGeneraciones.setText("Numero de generaciones");

        jTextFieldGeneraciones.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jTextFieldGeneraciones.setToolTipText("Introduce el numero de generaciones (valor entero)");
        jTextFieldGeneraciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldGeneracionesActionPerformed(evt);
            }
        });

        jLabelSeleccion.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabelSeleccion.setText("Seleccion");

        jComboBoxSeleccion.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jComboBoxSeleccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ruleta", "Estocastica", "Truncamiento" }));
        jComboBoxSeleccion.setToolTipText("Elige un método de seleccion");
        jComboBoxSeleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSeleccionActionPerformed(evt);
            }
        });

        jComboBoxCruce.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jComboBoxCruce.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Un punto", "Varios puntos", "Uniforme" }));
        jComboBoxCruce.setToolTipText("Selecciona un mecanismo de cruce");
        jComboBoxCruce.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jComboBoxCruce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCruceActionPerformed(evt);
            }
        });

        jLabelCruce.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabelCruce.setText("Cruce");

        jLabelCruceporcentaje.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabelCruceporcentaje.setText("Cruce %");

        jTextFieldCruceporcentaje.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jTextFieldCruceporcentaje.setToolTipText("Selecciona un porcentaje de cruce");
        jTextFieldCruceporcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCruceporcentajeActionPerformed(evt);
            }
        });

        jTextFieldError.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jTextFieldError.setToolTipText("Selecciona un porcentaje de cruce");
        jTextFieldError.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldErrorActionPerformed(evt);
            }
        });

        jLabelPrecisión.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabelPrecisión.setText("Precision");

        jLabelProbMutacion.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabelProbMutacion.setText("Prob Mutacion");

        jTextFieldProbMutacion.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jTextFieldProbMutacion.setToolTipText("Selecciona un porcentaje de cruce");
        jTextFieldProbMutacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldProbMutacionActionPerformed(evt);
            }
        });

        jTextFieldProbMutacion1.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jTextFieldProbMutacion1.setToolTipText("Selecciona un porcentaje de cruce");
        jTextFieldProbMutacion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldProbMutacion1ActionPerformed(evt);
            }
        });

        jLabelElite.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabelElite.setText("Elite");

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jTextArea3.setAutoscrolls(false);
        jScrollPane3.setViewportView(jTextArea3);

        jTextArea4.setEditable(false);
        jTextArea4.setBackground(new java.awt.Color(239, 234, 234));
        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jTextArea4.setAutoscrolls(false);
        jScrollPane4.setViewportView(jTextArea4);

        jButtonRun.setText("Run");
        jButtonRun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRunActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelPoblacion)
                            .addComponent(jLabelGeneraciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldGeneraciones)
                            .addComponent(jTextFieldPoblacion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxSeleccion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelSeleccion)
                            .addComponent(jLabelCruce)
                            .addComponent(jComboBoxCruce, 0, 140, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextFieldProbMutacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(jTextFieldCruceporcentaje, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelElite)
                                .addComponent(jTextFieldError, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelPrecisión))
                            .addComponent(jTextFieldProbMutacion1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelCruceporcentaje, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelProbMutacion, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(jButtonRun)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPoblacion)
                    .addComponent(jLabelSeleccion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPoblacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxSeleccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelGeneraciones)
                    .addComponent(jLabelCruce))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldGeneraciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxCruce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCruceporcentaje)
                    .addComponent(jLabelPrecisión))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCruceporcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldError, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelProbMutacion)
                    .addComponent(jLabelElite))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldProbMutacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldProbMutacion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonRun)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        cosasPorDefecto();
    }// </editor-fold>                        

    private void cosasPorDefecto() {
		this.jTextFieldPoblacion.setText("100");
		this.jTextFieldCruceporcentaje.setText("60");
		this.jTextFieldGeneraciones.setText("100");
		this.jTextFieldProbMutacion.setText("5");
		this.jTextFieldError.setText("0.001");
		this.jTextFieldProbMutacion1.setText("2");
		
		this.jTextArea3.setLineWrap(true);
		this.jTextArea3.setWrapStyleWord(true);
		this.jTextArea4.setLineWrap(true);
		this.jTextArea4.setWrapStyleWord(true);
}
    
    private void jTextFieldPoblacionActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        // TODO add your handling code here:
    }                                                   

    private void jTextFieldGeneracionesActionPerformed(java.awt.event.ActionEvent evt) {                                                       
        // TODO add your handling code here:
    }                                                      

    private void jComboBoxSeleccionActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        // TODO add your handling code here:
    }                                                  

    private void jComboBoxCruceActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void jTextFieldCruceporcentajeActionPerformed(java.awt.event.ActionEvent evt) {                                                          
        // TODO add your handling code here:
    }                                                         

    private void jTextFieldErrorActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void jTextFieldProbMutacionActionPerformed(java.awt.event.ActionEvent evt) {                                                       
        // TODO add your handling code here:
    }                                                      

    private void jTextFieldProbMutacion1ActionPerformed(java.awt.event.ActionEvent evt) {                                                        
        // TODO add your handling code here:
    }                                                       

    private void jButtonRunActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          


    // Variables declaration - do not modify                     
    private javax.swing.JButton jButtonRun;
    private javax.swing.JComboBox<String> jComboBoxCruce;
    private javax.swing.JComboBox<String> jComboBoxSeleccion;
    private javax.swing.JLabel jLabelCruce;
    private javax.swing.JLabel jLabelCruceporcentaje;
    private javax.swing.JLabel jLabelElite;
    private javax.swing.JLabel jLabelGeneraciones;
    private javax.swing.JLabel jLabelPoblacion;
    private javax.swing.JLabel jLabelPrecisión;
    private javax.swing.JLabel jLabelProbMutacion;
    private javax.swing.JLabel jLabelSeleccion;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextField jTextFieldCruceporcentaje;
    private javax.swing.JTextField jTextFieldError;
    private javax.swing.JTextField jTextFieldGeneraciones;
    private javax.swing.JTextField jTextFieldPoblacion;
    private javax.swing.JTextField jTextFieldProbMutacion;
    private javax.swing.JTextField jTextFieldProbMutacion1;
    // End of variables declaration                   
}
