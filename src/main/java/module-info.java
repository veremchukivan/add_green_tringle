module ukf.sk.vlastne_komponenty {
    requires javafx.controls;
    requires javafx.fxml;


    opens ukf.sk.vlastne_komponenty to javafx.fxml;
    exports ukf.sk.vlastne_komponenty;
}