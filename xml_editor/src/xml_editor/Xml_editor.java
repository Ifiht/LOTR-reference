/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xml_editor;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author MH042760
 */
public class Xml_editor extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX Welcome");
        primaryStage.setHeight( 500 );
        primaryStage.setWidth( 500 );
                
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(8);
        grid.setVgap(8);
        grid.setPadding(new Insets(15, 15, 15, 15));

        Text scenetitle = new Text("LOTR index editor");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
            grid.add(scenetitle, 0, 0, 2, 1);

        Label ixTitle = new Label("Title:");
            grid.add(ixTitle, 0, 1);

        TextField txTitle = new TextField();
            grid.add(txTitle, 1, 1);

        Label ixAliases = new Label("Aliases:");
            grid.add(ixAliases, 0, 2);

        TextField txAliases = new TextField();
            grid.add(txAliases, 1, 2, 2, 1);
            
        Label ixDescription = new Label("Description:");
            grid.add(ixDescription, 0, 3);

        TextArea txDescription = new TextArea();
/*            txDescription.setHeight( 50 ); */
            grid.add(txDescription, 1, 3, 2, 5);            
            
            Button btn = new Button("Save");
            HBox hbBtn = new HBox(10);
            hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
            hbBtn.getChildren().add(btn);
            grid.add(hbBtn, 2, 9);

            final Text actiontarget = new Text();
            grid.add(actiontarget, 1, 10);
            
            btn.setOnAction((ActionEvent e) -> {
                actiontarget.setFill(Color.FIREBRICK);
                actiontarget.setText("Data saved.");
        });
            
            Scene scene = new Scene(grid, 300, 275);
            primaryStage.setScene(scene);
            primaryStage.show();
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
