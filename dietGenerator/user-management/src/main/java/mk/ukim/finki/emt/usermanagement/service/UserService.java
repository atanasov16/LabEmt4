package mk.ukim.finki.emt.usermanagement.service;

import lombok.NonNull;

import mk.ukim.finki.emt.sharedkernel.domain.user.UserInfo;
import mk.ukim.finki.emt.usermanagement.domain.exceptions.UserIdNotFoundException;
import mk.ukim.finki.emt.usermanagement.domain.model.User;
import mk.ukim.finki.emt.usermanagement.domain.model.UserId;
import mk.ukim.finki.emt.usermanagement.domain.valueObjects.Goal;
import mk.ukim.finki.emt.usermanagement.service.forms.UserForm;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> findAll();
    Optional<User> findById(UserId userId);
    void addUser(UserForm userForm, @NonNull Goal goal);
//    void deleteUser(UserId userId)throws UserIdNotFoundException;
//    Optional<Diet> getUserDiet(UserId userId) throws UserIdNotFoundException;
}
