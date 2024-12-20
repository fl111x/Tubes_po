module org.example.tubes_po_gui_v1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens app.tubes_po_gui_v1 to javafx.fxml;
    exports app.tubes_po_gui_v1;
}