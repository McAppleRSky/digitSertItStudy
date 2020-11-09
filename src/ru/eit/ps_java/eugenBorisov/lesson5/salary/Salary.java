package ru.eit.ps_java.eugenBorisov.lesson5.salary;

import ru.eit.ps_java.eugenBorisov.lesson5.salary.type.plain.Worker;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Salary {

    private static final Logger logger;

    static {
        System.setProperty("java.util.logging.SimpleFormatter.format", "[%1$tF %1$tT] [%4$-7s] %5$s %n");
        logger = Logger.getLogger(Salary.class.getName());
        logger.setLevel(Level.WARNING);
    }

    static Worker[] worker = new Worker[7];
    private static WorkerSource workerSource = new WorkerSource();

    public static void main(String[] args) {
        http://do.academyit.ru/course/view.php?id=666
        for (int i=0; i<worker.length;i++)
            worker[i]=workerSource.hireWorker();
        System.out.println("ФИО\tВозраст");
        for(Worker checkRichWorker:worker){
            logger.info( checkRichWorker.getFio()+", "
                    +checkRichWorker.getAge()+ ", "
                    +checkRichWorker.getSalary() );
            if(checkRichWorker.getSalary()>30000)
                System.out.println(checkRichWorker.getFio()+"\t"+checkRichWorker.getAge());
        }
    }

}
