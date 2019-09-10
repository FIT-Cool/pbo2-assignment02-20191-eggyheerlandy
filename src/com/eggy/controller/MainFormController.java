package com.eggy.controller;

import com.eggy.entity.Category;
import com.eggy.entity.Item;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class MainFormController implements Initializable {

    @FXML
    private TextField txtName;
    @FXML
    private TextField txtPrice;
    @FXML
    private TextField txtCategoryName;
    @FXML
    private TableView<Category> tableDepartment;
    @FXML
    private TableColumn<Category, String > colName;
    @FXML
    private TableColumn<Category, String> colPrice;
    @FXML
    private TableColumn colCategory;


    @FXML
    private void tableClicked(MouseEvent mouseEvent) {
    }

    @FXML
    private void SaveAction(ActionEvent actionEvent) {
        Category c = new Category();
        c.setName(txtName.getText().trim());
        Category.add(c);
        c.setName(txtPrice.getText().trim());
        Category.add(c);
        c.setName(txtCategoryName.getText().trim());
        Category.add(c);
    }

    public void initialize(URL location, ResourceBundle resources) {
        category = FXCollections.observableArrayList();
        tableDepartment.setItems(category);
        colName.setCellValueFactory(data -> {
            Category c = data.getValue();
            return new SimpleStringProperty(c.getName());
        });
        colPrice.setCellValueFactory(data -> {
            Category c = data.getValue();
            return new SimpleStringProperty(c.getPrice());
        });

    }
}



