package com.englishproject.core.repositories;

import com.englishproject.core.model.EnWord;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnWordRepository extends CrudRepository<EnWord, Long> {
    EnWord getById(Long id);
}
