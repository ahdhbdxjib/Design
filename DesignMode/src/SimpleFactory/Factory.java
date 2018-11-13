package SimpleFactory;
/**   
* @Title: Factory.java 
* @Package SimpleFactory 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author fsjohnhuang
* @date 2018��11��13�� ����8:55:54 
* @version V1.0   
*/
public class Factory {
	public static Car create(String name){
		try {
			Car car = (Car) Class.forName(name).newInstance();
			return car;
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}
}
