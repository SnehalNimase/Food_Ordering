package com.flavourHub.service;

import java.util.List;

import com.flavourHub.Exception.ReviewException;
import com.flavourHub.model.Review;
import com.flavourHub.model.User;
import com.flavourHub.request.ReviewRequest;

public interface ReviewSerive {
	
    public Review submitReview(ReviewRequest review,User user);
    public void deleteReview(Long reviewId) throws ReviewException;
    public double calculateAverageRating(List<Review> reviews);
}
