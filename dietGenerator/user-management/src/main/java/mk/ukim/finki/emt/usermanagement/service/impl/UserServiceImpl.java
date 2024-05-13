package mk.ukim.finki.emt.usermanagement.service.impl;

import lombok.NonNull;
import mk.ukim.finki.emt.usermanagement.domain.model.User;
import mk.ukim.finki.emt.usermanagement.domain.model.UserId;
import mk.ukim.finki.emt.usermanagement.domain.repository.UserRepository;
import mk.ukim.finki.emt.usermanagement.domain.valueObjects.Goal;
import mk.ukim.finki.emt.usermanagement.service.UserService;
import mk.ukim.finki.emt.usermanagement.service.forms.UserForm;
import org.springframework.stereotype.Service;

import javax.xml.validation.Validator;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;


    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Optional<User> findById(UserId userId) {
        return userRepository.findById(userId);
    }

    @Override
    public void addUser(UserForm userForm, @NonNull Goal goal) {
        User user = new User(userForm.getUserInfo(), goal);
        userRepository.saveAndFlush(user);
    }
}
