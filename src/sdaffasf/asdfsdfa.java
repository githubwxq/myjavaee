package sdaffasf;

import java.util.ArrayList;
import java.util.List;

public class asdfsdfa {

	public static void main(String[] args) {
		String a = "[mamma]����[����]��[[qweq]��������ʦ��[΢Ц]";

		String[] allbiaoqing = { "[΢Ц]", "[����]", "[mamma]" };
		

        List<String> list = new ArrayList<String>();// list
        list = java.util.Arrays.asList(allbiaoqing);// �ַ�����תlist �Ա�
	
		
		char[] b = a.toCharArray();
		int index=0;
		boolean left = false;
		int leftIndex = 0;
		int rightIndex = 0;
		boolean right = false;
		int count = 30; // ���������ʮ���ַ���
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
						// ��ȡ�м�����
						String biaoqing = a
								.substring(leftIndex, rightIndex + 1);
						System.out.println("δ����" + biaoqing);
						boolean flag = false;

						
						if(list.contains(biaoqing)){
							flag = true;
						System.out.println("���˵ı���" + biaoqing);
							
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

					// ��������ֱ�Ӽ�
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
