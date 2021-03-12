package com.englishproject.core.repositories;

import com.englishproject.core.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    User getById(Long id);

    @Override
    Optional<User> findById(Long aLong);
}
