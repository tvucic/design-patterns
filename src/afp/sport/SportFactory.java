package afp.sport;

import afp.AbstractFactory;

public class SportFactory implements AbstractFactory<Sport> {
    @Override
    public Sport create(String sport) {
        if("Football".equalsIgnoreCase(sport)){
            return new Football();
        }else if("Handball".equalsIgnoreCase(sport)){
            return new Handball();
        }
        return null;
    }
}
