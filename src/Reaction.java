public class Reaction {

    private int counter = 0;
    private int maxCounter = 0;

    public Reaction(int maxCounter){
        this.maxCounter = maxCounter;

    }
    public void reaction (){
        System.out.printf("Reaction - Habe reagieret %d\n", counter);
        if (counter > maxCounter)
            System.out.printf("Ende");
        counter++;
    }
}
