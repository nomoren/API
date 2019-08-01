package String;
/**
 * StringBuilder(修改性能
 * )专门用来修改字符串内容的API
 * Strinf由于其优化设计问题导致的问题就是不能频繁修改
 * 修改(每次都创建新对象）
 * @author admin
 *
 */
public class StringBulider {
	public static void main(String[] args) {
		String str="努力学习java";
		StringBuilder bulider=new StringBuilder(str);
		//append(),拼接字符串
		bulider.append("，为了找到好工作");
		str=bulider.toString();
		System.out.println(str);
		System.out.println(str.substring(9,16));
		//replace(),改
		bulider.replace(9, 16, "改变世界");
		System.out.println(bulider.toString());
		//delete()删
		bulider.delete(0, 8);
		System.out.println(bulider.toString());
		//insert()插入
		bulider.insert(0, "或者");
		System.out.println(bulider.toString());
		
}
}
