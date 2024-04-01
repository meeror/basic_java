package controller;
import model.Human;
import model.Sex;

public class HumanCreator {
    public Human createHuman(String name,  String patronymic,String surname, Sex sex) {

        Human human = new Human();
        human.setName(name);
        human.setPatronymic(patronymic);
        human.setSex(sex);
        human.setSurname(surname);

        return human;
    }
    public  Human typicalHuman(){

        return createHuman("John","Johnson","Doe",Sex.MALE);
    }
}

