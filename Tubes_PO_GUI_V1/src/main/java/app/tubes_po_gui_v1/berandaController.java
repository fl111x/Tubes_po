package app.tubes_po_gui_v1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class berandaController {
    @FXML
    private Button berandaBtn;
    @FXML
    private Button akunBtn;

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    public void changeKelolaAkun(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("kelolaAkun.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void btnIsiSaldo() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("modalIsiSaldo.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("IsiSaldo");
        stage.setScene(new Scene(root));
        stage.show();
    }

    @FXML
    public void btnTransaksi() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("modalTransaksi.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("Transaksi");
        stage.setScene(new Scene(root));
        stage.show();
    }
}