package SimpleFactory;
/**   
* @Title: Factory.java 
* @Package SimpleFactory 
* @Description: TODO(用一句话描述该文件做什么) 
* @author fsjohnhuang
* @date 2018年11月13日 下午8:55:54 
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
