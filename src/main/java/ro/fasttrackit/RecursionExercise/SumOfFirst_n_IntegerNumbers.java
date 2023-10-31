package ro.fasttrackit.RecursionExercise;

public class SumOfFirst_n_IntegerNumbers {

    public static int sum(int n){
        if(n == 1){
            return 1;
        }
        return n + sum(n-1);
    }

}
