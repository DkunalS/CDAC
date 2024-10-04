package day07_03_10_2024.assignment.twitter;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TwitterApp {
    public List<Tweet> initializedTweet() {
        List<Tweet> tweetList = new ArrayList<Tweet>();
        tweetList.add(new Tweet(100,"political", 15000, new HashSet<>(Set.of("#JanShaktiParty", "#Democaracy")), LocalDate.of(2024,5, 2)));
        tweetList.add(new Tweet(101,"educational", 12912, new HashSet<>(Set.of("#study","#jobs", "#knowledge")),LocalDate.of(2023,8, 5)));
        tweetList.add(new Tweet(102,"economy", 9452, new HashSet<>(Set.of("#stocks","#economy", "#sebi")),LocalDate.of(2024,10, 2)));
        tweetList.add(new Tweet(103,"social", 9854, new HashSet<>(Set.of("#poor","#inequality", "#justice")),LocalDate.of(2021,9, 2)));
        tweetList.add(new Tweet(104,"global", 14656, new HashSet<>(Set.of("#russia","#ukrain", "#israel")),LocalDate.of(2024,10, 3)));
        tweetList.add(new Tweet(105,"historical", 12951, new HashSet<>(Set.of("#maratha","#shivaji", "#peshwa")),LocalDate.of(2023,8, 2)));
        tweetList.add(new Tweet(106,"global", 15753, new HashSet<>(Set.of("#usa","#china", "#russia")),LocalDate.of(2021,9, 15)));
        return tweetList;
    }
    public static void main(String[] args) {
        TwitterApp twitterApp = new TwitterApp();
        List<Tweet> tweetList = twitterApp.initializedTweet();

        System.out.println("---------List of all tweets that are posted in current month-------------");
        Stream<Tweet> tweetStream = tweetList.stream();
        tweetStream.filter((tweet) -> (tweet.getDateOfPost().getMonthValue()) == (LocalDate.now().getMonthValue())).forEach(System.out::println);

        System.out.println("\n-----------------List all the tweet for the hashtag for #russia-------------------");
        tweetStream = tweetList.stream();
        tweetStream.filter((tweet) -> tweet.getHashtags().contains("#russia")).forEach(System.out::println);

        System.out.println("\n---------------------Count the Tweet by Subject------------------------");
        tweetStream = tweetList.stream();
        Map<String,List<Tweet>> countTweetBySub = tweetStream.collect(Collectors.groupingBy(Tweet::getSubject));
        countTweetBySub.forEach((key, value) -> System.out.println(key + " : " + value.size()));

        System.out.println("\n---------------List the Tweets by got more than 10k view---------------");
        tweetStream = tweetList.stream();
        tweetStream.filter((tweet) -> (tweet.getNoOfViews() > 10000)).forEach(System.out::println);

        System.out.println("\n------------------Print the top 5 trending tweets----------------------");
        tweetStream = tweetList.stream();
        tweetStream.sorted(Comparator.comparing(Tweet::getNoOfViews).reversed()).limit(5).forEach(System.out::println);
    }
}
