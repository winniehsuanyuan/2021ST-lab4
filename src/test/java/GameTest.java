import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;


import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import java.util.stream.Stream;

public class GameTest {

    //parameterization
    private static Stream<Arguments> stringProvider(){
        return Stream.of(
                //player1 win
                arguments(new String[]{"rock", "scissors"}, new String("Player 1 win!")),
                arguments(new String[]{"scissors", "paper"}, new String("Player 1 win!")),
                arguments(new String[]{"paper", "rock"}, new String("Player 1 win!")),
                //player2 win
                arguments(new String[]{"scissors", "rock"}, new String("Player 2 win!")),
                arguments(new String[]{"paper", "scissors"}, new String("Player 2 win!")),
                arguments(new String[]{"rock", "paper"}, new String("Player 2 win!")),
                //draw
                arguments(new String[]{"rock", "rock"}, new String("Draw!")),
                arguments(new String[]{"paper", "paper"}, new String("Draw!")),
                arguments(new String[]{"scissors", "scissors"}, new String("Draw!"))
                );
    }
    @ParameterizedTest(name="#{index} - Test with Argument={0},{1}")
    @MethodSource("stringProvider")
    public void winnerTest(String[] playerChoices, String expectedResult) {
            Game game = new Game();
            assertEquals(game.winner(playerChoices[0],playerChoices[1]), expectedResult);
    }
    
    //input validation test
    @Test
    void invalidInputTest() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Game().inputValidation("wrongInput");
        });
    }

}