import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataFrame<E> {
    private Map<String, List<E>> dataArray;

    public DataFrame() {
        this.dataArray = new HashMap<String, List<E>>();
    }
}
