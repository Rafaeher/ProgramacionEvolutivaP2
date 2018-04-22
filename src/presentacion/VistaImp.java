package presentacion;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.ProgressMonitor;

import org.math.plot.Plot2DPanel;

public class VistaImp extends Vista {

	private  PanelInfo panelInfo;
	//private  Textos textos;
	private  JFrame frame;
	private  Plot2DPanel plot ;
	
	public VistaImp(){
		frame = new JFrame();
		frame.setTitle("Programaci�n Evolutiva");
		frame.setSize(1200, 900);
		panelInfo = new PanelInfo();
		frame.setLayout(new BorderLayout());
		frame.add(panelInfo, BorderLayout.WEST);

		grafica();
		
		frame.setVisible(true);
	}
	private void grafica() {

		// Para crear un panel
		plot = new Plot2DPanel();
		//plot.setBackground(new java.awt.Color(187, 212, 238));
		// Para a�adir la leyenda abajo
		plot.addLegend("SOUTH");
		// Para a�adir lineas
		
		// Tambien se puede hacer con una matriz
		//plot.addLinePlot("my plot", x, y);
		// Para eliminar las herramientas que salen arriba
		plot.plotToolBar.removeAll();
		// Lo a�ado al jframe
		frame.add(plot, BorderLayout.CENTER);
	}
	@Override
	public void repintaGrafica(double[] x_generaciones, double[] y_mejorPoblacion,
			double[] y_mejorAbsoluto,double[] y_media, String mensaje) {
		double aux = y_media[2] ;
		y_media[0] = aux;
		y_mejorPoblacion[0] = aux;
		y_mejorAbsoluto[0] = aux;
		plot.removeAllPlots();
		plot.addLegend("SOUTH");
		plot.addLinePlot("Mejor absoluto", x_generaciones, y_mejorAbsoluto);
		plot.addLinePlot("Mejor de la generaci�n", x_generaciones, y_mejorPoblacion);
		plot.addLinePlot("Media de la poblaci�n", x_generaciones, y_media);
		this.panelInfo.setTexto(mensaje);
	}
	@Override
	public void pintaProgreso(int num) {
		
		this.panelInfo.setProgress(num);
		this.frame.repaint();
//		this.frame.repaint();
		panelInfo.repaint();
	}
	
}
