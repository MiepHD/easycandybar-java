module com.froxot.candybar {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.froxot.candybar to javafx.fxml;
    exports com.froxot.candybar;
}
