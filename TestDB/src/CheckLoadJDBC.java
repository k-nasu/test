
public class CheckLoadJDBC {

	public static void main(String[] args)throws
	InstantiationException,IllegalAccessException{
		String msg ="";
		try{
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		msg ="ドライバのロードに失敗しました";
		}catch(ClassNotFoundException e){
		msg ="ドライバのロードに失敗しました";
		}
		System.out.println(msg);
	}

}
