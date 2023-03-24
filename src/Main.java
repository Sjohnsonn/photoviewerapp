import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Construct controls
        FileInputStream input = new FileInputStream("fast car.jpeg");
        Image image = new Image(input);
        ImageView imageView = new ImageView(image);
        imageView.setFitHeight(650);
        imageView.setFitWidth(1200);
        Button button = new Button("My Button");
        button.setOnAction(actionEvent -> {
            FileInputStream input2 = null;
            try {
                input2 = new FileInputStream("LilUziVert.png");
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
            Image image2 = new Image(input2);
            imageView.setImage(image2);
            Button button2 = new Button("My Button");
        });

        public void start(Stage primaryStage) throws Exception {
            primaryStage.setTitle("ChoiceBox Experiment 1");

            ChoiceBox<String> choiceBox = new ChoiceBox<>();

            choiceBox.getItems().add("Choice 1");
            choiceBox.getItems().add("Choice 2");
            choiceBox.getItems().add("Choice 3");

            HBox hbox = new HBox(choiceBox);

            Scene scene = new Scene(hbox, 200, 100);
            primaryStage.setScene(scene);
            primaryStage.show();

        }

        public static void main(String[] args) {
            Application.launch(args);
        }
    }
choiceBox.setOnAction((event) -> {
        ChoiceBox<Object> choiceBox = new ChoiceBox<>();
        int selectedIndex = choiceBox.getSelectionModel().getSelectedIndex();
        Object selectedItem = choiceBox.getSelectionModel().getSelectedItem();

        System.out.println("Selection made: [" + selectedIndex + "] " + selectedItem);
        System.out.println("   ChoiceBox.getValue(): " + choiceBox.getValue());
    });


        // Layout the controls
        VBox vbox1 = new VBox(imageView,button);
        Scene scene = new Scene(vbox1, 1200, 676);


        // Open the stage's curtains
        primaryStage.setScene(scene);
        primaryStage.setTitle("Siraj's JavaFX App");
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}