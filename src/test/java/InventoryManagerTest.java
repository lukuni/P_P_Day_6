import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * InventoryManager-ийн алдааны тохиолдлуудыг шалгах unit test.
 */
public class InventoryManagerTest {

    @Test
    public void testAddProductWithNegativePriceThrowsException() {
        InventoryManager manager = new InventoryManager();
        Exception e = assertThrows(IllegalArgumentException.class, () -> {
            manager.addProduct("Сүү", -500.0, 10, "Хүнс", "123456");
        });
        assertEquals("Үнэ сөрөг байж болохгүй.", e.getMessage());
    }

    @Test
    public void testAddProductWithNegativeQuantityThrowsException() {
        InventoryManager manager = new InventoryManager();
        Exception e = assertThrows(IllegalArgumentException.class, () -> {
            manager.addProduct("Талх", 500.0, -1, "Хүнс", "123456");
        });
        assertEquals("Тоо хэмжээ сөрөг байж болохгүй.", e.getMessage());
    }

    @Test
    public void testAddProductWithInvalidBarcodeThrowsException() {
        InventoryManager manager = new InventoryManager();
        Exception e = assertThrows(IllegalArgumentException.class, () -> {
            manager.addProduct("Гурил", 1000.0, 10, "Хүнс", "abc123");
        });
        assertEquals("Баркод 4-13 оронтой тоо байх ёстой.", e.getMessage());
    }

    @Test
    public void testAddProductWithTooManyQuantityThrowsException() {
        InventoryManager manager = new InventoryManager();
        Exception e = assertThrows(IllegalArgumentException.class, () -> {
            manager.addProduct("Кофе", 5000.0, 101, "Уух зүйл", "12345678");
        });
        assertEquals("Нэг бүтээгдэхүүний тоо хэмжээ 100-аас их байж болохгүй.", e.getMessage());
    }

    @Test
    public void testAddProductValid() {
        InventoryManager manager = new InventoryManager();
        manager.addProduct("Цай", 1200.0, 5, "Уух зүйл", "1234567890123");
        assertEquals(1, manager.getProducts().size());
    }
}
