/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello_world;

import javafx.application.Application;
import static javafx.application.ConditionalFeature.FXML;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author pasindu akalanka
 */
public class Hello_World extends Application {
    
    @Override
    public void start(Stage s) {
        s.setTitle("creating label"); 
        
        Label nameLbl = new Label("Name:");
        nameLbl.relocate(10, 10);
        TextField nameFld = new TextField("abc");
        nameFld.relocate(50, 10);
        Label passwordLbl = new Label("Password:");
        passwordLbl.relocate(200, 10);
        TextField passwordFld = new TextField("123");
        passwordFld.relocate(400, 10);
        Button loginBtn = new Button("Login");
        loginBtn.relocate(420, 10);
        AnchorPane.setLeftAnchor(nameLbl, 30.0);
        AnchorPane.setLeftAnchor(nameFld, 50.0);
        AnchorPane.setRightAnchor(passwordLbl, 150.0);
        AnchorPane.setRightAnchor(passwordFld, 0.0);

        AnchorPane.setBottomAnchor(loginBtn, 10.0);
        AnchorPane root = new AnchorPane();
        root.setStyle("-fx-padding: 1;");
        root.setStyle("-fx-border-style: solid inside;");
        root.setStyle("-fx-border-width: 10;");
        root.setStyle("-fx-border-insets: 5;");
        root.setStyle("-fx-border-radius: 5;");
        root.setStyle("-fx-border-color: blue;");
        root.setPrefSize(400, 250);
        root.getChildren().addAll(nameLbl, nameFld, passwordLbl, passwordFld, loginBtn);
        Scene scene = new Scene(root);
        s.setScene(scene);
        s.setTitle("A VBox Example");
        s.show();

    

 
    //return hbox;
        
        
        
        
        
        
        
//        // TextField 
//        TextField b1 = new TextField("input textfield1"); 
//        b1.setAlignment(Pos.CENTER);
//        // create a label
//        
//       
//        Label l1 = new Label("_1 TextField"); 
//        l1.setAlignment(Pos.TOP_RIGHT);
//        l1.setLabelFor(b1); 
//        
//        
//        
//        
//        // TextField 
//        TextField b2 = new TextField("textfield2"); 
//        Label l2 = new Label("_2 TextField"); 
//        l2.setLabelFor(b2); 
//        TilePane r = new TilePane(); 
//        l1.setMnemonicParsing(true); 
//        l2.setMnemonicParsing(true); 
//        r.getChildren().add(l1); 
//        r.getChildren().add(b1); 
//        r.getChildren().add(l2); 
//        r.getChildren().add(b2); 
//
//        Scene sc = new Scene(r, 700, 400); 
//        s.setScene(sc); 
//        s.show(); 
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

