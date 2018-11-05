package ChainOfResponsibility;
/**   
* @Title: TestFilter.java 
* @Package ChainOfResponsibility 
* @Description: TODO(用一句话描述该文件做什么) 
* @author fsjohnhuang
* @date 2018年11月4日 下午8:30:30 
* @version V1.0   
*/
public class TestFilter {

	public static void main(String[] args) {
		String msg = "今天天气不好，不想学习，想写<script>，:)";
		Process p = new Process();
		p.add(new SenstiveFilter());
		p.add(new ScriptFilter());
		Request request = new Request();
		Reponse reponse = new Reponse();
		request.setRequest(msg);
		reponse.setReponse("process");
		p.doFilter(request, reponse,p);
		System.out.println(request.getRequest());
		System.out.println(reponse.getReponse());
	}

}
