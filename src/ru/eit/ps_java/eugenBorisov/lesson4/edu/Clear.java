package ru.eit.ps_java.eugenBorisov.lesson4.edu;

import java.io.IOException;

import static java.lang.Runtime.getRuntime;

public class Clear {
    void doClear(){
        Runtime runtime = getRuntime();
        Process process = null;
        try {
            process = runtime.exec("clear"); //для linux, в виндовс "cls"
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
