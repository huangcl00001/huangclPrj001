package huangcl;

public class DoubleNumber {//测试完全通过

		//1,0 去掉
		//2-9 
		static String a0[] = {};
		static String a1[] = {};
		static String a2[] = {"a","b","c"};
		static String a3[] = {"d","e","f"};
		static String a4[] = {"g","h","i"};
		static String a5[] = {"j","k","l"};
		static String a6[] = {"m","n","o"};
		static String a7[] = {"p","q","r","s"};
		static String a8[] = {"t","u","v"};
		static String a9[] = {"w","x","y","z"};
		
		
		public static void main(String[] args) {
			int[] a = {2,3};
			int[] b = {9,9};
			int[] c = {2};
			int[] d = {9};
			//测试数据：成功
			System.out.println("------------------------------------------");
			String res1 = doubles(a[0],a[1]);
			System.out.println( "input:{" + a[0] + "," + a[1] +"}");
			System.out.println( "output:" + res1);
			System.out.println("------------------------------------------");
			String res2 = doubles(b[0],b[1]);
			System.out.println(  "input:{" + b[0] + "," + b[1] +"}");
			System.out.println( "output:" + res2);
			System.out.println("------------------------------------------");
			String res3 = single(c[0]);
			System.out.println(  "input:{" + c[0]  +"}");
			System.out.println( "output:" + res3);
			System.out.println("------------------------------------------");
			String res4 = single(d[0]);
			System.out.println(  "input:{" + d[0]  +"}");
			System.out.println( "output:" + res4);
			System.out.println("------------------------------------------");
		}
		
		
		public static String single(int m) {
			String singleRes = "";
			String[] s = transfer(m);
			for (int j = 0; j < s.length; j++) {
				String t  = s[j];
				singleRes += t + " ";
			}
			return singleRes;
		}
		
		
		public static String doubles(int m, int n) {
			String result = "";
			String[] s1 = transfer(m);
			String[] s2 = transfer(n);
			if(s1.length==0||s2.length==0||s1.length==1||s2.length==1) {
				for (int j = 0; j < s1.length; j++) {
					String t  = s1[j];
					result += t + " ";
				}
				for (int j = 0; j < s2.length; j++) {
					String t  = s2[j];
					result += t + " ";
				}
			}else {
				for (int i = 0; i < s1.length; i++) {
					String firstChar = s1[i];
					for (int j = 0; j < s2.length; j++) {
						String secondChar  = s2[j];
						result += firstChar + secondChar + " ";
					}
				}
			}
			return result;
		}	
		
		
		public static String[] transfer(int k) {
			if(k==0) {return a0;}
			if(k==1) {return a1;}
			if(k==2) {return a2;}
			if(k==3) {return a3;}
			if(k==4) {return a4;}
			if(k==5) {return a5;}
			if(k==6) {return a6;}
			if(k==7) {return a7;}
			if(k==8) {return a8;}
			if(k==9) {return a9;}
			return null;
		}
		
		
}
