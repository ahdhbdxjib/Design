package ChainOfResponsibility;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title: Process.java
 * @Package ChainOfResponsibility
 * @Description: TODO(��һ�仰�������ļ���ʲô)
 * @author fsjohnhuang
 * @date 2018��11��4�� ����8:22:58
 * @version V1.0
 */
public class Process {
	private List<Filter> filters = new ArrayList<>();

	public String doProcess(String str) {
		return doFilter(str);
	}
	//ʵ�������õ�Filter����
	private String doFilter(String str) {
		String s = null ;
		for (Filter f : filters) {
			str = f.doFilter(str);
		}
		return str;
	}
	//���Filter�ķ���
	public void add(Filter filter) {

		filters.add(filter);

	}
}
