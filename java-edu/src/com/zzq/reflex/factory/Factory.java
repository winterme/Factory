package com.zzq.reflex.factory;

public class Factory {
	
	private Factory(){}
	
	public static <T> T getInstance(String className) {
		T obj = null;
		try {
			Class<?> cla = Class.forName(className);
			obj = (T)cla.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return obj;
	}
	
}
