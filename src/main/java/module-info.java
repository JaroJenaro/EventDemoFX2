module de.iav.eventdemofx2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens de.iav.eventdemofx2 to javafx.fxml;
    exports de.iav.eventdemofx2;
    opens de.iav.eventdemofx2.KeyPresedDemo to javafx.fxml;
    exports de.iav.eventdemofx2.KeyPresedDemo;

}