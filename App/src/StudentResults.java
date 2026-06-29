public class StudentResults {
    private static int MINIMUM_AVERAGE = 60;

    public void printResults(int[] results){
        for (int result: results){
            System.out.print(result + " - ");
        }
    }

    public static boolean passOrFail(double average){
        return average >= MINIMUM_AVERAGE ? true : false;
    }

    public static double getAverage(int[] results){
        int sum = 0;
        for (int result: results){
            sum += result;
        }
        return (double) sum / results.length;
    }
}
