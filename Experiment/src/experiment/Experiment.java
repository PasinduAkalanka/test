/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiment;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import static javax.swing.Spring.width;

/**
 *
 * @author pasindu akalanka
 */
public class Experiment extends Application {
    
    @Override
    public void start(Stage primaryStage) {
    BorderPane border = new BorderPane();
    border.setCenter(addGridPane());
    border.setPrefSize(800, 550);  
    border.setStyle("-fx-background-color: #0D6EA3");
    Scene scene = new Scene(border);
    primaryStage.setScene(scene);
    primaryStage.setTitle("Student Marks");
    primaryStage.show();
    
    
    
    }
    
   public static void showErrorMessage(String message){
    // Error message can be given here
    Alert alert = new Alert(AlertType.WARNING);
    alert.setTitle("Warning Dialog");
    alert.setHeaderText("Please check inputs");
    alert.setContentText(message);
    alert.showAndWait();
    
   }
   public GridPane addGridPane() {
        GridPane grid = new GridPane();
        grid.setHgap(20);
        grid.setVgap(20);
        grid.setPadding(new Insets(0, 10, 0, 10));
        
        Text topic = new Text("Student Grades Calculator");
        topic.setFont(Font.font("Arial", FontWeight.BOLD, 17));
        topic.setFill(Color.WHITE);
        grid.add(topic, 2, 1);

        // Subject 1 in text
        Text subject1 = new Text("Subject 1:");
        subject1.setFont(Font.font("Arial", FontWeight.BOLD, 12));
        subject1.setFill(Color.WHITE);
        grid.add(subject1, 1, 2); 
        
        //text box for subject1
        TextField textbox1 = new TextField("Enter Mark for subject 1");
        textbox1.setFont(Font.font("Arial", FontWeight.BOLD, 10));
        grid.add(textbox1, 2,2 );
        // Subject 2 in text
        Text subject2 = new Text("Subject 2:");
        subject2.setFont(Font.font("Arial", FontWeight.BOLD, 12));
        subject2.setFill(Color.WHITE);
        grid.add(subject2, 1, 3); 
        //text box for subject2
        TextField textbox2 = new TextField("Enter Mark for subject 2");
        textbox2.setFont(Font.font("Arial", FontWeight.BOLD, 10));
        grid.add(textbox2, 2,3 );
        // Subject 3 in text
        Text subject3 = new Text("Subject 3:");
        subject3.setFont(Font.font("Arial", FontWeight.BOLD, 12));
        subject3.setFill(Color.WHITE);
        grid.add(subject3, 1, 4); 
        //text box for subject3
        TextField textbox3 = new TextField("Enter Mark for subject 3");
        textbox3.setFont(Font.font("Arial", FontWeight.BOLD, 10));
        grid.add(textbox3, 2,4 );
        // Subject 4 in text
        Text subject4 = new Text("Subject 4:");
        subject4.setFont(Font.font("Arial", FontWeight.BOLD, 12));
        subject4.setFill(Color.WHITE);
        grid.add(subject4, 1, 5); 
        //text box for subject4
        TextField textbox4 = new TextField("Enter Mark for subject 4");
        textbox4.setFont(Font.font("Arial", FontWeight.BOLD, 10));
        grid.add(textbox4, 2,5 );
        // Subject 5 in text
        Text subject5 = new Text("Subject 5:");
        subject5.setFont(Font.font("Arial", FontWeight.BOLD, 12));
        subject5.setFill(Color.WHITE);
        grid.add(subject5, 1, 6); 
        //text box for subject5
        TextField textbox5 = new TextField("Enter Mark for subject 5");
        textbox5.setFont(Font.font("Arial", FontWeight.BOLD, 10));
        grid.add(textbox5, 2,6 );
        // Subject 6 in text
        Text subject6 = new Text("Subject 6:");
        subject6.setFont(Font.font("Arial", FontWeight.BOLD, 12));
        subject6.setFill(Color.WHITE);
        grid.add(subject6, 1, 7); 
        //text box for subject6
        TextField textbox6 = new TextField("Enter Mark for subject 6");
        textbox6.setFont(Font.font("Arial", FontWeight.BOLD, 10));
        grid.add(textbox6, 2,7 );
        //Button Calculate
        Button calculate = new Button("Calculate");
        calculate.setFont(Font.font("Arial", FontWeight.BOLD, 12));
        calculate.setMinWidth(70);
        calculate.setMinHeight(20);
        calculate.setPadding(new Insets(7));
        grid.add(calculate, 5, 3);
        //Button Clear
        Button clear = new Button("Clear");
        clear.setFont(Font.font("Arial", FontWeight.BOLD, 12));
        clear.setMinWidth(70);
        clear.setMinHeight(20);
        clear.setPadding(new Insets(7));
        grid.add(clear, 5, 4);
        //Button Exit
        Button exit = new Button("Exit");
        exit.setFont(Font.font("Arial", FontWeight.BOLD, 12));
        exit.setMinWidth(70);
        exit.setMinHeight(20);
        exit.setPadding(new Insets(7));
        grid.add(exit, 5, 5);
       
        TextField result = new TextField();
        result.setEditable(false);
        grid.add(result, 7, 6);

        calculate.setOnAction(e -> {
            
            Integer r = value1 + value2 + value3 + value4 + value5 + value6;
            result.setText(r.toString());
        });
        
        clear.setOnAction(e -> {
            textbox1.clear();
            textbox2.clear();
            textbox3.clear();
            textbox4.clear();
            textbox5.clear();
            textbox6.clear();
        });
        
        exit.setOnAction(e -> {
            Platform.exit();
        });    

        return grid;
    }
   
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    
    public static boolean isInteger(String s, int inputNumber) {
      boolean isValidInteger = false;
      try
      {
         Integer.parseInt(s);
 
         // s is a valid integer
 
         isValidInteger = true;
      }
      catch (NumberFormatException ex)
      {
          Experiment.showErrorMessage(ex.getMessage() + inputNumber);
      }
 
      return isValidInteger;
   }
     
    public static int[] getInputs(){
        Integer inputs[] = {textbox1.getText(), textbox2.getText()};
        
        Integer value1 = Integer.valueOf(isInteger(textbox1.getText())?, 1);
        Integer value2 = Integer.valueOf(textbox2.getText());
        Integer value3 = Integer.valueOf(textbox3.getText());
        Integer value4 = Integer.valueOf(textbox4.getText());
        Integer value5 = Integer.valueOf(textbox5.getText());
        Integer value6 = Integer.valueOf(textbox6.getText());
    }
    
    
}
