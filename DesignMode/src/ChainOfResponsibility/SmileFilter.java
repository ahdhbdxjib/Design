package ChainOfResponsibility;
/**   
* @Title: SmileFilter.java 
* @Package ChainOfResponsibility 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author fsjohnhuang
* @date 2018��11��4�� ����8:20:39 
* @version V1.0   
*/
public class SmileFilter implements Filter {

	@Override
	public String doFilter(String str) {
		return str.replaceAll(":", "^v^");
	}

}
