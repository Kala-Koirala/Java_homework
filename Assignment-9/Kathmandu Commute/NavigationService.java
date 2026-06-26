public interface NavigationService {
    abstract void navigate(String startPoint, String endPoint, RouteValidator validator) throws NavigationFailedException; 
}

class NavigationFailedException extends Exception{
    public NavigationFailedException(String error){
        super(error);
    }
}