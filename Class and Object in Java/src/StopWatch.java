import java.util.Date;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
        startTime = this.start();
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public long start() {
        Date time = new Date();
        startTime = time.getTime();
        return startTime;
    }

    public long stop() {
        Date time = new Date();
        endTime = time.getTime();
        return endTime;
    }

    public long getElapsedTime() {
        return this.getEndTime() - this.getStartTime();
    }
}
