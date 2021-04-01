import java.util.Scanner;

class Main {
    public static void main (String[] args){
        System.out.println("===Welcome to Rock-Paper-Scissors game===");
        Game game = new Game();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Player 1 choice(rock, paper or scissors):");
        String player1 = sc.nextLine();
        game.inputValidation(player1);

        System.out.println("Enter Player 2 choice(rock, paper or scissors):");
        String player2 = sc.nextLine();
        game.inputValidation(player2);

        System.out.println(game.winner(player1,player2));

    }
}