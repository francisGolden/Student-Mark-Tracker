public class StudentResults {
    private int[] results;
    private int MINIMUM_AVERAGE = 60;

    public StudentResults(int[] results) {
        this.results = results;
    }

    public void printResults(){
        for (int result: results){
            System.out.print(result + " - ");
        }
    }

    public boolean passOrFail(double average){
        return average >= MINIMUM_AVERAGE ? true : false;
    }

    public double getAverage(int[] results){
        int sum = 0;
        for (int result: results){
            sum += result;
        }
        return (double) sum / results.length;
    }
}
