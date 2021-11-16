module com.example.coatescop3330assignment4part2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.coatescop3330assignment4part2 to javafx.fxml;
    exports com.example.coatescop3330assignment4part2;
}