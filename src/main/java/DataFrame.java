import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataFrame<DataElement> {
    private Map<String, DataElement> dataArray;

    public DataFrame() {
        this.dataArray = new HashMap<String, DataElement>();
    }

    public DataFrame(ArrayList <DataElement> data, ArrayList<String> columnsNames){
        for (String columnsName : columnsNames) {
            this.dataArray.put(columnsName,data.get(columnsNames.indexOf(columnsName)));
        }

    }

}
