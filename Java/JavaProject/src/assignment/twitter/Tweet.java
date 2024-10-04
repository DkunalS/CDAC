package assignment.twitter;

import java.time.LocalDate;
import java.util.HashSet;

public class Tweet {
    private int tweetId;
    private String subject;
    private int views;
    private LocalDate dateOfPost;
    HashSet<String> hashtags;

    public Tweet(int tweetId, String subject, int views, HashSet<String> hashtags, LocalDate dateOfPost) {
        this.tweetId = tweetId;
        this.subject = subject;
        this.dateOfPost = dateOfPost;
        this.views = views;
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

    public int getviews() {
        return views;
    }

    public void setViews(int noOfViews) {
        this.views = noOfViews;
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
                ", noOfViews=" + views +
                ", hashtags=" + hashtags +
                '}';
    }
}
