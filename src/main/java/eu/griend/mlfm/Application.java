package eu.griend.mlfm;

import eu.griend.mlfm.service.GpioService;

/**
 * Hello world!
 * 
 */
public class Application {
	public static void main(String[] args) {
		
		try {
			GpioService service = new GpioService();
			service.getPlatformInfo();
		} catch (Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
