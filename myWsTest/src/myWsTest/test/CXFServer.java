package myWsTest.test;

import org.apache.cxf.endpoint.Endpoint;
import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

public class CXFServer {
    public static void main(String[] args)
    {
        JaxWsServerFactoryBean factoryBean = new JaxWsServerFactoryBean();
        // Web����ĵ�ַ
        factoryBean.setAddress("http://localhost:8081/hello");

        // Web���������ýӿ�
        factoryBean.setServiceClass(HelloWorldServiceImpl.class);
        factoryBean.setStart(false);
        Server server = factoryBean.create();
        System.out.println(server.isStarted());
        server.start();
        //factoryBean.setStart(false);
    	//ʹ��һ�����������淢����ws���ֲ�ʽ���⣬ʹ��redis���
        try {
			Thread.sleep(5*1000);
			System.out.println("123");
			System.out.println(server.isStarted());
			server.stop();
			//server.destroy();
			System.out.println(server.isStarted());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
    	//Endpoint.publish("http://localhost:8888/Hello",new HelloWorldServiceImpl());
        
    }
}
