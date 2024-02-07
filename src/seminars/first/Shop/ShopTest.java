package seminars.first.Shop;

import static org.assertj.core.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;

public class ShopTest {

    /*
   1. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов (правильное количество продуктов, верное содержимое корзины).
   2. Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
   3. Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность сортировки).
   */

    public static void main(String[] args) {
        Shop shop = new Shop();
        List<Product> productList = new ArrayList<>();
        List<Product> testList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Product product = new Product();
            product.setTitle("Product(" + i + ")");
            product.setCost(4 - i);
            productList.add(product);

            //Sorted test list of Products
            Product testProduct = new Product();
            testProduct.setTitle("Product(" + i + ")");
            testProduct.setCost(i);
            testList.add(testProduct);
        }
        shop.setProducts(productList);
        shop.sortProductsByPrice();
        assertThat(shop.getProducts().stream().map(Product::getCost).toArray())
                .isEqualTo(testList.stream().map(Product::getCost).toArray());
    }

}