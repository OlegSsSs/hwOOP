package hwSeminar2.Aquarium;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {
    private List<Fish> listFish = new ArrayList<>();

    public List<Fish> getListFish(){
        return listFish;
    }

    public Aquarium addList(Fish fish){
        listFish.add(fish);
        return this;
    }

    public List<Volumeable> volumeables(){
        List<Volumeable> volumeables = new ArrayList<>();
        for (var item: listFish){
            if (item instanceof Volumeable)
                volumeables.add((Volumeable) item);
        }
        return volumeables;
    }

    public List<Temperatureable> temperatureables(){
        List<Temperatureable> temperatureables = new ArrayList<>();
        for (var item: listFish){
            if (item instanceof Temperatureable)
                temperatureables.add((Temperatureable) item);
        }
        return temperatureables;
    }

    public List<Hardnesswaterable> hardnesswaterables(){
        List<Hardnesswaterable> hardnesswaterables = new ArrayList<>();
        for (var item: listFish){
            if (item instanceof Hardnesswaterable)
                hardnesswaterables.add((Hardnesswaterable) item);
        }
        return hardnesswaterables;
    }


}
