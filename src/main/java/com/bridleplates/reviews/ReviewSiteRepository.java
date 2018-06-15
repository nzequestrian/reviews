
package com.bridleplates.reviews;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ReviewSiteRepository {

	private Map<Long, Review> reviewRepository = new HashMap<Long, Review>();

	public ReviewSiteRepository() {
		Review TrailOneReview = new Review(2L, "Trail One Review", "TrailOneImg", "Easy", "This is Trail One");
		Review TrailTwoReview = new Review(3L, "Trail Two Review", "TrailTwoImg", "Moderate",
				"This is a review of trail two");
		Review TrailThreeReview = new Review(4L, "Trail Three Review", "TrailThreeImg", "Difficult",
				"This is a review of trail three");

		this.addReview(TrailOneReview);
		this.addReview(TrailTwoReview);
		this.addReview(TrailThreeReview);

	}

	public int getSizeOfRepository() {
		return reviewRepository.size();
	}

	public void addReview(Review review) {
		reviewRepository.put(review.getTrailId(), review);
	}

	public Collection<Review> getReviews() {
		return reviewRepository.values();
	}

	public Review findById(Long trailId) {
		return reviewRepository.get(trailId);
	}

	

}
