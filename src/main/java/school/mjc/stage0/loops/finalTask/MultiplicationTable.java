package school.mjc.stage0.loops.finalTask;

public class MultiplicationTable {
    public void printTable(int n){
        for (int i = 1; i < 11; i++) {
            System.out.printf("%d x %d = %d%n", i, n, i * n);
        }
    }
}
