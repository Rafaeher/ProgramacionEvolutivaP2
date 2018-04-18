package presentacion;

import javax.swing.JOptionPane;

import configuracion.Configuracion;
import configuracion.Genotipo_enum;
import configuracion.Mutacion_enum;
import configuracion.Reproduccion_enum;
import configuracion.Seleccion_enum;

/**
 *
 * @author carlo
 */
public class PanelInfo extends javax.swing.JPanel {

	/**
	 * Creates new form NewJPanel
	 */
	public PanelInfo() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
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
		jLabelProbMutacion = new javax.swing.JLabel();
		jTextFieldProbMutacion = new javax.swing.JTextField();
		jTextFieldElite = new javax.swing.JTextField();
		jLabelElite = new javax.swing.JLabel();
		jScrollPane3 = new javax.swing.JScrollPane();
		jTextArea3 = new javax.swing.JTextArea();
		jScrollPane4 = new javax.swing.JScrollPane();
		jTextArea4 = new javax.swing.JTextArea();
		jButtonRun = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();
		jTextFieldNGramas = new javax.swing.JTextField();
		jComboBoxMutacion = new javax.swing.JComboBox<>();
		jLabelSeleccion1 = new javax.swing.JLabel();
		jComboBoxFitness = new javax.swing.JComboBox<>();
		jProgressBar1 = new javax.swing.JProgressBar();

		setAutoscrolls(true);
		setPreferredSize(new java.awt.Dimension(400, 200));

		jTextFieldPoblacion.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
		jTextFieldPoblacion.setToolTipText("Introduce el tama�o de la poblacion (valor entero)");
		jTextFieldPoblacion.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextFieldPoblacionActionPerformed(evt);
			}
		});

		jLabelPoblacion.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
		jLabelPoblacion.setText("Tama�o de la poblacion");

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
		jComboBoxSeleccion.setModel(
				new javax.swing.DefaultComboBoxModel<>(new String[] { "Ruleta", "Estocastica", "Truncamiento" }));
		jComboBoxSeleccion.setToolTipText("Elige un m�todo de seleccion");
		jComboBoxSeleccion.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jComboBoxSeleccionActionPerformed(evt);
			}
		});

		jComboBoxCruce.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
		jComboBoxCruce.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PMX", "Ordinal" }));
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

		jLabelProbMutacion.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
		jLabelProbMutacion.setText("Prob Mutacion");

		jTextFieldProbMutacion.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
		jTextFieldProbMutacion.setToolTipText("Selecciona un porcentaje de cruce");
		jTextFieldProbMutacion.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextFieldProbMutacionActionPerformed(evt);
			}
		});

		jTextFieldElite.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
		jTextFieldElite.setToolTipText("Selecciona un porcentaje de cruce");
		jTextFieldElite.addActionListener(new java.awt.event.ActionListener() {
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

		jLabel1.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
		jLabel1.setText("NGramas");

		jComboBoxMutacion.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
		jComboBoxMutacion.setModel(new javax.swing.DefaultComboBoxModel<>(
				new String[] { "Intercambio", "Insercion", "Inversion", "Nuestra", "Heuristica" }));
		jComboBoxMutacion.setToolTipText("Selecciona un mecanismo de cruce");
		jComboBoxMutacion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
		jComboBoxMutacion.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jComboBoxMutacionActionPerformed(evt);
			}
		});

		jLabelSeleccion1.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
		jLabelSeleccion1.setText("Fitness");

		jComboBoxFitness.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
		jComboBoxFitness
				.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Palabras", "Ngramas", "Otro" }));
		jComboBoxFitness.setToolTipText("Elige un m�todo de seleccion");
		jComboBoxFitness.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jComboBoxFitnessActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addGap(173, 173, 173).addComponent(jButtonRun)
								.addGap(18, 18, 18)
								.addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(jScrollPane3)
										.addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.TRAILING, false)
												.addGroup(layout
														.createSequentialGroup()
														.addComponent(jTextFieldProbMutacion,
																javax.swing.GroupLayout.PREFERRED_SIZE, 42,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
														.addComponent(jComboBoxMutacion, 0, 1, Short.MAX_VALUE))
												.addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout
														.createSequentialGroup()
														.addComponent(jTextFieldCruceporcentaje,
																javax.swing.GroupLayout.PREFERRED_SIZE, 45,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(jComboBoxCruce,
																0, javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE))
												.addGroup(layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(layout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING,
																		false)
																.addComponent(jLabelPoblacion)
																.addComponent(jLabelGeneraciones,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		Short.MAX_VALUE)
																.addComponent(jTextFieldGeneraciones)
																.addComponent(jTextFieldPoblacion))
														.addGroup(layout.createSequentialGroup()
																.addComponent(jLabelCruceporcentaje)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																.addComponent(jLabelCruce))
														.addComponent(
																jLabelProbMutacion)))
												.addGroup(layout.createParallelGroup(
														javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(layout.createSequentialGroup().addGap(100, 100, 100)
																.addGroup(layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																		.addGroup(layout.createSequentialGroup()
																				.addComponent(jLabel1)
																				.addGap(0, 0, Short.MAX_VALUE))
																		.addComponent(jTextFieldElite,
																				javax.swing.GroupLayout.Alignment.TRAILING,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				140,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jTextFieldNGramas,
																				javax.swing.GroupLayout.Alignment.TRAILING,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				140,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
														.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
																layout.createSequentialGroup()
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addGroup(layout
																				.createParallelGroup(
																						javax.swing.GroupLayout.Alignment.LEADING)
																				.addGroup(
																						javax.swing.GroupLayout.Alignment.TRAILING,
																						layout.createSequentialGroup()
																								.addGroup(layout
																										.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING)
																										.addComponent(
																												jLabelElite)
																										.addComponent(
																												jLabelSeleccion)
																										.addComponent(
																												jLabelSeleccion1))
																								.addGap(87, 87, 87))
																				.addComponent(jComboBoxSeleccion,
																						javax.swing.GroupLayout.Alignment.TRAILING,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						140,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(jComboBoxFitness,
																						javax.swing.GroupLayout.Alignment.TRAILING,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						140,
																						javax.swing.GroupLayout.PREFERRED_SIZE))))))
								.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addContainerGap()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(jLabelPoblacion).addComponent(jLabelSeleccion))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(jTextFieldPoblacion, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(jComboBoxSeleccion, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(jLabelGeneraciones).addComponent(jLabelSeleccion1))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(jTextFieldGeneraciones, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(jComboBoxFitness, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(jLabelCruceporcentaje).addComponent(jLabelElite).addComponent(jLabelCruce))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(jTextFieldCruceporcentaje, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(jTextFieldElite, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(jComboBoxCruce, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(jLabelProbMutacion).addComponent(jLabel1))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
								.addComponent(jTextFieldNGramas, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(1, 1, 1))
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jTextFieldProbMutacion, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jComboBoxMutacion, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
				.addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 150,
						javax.swing.GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 151,
						javax.swing.GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
						.addComponent(jButtonRun, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addContainerGap(12, Short.MAX_VALUE)));
		cosasPorDefecto();
	}// </editor-fold>

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

	private void jTextFieldProbMutacionActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jTextFieldProbMutacion1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jComboBoxMutacionActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jComboBoxFitnessActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void cosasPorDefecto() {
		this.jProgressBar1.setVisible(false);
		this.jTextFieldNGramas.setText("0");
		this.jTextFieldPoblacion.setText("100");
		this.jTextFieldCruceporcentaje.setText("60");
		this.jTextFieldGeneraciones.setText("100");
		this.jTextFieldProbMutacion.setText("5");
		this.jTextFieldElite.setText("2");
		String texto3 = "GNX NVMVNL XP G QUEVNLV NGSCV PM WYZGS GOXUEUXUVL US ONVGXUSC EULYGT,";
		texto3 += "GYQUXPNH PN KVNMPNZUSC GNXUMGOXL. XWVLV GNXFPNBL VJKNVLL XWV GYXWPN'L UZGCU";
		texto3 += "SGXUEV PN XVOWSUOGT LBUTT. GNX UL USXVSQVQ XP IV GKKNVOUGXVQ MPN UXL IVGYXH";
		texto3 += " PN VZPXUPSGT KPFVN. US XWVUN ZPLX CVSVNGT MPNZ XWVLV GOXUEUXUVL USOTYQV XW";
		texto3 += "V KNPQYOXUPS PM FPNBL PM GNX, XWV ONUXUOULZ PM GNX, XWV LXYQH PM XWV WULXPN";
		texto3 += "H PM GNX, GSQ XWV GVLXWVXUO QULLVZUSGXUPS PM GNX. GNX WGL WGQ G CNVGX SYZIV";
		texto3 += "N PM QUMMVNVSX MYSOXUPSL XWNPYCWPYX UXL WULXPNH, ZGBUSC UXL KYNKPLV QUMMUOY";
		texto3 += "TX XP GILXNGOX PN RYGSXUMH XP GSH LUSCTV OPSOVKX. XWUL QPVL SPX UZKTH XWGX ";
		texto3 += "XWV KYNKPLV PM GNX UL EGCYV, IYX XWGX UX WGL WGQ ZGSH YSURYV, QUMMVNVSX N";
		texto3 += "VGLPSL MPN IVUSC ONVGXVQ. GNX OGS WGEV G KVNLPSGT MYSOXUPS, UX UL GS VJKNVL";
		texto3 += "LUPS PM IGLUO WYZGS USLXUSOX MPN WGNZPSH, IGTGSOV, NWHXWZ. GNX GX XWUL TVEV";
		texto3 += "T UL SPX GS GOXUPS PN GS PIDVOX, IYX GS USXVNSGT GKKNVOUGXUPS PM IGTGSOV GS";
		texto3 += "Q WGNZPSH (IVGYXH), GSQ XWVNVMPNV GS GLKVOX PM IVUSC WYZGS IVHPSQ YXUTUXH. ";
		texto3 += "GNX GTLP KNPEUQVL G FGH XP VJKVNUVSOV PSV'L LVTM US NVTGXUPS XP XWV YSUEVNL";
		texto3 += "V. XWUL VJKVNUVSOV ZGH PMXVS OPZV YSZPXUEGXVQ, GL PSV GKKNVOUGXVL GNX, ZYLU";
		texto3 += "O PN KPVXNH. PS XWV PXWVN WGSQ GNX ZGH WGEV G LPOUGT MYSOXUPS. GX UXL LUZKT";
		texto3 += "VLX, GNX UL G MPNZ PM OPZZYSUOGXUPS. UX LVVBL XP VSXVNXGUS GSQ INUSC GIPYX ";
		texto3 += "G KGNXUOYTGN VZPXUPS PN ZPPQ, MPN XWV KYNKPLV PM NVTGJUSC PN VSXVNXGUSUSC X";
		texto3 += "WV EUVFVN. GNX ZGH GTLP IV GS VJKNVLLUPS PM LPOUGT KNPXVLX, LVVBUSC XP RYVL";
		texto3 += "XUPS GLKVOXL PM LPOUVXH. XWV PTQVLX MPNZ PM GNX GNV EULYGT GNXL, FWUOW USOT";
		texto3 += "YQV ONVGXUPS PM UZGCVL PN PIDVOXL US MUVTQL USOTYQUSC KGUSXUSC, LOYTKXYNV, ";
		texto3 += "KNUSXZGBUSC, KWPXPCNGKWH, GSQ PXWVN EULYGT ZVQUG. GNOWUXVOXYNV UL PMXVS USO";
		texto3 += "TYQVQ GL PSV PM XWV EULYGT GNXL; WPFVEVN, TUBV XWV QVOPNGXUEV GNXL, UX USEP";
		texto3 += "TEVL XWV ONVGXUPS PM PIDVOXL FWVNV XWV KNGOXUOGT OPSLUQVNGXUPSL PM YLV GNV ";
		texto3 += "VLLVSXUGT, US G FGH XWGX XWVH YLYGTTH GNV SPX US G KGUSXUSC, MPN VJGZKTV.";
		this.jTextArea3.setText(texto3);

		this.jTextArea3.setLineWrap(true);
		this.jTextArea3.setWrapStyleWord(true);
		this.jTextArea4.setLineWrap(true);
		this.jTextArea4.setWrapStyleWord(true);
	}

	private void jButtonRunActionPerformed(java.awt.event.ActionEvent evt) {
		if (this.jTextFieldPoblacion.getText().isEmpty() || jTextFieldGeneraciones.getText().isEmpty()
				|| jTextFieldCruceporcentaje.getText().isEmpty() || this.jTextFieldProbMutacion.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Error: Faltan datos", "error", JOptionPane.ERROR_MESSAGE);
		} else {
			// String tipo = (String) this.jComboBoxTipo.getSelectedItem();
			// this.tipo = tipo;
			int tamano_poblacion = Integer.parseInt(this.jTextFieldPoblacion.getText());
			int num_generaciones = Integer.parseInt(this.jTextFieldGeneraciones.getText());
			int ngramas = Integer.parseInt(this.jTextFieldNGramas.getText());
			String seleccion = (String) this.jComboBoxSeleccion.getSelectedItem();
			String cruce = (String) this.jComboBoxCruce.getSelectedItem();
			String mutacion = (String) this.jComboBoxMutacion.getSelectedItem();
			double cruceporcentaje = Double.parseDouble(this.jTextFieldCruceporcentaje.getText());
			double prob_mutacion = Double.parseDouble(this.jTextFieldProbMutacion.getText());
			int elite = Integer.parseInt(this.jTextFieldElite.getText());
			Seleccion_enum s = getSeleccion(seleccion);
			Reproduccion_enum r = getReproduccion(cruce);
			Genotipo_enum g = Genotipo_enum.ALFABETO;
			Mutacion_enum m = getMutacion(mutacion);
			this.jProgressBar1.setMaximum(num_generaciones);
			this.jProgressBar1.setMinimum(0);
			Configuracion c = new Configuracion(true, num_generaciones, prob_mutacion, r, m, s, g, cruceporcentaje,
					tamano_poblacion, elite, jTextArea3.getText().toLowerCase(), ngramas);

			Controlador controlador = new Controlador();
			// System.out.println("tama�o de la poblacion" + tamano_poblacion);
			controlador.execute(c);
		}
	}

	private Seleccion_enum getSeleccion(String s) {
		if (s.equalsIgnoreCase("Ruleta"))
			return Seleccion_enum.Ruleta;
		else if (s.equalsIgnoreCase("Estocastica"))
			return Seleccion_enum.Estocastica;
		else if (s.equalsIgnoreCase("Truncamiento"))
			return Seleccion_enum.Truncamiento;
		else if (s.equalsIgnoreCase("Torneo Deterministico"))
			return Seleccion_enum.Torneo_Deterministico;
		else if (s.equalsIgnoreCase("Torneo Probabilistico"))
			return Seleccion_enum.Torneo_Probabilistico;
		else
			return null;
	}

	private Reproduccion_enum getReproduccion(String s) {
		switch (s) {
		case "PMX":
			return Reproduccion_enum.PMX;
		case "Ordinal":
			return Reproduccion_enum.CODIFICACION_ORDINAL;
		default:
			return null;
		}
	}

	private Mutacion_enum getMutacion(String s) {
		switch (s) {
		case "Insercion":
			return Mutacion_enum.INSERCION;
		case "Intercambio":
			return Mutacion_enum.INTERCAMBIO;
		case "Inversion":
			return Mutacion_enum.INVERSION;
		case "Nuestra":
			return Mutacion_enum.MUTACION_HIBRIDA;
		case "Heuristica":
			return Mutacion_enum.HEURISTICA;
		default:
			return null;
		}

	}

	public void setTexto(String texto) {
		this.jTextArea4.setText(texto);

	}

	public void setProgress(int num) {
		this.jProgressBar1.setValue(num);
		this.jProgressBar1.repaint();
	}

	// Variables declaration - do not modify
	private javax.swing.JButton jButtonRun;
	private javax.swing.JComboBox<String> jComboBoxCruce;
	private javax.swing.JComboBox<String> jComboBoxFitness;
	private javax.swing.JComboBox<String> jComboBoxMutacion;
	private javax.swing.JComboBox<String> jComboBoxSeleccion;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabelCruce;
	private javax.swing.JLabel jLabelCruceporcentaje;
	private javax.swing.JLabel jLabelElite;
	private javax.swing.JLabel jLabelGeneraciones;
	private javax.swing.JLabel jLabelPoblacion;
	private javax.swing.JLabel jLabelProbMutacion;
	private javax.swing.JLabel jLabelSeleccion;
	private javax.swing.JLabel jLabelSeleccion1;
	private javax.swing.JProgressBar jProgressBar1;
	private javax.swing.JScrollPane jScrollPane3;
	private javax.swing.JScrollPane jScrollPane4;
	private javax.swing.JTextArea jTextArea3;
	private javax.swing.JTextArea jTextArea4;
	private javax.swing.JTextField jTextFieldCruceporcentaje;
	private javax.swing.JTextField jTextFieldGeneraciones;
	private javax.swing.JTextField jTextFieldNGramas;
	private javax.swing.JTextField jTextFieldPoblacion;
	private javax.swing.JTextField jTextFieldProbMutacion;
	private javax.swing.JTextField jTextFieldElite;
	// End of variables declaration
}
