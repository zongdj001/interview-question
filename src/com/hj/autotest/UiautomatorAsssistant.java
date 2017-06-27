package com.hj.autotest;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class UiautomatorAsssistant extends UiAutomatorTestCase {

	/**
	 * @param args
	 */
	UiDevice device;
	/* log 存放地址*/
	final int  CLICK_ID = 10;
	final int  CLICK_TEXT = 20;
	
	public boolean ClickById(String id){
		return ClickInfo(CLICK_ID,id) ;
	}
	public boolean ClickInfo( int CLICK ,String str){
		UiSelector uislector = null;
		switch(CLICK){
		case CLICK_ID : uislector = new UiSelector().resourceId(str);break;
		case CLICK_TEXT: uislector = new UiSelector().text(str); break;
		default : return false;
		
		}
		
		UiObject uiobject = new UiObject(uislector);
		if(!uiobject.exists()){
			return false;
			
		}
		try {
			uiobject.click();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}
}
