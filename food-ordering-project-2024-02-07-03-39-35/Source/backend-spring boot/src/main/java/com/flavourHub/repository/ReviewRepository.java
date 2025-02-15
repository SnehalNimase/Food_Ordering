package com.flavourHub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flavourHub.model.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {

}
