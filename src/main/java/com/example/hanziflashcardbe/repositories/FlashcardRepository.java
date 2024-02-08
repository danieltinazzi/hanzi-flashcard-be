package com.example.hanziflashcardbe.repositories;

import com.example.hanziflashcardbe.entities.Flashcard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlashcardRepository extends JpaRepository<Flashcard, Long> {
}
