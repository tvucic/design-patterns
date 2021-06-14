package afp;

import afp.sport.SportFactory;
import afp.sporttype.SportTypeFactory;

public class FactoryProvider {

    public static AbstractFactory getFactory(String choice){
        if("Sport".equalsIgnoreCase(choice)){
            return new SportFactory();
        }
        else if("SportType".equalsIgnoreCase(choice)){
            return new SportTypeFactory();
        }

        return null;
    }
}
