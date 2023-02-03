import java.util.ArrayList;

public class Shelf {
    ArrayList<Resource<?>> resources;
    private final Integer maxSizeOfPages;

    public boolean isEmpty(){
        return resources.isEmpty();
    }

    public Integer size(){
        return resources.size();
    }

    public Integer sumOfPages(){
        Integer sum = 0;
        for (Resource<?> resource : resources) {
            sum += resource.getPageNumber();
        }
        return sum;
    }

    public Shelf(Integer maxSizeOfPages) {
        this.maxSizeOfPages = maxSizeOfPages;
        resources = new ArrayList<>();
    }

    public Resource<?> takeResource() throws ShelfException {
        if(resources.isEmpty()){
            throw new ShelfException("this shelf is empty");
        }

        Resource<?> resource = resources.get(0);
        resources.remove(0);
        return resource;
    }

    public Resource<?> takeResource(Integer index) throws ShelfException {
        if(resources.isEmpty()){
            throw new ShelfException("this shelf is empty");
        }
        if(index<0 || index>resources.size()){
            throw new ShelfException("index is not correct");
        }
        Resource<?> resource = resources.get(index);
        resources.remove(resources.get(index));
        return resource;
    }

    public void putOnResource(Resource<?> resource) throws ShelfException {
        if(resource.getPageNumber()+sumOfPages()>maxSizeOfPages){
            throw new ShelfException("you can not put this on the shelf");
        }
        if(!resources.isEmpty() && resources.get(0).getResource().getClass()!=resource.getResource().getClass()){
            throw new ShelfException("you can not put this on the shelf - not suitable type of resource");
        }
        resources.add(resource);
    }

    public void putOnResource(Integer index, Resource<?> resource) throws ShelfException {
        if(resource.getPageNumber()+sumOfPages()>maxSizeOfPages){
            throw new ShelfException("you can not put this on the shelf");
        }
        if(!resources.isEmpty() && resources.get(0).getResource().getClass()!=resource.getResource().getClass()){
            throw new ShelfException("you can not put this on the shelf - not suitable type of resource");
        }
        resources.add(index, resource);
    }


    @Override
    public String toString() {
        return "Shelf{" + resources + '}';
    }
}
