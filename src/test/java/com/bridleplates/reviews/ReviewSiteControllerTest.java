package com.bridleplates.reviews;

import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest(ReviewSiteController.class)
public class ReviewSiteControllerTest {

	@Resource
	MockMvc mvc;

	@MockBean
	ReviewSiteRepository reviewRepo;

	@Mock
	Review review;

	ReviewSiteController reviewController = new ReviewSiteController();

	@Test
	public void shouldReturnReviews() throws Exception {
		mvc.perform(get("/reviews")).andExpect(view().name(is(equalTo("reviews"))));
	}

	@Test
	public void shouldReturn2xxSuccessOfReviews() throws Exception {
		mvc.perform(get("/reviews")).andExpect(status().is2xxSuccessful());

	}

	@Test
	public void shouldReturnModel() throws Exception {
		mvc.perform(get("/reviews")).andExpect(model().attribute("reviews", reviewRepo.getReviews()));
	}

}
