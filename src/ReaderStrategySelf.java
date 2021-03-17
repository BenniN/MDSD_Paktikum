import java.lang.reflect.Type;
import java.util.ArrayList;

public class ReaderStrategySelf {

    String code;
    Type target;
    ArrayList<FieldExtractorSelf> extractors = new ArrayList<FieldExtractorSelf>();

    public void ReaderStrategy(String code, Type target){
        throw new UnsupportedOperationException();
    }

    public void addFieldExtractor(int begin, int end, String target){
        throw new UnsupportedOperationException();
    }

    public Object process(String line){
        throw new UnsupportedOperationException();
    }
}
