module com.checkers.checkers {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.checkers.checkers to javafx.fxml;
    exports com.checkers.checkers;
}