public class Cat {

    private String name;
    private int appetite;
    public boolean satiety;

    public Cat(String name, int appetite)
    {
        this.name = name;
        this.appetite = appetite;
        satiety = false;
    }

    public void eat(Plate plate)
    {
        if(plate.hasFood(appetite) && !satiety) {
            plate.decreaseFood(appetite);
            satiety = true;
            System.out.println(name + " - Покушал");
        }
        else if (satiety){
            System.out.println(name + " - сытый");
        }
        else{
            System.out.println(name + " - не хватило еды");
        }
    }

}
