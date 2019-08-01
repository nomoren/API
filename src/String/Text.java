package String;

public class Text {
	public static void main(String[] args) {
	   String regex="(wc|mmp)";
	   String message="wc.fffmmp,wc,mmp,f,mmp";
	   message=message.replaceAll(regex, "***");
	   System.out.println(message);
		/*String imageName="abc.jpg";
		imageName=imageRename(imageName);
		System.out.println(imageName);*/
		
	}
	public static String imageRename(String imageName){
		String[] data=imageName.split("\\.");
		imageName=System.currentTimeMillis()+"."+data[1];
		return imageName;
	}
}
