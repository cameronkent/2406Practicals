/**
 * Created by cameronkent on 31/08/2016.
 */
public class DemoHorses {

    public static void main(String[] args) {

        Horse one = new Horse();
        String oneName = one.getName();
        String oneColor = one.getColor();
        int oneBirthYear = one.getBirthYear();
        one.setName(oneName);
        one.setColor(oneColor);
        one.setBirthYear(oneBirthYear);

        System.out.println("Horse Details: \n Name: " + one.name + "\n Color: " + oneColor + "\n Birth Year: " + one.birthYear);

        RaceHorse two = new RaceHorse();
        String twoName = two.getName();
        String twoColor = two.getColor();
        int twoBirthYear = two.getBirthYear();
        int twoRaces = two.getRaces();
        two.setName(twoName);
        two.setColor(twoColor);
        two.setBirthYear(twoBirthYear);
        two.setRaces(twoRaces);

        System.out.println("Horse Details: \n Name: " + two.name + "\n Color: " + two.color + "\n Birth Year: " + two.birthYear + "\n Races completed: " + two.races);

    }
}
