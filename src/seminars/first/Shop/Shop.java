package seminars.first.Shop;

import java.util.Comparator;
import java.util.List;

public class Shop {
    private List<Product> products;

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    // Метод должен вернуть отсортированный по возрастанию по цене список продуктов
    public void sortProductsByPrice() {
        products.sort(Comparator.comparingInt(Product::getCost));
    }

    // Метод должен вернуть самый дорогой продукт
    public Product getMostExpensiveProduct() {
        return products.stream().max(Comparator.comparingInt(Product::getCost)).orElse(null);
    }
}