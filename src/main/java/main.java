import java.util.Objects;

public class main {
    public static void main(String[] args) {
        Dice die1 = new Dice(6);

        System.out.println("The initial value of our die is " + die1.getFaceValue());

        die1.rollDice();

        System.out.println("The value after rolling our die is: "+ die1.getFaceValue());

        die1.rollDice();

        System.out.println("The value after second rolling our die is: "+ die1.getFaceValue());
    }
}
