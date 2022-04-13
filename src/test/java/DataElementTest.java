import org.junit.Test;
import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class DataElementTest {


    @Test
    public void shouldCreateDataElementInteger(){
        ArrayList<Integer> arrayTest = generateIntegerArrayTest();
        DataElement<Integer> dataElementTest = new DataElement<>("IntegerTest",arrayTest);
        assertNotNull("DataElement not null Integer",dataElementTest);
        assertEquals(dataElementTest.getElements(),arrayTest);
    }

    @Test
    public void shouldCreateDataElementString(){
        ArrayList<String> arrayTest = generateStringArrayTest();
        DataElement<String> dataElementTest = new DataElement<>("StringTest",arrayTest);
        assertNotNull("DataElement not null String",dataElementTest);
        assertEquals(dataElementTest.getElements(),arrayTest);
    }

    @Test
    public void shouldCreateDataElementFloat(){
        ArrayList<Float> arrayTest = generateFloatArrayTest();
        DataElement<Float> dataElementTest = new DataElement<>("FloatTest",arrayTest);
        assertNotNull("DataElement not null Float",dataElementTest);
        assertEquals(dataElementTest.getElements(),arrayTest);
    }

    @Test
    public void shouldCreateDataElementDate(){
        ArrayList<LocalDate> arrayTest = generateDateArrayTest();
        DataElement<LocalDate> dataElementTest = new DataElement<>("DateTest",arrayTest);
        assertNotNull("DataElement not null Date",dataElementTest);
        assertEquals(dataElementTest.getElements(),arrayTest);
    }


    private ArrayList<Integer> generateIntegerArrayTest() {
        ArrayList<Integer> arrayTest= new ArrayList<>();
        arrayTest.add(1);
        arrayTest.add(199);
        arrayTest.add(23);
        return arrayTest;
    }

    private ArrayList<String> generateStringArrayTest() {
        ArrayList<String> arrayTest= new ArrayList<>();
        arrayTest.add("a");
        arrayTest.add("Lorem Ipsum !");
        return arrayTest;
    }

    private ArrayList<Float> generateFloatArrayTest() {
        ArrayList<Float> arrayTest= new ArrayList<>();
        arrayTest.add(1.1f);
        arrayTest.add(199908908.2783f);
        arrayTest.add(22.f);
        arrayTest.add(444444.444f);
        return arrayTest;
    }


    private ArrayList<LocalDate> generateDateArrayTest() {
        ArrayList<LocalDate> arrayTest= new ArrayList<>();
        arrayTest.add(LocalDate.now());
        arrayTest.add(LocalDate.now().plusDays(12));
        arrayTest.add(LocalDate.now().minusYears(42));
        return arrayTest;
    }

}
