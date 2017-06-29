package com.hj.autotest;

<<<<<<< HEAD
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
=======
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;

import android.R.integer;

import com.android.ddmlib.IDevice.DeviceState;
import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class UiautomatorAsssistant extends UiAutomatorTestCase {

	/**
	 * @param args
	 */
	/*Uidevice对象
	 
	 * 
	 * zhenzhen.zong
	 * 
	 * 
	 * */
	UiDevice device;
	
	/* log 存放地址*/
	public String logpath = "/mnt/sdcard/performancellog.txt";
	
	/*定义通过哪种方式获得uiselector的int标识*/
	final int  CLICK_ID = 10;
	final int  CLICK_TEXT = 20;
	final int  CLICK_CLASS = 30;
	
	
	 UiautomatorAsssistant(UiDevice device) {
		 
		device = device;
	}
	
	public boolean ClickById(String id){
		return ClickInfo(CLICK_ID,id) ;
	}
	
	public boolean ClickByText(String text){
		return ClickInfo(CLICK_TEXT, text);
	}
	public boolean ClickByClassName(String classname) {
		return ClickInfo(CLICK_CLASS, classname);		
	}
	public boolean ClickInfo( int CLICK ,String str){
		UiSelector uislector = null;
		switch(CLICK){
		case CLICK_ID : uislector = new UiSelector().resourceId(str);break;
		case CLICK_TEXT: uislector = new UiSelector().text(str); break;
		case CLICK_CLASS: uislector = new UiSelector().className(str);break;
		default : return false;
		
		}
		
		UiObject uiobject = new UiObject(uislector);
		int i =0;
		while(!uiobject.exists()&& i<5){
			sleep(500);
			if(i==4){
				TakeScreen(getUiDevice(), str+"-not-find");
				return false;
			}
			i++;
			
			
		}
		try {
			UiAutomationLog("click type:"+CLICK+"content:"+str);
			uiobject.click();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
		
		
		
	}
	public  void TakeScreen(UiDevice device,String descrip){
		//获取当前时间
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(System.currentTimeMillis());
		String dateStr = calendar.get(Calendar.HOUR_OF_DAY)+"-"+calendar.get(calendar.MINUTE)+"-"+calendar.get(calendar.SECOND);
		
		//保存文件
		File files = new File("/mnt/sdcard/"+dateStr+"_"+descrip+".jpg");
		UiAutomationLog("TakeScreen:"+dateStr+"_"+descrip+".jpg");
		device.takeScreenshot(files);
		
	}
	
	public void  UiAutomationLog(String str) {
		//获取当前时间
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(System.currentTimeMillis());
		String dateStr = calendar.get(Calendar.HOUR_OF_DAY)+"-"+calendar.get(calendar.MINUTE)+"-"+calendar.get(calendar.SECOND);
		FileWriter fwlog = null;
		
		try {
			fwlog = new FileWriter(logpath,true);
			fwlog.write(dateStr+str+"\r\n");
			System.out.println(dateStr+str);
			fwlog.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				fwlog.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
>>>>>>> branch 'master' of https://github.com/zhenzhen15/Sample_Uia.git
	}
}
