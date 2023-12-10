package com.satyam.spring.springcore_advanced.stereotype.annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Profile {

	@Value("Senior Software Engineer")
	private String title;
	@Value("SatyamCorp")
	private String compnay;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCompnay() {
		return compnay;
	}

	public void setCompnay(String compnay) {
		this.compnay = compnay;
	}

	@Override
	public String toString() {
		return "Profile [title=" + title + ", compnay=" + compnay + "]";
	}

}
