package ChainOfResponsibility;
/**   
* @Title: SenstiveFilter.java 
* @Package ChainOfResponsibility 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author fsjohnhuang
* @date 2018��11��4�� ����8:17:44 
* @version V1.0   
*/
public class SenstiveFilter implements Filter {

	@Override
	public String doFilter(String str) {
		return str.replaceAll("����ѧϰ","��ѧϰ");
	}

}
