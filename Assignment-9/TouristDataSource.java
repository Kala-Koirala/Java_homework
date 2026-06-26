import java.util.List;

public abstract class TouristDataSource {
    String sourceName;

    public TouristDataSource(String sourceName){
        this.sourceName = sourceName;
    }

    public abstract List<String> fetchData() throws DataSourceAccessException;
}

class DataSourceAccessException extends Exception{
    public DataSourceAccessException(String error){
        super(error);
    }
}
