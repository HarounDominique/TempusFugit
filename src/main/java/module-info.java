module com.haroun.tempusfugit {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.haroun.tempusfugit to javafx.fxml;
    exports com.haroun.tempusfugit;
}