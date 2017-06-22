package controller;

import model.Stad;
import service.BewonerService;
import test.JUnit;

/**
 * Created by farshid on 6/22/17.
 */
public class Kut {
    public static void main(String[] args) {
JUnit unit = new JUnit();
        BewonerService b = new BewonerService();
        Stad stad = new Stad();
     b.getCities().add(stad);

        unit.iets(stad);

    }
}
