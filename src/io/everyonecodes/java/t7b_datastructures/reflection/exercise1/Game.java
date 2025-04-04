package io.everyonecodes.java.t7b_datastructures.reflection.exercise1;

import java.util.*;

public class Game {
    public void startGame() {
//        i want to put every code block logic into separate classes or methods, need more time


//        RULESET
        Map<Move, Set<Move>> rules = new HashMap<>();
        rules.put(Move.ROCK, new HashSet<>(Arrays.asList(Move.SCISSORS, Move.LIZARD)));
        rules.put(Move.PAPER, new HashSet<>(Arrays.asList(Move.ROCK, Move.SPOCK)));
        rules.put(Move.SCISSORS, new HashSet<>(Arrays.asList(Move.PAPER, Move.LIZARD)));
        rules.put(Move.LIZARD, new HashSet<>(Arrays.asList(Move.SPOCK, Move.PAPER)));
        rules.put(Move.SPOCK, new HashSet<>(Arrays.asList(Move.SCISSORS, Move.ROCK)));


//        USER INTERACTION (GET USER MOVE)
        System.out.println("Let’s play rock, paper, scissors, lizard, spock!");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose one:");
        String userInput = scanner.nextLine();
        Move userMove;

        try {
            userMove = Move.valueOf(userInput.trim().toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid move. Please choose rock, paper, scissors, lizard, or spock.");

            System.out.println("Choose one:");
            userInput = scanner.nextLine();
            userMove = Move.valueOf(userInput.trim().toUpperCase());
        }


//         GET RANDOM COMPUTER MOVE
        Move[] moves = Move.values();
        Random random = new Random();
        Move computerMove = moves[random.nextInt(moves.length)];


//        CHECK MOVES (printResult?)
        String printWhatComPicked = "Computer picked: " + computerMove + "\n";
        if (userMove == computerMove) {
            System.out.println(printWhatComPicked + "It's a draw!");
        } else if (rules.get(userMove).contains(computerMove)) {
            System.out.println(printWhatComPicked + "You won!");
        } else {
            System.out.println(printWhatComPicked + "Computer won!");
        }
    }
}
