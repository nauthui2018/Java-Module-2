import java.text.SimpleDateFormat;

public class StopWatchTest {
    public static void main(String[] args) {
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss.SSS");
        StopWatch stopWatch = new StopWatch();
        long start = stopWatch.start();
        int[] array = new int[100000];
        int i,j;
        for (i=0; i< array.length; i++) {
            array[i] = (int) (Math.random()*100000);
        }
        for (i=0; i<array.length; i++) {
            for (j=1; j<array.length; j++) {
                if (array[i]>array[j]) {
                    array[i] = array[i] - array[j];
                    array[j] = array[j] + array[i];
                    array[i] = array[j] - array[i];
                }
            }
        }
        long end = stopWatch.stop();
        long time = stopWatch.getElapsedTime();
        System.out.println("Start: " + formatter.format(start));
        System.out.println("End: " + formatter.format(end));
        System.out.println("Elapsed time: " + formatter.format(time));
    }
}
