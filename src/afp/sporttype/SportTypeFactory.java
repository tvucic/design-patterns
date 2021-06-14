package afp.sporttype;

import afp.AbstractFactory;

public class SportTypeFactory implements AbstractFactory<SportType> {
    @Override
    public SportType create(String sport) {
        if("Individual".equalsIgnoreCase(sport)){
            return new Individual();
        }else if("Team".equalsIgnoreCase(sport)){
            return new Team();
        }
        return null;
    }
}
