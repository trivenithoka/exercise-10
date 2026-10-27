import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DisplayTextAndImage extends Application {

    @Override
    public void start(Stage primaryStage) {

        // Set the window title
        primaryStage.setTitle("Text and Image Display");

        // Create a label
        Label label = new Label("Hello, JavaFX!");

        // Load an image from a file
        Image image = new Image("file:imagePath.jpg");
        ImageView imageView = new ImageView(image);

        // Set image dimensions
        imageView.setFitWidth(400);
        imageView.setFitHeight(300);
        imageView.setPreserveRatio(true);

        // Create a VBox layout
        VBox vbox = new VBox(10);
        vbox.getChildren().addAll(label, imageView);

        // Create a scene with dimensions 600 x 400
        Scene scene = new Scene(vbox, 600, 400);

        // Set the scene and display the window
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
