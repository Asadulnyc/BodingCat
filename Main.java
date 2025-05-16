public class Main {
        public static void main(String[] args) {
        new DrawingExample();
    }
}


- File containing list of possible CodingBat questions

   - File that contains the most efficient program code of each codingBat questions as a reference
   - Feedback system that tells the user if their solution was the most efficient
   - Code that determines speed of code programs. See TimeTracker code.




   public class TimeTracker {

    public static void main(String[] args) {
        // Code block 1
        long startTime1 = System.nanoTime();
        performTask1();
        long endTime1 = System.nanoTime();
        long duration1 = endTime1 - startTime1;
        System.out.println("Task 1 execution time: " + duration1 + " nanoseconds");

        // Code block 2
        long startTime2 = System.nanoTime();
        performTask2();
        long endTime2 = System.nanoTime();
        long duration2 = endTime2 - startTime2;
        System.out.println("Task 2 execution time: " + duration2 + " nanoseconds");
    }

    static void performTask1() {
        // Simulate some work
        try {
            Thread.sleep(1000); // Sleep for 1 second
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    static void performTask2() {
        // Simulate some other work
        int sum = 0;
        for (int i = 0; i < 1000000; i++) {
            sum += i;
        }
    }
}