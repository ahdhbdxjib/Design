package SimpleFactory;
/**   
* @Title: Client.java 
* @Package SimpleFactory 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author fsjohnhuang
* @date 2018��11��13�� ����8:58:45 
* @version V1.0   
*/
public class Client {

	public static void main(String[] args) {
		Car car = Factory.create("SimpleFactory.BMW");
		car.run();
		Car car1 = Factory.create("SimpleFactory.Byd");
		car1.run();
	}

}
