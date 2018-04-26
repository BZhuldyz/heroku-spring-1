package kz.kaznitu.course.services;

import kz.kaznitu.course.models.User;

public interface UserService {
    public User findUserByEmail(String email);
    public void saveUser(User user);
}
