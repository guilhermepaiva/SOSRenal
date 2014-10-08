package com.development.sosrenal;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseObject;
import com.parse.ParseUser;


public class SOSRenalApplication extends Application {
	
public static final String HOSPITAL_GROUP_NAME = "ALL_HOSPITALS";
	
	@Override
	public void onCreate() {
		super.onCreate();
		
		// add Todo subclass
		ParseObject.registerSubclass(Hospital.class);
		
		// enable the Local Datastore
		Parse.enableLocalDatastore(getApplicationContext());
		Parse.initialize(this, "f5RD306BzjUahM03d6XMHOmEMVvzh6FzgBtrp8EO", "FzwHdZt0D9pldleLRgemYu0oFlwYhBllZ0uDcM2t");
		ParseUser.enableAutomaticUser();
		ParseACL defaultACL = new ParseACL();
		ParseACL.setDefaultACL(defaultACL, true);	

}
