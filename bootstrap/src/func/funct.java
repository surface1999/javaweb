package func;

import java.util.ArrayList;

import bean.cartBean;

public class funct {
	public String formart(int price) {
		String result = "";
		String strPrice = String.valueOf(price);
		int len = strPrice.length();
		int sl = len/3;
		int du = len % 3;
		for(int i = len-1; i >= 0; i-= 3) {
			if(i == du-1) {
				result =  strPrice.substring(0, i+1) + "." + result;
			}
			else
				if(i+1 == len)
					result = strPrice.substring(i-3+1, i+1);
				else
					result = strPrice.substring(i-3+1, i+1) + "." + result;	
			
		}
		return result;
	}

}
