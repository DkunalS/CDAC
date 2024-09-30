package day06_30_09_2024.genericwithcollection;

public class Stat<T extends Number> {
    T[] num;
    public void setValue(T [] num) {
        this.num = num;
    }

    public double getAverage() {
        double sum = 0.0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i].doubleValue();
        }
        return sum / num.length;
    }

    public static void main(String[] args) {
        Integer[] intArry = {5, 6, 9, 1, 7, 6, 5};
        Stat<Integer> stat = new Stat<>();
        stat.setValue(intArry);
        System.out.println(stat.getAverage());

        Double[] dubArry = {78.6, 89.5, 57.3, 45.8};
        Stat<Double> stat1 = new Stat<>();
        stat1.setValue(dubArry);
        System.out.println(stat1.getAverage());

    }

}
