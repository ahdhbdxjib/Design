package ChainOfResponsibility;
/**   
* @Title: ScriptFilter.java 
* @Package ChainOfResponsibility 
* @Description: TODO(用一句话描述该文件做什么) 
* @author fsjohnhuang
* @date 2018年11月4日 下午8:21:35 
* @version V1.0   
*/
public class ScriptFilter implements Filter {

	@Override
	public void doFilter(Request request,Reponse reponse,Process process) {
		 request.request = request.request.replaceAll("<","[").replaceAll(">", "]").concat("----》ScriptFilter");
		 process.doFilter(request, reponse, process);
		 reponse.reponse = reponse.reponse.concat("----》ScriptFilter");
	}

}
