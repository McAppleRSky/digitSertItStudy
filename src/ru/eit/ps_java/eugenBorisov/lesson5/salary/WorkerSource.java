package ru.eit.ps_java.eugenBorisov.lesson5.salary;

import ru.eit.ps_java.eugenBorisov.lesson5.salary.type.plain.Worker;

public class WorkerSource implements WorkerSourceSamples {

    String genFio(String family, String name, String surname){
        StringBuilder stringBuilder = new StringBuilder();
        return stringBuilder
                .append(family)
                .append(" ")
                .append(name.charAt(0))
                .append(".")
                .append(surname.charAt(0))
                .append(".")
                .toString();
    }

    public Worker hireWorker(){
        /**
         * default [0;1)
         * for [a; b)
         * Math.random()*(b-a)+a
         */
        String fio =genFio(
                familySample[(int) (Math.random()*familySample.length)],
                nameSample[(int) (Math.random()*nameSample.length)],
                surnameSample[(int) (Math.random()*surnameSample.length)]
        );
        Worker result = null, worker = new Worker(fio,
                (int)(Math.random()*(45000-15000)+15000),
                (int)(Math.random()*(2003-1900)+1900)
        );
        if(worker.getAge()<18 || worker.getSalary()<15000)
            throw new NullPointerException( "Incorrect worker at class " + this.getClass() );
        else result = worker;
        return result;
    }

}
