import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    /**
     * Creat Full scren View
     * @param primaryStage Use the Stage.
     * @throws Exception Throw default exception
     */
    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("view/drawView.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("UML2.5");
        primaryStage.setScene(scene);
        primaryStage.setMaximized(true);
        primaryStage.show();
    }

    /**
     * Here starts the Program
     * @param args entry point for the Application
     */
    public static void main(String[] args) {
        launch(args);
    }
}
