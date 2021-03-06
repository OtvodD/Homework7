public class Plate {

    private int food;

    public Plate(int food){
            this.food = food;
    }

    public void decreaseFood(int n)
    {
        if (n > food)
        {
            return;
        }
        food -= n;

    }

    public void info()
    {
        System.out.println("В тарелке осталось " + food + " еды");
    }

    public boolean hasFood(int appetite)
    {
        return appetite <= food;
    }

    public void addition(int food)
    {
        this.food += food;
    }
}
