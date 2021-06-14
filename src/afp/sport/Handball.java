package afp.sport;

public class Handball implements Sport {
    @Override
    public String getName() {
        return "Handball";
    }

    @Override
    public String getCountry() {
        return "Croatia";
    }
}
