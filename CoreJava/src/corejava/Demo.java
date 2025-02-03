package corejava;
import com.tnsif.packages.*;
import java.util.Date;

public class Demo {
	public static void main (String args[])
	
	{
		long views=1_232_970_75737L;
		System.out.println("access from different packages");
		Ajay obj = new Ajay();
		System.out.println(obj.a);
		System.out.println(views);
		System.out.println("first program");
		Date now =new Date();
		System.out.println(now);
	}

}
