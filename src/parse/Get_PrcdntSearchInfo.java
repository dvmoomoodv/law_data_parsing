package parse;

import java.util.ArrayList;

import common.Common;

public class Get_PrcdntSearchInfo {
//	getPrcdntSearchInfo
	
	public static void main(String[] args) throws Exception {
		String function = "getPrcdntSearchInfo";
		
		ArrayList<String> url_list = Common.getURL(function, 0, null);
		Common.parsing(url_list, function);
		
		
	}
}