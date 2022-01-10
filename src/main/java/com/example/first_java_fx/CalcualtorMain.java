package com.example.first_java_fx;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.io.IOException;
class Calculator{
    String firstString="";
    String secondString="";
    double first=0;
    double second=0;
    double value=0;
    char operator=' ';
    public double addition(){
        value=first+second;
        return first+second;
    }
    public double subtraction(){
        value=first-second;
        return first-second;
    }
    public double multiplication(){
        value=first*second;
        return first*second;
    }
    public double division(){
        value=first/second;
        return first/second;
    }
    public void pressedEqual(){
        first=value;
        second=0;
    }
    public String getString(){
        return  firstString+" "+ operator+" "+secondString;
    }

}
public class CalcualtorMain extends Application {
    static Calculator calculator=new Calculator();
    public void start(Stage stage) throws IOException {
        GridPane gridPane = new GridPane();
        gridPane.setVgap(10);
        gridPane.setHgap(10);
        gridPane.setPrefWidth(100);
        Button button1 = new Button("    1    ");
        button1.setMaxSize(100,200);
        Button button2 = new Button("    2    ");
        button2.setMaxSize(100,200);
        Button button3 = new Button("    3    ");
        button3.setMaxSize(100,200);
        Button button4 = new Button("    4   ");
        button4.setMaxSize(100,200);
        Button button5 = new Button("    5    ");
        button5.setMaxSize(100,200);
        Button button6 = new Button("    6    ");
        button6.setMaxSize(100,200);
        Button button7 = new Button("    7    ");
        button7.setMaxSize(100,200);
        Button button8 = new Button("    8    ");
        button8.setMaxSize(100,200);
        Button button9 = new Button("    9    ");
        button9.setMaxSize(100,200);
        Button button0 = new Button("  0  ");
        button0.setMaxSize(100,200);
        Button clear = new Button("    C    ");
        Button equals = new Button("    =    ");
        Button plus = new Button("    +    ");
        Button minus = new Button("    -    ");
        Button mul = new Button("    *    ");
        Button div = new Button("    /    ");
        Label greet = new Label("Count");
        TextField answer = new TextField();
        greet.setTextFill(Color.grayRgb(12));
        answer.setMaxSize(230, 500);
        VBox vbox=new VBox();
        vbox.setSpacing(10);
        gridPane.addRow(1, button7,button8,button9,plus);
        gridPane.addRow(2,button4,button5,button6,minus);
        gridPane.addRow(3,button1,button2,button3,mul);
        gridPane.addRow(4,clear,button0,equals,div);
        vbox.getChildren().add(answer);
        vbox.getChildren().add(gridPane);
        vbox.setAlignment(Pos.CENTER);
        button0.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(calculator.operator==' ')
                    calculator.firstString+="0";
                else
                    calculator.secondString+="0";
                answer.setText(calculator.getString());
            }
        });
        button1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(calculator.operator==' ')
                    calculator.firstString+="1";
                else
                    calculator.secondString+="1";
                answer.setText(calculator.getString());

            }
        });
        button2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(calculator.operator==' ')
                    calculator.firstString+="2";
                else
                    calculator.secondString+="2";
                answer.setText(calculator.getString());
            }
        });
        button3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(calculator.operator==' ')
                    calculator.firstString+="3";
                else
                    calculator.secondString+="3";
                answer.setText(calculator.getString());
            }
        });
        button4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(calculator.operator==' ')
                    calculator.firstString+="4";
                else
                    calculator.secondString+="4";
                answer.setText(calculator.getString());
            }
        });
        button5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(calculator.operator==' ')
                    calculator.firstString+="5";
                else
                    calculator.secondString+="5";
                answer.setText(calculator.getString());
            }
        });
        button6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(calculator.operator==' ')
                    calculator.firstString+="6";
                else
                    calculator.secondString+="6";
                answer.setText(calculator.getString());
            }
        });
        button7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(calculator.operator==' ')
                    calculator.firstString+="7";
                else
                    calculator.secondString+="7";
                answer.setText(calculator.getString());
            }
        });
        button8.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(calculator.operator==' ')
                    calculator.firstString+="8";
                else
                    calculator.secondString+="8";
                answer.setText(calculator.getString());
            }
        });
        button9.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(calculator.operator==' ')
                    calculator.firstString+="9";
                else
                    calculator.secondString+="9";
                answer.setText(calculator.getString());
            }
        });
        plus.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                calculator.operator='+';
                answer.setText(calculator.getString());
            }
        });
        minus.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                calculator.operator='-';
                answer.setText(calculator.getString());
            }
        });
        mul.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                calculator.operator='*';
                answer.setText(calculator.getString());
            }
        });
        div.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                calculator.operator='/';
                answer.setText(calculator.getString());
            }
        });
        equals.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                calculator.first=Double.parseDouble(calculator.firstString);
                calculator.second=Double.parseDouble(calculator.secondString);
                if(calculator.operator=='+'){
                    calculator.addition();
                }
                if(calculator.operator=='-'){
                    calculator.subtraction();
                }
                if(calculator.operator=='*'){
                    calculator.multiplication();
                }
                if(calculator.operator=='/'){
                    calculator.division();
                }
                calculator.firstString=String.valueOf(calculator.value);
                calculator.secondString="";
                calculator.operator=' ';
                answer.setText(String.valueOf(calculator.value));
            }
        });
        clear.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                calculator.firstString="";
                calculator.secondString="";
                calculator.operator=' ';
                answer.setText(calculator.firstString+calculator.operator+calculator.secondString);

            }
        });
        stage.setTitle("Calculator");
        stage.setScene(new Scene(vbox, 240, 185));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }


}