package Lesson7HW;

public class Cat {
    private String name;
    private final int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public void eat(Plate p) {
        if (p.getFood() >= 0 && this.appetite <= p.getFood()) {
            p.decreaseFood(appetite);
            this.setSatiety(true);
            System.out.println("Кот " + this.name + " поел из " + p.getName() + " и пока не голоден.");
        } else {
            System.out.println("Коту " + this.name + " не хватило еды что бы насытиться и он забил");
            this.setSatiety(false);
        }
    }

    public void isSatiety() {
        if (this.satiety == true) {
            System.out.println(this.name + " сыт");
        } else {
            System.out.println(this.name + " голоден");
        }
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }
}

