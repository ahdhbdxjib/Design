package ChainOfResponsibility;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title: Process.java
 * @Package ChainOfResponsibility
 * @Description: TODO 链条，想用 什么就直接添加即可
 * @author fsjohnhuang
 * @date 2018年11月4日 下午8:22:58
 * @version V1.0
 */
public class Process implements Filter {
	private List<Filter> filters = new ArrayList<>();
	int index = 0;

	public void add(Filter filter) {

		filters.add(filter);

	}

	// 调用filter的方法
	@Override
	public void doFilter(Request request, Reponse reponse, Process process) {
		if (index == filters.size())
			return;
		Filter fc = filters.get(index);
		index++;

		fc.doFilter(request, reponse, process);

	}
}
