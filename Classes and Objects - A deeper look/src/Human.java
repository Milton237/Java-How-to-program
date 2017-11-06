/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MILTON PRO
 */
public class Human extends Agent{
    private InputManager inputManager;
    private int playerNumber = 0;

    // CONSTRUCTOR
    public Human(Board gameBoard, int playerNo, InputManager iManager){
        super(gameBoard);

        playerNumber = playerNo;
        inputManager = iManager;
    }
    // ABSTRACT METHODS
    @Override
    public void move(){
        getBoard().printBoard();

        System.out.printf("Player %d. Enter space separated coordinates: ",
                playerNumber);
        int row = inputManager.getIntInput();
        int col = inputManager.getIntInput();

        if(!getBoard().movePlayer(row, col, playerNumber))
            move();
    }
}
