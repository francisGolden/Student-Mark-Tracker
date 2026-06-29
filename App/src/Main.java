public class Main {
    public static final int[][] STUDENTS_MARKS = {
            {59, 60, 60}, // Student 1 marks
            {78, 81, 80}, // ...
            {95, 96, 99}, //
            {60, 75, 70}  //
    };
    public static void main(String[] args){
        int studentIndex = 0;
        for (int[] results: STUDENTS_MARKS){
            studentIndex++;

            double studentAverage = StudentResults.getAverage(results);
            System.out.println("student " + studentIndex + ": Average: " + studentAverage + " | RESULT: " + (StudentResults.passOrFail(studentAverage) ? "pass" : "fail"));
        }
    }
}