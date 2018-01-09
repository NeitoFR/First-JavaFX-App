package neito.view;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import neito.Main;
import neito.model.Person;

public class BodyController 
{
	@FXML
    private TableView<Person> personTable;
    @FXML
    private TableColumn<Person, String> firstNameColumn;
    @FXML
    private TableColumn<Person, String> lastNameColumn;
    @FXML
    private TextField prenomField;
    @FXML
    private TextField nomField;
    
    private Main main;
    
    
    
    public BodyController()
    {
    	
    }
    
    @FXML
    private void initialize() {
        // Initialize the person table with the two columns.
        firstNameColumn.setCellValueFactory(cellData -> cellData.getValue().PrenomProperty());
        lastNameColumn.setCellValueFactory(cellData -> cellData.getValue().NomProperty());
    }
    
    public void setMain(Main main)
    {
    	this.main = main;
    	
    	 personTable.setItems(main.getPersonData());
    }
    
    @FXML
    private void handleDeletePerson() {
        int selectedIndex = personTable.getSelectionModel().getSelectedIndex();
        personTable.getItems().remove(selectedIndex);
        
    }
    
    @FXML
    private void handleAddPerson() {
    	personTable.getItems().add(new Person(prenomField.getText(),nomField.getText()));
    }
}
