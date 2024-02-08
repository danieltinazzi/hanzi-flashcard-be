package com.example.hanziflashcardbe.entities;

import com.example.hanziflashcardbe.enums.ReviewStatus;
import com.example.hanziflashcardbe.enums.ReviewType;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Enumerated(EnumType.STRING)
    private ReviewType type;
    private int level;

    @ManyToOne
    private Flashcard flashcard;

    @ManyToMany
    @JoinTable(
        name = "review_options",
        joinColumns = @JoinColumn(name = "review_id"),
        inverseJoinColumns = @JoinColumn(name = "flashcard_id"))
    private List<Flashcard> options;

    @Enumerated(EnumType.STRING)
    private ReviewStatus status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ReviewType getType() {
        return type;
    }

    public void setType(ReviewType type) {
        this.type = type;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Flashcard getFlashcard() {
        return flashcard;
    }

    public void setFlashcard(Flashcard flashcard) {
        this.flashcard = flashcard;
    }

    public List<Flashcard> getOptions() {
        return options;
    }

    public void setOptions(List<Flashcard> options) {
        this.options = options;
    }

    public ReviewStatus getStatus() {
        return status;
    }

    public void setStatus(ReviewStatus status) {
        this.status = status;
    }
}
