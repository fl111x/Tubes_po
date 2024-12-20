package app.tubes_po_gui_v1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class kelolaAkunController {

    private Parent root;
    private Stage stage;
    private Scene scene;

    @FXML
    public void changeBeranda(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("beranda.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void modalBuatAkun() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("modalBuatAkun.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("Buat Akun");
        stage.setScene(new Scene(root));
        stage.show();
    }

    @FXML
    public void modalEditAkun() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("modalEditAkun.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("Edit Akun");
        stage.setScene(new Scene(root));
        stage.show();
    }
}
