package day07_03_10_2024.assignment.twitter;

import java.time.LocalDate;
import java.util.HashSet;

public class Tweet {
    private int tweetId;
    private String subject;
    private int noOfViews;
    private LocalDate dateOfPost;
    HashSet<String> hashtags;

    public Tweet(int tweetId, String subject, int noOfViews, HashSet<String> hashtags, LocalDate dateOfPost) {
        this.tweetId = tweetId;
        this.subject = subject;
        this.dateOfPost = dateOfPost;
        this.noOfViews = noOfViews;
        this.hashtags = hashtags;
    }

    public int getTweetId() {
        return tweetId;
    }

    public void setTweetId(int tweetId) {
        this.tweetId = tweetId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public LocalDate getDateOfPost() {
        return dateOfPost;
    }

    public void setDateOfPost(LocalDate dateOfPost) {
        this.dateOfPost = dateOfPost;
    }

    public int getNoOfViews() {
        return noOfViews;
    }

    public void setNoOfViews(int noOfViews) {
        this.noOfViews = noOfViews;
    }

    public HashSet<String> getHashtags() {
        return hashtags;
    }

    public void setHashtags(HashSet<String> hashtags) {
        this.hashtags = hashtags;
    }

    @Override
    public String toString() {
        return "Tweet{" +
                "subject='" + subject + '\'' +
                ", dateOfPost=" + dateOfPost +
                ", noOfViews=" + noOfViews +
                ", hashtags=" + hashtags +
                '}';
    }
}
