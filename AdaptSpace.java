package huangcl;

import java.util.Arrays;
import java.util.List;

public class AdaptSpace {

	
		static String array[] = {
				"i","like", "sam", "sung", 
				"samsung", "mobile", "ice", 
				"cream", "man go"};
		
		public static void main(String[] args) {
			String paras = "ilikesamsungmobile";
			//String paras = "ilikeicecreamandmango";
			test(paras);
		}
		
		public static void test(String para) {
			List<String> list = Arrays.asList(array);
			String curPara = "";
			String lastPara = para;
			String resultStr = "";
			for (int i = 0; i < list.size(); i++) {
				String temp = list.get(i);
				temp.replace(" ", "");
			}		
			
			for (int i = 0; i < para.length(); i++) {
				curPara = curPara + lastPara.substring(0,1);
				if(i==0&&"i".equals(curPara)) {
					resultStr += curPara + " ";
					curPara = "";
				}else {
					if(list.contains(curPara)&&!"i".equals(curPara)) {
						resultStr += curPara + " ";
						curPara = "";
					}
				}
				lastPara = para.substring(i+1,para.length());;
			}
			
			
			System.out.println("result:" + resultStr.replace("mango", "man go"));
		}	
		
		
}
