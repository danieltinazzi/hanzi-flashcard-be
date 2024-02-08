package com.example.hanziflashcardbe.repositories;

import com.example.hanziflashcardbe.entities.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}
