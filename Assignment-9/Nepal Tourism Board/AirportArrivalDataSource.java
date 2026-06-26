import java.util.ArrayList;
import java.util.List;

public class AirportArrivalDataSource extends TouristDataSource{
    public AirportArrivalDataSource(){
        super("Tribhuvan Airport Arrivals");
    }
    @Override
    public List<String> fetchData() throws DataSourceAccessException, ConnectionLostException{
        if(sourceName.contains("Tribhuvan") && Math.random() < 0.3){
            throw new ConnectionLostException("Airport data connection lost! Maybe a pigeon sat on the antenna?");
        }

        List<String> tourists = new ArrayList<>();
        tourists.add("Visitor: John Doe, USA");
        tourists.add("Visitor: Emily White, UK");
        return tourists;
    }

    public static void main(String[] args) {
        AirportArrivalDataSource dataSource = new AirportArrivalDataSource();

        try{
            List<String> tourists = dataSource.fetchData();
            for(String tourist : tourists){
                System.out.println(tourist);
            }
        }
        catch(DataSourceAccessException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}

class ConnectionLostException extends DataSourceAccessException{
    public ConnectionLostException(String error){
        super(error);
    }
}