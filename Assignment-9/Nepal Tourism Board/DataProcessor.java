import java.util.List;


public interface DataProcessor {
    abstract List<String> process(List<String> rawData) throws DataProcessingException;
}
 
class DataProcessingException extends Exception{
    public DataProcessingException(String error){
        super(error);
    }
}