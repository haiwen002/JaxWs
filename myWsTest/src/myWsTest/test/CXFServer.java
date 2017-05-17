package myWsTest.test;

import org.apache.cxf.endpoint.Endpoint;
import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

public class CXFServer {
    public static void main(String[] args)
    {
        JaxWsServerFactoryBean factoryBean = new JaxWsServerFactoryBean();
        // Web服务的地址
        factoryBean.setAddress("http://localhost:8081/hello");

        // Web服务对象调用接口
        factoryBean.setServiceClass(HelloWorldServiceImpl.class);
        factoryBean.setStart(false);
        Server server = factoryBean.create();
        System.out.println(server.isStarted());
        server.start();
        //factoryBean.setStart(false);
    	//使用一个队列来保存发布的ws，分布式问题，使用redis解决
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
