package ChainOfResponsibility;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title: Process.java
 * @Package ChainOfResponsibility
 * @Description: TODO ���������� ʲô��ֱ����Ӽ���
 * @author fsjohnhuang
 * @date 2018��11��4�� ����8:22:58
 * @version V1.0
 */
public class Process implements Filter {
	private List<Filter> filters = new ArrayList<>();
	int index = 0;

	public void add(Filter filter) {

		filters.add(filter);

	}

	// ����filter�ķ���
	@Override
	public void doFilter(Request request, Reponse reponse, Process process) {
		if (index == filters.size())
			return;
		Filter fc = filters.get(index);
		index++;

		fc.doFilter(request, reponse, process);

	}
}
