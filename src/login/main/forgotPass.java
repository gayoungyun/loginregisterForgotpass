package login.main;

import java.lang.ModuleLayer.Controller;
import java.net.URL;
import java.nio.file.Paths;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import login.url.URLService;

public class forgotPass extends Application{
	@Override
	public void start(Stage arg0) throws Exception {
		System.out.println
		("file:/"+(Paths.get("").toAbsolutePath().toString())+"/bin/loginregisterForgotpass/document.fxml");
		URL url= new URL(URLService.fxPath+"loginregisterForgotpass/document.fxml");

		FXMLLoader loader = new FXMLLoader(url);
		Parent root = loader.load();

		Controller ctrl = loader.getController();
		ctrl.setRoot(root);

		Scene scene = new Scene(root);
		arg0.setScene(scene);
		arg0.show();

	}
	public static void main(String[] args) {
		launch(args);
	}

}
