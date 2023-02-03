
public class Main {

    public static void main(String[] args) throws RackException, ShelfException, TableException {
        Book b = new Book("Adam Mickiewicz", "Pan Tadeusz", 830);
        Book b2 = new Book("Adam Mickiewicz", "Dziady", 130);
        Book bb = new NormalCover(b);
        Book bb2 = new SolidCover(b2);
        Book bbb2 = new DecorativeCover(bb2);
        System.out.println(bb);
        System.out.println(bbb2);

        PublishingHouse w = PublishingHouse.getPublishingHouse("Adam Mickiewicz");
        assert w != null;
        Book k = w.createBook("Dziady", 148);
        System.out.println(k);


        RackBuilder rb = new RackBuilder();

        rb.add(new Shelf(10000));
        rb.add(new Shelf(5000));

        Rack r = rb.toBookStand();

        Shelf shelf = new Shelf(6000);
        // shelf.takeBook();  // PolkaException: Półka jest pusta!
        shelf.putOnResource(new Resource<>(new Book("Juliusz Slowacki", "Kordian", 180)));
        shelf.putOnResource(new Resource<>(new Book("Robin Cook", "Spiaczka", 300)));
      //  shelf.putOnResource(new Resource<>(new Magazine()));
        System.out.println("*" + shelf.takeResource(0));
        System.out.println(shelf);

        ReadingRoom readingRoom = new ReadingRoom();
        Table table = new Table(1000);
        readingRoom.moveFromShelfToTable(table, shelf);
        System.out.println(table);
        System.out.println(shelf);

    }
}

