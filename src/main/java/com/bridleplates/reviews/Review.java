package com.bridleplates.reviews;

public class Review {

	private long trailId;
	private String title;
	private String imgUrl;
	private String category;
	private String content;

	public Review(long trailId, String title, String imgUrl,String category, String content) {
		super();
		this.trailId = trailId;
		this.title = title;
		this.imgUrl = imgUrl;
		this.category = category;
		this.content = content;
	}

	public Long getTrailId() {
		return trailId;
	}

	public String getTitle() {
		return title;
	}

	public String getImgUrl() {
		return imgUrl;
	}
	
	public String getCategory() {
		return category;
	}

	public String getContent() {
		return content;
	}

}
