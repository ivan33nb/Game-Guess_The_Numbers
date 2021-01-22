public class CreatedNumbers {

    private int i = createdNumbers();

    public int getI() {
        return i;
    }

    private int createdNumbers(){
        double b = Math.random() * 100;
        return (int) b;
    }
}
