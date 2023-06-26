package com.uruburu.treasuebin.treasure;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TreasureRepository extends JpaRepository<Treasure, Long> {
    public Optional<Treasure> findById(Long id);

    public Treasure findByTitle(String title);

}
