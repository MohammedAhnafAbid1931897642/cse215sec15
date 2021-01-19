module com.mycompany.cgpa_calculator_by_ahnaf {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.cgpa_calculator_by_ahnaf to javafx.fxml;
    exports com.mycompany.cgpa_calculator_by_ahnaf;
}
