package ru.netology.exceptions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShopRepositoryTest {
    @Test
    public void shouldShopRepositoryTestFounded() {
        ShopRepository repo = new ShopRepository();
        Product product1 = new Product(11, "phone", 30000);
        Product product2 = new Product(13, "book", 300);
        Product product3 = new Product(15, "car", 300000);

        repo.add(product1);
        repo.add(product2);
        repo.add(product3);
        repo.remove(13);

        Product[] actual = repo.findAll();
        Product[] expected = {product1, product3};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShopRepositoryTestNotFounded() {
        ShopRepository repo = new ShopRepository();
        Product product1 = new Product(11, "phone", 30000);
        Product product2 = new Product(13, "book", 300);
        Product product3 = new Product(15, "car", 300000);

        repo.add(product1);
        repo.add(product2);
        repo.add(product3);
        Assertions.assertThrows(NotFoundExceptions.class, () -> repo.remove(1234));
    }

}