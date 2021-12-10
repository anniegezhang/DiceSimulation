import java.util.Objects;
import java.util.Random;

public class Dice {
    private int numberOfSides;
    private int faceValue;

    public Dice(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }

    public int getFaceValue() {
        return faceValue;
    }

    public void rollDice() {
        Random myRandomNumGenerator = new Random();
        this.faceValue = myRandomNumGenerator.nextInt(numberOfSides) + 1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dice dice = (Dice) o;
        return getNumberOfSides() == dice.getNumberOfSides() && getFaceValue() == dice.getFaceValue();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumberOfSides(), getFaceValue());
    }

    @Override
    public String toString() {
        return "Dice{" +
                "numberOfSides=" + numberOfSides +
                ", faceValue=" + faceValue +
                '}';
    }
}
