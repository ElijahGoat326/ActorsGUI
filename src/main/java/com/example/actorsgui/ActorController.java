package com.example.actorsgui;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.util.converter.IntegerStringConverter;
import javafx.util.converter.LongStringConverter;

import java.util.ArrayList;

import static com.example.actorsgui.Moviemaker.allmoviemakers;

public class ActorController {

    public TableView actorTable;
    public TableColumn<Actor, String> rank;
    public TableColumn name;

    public TableColumn worldwidetotal;
    public TableColumn average;
    public TableColumn numberOffilms;
    public TableColumn amountOfMoneyMade;

    public void initialize() {
        //restoreOrReadData();
        Actor.readAllData();

        ArrayList<Moviemaker> temporaryList = Actor.getAllmoviemakers();
        ObservableList temporaryObservableList = FXCollections.observableArrayList(temporaryList);
         actorTable.setItems(temporaryObservableList);

        rank.setCellValueFactory(new PropertyValueFactory<>("rank"));
        name.setCellValueFactory(new PropertyValueFactory<>("name"));
        worldwidetotal.setCellValueFactory(new PropertyValueFactory<>("worldwideTotal"));
        average.setCellValueFactory(new PropertyValueFactory<>("average"));
        numberOffilms.setCellValueFactory(new PropertyValueFactory<>("numberOfFilms"));
        amountOfMoneyMade.setCellValueFactory(new PropertyValueFactory<>("AmountOfMoneyMade"));

        rank.setCellFactory(TextFieldTableCell.forTableColumn());
        name.setCellFactory(TextFieldTableCell.forTableColumn());
        worldwidetotal.setCellFactory(TextFieldTableCell.forTableColumn());
        average.setCellFactory(TextFieldTableCell.forTableColumn());
        numberOffilms.setCellFactory(TextFieldTableCell.forTableColumn());
        amountOfMoneyMade.setCellFactory(TextFieldTableCell.forTableColumn());

        rank.setOnEditCommit(
                (TableColumn.CellEditEvent<Actor, String> t) -> {
                    int tableRow = t.getTablePosition().getRow();
                    Moviemaker actorFromTableRow = t.getTableView().getItems().get(tableRow);
                    actorFromTableRow.setRank(t.getNewValue());
                });








    }

}

