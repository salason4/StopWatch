import java.util.Scanner;

public class Stopwatch {
    private long startTime;
    private long endTime;

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }

    public static void main(String[] args) {
        Stopwatch stopwatch = new Stopwatch();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Press 's' to start the stopwatch, 'x' to stop it.");
        String input = scanner.nextLine();

        if (input.equals("s")) {
            stopwatch.start();
        }

        input = scanner.nextLine();

        if (input.equals("x")) {
            stopwatch.stop();
            System.out.println("Elapsed time: " + stopwatch.getElapsedTime() + "ms");
        }
    }
}
