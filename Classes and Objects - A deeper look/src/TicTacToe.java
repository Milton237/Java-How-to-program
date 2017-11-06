/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MILTON PRO
 */
import java.util.Random;

public class TicTacToe{
    private int players     = 0;        // number of human players
    private int winner      = 0;
    private int playerTurn  = 0;

    private enum GameStatus{INITIALISE, RUNNING, EXIT, WON, DRAW};

    Random randomGenerator = new Random();

    GameStatus gameStatus = GameStatus.INITIALISE;

    Board gameBoard = new Board();
    InputManager inputManager = new InputManager();
    Agent player1;
    Agent player2;

    // SETTERS
    public void setGameStatus(GameStatus gameStatus){
        this.gameStatus = gameStatus;
    }
    // GETTERS
    public GameStatus getGameStatus(){
        return this.gameStatus;
    }
    // play the game
    public void run(){
        while(getGameStatus() != GameStatus.EXIT){
            if(getGameStatus() == GameStatus.INITIALISE){
                if(initialise()){
                    setGameStatus(GameStatus.RUNNING);
                }
            }
            if(getGameStatus() == GameStatus.RUNNING){
                switch(playerTurn){
                    case 1:
                        player1.move();
                        checkWinCondition();
                        break;
                    case 2:
                        player2.move();
                        checkWinCondition();
                        break;
                }
                // swap player
                playerTurn = (playerTurn == 1) ? 2 : 1;
            }
        }
    }
    // intialise players
    private boolean initialise(){
        reset();

        while(players == 0 && gameStatus != GameStatus.EXIT){
            printMenu();
        }
        if(players == 1){
            player1 = new Human(gameBoard, 1, inputManager);
            player2 = new Computer(gameBoard, 2);
        }
        if(players == 2){
            player1 = new Human(gameBoard, 1, inputManager);
            player2 = new Human(gameBoard, 2, inputManager);
        }

        playerTurn = 1 + randomGenerator.nextInt(2);
        return true;
    }
    // print main game menu
    // get number of players
    private void printMenu(){
        System.out.println("\nWelcome to TicTacToe\n");
        System.out.println("1. PvC");
        System.out.println("2. PvP");
        System.out.println("0. Exit");
        System.out.print("> ");

        int choice = inputManager.getIntInput();

        if(choice == 0)
            setGameStatus(GameStatus.EXIT);
        else if(choice == 1 || choice == 2)
            players = choice;
        else
            System.out.println("Invalid menu entry. Try again.");
    }
    // print the winner
    private void printEndStatus(){
        if(winner > 0)
            System.out.printf("\nCongratulations player %d won!!\n", winner);
        else
            System.out.println("\nGame ended in a draw\n");

        gameBoard.printBoard();
    }
    // check for exit condition
    private void checkWinCondition(){
        // check victory/play again
        if(gameBoard.checkVictory()){
            setGameStatus(GameStatus.WON);
            winner = gameBoard.getWinner();
        }
        if(gameBoard.checkDraw()){
            setGameStatus(GameStatus.DRAW);
        }

        if(getGameStatus() != GameStatus.RUNNING){
            printEndStatus();
            System.out.println("Play Again? (y/n)");
            System.out.print("> ");
            if(inputManager.getCharInput() == 'y'){
                reset();
                run();
            }else{
                setGameStatus(GameStatus.EXIT);
            }
        }
    }
    // reset game variables
    private void reset(){
        gameBoard.reset();

        gameStatus = GameStatus.RUNNING;
        players = 0;
        winner = 0;
        playerTurn = 0;
    }
}
