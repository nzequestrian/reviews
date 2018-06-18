
package com.bridleplates.reviews;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class ReviewSiteRepository {

	private Map<Long, Review> reviewRepository = new HashMap<>();



	public ReviewSiteRepository() 
	{
		Review TrailOneReview = new Review(2L, "Franz Joseph Glacier", "/img/franz.jpg", "Trail rating: Easy to Advanced", "If you’re fit, adventurous, "
				+ "and able to spend around 3 hours hiking on the ice wearing crampons, then the Ice Explorer is an experience you'll never forget. "
				+ "Choose the Ice Explorer for the most time on the ice. If you’re somewhat fit, still adventurous but would like to take "
				+ "things a bit slower, then the Glacier Heli Hike is the hike for you. For those who are not quite so fit but still "
				+ "want to relish in the breathtaking scenery of the towering mountains, rainforest, and glacial views then the Glacier Valley"
				+ "walk is perfect and would be suitable for the whole family.");
		Review TrailTwoReview = new Review(3L, "Fox Glacier", "/img/foxGlacier.jpg",  "Trail rating: Moderate to Advanced","We really underestimated how "
				+ "jam-packed this day would be!  We heli-hiked onto the glacier and gazed upon the most reflective lake in New Zealand. You don't need "
				+ "to be as fit for this hike.  You will view spectacular ice caves and huge ice arches. Walking the valley bed is a adventure in itself."
				+ "You'll be surrounded by towering mountains while walking on the valley bed. The environment here is ever changing "
				+ "and even the journey of the Fox Glacier goes through varying different landscapes itself starting from mountains "
				+ "which are over 3,000m and making their way all the way to the rainforest. And it’s through a lot of huffing and puffing "
				+ "that are tackling the last section of the trail. The last 200m of the trails are getting super steep and the rocks "
				+ "are even looser than they were before making the walk a really really big challenge. But once we arrive on top in "
				+ "front of the viewing platform we are absolutely mind blown.");
		Review TrailThreeReview = new Review(4L, "Mueller Hutt - Mt Olliver", "/img/mtOlliver.jpg","Trail rating: Moderate to Advanced - Alpine experience "
				+ "recommened for summit hikes","Mount Ollivier is a 1,933-meter tall peak in the Sealy Range of the Southern Alps in Aoraki Mount Cook "
				+ "National Park. In 1939, Sir Edmond Hillary summited the mountain in what is recognized as his first major climb. "
				+ "(He went on to bag some other noteworthy peaks as well…) To get to the top of Mount Ollivier, you will first need to "
				+ "make your way to Mueller Hut, which is accomplished by trekking up Sealy Tarns Track and Mueller Hut Route, gaining "
				+ "1,808 meters over 5.4 kilometers. If you’re still feeling energetic after that steep effort,it only takes about "
				+ "thirty minutes to ascend another 125 meters to the summit. No pole-guided route leads to the mountaintop, so the path"
				+ " is yours to forge. It should be about 1.2 kilometer round trip from Mueller hut to Mount Ollivier summit");

		this.addReview(TrailOneReview);
		this.addReview(TrailTwoReview);
		this.addReview(TrailThreeReview);

	}
	public Map<Long, Review> getReviewRepository() {
		return reviewRepository;
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
