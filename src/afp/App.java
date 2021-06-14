package afp;

import afp.sport.Sport;

public class App {
    public static void main(String[] args) {
        AbstractFactory<Sport> sportFactory = FactoryProvider.getFactory("Sport");

        Sport football = sportFactory.create("Football");
        Sport handball = sportFactory.create("Handball");

        System.out.println(football.getName());
        System.out.println(handball.getName());
        System.out.println(handball.getCountry());

    }
}
