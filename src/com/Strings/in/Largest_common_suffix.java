package com.Strings.in;

public class Largest_common_suffix {

	public static void main(String[] args) {
		String arr[] = {"Eating","sleeping","Running","Studying","Thinking","Writting"};
//		System.out.println(Longestcommonsuffix(arr));
		
		//Step -1 : Reverse the given String
		for(int i=0;i<arr.length;i++) {
			arr[i] = new StringBuilder(arr[i]).reverse().toString();
		}
		
//		Step -2 : Find the prefix
		String prefix = arr[0];
		for(int i=1;i<arr.length;i++) {
			while(!arr[i].startsWith(prefix)) {
				prefix = prefix.substring(0,prefix.length()-1);
				if(prefix.isEmpty()) {
					System.out.println("");
					return;
				}
			}
		}
		
		// Step -3 : Reverse the prefix
		String suffix= new StringBuilder(prefix).reverse().toString();
		System.out.println(suffix);	
	}
	
	
	
//	public static String longestcommonsuffix(String[] strs) {
//      if (strs == null || strs.length == 0) return "";
//
//      String[] reversed = new String[strs.length];
//      for (int i = 0; i < strs.length; i++) {
//          reversed[i] = reverse(strs[i]);
//      }
//  
//      String prefix = "";
//      String shortest = reversed[0];
//      for (int i = 0; i < reversed.length; i++) {
//          if (shortest.length() > reversed[i].length()) {
//              shortest = reversed[i];
//          }
//      }
//      for (int i = 0; i < shortest.length(); i++) {
//          int count = 0;
//          for (int j = 0; j < reversed.length; j++) {
//              if (shortest.charAt(i) == reversed[j].charAt(i)) {
//                  count++;
//              }
//          }
//          if (count == reversed.length) {
//              prefix += shortest.charAt(i);
//          } else {
//              break;
//          }
//      }
//      return reverse(prefix);
//	}
//	
//	
//	 public static String reverse(String s) {
//		 String rev = "";
//	     for (int i = 0; i< s.length(); i++) {
//	         rev = s.charAt(i)+rev;
//	     }
//	     return rev;
//	     }

	 
	 
//	public static String Longestcommonsuffix(String[] strs) {
//		String suffix="";
//		String shortest=strs[0];
//		for(int i=0;i<strs.length;i++) {
//			if(shortest.length()>strs[i].length()) {
//				shortest = strs[i];
//			}
//		}
//        for (int i = 1; i <= shortest.length(); i++) {  
//        int count = 0; 
//        for (int j = 0; j < strs.length; j++) {
//            if (shortest.charAt(shortest.length() - i) == strs[j].charAt(strs[j].length() - i)) { 
//                count++;
//            }
//        }
//        if (count == strs.length) {
//            suffix = shortest.charAt(shortest.length() - i) + suffix; 
//        } else {
//            break;
//        }
//    }
//    return suffix;
//	}

}
