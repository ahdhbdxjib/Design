package ChainOfResponsibility;
/**   
* @Title: SenstiveFilter.java 
* @Package ChainOfResponsibility 
* @Description: TODO(用一句话描述该文件做什么) 
* @author fsjohnhuang
* @date 2018年11月4日 下午8:17:44 
* @version V1.0   
*/
public class SenstiveFilter implements Filter {

	@Override
	public String doFilter(String str) {
		return str.replaceAll("不想学习","爱学习");
	}

}
