import java.util.Stack;

public class Table {
    Stack<Resource<?>> resources;
    private final Integer M;

    public boolean isEmpty(){
        return resources.isEmpty();
    }

    public Integer size(){
       return resources.size();
    }

    public Table(Integer m) {
        M = m;
        resources = new Stack<>();
    }

    public Resource<?> takeResource(Integer index) throws TableException {
        if(resources.empty()){
            throw new TableException("table is empty");
        }
        return resources.pop();
    }

    public void putOnResource(Resource<?> resource) throws TableException {
        if(resources.size()>=M){
            throw new TableException("you can not put this on table");
        }
        resources.push(resource);
    }

    @Override
    public String toString() {
        return "Table{" + resources + '}';
    }
}
