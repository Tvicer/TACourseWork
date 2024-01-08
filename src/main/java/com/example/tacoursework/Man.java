package com.example.tacoursework;

import java.util.Random;

public class Man {

    int food;
    int water;
    int sleep;
    int study;
    int work;

    public int getFood() {
        return food;
    }

    public int getWater() {
        return water;
    }

    public int getSleep() {
        return sleep;
    }

    public int getStudy() {
        return study;
    }

    public int getWork() {
        return work;
    }

    public Man() {
        Random random = new Random();
        food = random.nextInt(12);
        water = random.nextInt(12);
        sleep = random.nextInt(12);
        study = random.nextInt(12);
        work = random.nextInt(12);

    }

    public enum manStatus {
        EAT,
        DRINK,
        SLEEP,
        STUDY,
        WORK,
        NOTHING
    }

    public manStatus tick() {
        if (work < 20)
            work += 2;
        if (work > 20)
            work = 20;

        if (sleep < 20)
            sleep += 3;
        if (sleep > 20)
            sleep = 20;

        if (food < 20)
            food += 4;
        if (food > 20)
            food = 20;

        if (study < 20)
            study += 5;
        if (study > 20)
            study = 20;

        if (water < 20)
            water += 6;
        if (water > 20)
            water = 20;



        if (water == 20) {
            water = 0;
            return manStatus.DRINK;
        }

        if (food == 20) {
            food = 0;
            return manStatus.EAT;
        }

        if (study == 20) {
            study = 0;
            return manStatus.STUDY;
        }

        if (work == 20) {
            work = 0;
            return manStatus.WORK;
        }

        if (sleep == 20) {
            sleep = 0;
            return manStatus.SLEEP;
        }

        return manStatus.NOTHING;
    }
}
