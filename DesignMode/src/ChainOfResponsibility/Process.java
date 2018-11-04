package ChainOfResponsibility;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title: Process.java
 * @Package ChainOfResponsibility
 * @Description: TODO(用一句话描述该文件做什么)
 * @author fsjohnhuang
 * @date 2018年11月4日 下午8:22:58
 * @version V1.0
 */
public class Process {
	private List<Filter> filters = new ArrayList<>();

	public String doProcess(String str) {
		return doFilter(str);
	}
	//实际所调用的Filter方法
	private String doFilter(String str) {
		String s = null ;
		for (Filter f : filters) {
			str = f.doFilter(str);
		}
		return str;
	}
	//添加Filter的方法
	public void add(Filter filter) {

		filters.add(filter);

	}
}
