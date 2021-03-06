public class Main {

    public static void main (String[] args) {
        Cat cat = new Cat("Васька", 30);
        Plate plate = new Plate(50);

        cat.eat(plate);
        plate.info();

        Cat cats[] = new Cat[5];
        cats[0] = new Cat ("Снежок", 15);
        cats[1] = new Cat ("Сима", 9);
        cats[2] = new Cat ("Мурка", 12);
        cats[3] = new Cat ("Барсик", 7);
        cats[4] = new Cat ("Сема", 14);

        do {
            for (int i = 0; i < cats.length; i++) {
                cats[i].eat(plate);
                plate.info();
            }

            addFood(plate, 20);

            System.out.println();
        }
        while (cats[cats.length - 1].satiety != true);

        System.out.println("Все коты сыты и довольны!");

    }

    public static void addFood(Plate plate,int food)
    {
        plate.addition(food);
    }
}
