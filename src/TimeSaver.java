public class TimeSaver {
    private int minuten;
    private int maxCounter;

    public static void main(String[] args){

       int maxCounter = 5;
       int minuten = 1;

    Saver testSaver = new Saver(millisekunden(minuten), maxCounter);

    }
    public static int millisekunden (int minuten){
        int millisekungen = minuten * 60000;
        return millisekungen;
    }
}
