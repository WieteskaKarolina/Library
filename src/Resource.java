public class Resource<T extends Book> {
    private T resource;

    public Resource(T resource) {
        this.resource = resource;
    }

    public T getResource() {
        return resource;
    }

    public void setResource(T resource) {
        this.resource = resource;
    }

    public Integer getPageNumber() {
        return resource.getPageNumber();
    }

    @Override
    public String toString() {
        return resource.toString();
    }
}
