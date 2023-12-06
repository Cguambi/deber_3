package com.distribuida.principal;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.distribuida.entities.Autor;
import com.distribuida.entities.Categoria;
import com.distribuida.entities.Cliente;
import com.distribuida.entities.DatosLibreria;
import com.distribuida.entities.DetalleFactura;
import com.distribuida.entities.Factura;
import com.distribuida.entities.Libro;

public class Principal {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		Autor autor = context.getBean("autor",Autor.class);
		Categoria categoria = context.getBean("categoria",Categoria.class);
		Cliente cliente = context.getBean("cliente",Cliente.class);
		DetalleFactura detalleFactura = context.getBean("detalleFactura",DetalleFactura.class);
		Factura factura = context.getBean("factura",Factura.class);
		Libro libro = context.getBean("libro",Libro.class);
		DatosLibreria datosLibreria =context.getBean("datosLibreria",DatosLibreria.class);

		//Datos Cliente		
	    cliente.setIdCliente(1);
	    cliente.setCedula(1728175108);
	    cliente.setNombre("PAMELO");
	    cliente.setApellido("COSTANCIO");
	    cliente.setDireccion("LARCACHACA");
	    cliente.setTelefono("9874563210");
	    cliente.setCorreo("pamalarca@gmail.com");
	    
	//Datos Libro
	    libro.setIdLibro(5);
	    libro.setTitulo("Mas alla del infierno volumen 666");
	    libro.setEditorial("s‎atanas.com");
	    
	    libro.setEdicion("100 edición");
	    libro.setIdioma("Español");
	    libro.setFechaPublicacion("1 Enero 1889");
	    libro.setDescripcion("Libro de historia de magia y fantasia");
	    libro.setTipoPasta("Pasta Semi Dura");
	    libro.setIsbn("ISBN-10: ‎8498387094");
	    libro.setNumEjemplares(3);
	    libro.setPortada("A Color y  B/N");
	    libro.setPresentacion(null);
	    libro.setPrecio(15.01);
	    
	 //Autor
	    autor.setIdAutor(3);
	    autor.setNombreAutor("lUCIFER");
	    autor.setApellidoAutor("SALAMANDRO​");
	    autor.setPais("UNGRIA");
	    autor.setDireccion("ESPAÑA");
	    autor.setTelefono("023645128");
	    autor.setCorreo("autor@outlook.com");
	    
	 //Categoria
	    categoria.setIdCategoria(1);
	    categoria.setCategoria("Fantasia");
	    categoria.setDescripcion("Fantasia y magia");
	    
	 //Factura
	    factura.setIdFactura(2);
	    factura.setNumFactura("Factura 066");
	    factura.setFecha("6/12/2023");
	    factura.setTotalNeto(11.36);
	    factura.setIva(0);
	    factura.setTotal(11.36);

	 //DetalleFactura
	    detalleFactura.setIdDetalleFcatura(1);
	    detalleFactura.setCantidad(2);
	    detalleFactura.setSubtotal(22.72);
	    
	 //Imprimer los datos 
	    System.out.println(cliente.toString());
	    System.out.println(libro.toString());
	    System.out.println(autor.toString());
	    System.out.println(categoria.toString());
	    System.out.println(factura.toString());
	    System.out.println(detalleFactura.toString());
	    
	    System.out.println(datosLibreria.toString());

	    context.close();
	}

}
