package com.uce.edu.demo;

import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.repository.modelo.Producto;
import com.uce.edu.demo.repository.modelo.VentaReporte;
import com.uce.edu.demo.service.IProductoService;
import com.uce.edu.demo.service.IVentaService;

@SpringBootApplication
public class PruebaUnidad3CaApplication implements CommandLineRunner{

	@Autowired
	private IProductoService productoService;
	
	@Autowired
	private IVentaService ventaService;
	
	private static final Logger logger = Logger.getLogger(PruebaUnidad3CaApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(PruebaUnidad3CaApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		//Base de datos
		/*
		Producto prod2 = new Producto();
		prod2.setCategoria("Enlatados");
		prod2.setCodigoBarras("124");
		prod2.setNombre("Atún");
		prod2.setPrecio(new BigDecimal(2));
		prod2.setStock(15);
		
		//this.productoService.ingresarProducto(prod2);
		
		Producto prod3 = new Producto();
		prod3.setCategoria("Cereales");
		prod3.setCodigoBarras("125");
		prod3.setNombre("Pastas");
		prod3.setPrecio(new BigDecimal(3));
		prod3.setStock(46);
		
		//this.productoService.ingresarProducto(prod3);
		
		Producto prod4 = new Producto();
		prod4.setCategoria("Frutas");
		prod4.setCodigoBarras("127");
		prod4.setNombre("Peras");
		prod4.setPrecio(new BigDecimal(1));
		prod4.setStock(39);
		
		this.productoService.ingresarProducto(prod4);*/
		
//		//a) Ingresar dos veces un producto (para ver si se actualiza el stock)
//		logger.info("a) Ingresar dos veces un producto (para ver si se actualiza el stock");
//		Producto prod = new Producto();
//		prod.setCategoria("Embutidos");
//		prod.setCodigoBarras("123");
//		prod.setNombre("Carne de Res");
//		prod.setPrecio(new BigDecimal(5));
//		prod.setStock(21);
//		
//		this.productoService.ingresarProducto(prod);
		
//		Producto prod1 = new Producto();
//		prod1.setCategoria("Embutidos");
//		prod1.setCodigoBarras("123");
//		prod1.setNombre("Carne de Res");
//		prod1.setPrecio(new BigDecimal(5));
//		prod1.setStock(21);
//		
//		this.productoService.ingresarProducto(prod1);
		
		//b) Realizar una  venta con un producto
//		logger.info("b) Realizar una  venta con un producto");
//		ProductoRealizarVenta prodRV1 = new ProductoRealizarVenta();
//		prodRV1.setCodigoBarras("124");
//		prodRV1.setCantidad(20);//Comprar 20 atunes
//		ProductoRealizarVenta prodRV2 = new ProductoRealizarVenta();
//		prodRV2.setCodigoBarras("125");
//		prodRV2.setCantidad(15);//Comprar 15 Pastas
//		ProductoRealizarVenta prodRV3 = new ProductoRealizarVenta();
//		prodRV3.setCodigoBarras("127");
//		prodRV3.setCantidad(30);//Comprar 30 Peras
//
//		List<ProductoRealizarVenta> listaProductos = Arrays.asList(prodRV1,prodRV2,prodRV3);
//		this.ventaService.realizarVenta("V001", "1751146786", listaProductos);
		
		//c) Consultar un producto a partir de su codigo de barras
//		Producto prodConsStock = this.productoService.consultarStock("123");
//		logger.info(prodConsStock.toString());
		
		//d) Imprimir todos los reportes, (Entregar los reportes listos para ser impresos)
//		List<VentaReporte> listaReporte= this.ventaService.reporteVentas(LocalDateTime.of(2022, 8,27,0,0), "Enlatados" , 50);
//		for(VentaReporte v: listaReporte) {
//			logger.info(v.toString());
//		}
		
	}

}
