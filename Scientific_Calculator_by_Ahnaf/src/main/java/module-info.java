module com.mycompany.scientific_calculator_by_ahnaf {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.scientific_calculator_by_ahnaf to javafx.fxml;
    exports com.mycompany.scientific_calculator_by_ahnaf;
}
