package day05_28_09_2024.collections;


public class DemoGeneric <T>{
    T data;
    public DemoGeneric(T data) {
        this.data = data;
    }
    public String getClassName() {
        return data.getClass().getName();
    }

    public static void main(String[] args) {
        DemoGeneric<Integer> dmgI = new DemoGeneric<Integer>(15);
        System.out.println(dmgI.getClassName());

        DemoGeneric<String> dmgS = new DemoGeneric<String>("Hello");
        System.out.println(dmgS.getClassName());
    }
}
