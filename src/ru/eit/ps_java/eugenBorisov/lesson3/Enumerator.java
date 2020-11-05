package ru.eit.ps_java.eugenBorisov.lesson3;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Enumerator {

    final static String resPath = "resources/lesson3";

    static int[] numbers = loadFromFile(
            JOptionPane.showInputDialog(
                    "Введите файл описью чисел.\nДоступны файлы:"
                            + listRresPath()
                            + "Результат выводится в консоль."
                    )
    );

    static HashMap<Integer, Integer> counter = new HashMap<Integer, Integer>();

    public static void main(String[] args) {
        System.out.println("\nNumbers and their count:");

        countNumber(counter, numbers);
        Object[] numberSet = counter.keySet().toArray();
        Object[] numberCount = counter.values().toArray();
        for(int i=0;i<numberSet.length;i++)
            System.out.print( numberSet[i] + (i==numberSet.length-1?"\n":"\t") );
        for(int i=0;i<numberCount.length;i++)
            System.out.print( numberCount[i] + (i==numberSet.length-1?"\n":"\t") );
    }

    private static String listRresPath() {
        StringBuilder stringBuilder = new StringBuilder();
        File path = new File(resPath);
        File[] files = path.listFiles();
        for (File file : files)
            if ( !file.isDirectory() )
                stringBuilder
                        .append("\n")
                        .append(file.getName());
        return stringBuilder.toString();
    }

    protected static void countNumber(HashMap<Integer, Integer> counter, int[] numbers) {
        for(Integer number:numbers){
            if( counter.containsKey(number) ){
                int i = counter.get(number);
                counter.put(number, ++i);
            } else counter.put(number, 1);
        }
    }

    static int[] loadFromFile(String fromFile) {
        int[] result = null;
        Scanner scanner = null;
        String stringNumbers = null;
        String[] arrayStringNumber = null;
        File file = new File(resPath, fromFile);
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while ( scanner.hasNextLine() ) stringNumbers = scanner.nextLine();
        scanner.close();
        arrayStringNumber = stringNumbers.split(" ");
        result = new int[arrayStringNumber.length];
        for(int i=0;i<arrayStringNumber.length;i++)
            result[i]=Integer.valueOf(arrayStringNumber[i]);
        if(result==null)throw new NullPointerException("Can't create array from file");
        return result;
    }

}
