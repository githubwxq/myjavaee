package sdaffasf;

import java.util.ArrayList;
import java.util.List;

public class asdfsdfa {

	public static void main(String[] args) {
		String a = "[mamma]王晓[伤心]清[[qweq]哇撒旦法师打发[微笑]";

		String[] allbiaoqing = { "[微笑]", "[伤心]", "[mamma]" };
		

        List<String> list = new ArrayList<String>();// list
        list = java.util.Arrays.asList(allbiaoqing);// 字符数组转list 对比
	
		
		char[] b = a.toCharArray();
		int index=0;
		boolean left = false;
		int leftIndex = 0;
		int rightIndex = 0;
		boolean right = false;
		int count = 30; // 假设最多三十个字符串
		int current = 0;
		for (int i = 0; i < b.length; i++) {
			if (String.valueOf(b[i]).equals("[")) {
				leftIndex = i;
				left = true;
			} else {
				if (String.valueOf(b[i]).equals("]")) {
					rightIndex = i;
					right = true;
					if (right && left) {
						// 获取中间内容
						String biaoqing = a
								.substring(leftIndex, rightIndex + 1);
						System.out.println("未过滤" + biaoqing);
						boolean flag = false;

						
						if(list.contains(biaoqing)){
							flag = true;
						System.out.println("过滤的表情" + biaoqing);
							
						}

						
						if (flag) {
							current = current + 1 - biaoqing.length();

						} else {
							// current=current+biaoqing.length();
						}

						left = false;
						leftIndex = 0;
						rightIndex = 0;
						right = false;

					}

				} else {

					// 其他东西直接加
				}
			}

			current++;
			if(current>18){
				
				index=i;
				//break;
			}

		}

		System.out.println("current" + current);
		System.out.println("index" + index+"");

	}

}
