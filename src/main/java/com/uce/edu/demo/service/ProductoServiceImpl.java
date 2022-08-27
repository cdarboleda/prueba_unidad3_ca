package com.uce.edu.demo.service;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.IProductoRepository;
import com.uce.edu.demo.repository.modelo.Producto;
import com.uce.edu.demo.repository.modelo.ProductoTo;

@Service
public class ProductoServiceImpl implements IProductoService {

	private static final Logger logger = Logger.getLogger(ProductoServiceImpl.class);
	
	@Autowired
	private IProductoRepository productoRepository;
	
	@Override
	@Transactional(value = TxType.REQUIRED)
	public void ingresarProducto(Producto producto) {
		
		Producto productoDB = this.productoRepository.buscar(producto.getCodigoBarras());
		if(productoDB==null) {
			logger.info("Inserción por primera vez de producto: "+ producto.getNombre());
			this.productoRepository.insertar(producto);
		}else {
			logger.info("Actualizando stock del producto: "+producto.getNombre());
			Integer stockFinal =productoDB.getStock()+producto.getStock();
			this.productoRepository.actualizarStock(producto.getCodigoBarras(),stockFinal);
		}	
	}

	@Override
	@Transactional(value = TxType.REQUIRED)
	public Integer controlarStock(String codigoBarras, Integer cantidad) {
		// TODO Auto-generated method stub
		Producto productoDB=this.productoRepository.buscar(codigoBarras);
		Integer stockActual = productoDB.getStock();
		Integer cantidadComprada = cantidad;
		if(productoDB==null || stockActual==0) {
			throw new RuntimeException();
		}
		else if(cantidad<=stockActual) {
			stockActual = stockActual-cantidad;
			this.productoRepository.actualizarStock(codigoBarras, stockActual);
		}else {
			cantidadComprada = stockActual;
			stockActual = stockActual-stockActual;//0
			this.productoRepository.actualizarStock(codigoBarras, stockActual);
		}

		return cantidadComprada;
	}
	
	@Override
	//@Transactional(value = TxType.NOT_SUPPORTED)
	public Producto consultarStock(String codigoBarras) {
		return this.productoRepository.consultarStock(codigoBarras);
	}

}
