package com.example.springjpademo.service;

import com.example.springjpademo.bd.BDUser;
import com.example.springjpademo.helper.EntityHelper;
import com.example.springjpademo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<BDUser> getAllUsers(){
        return EntityHelper.entityToBd(userRepository.findAll());
    }

    public BDUser getUser(long id){
        return EntityHelper.entityToBd(userRepository.findOneById(id));
    }

    public Optional<BDUser> getUserOptional(long id){
        return EntityHelper.entityToBd(userRepository.findById(id));
    }

    public void addUser(BDUser bdUser){
        userRepository.save(EntityHelper.bdToEntity(bdUser));
    }

    public void delete(long id){
        userRepository.deleteById(id);
    }

    public List<BDUser> getUserByName(String name) {
        return EntityHelper.entityToBd(userRepository.getUserByName(name));
    }
}
