package com.example.q3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        pane.setHgap(5.5);
        pane.setVgap(5.5);
 pane.add(new ImageView (new Image("C:\\Users\\NADAOMAR\\Desktop\\america.png")), 0, 0);
 pane.add(new ImageView(new Image("C:\\Users\\NADAOMAR\\Desktop\\england.png")), 1, 0);
 pane.add(new ImageView(new Image("C:\\Users\\NADAOMAR\\Desktop\\flower.png")), 1, 1);
 pane.add(new ImageView(new Image("C:\\Users\\NADAOMAR\\Desktop\\china.png")), 0, 1);
 Scene scene = new Scene(pane);
stage.setTitle("Excerise 14_01");
stage.setScene(scene);
stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}