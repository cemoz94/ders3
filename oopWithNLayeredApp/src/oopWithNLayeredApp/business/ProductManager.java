package oopWithNLayeredApp.business;



import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {//sadece interface e bağlıyız şu an loosely coupled
	private ProductDao productDao;
	private Logger[] loggers;   //sistem yazacağız hepsi loglansın
	
	
	public ProductManager(ProductDao productDao, Logger[] loggers) {
		this.productDao = productDao;
		this.loggers = loggers;
	}

	public void add(Product product)throws Exception {
		//bu e-mail var yazısı için iş kurallar
		if(product.getUnitPrice()<10) {
			throw new Exception("Ürün fiyatı 10'dan küçük olamaz");
		}
		productDao.add(product);
		
		for (Logger logger : loggers) { //önce db, mail yolladın array bunlar. Önce db çalışır sonra mail log u çalışır
			logger.log(product.getName());
		}
	}
}
