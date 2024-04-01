module com.haroun.tempusfugit {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.apache.commons.io;


    opens com.haroun.tempusfugit to javafx.fxml;
    exports com.haroun.tempusfugit;
}