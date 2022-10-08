package oopWithNLayeredApp.dataAccess;
//ilk bunla başlarız her zaman olası yöntem değişikliğine gidişe karşı
import oopWithNLayeredApp.entities.Product;
//productdao ile ilgili olan alternatifler/yöntemler şöyle bir operasyon içerebilmelidir
public interface ProductDao {
	void add(Product product);

}
