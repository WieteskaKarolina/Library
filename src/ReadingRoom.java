public class ReadingRoom{
    private static ReadingRoom instance;
    Table table;
    Rack rack;

    ReadingRoom() {
        if(instance != null) {
            throw new RuntimeException("Not allowed. Please use getInstance() method");
        }
    }

    public static ReadingRoom getInstance() {

        if(instance == null) {
            instance = new ReadingRoom();
        }
        return instance;
    }

    public void moveFromTableToShelf(Table table, Shelf shelf) throws TableException, ShelfException {
        if(table.isEmpty()){
            throw new TableException("table is empty");
        }
        Integer tableSize = table.size();
        while(tableSize>=0){
            shelf.putOnResource(table.takeResource(tableSize));
            tableSize--;
        }
    }

    public void moveFromShelfToTable(Table table, Shelf shelf) throws ShelfException, TableException {
        if(shelf.isEmpty()){
            throw new ShelfException("table is empty");
        }
        Integer shelfSize = table.size();
        while(shelfSize>=0){
            table.putOnResource(shelf.takeResource(shelfSize));
            shelfSize--;
        }
    }
}
