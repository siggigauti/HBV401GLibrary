package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private Button addButton;
    @FXML
    private ListView usersListView;
    @FXML
    private ListView reservationsListView;
    @FXML
    private TextField usernameTextField;
    @FXML
    private TextField emailTextField;
    private DataFactory dataFactory = new DataFactory();
    private ObservableList<User> users = FXCollections.observableArrayList();

    public void addButtonOnActivity(ActionEvent event){
        users.add(new User(0, usernameTextField.getText(), emailTextField.getText()));
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        users = dataFactory.getUsers();
        usersListView.setItems(users);
    }

    public void listViewMouseClicked(MouseEvent mouseEvent){
        User selectedItem = (User) usersListView.getSelectionModel().getSelectedItem();
        usernameTextField.setText(selectedItem.getName());
        emailTextField.setText(selectedItem.getEmail());

        reservationsListView.setItems(getReservedBooks(selectedItem));
    }

    private ObservableList<Book> getReservedBooks(User user){
        ObservableList<Book> reservedBooks = FXCollections.observableArrayList();
        ArrayList<Reservation> reservations = user.getReservations();
        for(Reservation reservation: reservations){
            reservedBooks.add(reservation.getBook());
        }
        return reservedBooks;
    }

}
