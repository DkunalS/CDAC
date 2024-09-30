package day02_25_09_2024;

public class Sorting {

    public static void sortArray(int [] a)
    {
        for (int i = 0; i < a.length; i++)
        {
            for (int j = i+1; j < a.length; j++)
            {
                if (a[i] > a[j])
                {
                    System.out.println(a[i]);
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
//       int [] sorted_array = (a);
    }

    public static void main(String[] args) {
        int [] a = {5,8,1,3,6};

        sortArray(a);

    }
}
