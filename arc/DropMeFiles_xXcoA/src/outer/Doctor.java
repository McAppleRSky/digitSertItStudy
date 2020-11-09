package outer;
//import main.Man;
public class Doctor {
    void cure(){
        var man = new main.Man();
        man.go();
        System.out.println("Свойство лечить");
    }

}
