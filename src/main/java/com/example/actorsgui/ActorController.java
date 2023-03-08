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
    public TableColumn<Actor, String> name;

    public TableColumn<Actor, String> worldwidetotal;
    public TableColumn<Actor, String> average;
    public TableColumn<Actor, String> numberOffilms;
    public TableColumn<Actor, String> amountOfMoneyMade;

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

        name.setOnEditCommit(
                (TableColumn.CellEditEvent<Actor, String> t) -> {
                    int tableRow = t.getTablePosition().getRow();
                    Moviemaker actorFromTableRow = t.getTableView().getItems().get(tableRow);
                    actorFromTableRow.setName(t.getNewValue());
                });

        worldwidetotal.setOnEditCommit(
                (TableColumn.CellEditEvent<Actor, String> t) -> {
                    int tableRow = t.getTablePosition().getRow();
                    Moviemaker actorFromTableRow = t.getTableView().getItems().get(tableRow);
                    actorFromTableRow.setWorldwideTotal(t.getNewValue());
                });

        average.setOnEditCommit(
                (TableColumn.CellEditEvent<Actor, String> t) -> {
                    int tableRow = t.getTablePosition().getRow();
                    Moviemaker actorFromTableRow = t.getTableView().getItems().get(tableRow);
                    actorFromTableRow.setAverage(t.getNewValue());
                });

        numberOffilms.setOnEditCommit(
                (TableColumn.CellEditEvent<Actor, String> t) -> {
                    int tableRow = t.getTablePosition().getRow();
                    Moviemaker actorFromTableRow = t.getTableView().getItems().get(tableRow);
                    actorFromTableRow.setNumberOfFilms(t.getNewValue());
                });

        amountOfMoneyMade.setOnEditCommit(
                (TableColumn.CellEditEvent<Actor, String> t) -> {
                    int tableRow = t.getTablePosition().getRow();
                    Moviemaker actorFromTableRow = t.getTableView().getItems().get(tableRow);
                    ((Actor) actorFromTableRow).setAmountOfMoneyMade(t.getNewValue());
                });

    }

}

