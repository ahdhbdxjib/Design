package ChainOfResponsibility;
/**   
* @Title: TestFilter.java 
* @Package ChainOfResponsibility 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author fsjohnhuang
* @date 2018��11��4�� ����8:30:30 
* @version V1.0   
*/
public class TestFilter {

	public static void main(String[] args) {
		String msg = "�����������ã�����ѧϰ����д<script>��:)";
		Process p = new Process();
		p.add(new SenstiveFilter());
		p.add(new SmileFilter());
		String res = p.doProcess(msg);
		System.out.println(res);
	}

}