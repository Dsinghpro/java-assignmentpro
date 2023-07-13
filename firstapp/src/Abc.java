import com.abc.graphics.Circle;
import com.abc.graphics.Rectangle;
import com.abc.utility.Calculator;
import static com.abc.utility.Calculator.*;
public class Abc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle(5.6);
		System.out.println(c1.area());
		Rectangle r1 =new Rectangle(7.6,6.8);
		System.out.println(r1.area());
		System.out.println(PI);
		System.out.println(sum(786, 999));
		System.out.println(power(4, 5));
		
	}

}

