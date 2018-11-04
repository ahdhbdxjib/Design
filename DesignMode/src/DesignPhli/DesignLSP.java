package DesignPhli;

import java.sql.Connection;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @Title: DesignLSP.java
 * @Package DesignPhli
 * @Description: TODO 设计原则之LSP：即子类参数的范围必须小于等于父类参数的范围，子类的输出也要小于等于父类
 * @date 2018年11月4日 上午10:27:30
 * @version V1.0
 */
public class DesignLSP {
	public static void main(String[] args) {
		//此方法只会父类的say方法执行
		/*Son s= new Son();
		HashMap map = new HashMap<>();
		s.say(map);*/
		//如果将Father中的传参数类型转化为Map，则Son中的say也会被执行
	}
}

class Father {
	public Collection say(HashMap map) {
		System.out.println("父类被执行");
		return map.values();
	}

}

class Son extends Father {
	public Collection say(Map map) {
		System.out.println("子类被执行");
		return map.values();
	}
}