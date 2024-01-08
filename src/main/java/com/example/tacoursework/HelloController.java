package com.example.tacoursework;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.ImageView;

public class HelloController {
    final Man man = new Man();

    @FXML
    private Label infoLabel;

    @FXML
    private ProgressBar prgWater;

    @FXML
    private ProgressBar prgFood;

    @FXML
    private ProgressBar prgSleep;

    @FXML
    private ProgressBar prgStudy;

    @FXML
    private ProgressBar prgWork;

    @FXML
    private ImageView picMan;

    public void updatePrg(ProgressBar prg, double value) {
        prg.setProgress(value);
        if (value == 1)
            prg.setStyle("-fx-accent:red;");
        else
            prg.setStyle("-fx-accent:green;");
    }

    public void showProgress() {
        updatePrg(prgWater, (double) man.getWater() / 20);
        updatePrg(prgFood, (double) man.getFood() / 20);
        updatePrg(prgSleep, (double) man.getSleep() / 20);
        updatePrg(prgStudy, (double) man.getStudy() / 20);
        updatePrg(prgWork, (double) man.getWork() / 20);
    }

    @FXML
    public void initialize() {
        showProgress();
    }

    @FXML
    void btnExecClick(ActionEvent event) {
        switch (man.tick()) {
            case NOTHING -> {
                infoLabel.setText("Ничего не делаю");
                picMan.setLayoutX(225);
                picMan.setLayoutY(315);
                picMan.setRotate(0);
            }
            case DRINK -> {
                infoLabel.setText("Пью");
                picMan.setLayoutX(520);
                picMan.setLayoutY(390);
                picMan.setRotate(0);
            }
            case EAT -> {
                infoLabel.setText("Ем");
                picMan.setLayoutX(520);
                picMan.setLayoutY(390);
                picMan.setRotate(0);
            }
            case STUDY -> {
                infoLabel.setText("Учусь");
                picMan.setLayoutX(290);
                picMan.setLayoutY(190);
                picMan.setRotate(0);
            }
            case WORK -> {
                infoLabel.setText("Работаю");
                picMan.setLayoutX(405);
                picMan.setLayoutY(40);
                picMan.setRotate(0);
            }
            case SLEEP -> {
                infoLabel.setText("Сплю");
                picMan.setLayoutX(390);
                picMan.setLayoutY(385);
                picMan.setRotate(270);
            }
        }

        showProgress();
    }

}