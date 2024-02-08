package com.example.hanziflashcardbe.controllers;

import com.example.hanziflashcardbe.entities.Review;
import com.example.hanziflashcardbe.repositories.ReviewRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/review")
public class ReviewController {

    private final ReviewRepository reviewRepository;

    ReviewController(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    @GetMapping("")
    public List<Review> getReviews() {
        return reviewRepository.findAll();
    }

    @GetMapping("/{id}")
    public Review getReview(@PathVariable Long id) {
        Optional<Review> review = reviewRepository.findById(id);
        return review.orElse(null);
    }
}
