package edu.university.leetcode.string.hard;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Travel Buddy
 * AirBnB Interview Question
 * I have a wish list of cities that I want to visit to, my friends also have city wish lists that they want to visit to.
 * If one of my friends share more than 50% (over his city count in his wish list), he is my buddy.
 * Given a list of city wish list, output buddy list sorting by similarity.
 */
public class TravelBuddy {
    private static final Logger LOG = LoggerFactory.getLogger(TravelBuddy.class);
    private List<Buddy> buddies;
    private Set<String> myWishList;

    public TravelBuddy(Set<String> myWishList, Map<String, Set<String>> friendsWishList) {
        this.buddies = new ArrayList<>();
        this.myWishList = myWishList;
        for (String name :  friendsWishList.keySet()) {
            Set<String> wishList = friendsWishList.get(name);
            Set<String> intersection = new HashSet<>(wishList);
            //intersection wishList and myWishList
            intersection.retainAll(myWishList);
            int similarity = intersection.size();
            LOG.info("similarity={} wishList={} intersection={}", similarity, wishList, intersection);
            if (similarity >= wishList.size() / 2) {
                buddies.add(new Buddy(name, similarity, wishList));
            }
        }
    }

    public List<Buddy> sortBuddies() {
        Collections.sort(buddies);
        List<Buddy> result = new ArrayList<>(buddies);
        return result;
    }

    public List<String> recommendCities(int k) {
        List<String> result = new ArrayList<>();
        List<Buddy> buddies = sortBuddies();
        int i = 0;
        LOG.info("buddies={}", buddies);
        while (k > 0 && i < buddies.size()) {
            Set<String> diff = new HashSet<>(buddies.get(i).wishList);
            diff.removeAll(myWishList);
            LOG.info("i={} k={} diff={}", i, k, diff);
            if (diff.size() <= k) {
                result.addAll(diff);
                k -= diff.size();
                i++;
            } else {
                Iterator<String> it = diff.iterator();
                while (k > 0) {
                    result.add(it.next());
                    k--;
                }
            }
        }
        return result;
    }

    class Buddy implements Comparable<Buddy> {
        String name;
        int similarity;
        Set<String> wishList;

        public Buddy(String name, int similarity, Set<String> wishList) {
            this.name = name;
            this.similarity = similarity;
            this.wishList = wishList;
        }

        @Override
        public int compareTo(Buddy that) {
            return that.similarity - this.similarity;
        }

        @Override
        public String toString() {
            return "\nBuddy{" +
                    "name='" + name + '\'' +
                    ", similarity=" + similarity +
                    ", wishList=" + wishList +
                    '}';
        }
    }

    public static void main(String[] args) {
        Set<String> myWishList = new HashSet<>(Arrays.asList("a", "b", "c", "d"));
        Set<String> wishList1 = new HashSet<>(Arrays.asList("a", "b", "e", "f"));
        Set<String> wishList2 = new HashSet<>(Arrays.asList("a", "c", "d", "g"));
        Set<String> wishList3 = new HashSet<>(Arrays.asList("c", "f", "e", "g"));
        Map<String, Set<String>> friendsWishList = new HashMap<>();
        friendsWishList.put("buddy1", wishList1);
        friendsWishList.put("buddy2", wishList2);
        friendsWishList.put("buddy3", wishList3);
        TravelBuddy test = new TravelBuddy(myWishList, friendsWishList);
        List<String> result = test.recommendCities(10);
        System.out.println("recommended " + result.size() + " cities " + result);
    }
}
