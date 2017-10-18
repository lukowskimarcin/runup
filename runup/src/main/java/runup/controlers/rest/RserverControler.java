package runup.controlers.rest;

import org.rosuda.REngine.REXPMismatchException;
import org.rosuda.REngine.Rserve.RConnection;
import org.rosuda.REngine.Rserve.RserveException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rserver")
public class RserverControler {

	@RequestMapping("/test")
	public String test() {
		RConnection connection = null;
		String result = "";
		try {
			connection = new RConnection("rserver", 6311);

			String vector = "c(1,2,3,4)";
			connection.eval("meanVal=mean(" + vector + ")");
			double mean = connection.eval("meanVal").asDouble();
			System.out.println("The mean of given vector is=" + mean);
			result = "The mean of given vector is=" + mean;

		} catch (RserveException e) {
			e.printStackTrace();
		} catch (REXPMismatchException e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}
		return result;
	}
}
