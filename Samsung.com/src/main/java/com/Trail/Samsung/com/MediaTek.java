package com.Trail.Samsung.com;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class MediaTek implements MobilePro {

	@Override
	public void process() {
		// TODO Auto-generated method stub
		
		System.out.println("2nd Best CPU");
		
	}

}
