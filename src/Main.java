
public class Main {

    public static void main(String[] args) throws RackException, ShelfException, TableException {
        Book book = new Book("Adam Mickiewicz", "Pan Tadeusz", 830);
        Book book1 = new Book("Adam Mickiewicz", "Dziady", 130);
        Book book2 = new NormalCover(book);
        Book book3 = new SolidCover(book1);
        Book book4 = new DecorativeCover(book3);
        System.out.println(book2);
        System.out.println(book4);

        PublishingHouse w = PublishingHouse.getPublishingHouse("Adam Mickiewicz");
        assert w != null;
        System.out.println(w);

        Shelf shelf = new Shelf(6000);
        shelf.putOnResource(new Resource<>(new Book("Juliusz Slowacki", "Kordian", 180)));
        shelf.putOnResource(new Resource<>(new Book("Robin Cook", "Spiaczka", 300)));
        System.out.println("*" + shelf.takeResource(0));
        System.out.println(shelf);

        ReadingRoom readingRoom = new ReadingRoom();
        Table table = new Table(1000);
        System.out.println(table);
        readingRoom.moveFromShelfToTable(table, shelf);
        System.out.println(table);
        System.out.println(shelf);

    }
}

