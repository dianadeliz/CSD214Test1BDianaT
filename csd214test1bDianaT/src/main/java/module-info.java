module com.trios.csd214test1bdianat {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;

    opens com.trios.csd214test1bdianat to javafx.fxml;
    exports com.trios.csd214test1bdianat;
}