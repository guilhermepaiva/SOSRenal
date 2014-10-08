package com.development.sosrenal;

import java.util.UUID;

import com.parse.ParseClassName;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.parse.ParseUser;


@ParseClassName("Hospital")
public class Hospital extends ParseObject {
	
	public String getHospitalName() {
		return getString("hospitalName");
	}
	
	public void setHospitalName(String hospitalName) {
		put("hospitalName", hospitalName);
	}
	
	public ParseUser getAuthor() {
		return getParseUser("author");
	}
	
	public void setAuthor(ParseUser currentUser) {
		put("author", currentUser);
	}
	
	public boolean isDraft() {
		return getBoolean("isDraft");
	}
	
	public void setDraft(boolean isDraft) {
		put("isDraft", isDraft);
	}
	
	public void setUuidString() {
	    UUID uuid = UUID.randomUUID();
	    put("uuid", uuid.toString());
	}
	
	public String getUuidString() {
		return getString("uuid");
	}
	
	public static ParseQuery<Hospital> getQuery() {
		return ParseQuery.getQuery(Hospital.class);
	}

}
