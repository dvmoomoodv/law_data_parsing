package parse;

import java.util.ArrayList;

import common.Common;

public class Get_OcprPrcdntInfo {
	/**
	 * 
	 * 공보판례 정보 조회
	 * 
	 */
	public static void main(String[] args) throws Exception {
		String function = "getOcprPrcdntInfo";

		ArrayList<String> url_list = Common.getURL(function, 0, null);
		Common.parsing(url_list, function);

	}
}
