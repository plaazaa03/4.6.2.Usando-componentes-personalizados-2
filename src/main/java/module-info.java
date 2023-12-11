module es.ieslosmontecillos.appusotextoboton {
    requires javafx.controls;
    requires javafx.fxml;
    requires es.ieslosmoncecillos.componenetes_plazaraul;

    opens es.ieslosmontecillos.appusotextoboton to javafx.fxml;
    exports es.ieslosmontecillos.appusotextoboton;
}