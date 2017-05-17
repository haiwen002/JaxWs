package myWsTest.test;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

@WebService(name="HelloWoldService")
public class HelloWorldServiceImpl implements HelloWoldClientServiceI{
	public List<ResultRecord> sayHello(String userName,String ps) {
		System.out.println("userName:"+userName+" ps:"+ps);
		List<ResultRecord> list = new ArrayList<ResultRecord>();
		ResultRecord map1 = new ResultRecord();
		ResultRecord map2 = new ResultRecord();
		
		map1.setName( "userName33");
		map1.setValue( "ÀîËÄddd");
		
		map2.setName(  "ps22");
		map2.setValue(  "ÄúºÃddd");
		
		list.add(map1);
		list.add(map2);
		return list;
	}

	@Override
	public String sayBay(String userName, String ps) {
		// TODO Auto-generated method stub
		return userName+ps;
	}

}
