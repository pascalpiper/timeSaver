public class Saver {

    private int millisekunden;
    private int maxCounter;

    public Saver(int millisekunden, int maxCounter){
        this.millisekunden = millisekunden;
        this.maxCounter = maxCounter;
        save();
    }

    public void save(){
        Reaction testReaction = new Reaction(maxCounter);
        Time testTime = new Time();
        testTime.time(millisekunden, testReaction);
        }
    }

