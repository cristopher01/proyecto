package clases;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.net.URL;

import javax.imageio.ImageIO;


public class dibuja extends Canvas{
	BufferedImage imagen;
	public void paint(Graphics grafico){
		setBackground(Color.white);
		imagen = cargarimagen("../arbol java.jpg");
		grafico.drawImage(imagen, 100, 100,this);
	}
	public BufferedImage cargarimagen(String imagen){
		try{
			URL ruta = getClass().getResource(imagen);
			BufferedImage temp_image = ImageIO.read(ruta);
			return temp_image;
		}catch(Exception e){
			System.out.println("no se pudo cargar la imagen");
			return null;
		}
	}
}