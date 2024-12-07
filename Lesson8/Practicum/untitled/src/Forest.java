import java.util.ArrayList;
import java.util.Objects;

public class Forest {
    private static ArrayList<MountainHare> hares;
    static String actualSeason;

    // объявите недостающие переменные и добавьте конструктор
    Forest(ArrayList<MountainHare> hares){
        this.hares = hares;
    }
    // добавьте метод setSeason(String newSeason)
    // в этом методе реализуйте логику смены цвета шубок зайцев-беляков
    public static void setSeason(String newSeason){
        if (Objects.equals(newSeason, "зима") || Objects.equals(newSeason, "лето")){
            actualSeason = newSeason;
            for(int i = 1; i < hares.size(); i++){
                hares.get(i).cahgeColor(actualSeason);
            }
        }
        else
            System.out.println("Указан не корректный сезон");

    }
    // добавьте метод printHares()
    public static void printHares(){
        for(int i = 1; i < hares.size(); i++) {
            System.out.println(hares.get(i).toString());
        }
    }

}