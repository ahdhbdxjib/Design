package DesignPhli;

import java.sql.Connection;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @Title: DesignLSP.java
 * @Package DesignPhli
 * @Description: TODO ���ԭ��֮LSP������������ķ�Χ����С�ڵ��ڸ�������ķ�Χ����������ҲҪС�ڵ��ڸ���
 * @date 2018��11��4�� ����10:27:30
 * @version V1.0
 */
public class DesignLSP {
	public static void main(String[] args) {
		//�˷���ֻ�Ḹ���say����ִ��
		/*Son s= new Son();
		HashMap map = new HashMap<>();
		s.say(map);*/
		//�����Father�еĴ���������ת��ΪMap����Son�е�sayҲ�ᱻִ��
	}
}

class Father {
	public Collection say(HashMap map) {
		System.out.println("���౻ִ��");
		return map.values();
	}

}

class Son extends Father {
	public Collection say(Map map) {
		System.out.println("���౻ִ��");
		return map.values();
	}
}