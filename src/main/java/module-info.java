module dev.cosmingherghe.musicsortercleaner {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
//    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens dev.cosmingherghe.musicsortercleaner to javafx.fxml;
    exports dev.cosmingherghe.musicsortercleaner;
}