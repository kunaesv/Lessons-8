public class MountainHare {

    private int age;
    private double weight, jumpLength;
    private String color;

    // добавьте переменные и конструктор
    MountainHare(int age, double weight, double jumpLength){
        this.age = age;
        this.weight = weight;
        this.jumpLength = jumpLength;
    }
    public void cahgeColor(String season){
        if (season.equals("зима"))
            color = "белый";
        else if (season.equals("лето"))
            color = "серо-рыжий";
    }

    @Override
    public String toString() {
        return "Заяц-беляк: " +
                "age=" + age +
                ", weight=" + weight +
                ", jumpLength=" + jumpLength +
                ", color=" + color +
                '.';
    }
}