package myWsTest.test;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public interface HelloWoldClientServiceI {
	
	@WebResult(name = "record")
	List<ResultRecord> sayHello(@WebParam(name = "userName")String userName,@WebParam(name = "ps")String ps);
	
	String sayBay(@WebParam(name = "userName2")String userName,@WebParam(name = "sex")String ps);
}
