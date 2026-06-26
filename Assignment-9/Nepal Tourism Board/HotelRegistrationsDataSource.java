import java.util.List;
import java.util.ArrayList;

public class HotelRegistrationsDataSource extends TouristDataSource{
    public HotelRegistrationsDataSource(){
        super("Kathmandu Hotels Registrations");
    }

    @Override
    public List<String> fetchData() throws DataSourceAccessException, AuthenticationFailedException{
        if(sourceName.contains("Hotels") && Math.random() < 0.2){
            throw new AuthenticationFailedException("Hotel API authentication failed! Did someone forget the password again?");
        }

        List<String> hotels = new ArrayList<>();
        hotels.add("Hotel: Yak & Yeti, Guest: Ram Thapa, NP");
        hotels.add("Hotel: Annapurna, Guest: Alice Smith, AU");
        return hotels;
    }

    public static void main(String[] args) {
        HotelRegistrationsDataSource data = new HotelRegistrationsDataSource();

        try{
            List<String> hotels = data.fetchData();
            for(String hotel: hotels){
                System.out.println(hotel);
            }
        }
        catch(DataSourceAccessException e){
            System.out.println("DataSourceAccessException: " + e.getMessage());
        }
    }
}

class AuthenticationFailedException extends DataSourceAccessException{
    public AuthenticationFailedException(String error){
        super(error);
    }
}
