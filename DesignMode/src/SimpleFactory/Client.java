package SimpleFactory;
/**   
* @Title: Client.java 
* @Package SimpleFactory 
* @Description: TODO(用一句话描述该文件做什么) 
* @author fsjohnhuang
* @date 2018年11月13日 下午8:58:45 
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
