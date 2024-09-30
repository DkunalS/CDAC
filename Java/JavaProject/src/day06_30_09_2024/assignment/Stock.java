package day06_30_09_2024.assignment;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.time.temporal.ChronoUnit;


public class Stock
{

    public void printList(List<Toy> toyList) {
        for (Toy toy : toyList) {
            System.out.println(toy);
        }
    }

    public List<Toy> filterCategory(List<Toy> toyList, String category)
    {
        List<Toy> filterList = new ArrayList<>();
        for (Toy toy : toyList)
        {
            if (toy.getCategory().equals(category)) {
                filterList.add(toy);
            }
        }
        return filterList;
    }

    public List<Toy> priceRange(List<Toy> toyList, double low, double high)
    {
        List<Toy> priceRangeList = new ArrayList<>();
        for (Toy toy : toyList) {
            if ((low < toy.getPrice()) && (high > toy.getPrice())) {
                priceRangeList.add(toy);
            }
        }
        return priceRangeList;
    }

    public List<Toy> SpecificAge(List<Toy> toyList, int age)
    {
        List<Toy> ageSpecificList = new ArrayList<>();
        for (Toy toy : toyList) {
            if (toy.getAge() <= age) {
                ageSpecificList.add(toy);
            }
        }
        return ageSpecificList;
    }

    public List<Toy> olderProduct(List<Toy> toyList, int timePeriod)
    {
        LocalDate today = LocalDate.now();
        List<Toy> ageSpecificList = new ArrayList<>();
        for (Toy toy : toyList) {
            long totalDays = ChronoUnit.DAYS.between(toy.getDate(), today);
            if (totalDays > timePeriod) {
                ageSpecificList.add(toy);
            }
        }
        return ageSpecificList;
    }
}
