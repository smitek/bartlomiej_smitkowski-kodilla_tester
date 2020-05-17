package com.kodilla.steam.homework;

import com.kodilla.steam.User;
import com.kodilla.steam.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {
        double avgOver40 = UsersRepository.getUsersList()
                .stream()
                .filter(a -> a.getAge() >= 40)
                .map(ForumStats::getNumberOfPosts)
                .mapToInt(a -> (int) a)
                .average()
                .getAsDouble();
        System.out.println(avgOver40);

        double avgUnder40 = UsersRepository.getUsersList()
                .stream()
                .filter(b -> b.getAge() < 40)
                .map(ForumStats::getNumberOfPosts)
                .mapToInt(b -> b)
                .average()
                .getAsDouble();
        System.out.println(avgUnder40);

    }

    public static int getNumberOfPosts(User user) {
        return user.getNumberOfPosts();
    }
}