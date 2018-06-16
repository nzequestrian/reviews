package com.bridleplates.reviews;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.Collection;

import org.junit.Test;

public class ReviewSiteRepositoryTest {
	ReviewSiteRepository reviewRepo = new ReviewSiteRepository();
	Review review = new Review(999L, "Test Title", "testImgUrl", "category", "content");

	@Test
	public void shouldAddNewReviewToSiteRepo() {

		int reviewRepoSizeBeforeAdding = reviewRepo.getSizeOfRepository();
		reviewRepo.addReview(review);
		int reviewRepoSizeAfterAdding = reviewRepo.getSizeOfRepository();
		assertThat(reviewRepoSizeAfterAdding, is(equalTo(reviewRepoSizeBeforeAdding + 1)));
	}

	@Test
	public void shouldReturnAllValuesOfRepository() {
		Collection<Review> underTest = reviewRepo.getReviews();
		int actualSizeOfCollection = underTest.size();
		int expectedSizeOfCollection = 3;
		assertThat(actualSizeOfCollection, is(equalTo(expectedSizeOfCollection)));
	}

	@Test
	public void shouldReturnAReview() {
		for (Review review : reviewRepo.getReviews()) {
			assertTrue(review instanceof Review);
		}
	}

	@Test
	public void shouldReturnReviewById() {

		reviewRepo.addReview(review);
		Review underTest = reviewRepo.findById(999L);

		Long expectedReviewId = 999L;
		assertThat(underTest.getTrailId(), is (equalTo(expectedReviewId)));

	}

}
