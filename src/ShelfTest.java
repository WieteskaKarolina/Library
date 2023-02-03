import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


class ShelfTest {

    @Test
    void takeResourceTest() throws ShelfException {
        Shelf shelf = new Shelf(400);

        assertEquals("this shelf is empty", Assertions.assertThrows(ShelfException.class, shelf::takeResource).getMessage());

        shelf.putOnResource(new Resource<>(new Book("Juliusz Slowacki", "Kordian", 180)));

        Resource<?> testResource = shelf.resources.get(0);
        assertEquals(testResource, shelf.takeResource());
    }

    @Test
    void TakeResourceTest() throws ShelfException {
        Shelf shelf = new Shelf(400);

        assertEquals("this shelf is empty", Assertions.assertThrows(ShelfException.class, () -> shelf.takeResource(1)).getMessage());
        shelf.putOnResource(new Resource<>(new Book("Juliusz Slowacki", "Kordian", 180)));

        assertEquals("index is not correct", Assertions.assertThrows(ShelfException.class, () -> shelf.takeResource(1)).getMessage());
    }

    @Test
    void putOnResourceTest() throws ShelfException {
        Shelf shelf = new Shelf(400);

        shelf.putOnResource(new Resource<>(new Book("Juliusz Slowacki", "Kordian", 180)));

        assertEquals("you can not put this on the shelf - not suitable type of resource",
                Assertions.assertThrows(ShelfException.class, () -> shelf.putOnResource(new Resource<>(new Magazine()))).getMessage());

        assertEquals("you can not put this on the shelf - to less space",
                Assertions.assertThrows(ShelfException.class, () -> shelf.putOnResource(new Resource<>(new Book("Robin Cook", "Spiaczka", 300)))).getMessage());

    }

    @Test
    void PutOnResourceTest() throws ShelfException {
        Shelf shelf = new Shelf(400);

        shelf.putOnResource(0, new Resource<>(new Book("Juliusz Slowacki", "Kordian", 180)));

        assertEquals("you can not put this on the shelf - not suitable type of resource",
                Assertions.assertThrows(ShelfException.class, () -> shelf.putOnResource(1, new Resource<>(new Magazine()))).getMessage());

        assertEquals("you can not put this on the shelf - to less space",
                Assertions.assertThrows(ShelfException.class, () -> shelf.putOnResource(1, new Resource<>(new Book("Robin Cook", "Spiaczka", 300)))).getMessage());

        assertEquals("index is not correct",
                Assertions.assertThrows(ShelfException.class, () -> shelf.putOnResource(4, new Resource<>(new Book("Juliusz Slowacki", "Kordian", 180)))).getMessage());
    }
}