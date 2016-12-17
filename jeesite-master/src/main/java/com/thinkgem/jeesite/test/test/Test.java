package com.thinkgem.jeesite.test.test;

import java.io.File;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("G:/KuGouMVmp4");
		String[] fileName = file.list();
		for(String s:fileName){
			System.out.println(s);
			/*String name = s.substring(0,s.indexOf("-")).trim();
			String musicName = s.substring(s.indexOf("-")+1).trim();
			System.out.println(name+":"+musicName);*/
		}
	}

}
