module com.example.ood_final_cw {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ood_final_cw to javafx.fxml;
    exports com.example.ood_final_cw;
}