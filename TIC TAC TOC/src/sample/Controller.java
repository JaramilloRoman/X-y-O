package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class Controller {
    int player = 1;
    int cont1=0,cont2=0,cont3=0,cont4=0,cont5=0,cont6=0,cont7=0,cont8=0,cont9=0;
    @FXML Button btn1;
    @FXML Button btn2;
    @FXML Button btn3;
    @FXML Button btn4;
    @FXML Button btn5;
    @FXML Button btn6;
    @FXML Button btn7;
    @FXML Button btn8;
    @FXML Button btn9;
    @FXML TextField jugador1;

    public void Nuevo(ActionEvent actionEvent) {
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");


    }

    public void Salir(ActionEvent actionEvent) {
        Platform.exit();
    }


    public void player1(ActionEvent actionEvent) {
        player = 1;
    }

    public void player2(ActionEvent actionEvent) {
        player = 2;
    }


    public void add1(ActionEvent actionEvent) {
     if(cont1==0) {
         if (player == 1)
             btn1.setText("X");
         else
             btn1.setText("O");

         cont1++;
     }



    }

    public void add2(ActionEvent actionEvent) {
        if(cont2==0) {
            if (player == 1)
                btn2.setText("X");
            else
                btn2.setText("O");

            cont2++;
        }
    }

    public void add3(ActionEvent actionEvent) {
        if(cont3==0) {
            if (player == 1)
                btn3.setText("X");
            else
                btn3.setText("O");

            cont3++;

        }
    }

    public void add4(ActionEvent actionEvent) {
        if(cont4==0) {
            if (player == 1)
                btn4.setText("X");
            else
                btn4.setText("O");
            cont4++;
        }
    }

    public void add5(ActionEvent actionEvent) {
        if(cont5==0) {
            if (player == 1)
                btn5.setText("X");
            else
                btn5.setText("O");

            cont5++;
        }
    }

    public void add6(ActionEvent actionEvent) {
        if(cont6==0) {
            if (player == 1)
                btn6.setText("X");
            else
                btn6.setText("O");

            cont6++;
        }
    }

    public void add7(ActionEvent actionEvent) {
        if(cont7==0) {
            if (player == 1)
                btn7.setText("X");
            else
                btn7.setText("O");

            cont7++;
        }
    }

    public void add8(ActionEvent actionEvent) {
        if(cont8==0) {
            if (player == 1)
                btn8.setText("X");
            else
                btn8.setText("O");

            cont8++;
        }
    }

    public void add9(ActionEvent actionEvent) {
        if(cont9==0) {
            if (player == 1)
                btn9.setText("X");
            else
                btn9.setText("O");

            cont9++;
        }
    }

    //if( btn1=="X" && btn2=="X" && btn3="X")
        //jugador1.setText("1");
}

