package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;
//dao data access object
public class JdbcProductDao implements ProductDao{//product dao'dan alıyor demek oluyor
	public void add(Product product) {
		//sadece ve sadece db erişim kodları buraya yazılır... SQL bilmek lazım
		System.out.println("JDBC ile veritabanına eklendi");
	}
}

//yeni sistem geldi hibernate. buna geçilecek