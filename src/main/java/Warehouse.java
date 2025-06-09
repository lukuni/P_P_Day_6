import java.util.ArrayList;
import java.util.List;

/**
 * Агуулахын мэдээллийг хадгалах класс.
 * Агуулах нь олон байршил (Location) -ыг агуулна.
 */
public class Warehouse {
    /** Агуулахын нэр */
    String name;

    /** Агуулах дахь байршлуудын жагсаалт */
    List<Location> locations;

    /**
     * Шинэ агуулах үүсгэх конструктор.
     * 
     * @param name Агуулахын нэр
     */
    public Warehouse(String name) {
        this.name = name;
        this.locations = new ArrayList<>();
    }

    /**
     * Агуулахад шинэ байршил нэмнэ.
     * 
     * @param loc Нэмэх байршил
     */
    public void addLocation(Location loc) {
        locations.add(loc);
    }

    /**
     * Агуулах дахь байршлуудыг буцаана.
     * 
     * @return байршлуудын жагсаалт
     */
    public List<Location> getLocations() {
        return locations;
    }

    /**
     * Агуулахын нэрийг буцаана.
     * 
     * @return агуулахын нэр
     */
    public String toString() {
        return name;
    }
}
