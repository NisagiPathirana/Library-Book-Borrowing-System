package edu.icet.service;

import edu.icet.model.dto.Book;
import edu.icet.model.dto.User;
import edu.icet.model.entity.BookEntity;
import edu.icet.model.entity.UserEntity;
import edu.icet.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public void save(User user){

         UserEntity userEntity= new UserEntity(
                user.getUserId(),
                user.getName(),
                user.getEmail(),
                 user.getPhone(),
                user.getAddress(),
                user.getMembershipDate()
        );

        userRepository.save(userEntity);
    }
}
