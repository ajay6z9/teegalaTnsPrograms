package corejava;
import com.tnsif.packages.*;

public class Demo {
	public static void main (String args[])
	{
		System.out.println("access from different packages");
		Ajay obj = new Ajay();
		System.out.println(obj.a);
	}

}
