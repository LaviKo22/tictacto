package com.example.tictacto;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Button button00;
    @FXML
    private Button button01;
    @FXML
    private Button button02;
    @FXML
    private Button button03;
    @FXML
    private Button button04;
    @FXML
    private Button button05;
    @FXML
    private Button button06;
    @FXML
    private Button button07;
    @FXML
    private Button button08;


    private TicTacToe ticTacToe;



    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }


    public HelloController() {

        ticTacToe = new TicTacToe();
    }

    public void button00Clicked(ActionEvent actionEvent) {

        if( ticTacToe.available(0,0) )
        {
            ticTacToe.Domove(0,0);
            button00.setText("X");
            int player = ticTacToe.getCurrentPlayer();
            if (player ==1) {
                button00.setText("X");
            }else {
                button00.setText("0");

            }


        }



        checkForWin();

    }



    public void setButton01Clicked(ActionEvent actionEvent) {

        if( ticTacToe.available(0,1) )
        {
            ticTacToe.Domove(0,1);
            button01.setText("X");
            int player = ticTacToe.getCurrentPlayer();
            if (player ==1) {
                button01.setText("X");
            }else {
                button01.setText("0");

            }


            checkForWin();

        }


    }
    public void setButton02Clicked(ActionEvent actionEvent) {

        if( ticTacToe.available(0,2) )
        {
            ticTacToe.Domove(0,2);
            button02.setText("X");
            int player = ticTacToe.getCurrentPlayer();
            if (player ==1) {
                button02.setText("X");
            }else {
                button02.setText("0");

            }


            checkForWin();

        }


    }
    public void setButton03Clicked(ActionEvent actionEvent) {

        if( ticTacToe.available(1,0) )
        {
            ticTacToe.Domove(1,0);
            button03.setText("X");
            int player = ticTacToe.getCurrentPlayer();
            if (player ==1) {
                button03.setText("X");
            }else {
                button03.setText("0");

            }


            checkForWin();

        }


    }
    public void setButton04Clicked(ActionEvent actionEvent) {

        if( ticTacToe.available(1,1) )
        {
            ticTacToe.Domove(1,1);
            button04.setText("X");
            int player = ticTacToe.getCurrentPlayer();
            if (player ==1) {
                button04.setText("X");
            }else {
                button04.setText("0");

            }


            checkForWin();

        }


    }
    public void setButton05Clicked(ActionEvent actionEvent) {

        if( ticTacToe.available(1,2) )
        {
            ticTacToe.Domove(1,2);
            button05.setText("X");
            int player = ticTacToe.getCurrentPlayer();
            if (player ==1) {
                button05.setText("X");
            }else {
                button05.setText("0");

            }


            checkForWin();

        }


    }    public void setButton06Clicked(ActionEvent actionEvent) {

        if( ticTacToe.available(2,0) )
        {
            ticTacToe.Domove(2,0);
            button06.setText("X");
            int player = ticTacToe.getCurrentPlayer();
            if (player ==1) {
                button06.setText("X");
            }else {
                button06.setText("0");

            }


            checkForWin();

        }


    }    public void setButton07Clicked(ActionEvent actionEvent) {

        if( ticTacToe.available(2,1) )
        {
            ticTacToe.Domove(2,1);
            button07.setText("X");
            int player = ticTacToe.getCurrentPlayer();
            if (player ==1) {
                button07.setText("X");
            }else {
                button07.setText("0");

            }

            checkForWin();


        }


    }    public void setButton08Clicked(ActionEvent actionEvent) {

        if( ticTacToe.available(2,2) )
        {
            ticTacToe.Domove(2,2);
            button08.setText("X");
            int player = ticTacToe.getCurrentPlayer();
            if (player ==1) {
                button08.setText("X");
            }else {
                button08.setText("0");

            }
            checkForWin();





        }
        else
            showMessage("taken illegal move");




    }
    private void showMessage(String s) {
        welcomeText.setText(s);

    }

    private void checkForWin() {
        if (ticTacToe.checkWin()==true){
            showMessage("GAME OVER!!");

        }
    }




}
