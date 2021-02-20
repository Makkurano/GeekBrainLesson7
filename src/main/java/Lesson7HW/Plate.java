package Lesson7HW;

public class Plate {
    private final String name;
    private int food;
    public Plate(String name, int food) {
        this.name = name;
        this.food = food;
    }

    public void decreaseFood(int n) {
        if (n <= this.food) {
            food -= n;
        } else {
            System.out.println("Еды в " + this.name + " недостаточно для утоления голода");
        }
    }

    public void info() {
        System.out.println("В " + this.name+ " " + food + " едениц еды");
    }

    public int getFood() {

        return food;
    }

    public String getName() {

        return name;
    }

    public void setAddFood(int add) {
        this.food += add;
        System.out.println("В " + this.name + " досыпали " + add + " еды. Теперь в нем " + this.food + " единиц еды");
    }
}
