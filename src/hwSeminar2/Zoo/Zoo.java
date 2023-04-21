package hwSeminar2.Zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> listAnimal = new ArrayList<>();

    public List<Animal> getListAnimal(){
        return listAnimal;
    }

    public Zoo addList(Animal animal){
        listAnimal.add(animal);
        return this;
    }

    private Radio radio;

    public void setRadio(Radio radio) {
        this.radio = radio;
    }

    public List<Sayable> getSayable(){
        List<Sayable> sayables = new ArrayList<>();
        for (var item: listAnimal){
            sayables.add(item);
        }
        sayables.add(radio);
        return sayables;
    }

    public List<Walkable> walkable(){
        List<Walkable> walkables = new ArrayList<>();
        for (var item: listAnimal){
            if (item instanceof Walkable)
                walkables.add((Walkable) item);  //приведение к типу
        }
        return walkables;
    }

    public List<Flyable> flyable(){
        List<Flyable> flyables = new ArrayList<>();
        for (var item: listAnimal){
            if (item instanceof Flyable)
                flyables.add((Flyable) item);
        }
        return flyables;
    }

    public List<Swimable> swimable(){
        List<Swimable> swimables = new ArrayList<>();
        for (var item: listAnimal){
            if (item instanceof Swimable)
                swimables.add((Swimable) item);
        }
        return swimables;
    }

    public Walkable winnerWalk(){
        int index = 0;
        for (int i = 0; i < walkable().size(); i++) {
            if (walkable().get(i).speedForWalk() > walkable().get(index).speedForWalk())
                index = i;
        }
        return walkable().get(index);
    }

    public Flyable winnerFly(){
        int index = 0;
        for (int i = 0; i < flyable().size(); i++) {
            if (flyable().get(i).speedForFly() > flyable().get(index).speedForFly())
                index = i;
        }
        return flyable().get(index);
    }

    public Swimable winnerSwim(){
        int index = 0;
        for (int i = 0; i < swimable().size(); i++) {
            if(swimable().get(i).speedForSwim() > swimable().get(index).speedForSwim())
                index = i;
        }
        return swimable().get(index);
    }
}
