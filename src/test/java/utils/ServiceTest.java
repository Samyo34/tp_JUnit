package utils;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import org.junit.Assert;

public class ServiceTest {
	
	private HttpDataService httpService;
	private IpService service;
	
	@Before
	public void before()
	{
		httpService = Mockito.mock(HttpDataService.class);
		//Mockito.when(httpService.getJsonIp()).thenReturn("{\"ip\":\"90.86.206.40\",\"about\":\"/about\",\"Pro!\":\"http://getjsonip.com\",\"reject-fascism\":\"Resist the fascist corporate Trump administration\"}");
		Mockito.when(httpService.getJsonIp()).thenReturn("{\"ip\":\"90.86.206.40\"}");
		service = new IpService(httpService);
	}
	
	@Test
	public void testIpService()
	{
		Assert.assertEquals("90.86.206.40", service.getMyIp());
		Mockito.verify(httpService).getJsonIp();
	}
	
	
	@Test
	public void testGetJson()
	{
		HttpDataService http = new HttpDataService();
		IpService serv = new IpService(http);
		Assert.assertEquals("90.86.206.40", serv.getMyIp());

	}
	



}
