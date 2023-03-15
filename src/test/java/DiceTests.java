import objects.Dice;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DiceTests {

    @Test
    public void diceTest()
    {
        Dice dice = new Dice(6, "blue");
        assertEquals(6,dice.getSides());
        assertEquals("blue",dice.getColor());
    }

    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4,5,6})
    public void validNumber(int number)
    {
       Dice dice = new Dice(6, "blue");

       int roll = dice.roll();
       Random random = new Random();

       int randomDiceNumber = random.nextInt(6) + 1;
      assertEquals(randomDiceNumber, roll,
              "The random dice number falls between the range of 1-6");

    }
}
