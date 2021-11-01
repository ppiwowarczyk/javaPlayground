package collectDemo;

public class CollectingResult {
    private int sum;
    private double average;

    public CollectingResult(int sum, double average) {
        this.sum = sum;
        this.average = average;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }
}
