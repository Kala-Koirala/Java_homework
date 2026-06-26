import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueVisitorCounter implements DataProcessor {
    @Override
    public List<String> process(List<String> rawData) throws DataProcessingException {
        if (rawData.isEmpty()) {
            throw new EmptyDataException("No raw data to process! Did all tourists go missing?");
        }

        Set<String> uniqueNames = new HashSet<>();

        for (String data : rawData) {
            String name = null;

            if (data.startsWith("Visitors: ")) {
                int start = "Visitors: ".length();
                int end = data.indexOf(",", start);
                if (end != -1) {
                    name = data.substring(start, end).trim();
                } 
                else if (data.startsWith("Guests: ")) {
                    start = "Guests: ".length();
                    end = data.indexOf(",", start);
                    if (end != -1) {
                        name = data.substring(start, end).trim();
                    }
                }
            }
            if(name != null){
                uniqueNames.add(name.trim());
            }
        }
        List<String> result = new ArrayList<>();
        result.add("Unique Visitors: " + uniqueNames.size());
        return result;
    }

    public static void main(String[] args) {
        DataProcessor dp = new UniqueVisitorCounter();

        try{
            List<String> uniqueVisitors = new ArrayList<>();
            dp.process(uniqueVisitors);
        }
        catch(DataProcessingException e){
            System.out.println("Error: " + e.getMessage());
        }

        try{
            List<String> uniqueVisiors = Arrays.asList("Visitors: John Doe, USA", "Visitors: Emily White, UK");
            List<String> output = dp.process(uniqueVisiors);
            System.out.println("Output: " + output.get(0));
            }
            catch(DataProcessingException e){
                System.out.println("Error: " + e.getMessage());
            }
        }

        
    }


class EmptyDataException extends DataProcessingException {
    public EmptyDataException(String error) {
        super(error);
    }
}
