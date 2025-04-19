interface Category {}

enum BookCategory implements Category {
    FICTION, NON_FICTION, SCIENCE
}

enum ClothingCategory implements Category {
    MEN, WOMEN, KIDS
}

enum GadgetCategory implements Category {
    MOBILE, LAPTOP, ACCESSORY
}

class Product<T extends Category> {
    String name;
    double price;
    T category;

    Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    double getPrice() {
        return price;
    }

    void setPrice(double price) {
        this.price = price;
    }

    String getName() {
        return name;
    }

    T getCategory() {
        return category;
    }
}

class ProductCatalog {
    <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double discountedPrice = product.getPrice() - product.getPrice() * (percentage / 100);
        product.setPrice(discountedPrice);
    }
}

public class gn2 {
    public static void main(String[] args) {
        Product<BookCategory> book = new Product<>("Java Basics", 45.0, BookCategory.SCIENCE);
        Product<ClothingCategory> jeans = new Product<>("Denim Jeans", 60.0, ClothingCategory.MEN);
        Product<GadgetCategory> laptop = new Product<>("Gaming Laptop", 1200.0, GadgetCategory.LAPTOP);

        ProductCatalog catalog = new ProductCatalog();
        catalog.applyDiscount(book, 10);
        catalog.applyDiscount(jeans, 20);
        catalog.applyDiscount(laptop, 5);

        System.out.println(book.getName() + " - " + book.getPrice());
        System.out.println(jeans.getName() + " - " + jeans.getPrice());
        System.out.println(laptop.getName() + " - " + laptop.getPrice());
    }
}

