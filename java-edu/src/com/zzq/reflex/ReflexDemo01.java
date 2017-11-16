package com.zzq.reflex;

import com.zzq.reflex.factory.Factory;
import com.zzq.reflex.factory.IFruits;
import com.zzq.reflex.factory.IMessage;

public class ReflexDemo01 {
	public static void main(String[] args) {
		IFruits apple = Factory.getInstance("com.zzq.reflex.factory.Apple");
		apple.eat();
		IMessage messageImpl = Factory.getInstance("com.zzq.reflex.factory.MessageImpl");
		messageImpl.print();
	}
}
