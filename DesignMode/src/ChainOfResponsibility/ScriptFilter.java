package ChainOfResponsibility;
/**   
* @Title: ScriptFilter.java 
* @Package ChainOfResponsibility 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author fsjohnhuang
* @date 2018��11��4�� ����8:21:35 
* @version V1.0   
*/
public class ScriptFilter implements Filter {

	@Override
	public String doFilter(String str) {
		return str.replaceAll("<","[").replaceAll(">", "]");
	}

}
