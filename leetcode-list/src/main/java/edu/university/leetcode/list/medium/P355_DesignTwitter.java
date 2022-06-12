package edu.university.leetcode.list.medium;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * 355. Design Twitter
 * Design a simplified version of Twitter where users can post tweets, follow/unfollow another user,
 * and is able to see the 10 most recent tweets in the user's news feed.
 * Implement the Twitter class:
 * Twitter() Initializes your twitter object.
 * void postTweet(int userId, int tweetId) Composes a new tweet with ID tweetId by the user userId.
 * Each call to this function will be made with a unique tweetId.
 * List<Integer> getNewsFeed(int userId) Retrieves the 10 most recent tweet IDs in the user's news feed.
 * Each item in the news feed must be posted by users who the user followed or by the user themselves.
 * Tweets must be ordered from most recent to least recent.
 * void follow(int followerId, int followeeId) The user with ID followerId started following the user with ID followeeId.
 * void unfollow(int followerId, int followeeId) The user with ID followerId started unfollowing the user with ID followeeId.
 * Example 1: Input ["Twitter", "postTweet", "getNewsFeed", "follow", "postTweet", "getNewsFeed", "unfollow", "getNewsFeed"]
 * [[], [1, 5], [1], [1, 2], [2, 6], [1], [1, 2], [1]]
 * Output: [null, null, [5], null, null, [6, 5], null, [5]]
 * Explanation: Twitter twitter = new Twitter();
 * twitter.postTweet(1, 5); // User 1 posts a new tweet (id = 5).
 * twitter.getNewsFeed(1);  // User 1's news feed should return a list with 1 tweet id -> [5]. return [5]
 * twitter.follow(1, 2);    // User 1 follows user 2.
 * twitter.postTweet(2, 6); // User 2 posts a new tweet (id = 6).
 * twitter.getNewsFeed(1);  // User 1's news feed should return a list with 2 tweet ids -> [6, 5]. Tweet id 6 should precede tweet id 5 because it is posted after tweet id 5.
 * twitter.unfollow(1, 2);  // User 1 unfollows user 2.
 * twitter.getNewsFeed(1);  // User 1's news feed should return a list with 1 tweet id -> [5], since user 1 is no longer following user 2.
 * Constraints:
 * 1 <= userId, followerId, followeeId <= 500
 * 0 <= tweetId <= 104
 * All the tweets have unique IDs.
 * At most 3 * 104 calls will be made to postTweet, getNewsFeed, follow, and unfollow.
 */
public class P355_DesignTwitter {
    //Map<followeeId, List<Tweet>>
    private Map<Integer, List<Tweet>> tweets;
    //Map<followerId, HashSet<followeeId>>
    private Map<Integer, HashSet<Integer>> follows;
    private static int count = 0;

    public P355_DesignTwitter() {
        follows = new HashMap<>();
        tweets = new HashMap<>();
    }

    public void postTweet(int userId, int tweetId) {
        follow(userId, userId);
        if (!tweets.containsKey(userId)) {
            tweets.put(userId, new ArrayList<>());
        }
        tweets.get(userId).add(new Tweet(tweetId, count++));
    }

    public List<Integer> getNewsFeed(int userId) {
        PriorityQueue<Tweet> q = new PriorityQueue<>(Comparator.comparingInt(o -> o.ts));
        Set<Integer> followeeIds = follows.get(userId);
        if (followeeIds != null && followeeIds.size() > 0) {
            for (Integer followeeId : followeeIds) {
                System.out.println("found followeeId = " +  followeeId);
                List<Tweet> followTweets = tweets.get(followeeId);
                if (followTweets != null && followTweets.size() > 0) {
                    for (Tweet t : followTweets) {
                        q.add(t);
                        if (q.size() > 10) {
                            q.poll();
                        }
                    }
                }
            }
        }
        List<Integer> feed = new ArrayList<>(10);
        while (!q.isEmpty()) {
            feed.add(0, q.poll().id);
        }
        return feed;
    }

    public void follow(int followerId, int followeeId) {
        if (!follows.containsKey(followerId)) {
            follows.put(followerId, new HashSet<>());
        }
        follows.get(followerId).add(followeeId);
    }

    public void unfollow(int followerId, int followeeId) {
        if (follows.containsKey(followerId) && followerId != followeeId) {
            follows.get(followerId).remove(followeeId);
        }
    }

    public static void main(String[] args) {
        P355_DesignTwitter twitter = new P355_DesignTwitter();
        twitter.postTweet(1, 5);
        System.out.println("should return [5] >>> " + twitter.getNewsFeed(1));
        twitter.follow(1, 2);
        twitter.postTweet(2, 6);
        System.out.println("should return [6, 5] >>> " + twitter.getNewsFeed(1));
        twitter.unfollow(1, 2);
        System.out.println("should return [5] >>> " + twitter.getNewsFeed(1));
    }

    private class Tweet {
        private int id;
        private int ts;
        public Tweet(int id, int ts) {
            this.id = id;
            this.ts = ts;
        }
    }
}
