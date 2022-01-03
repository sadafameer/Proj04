package in.co.rays.proj4.exception;

/**
 * ApplicationException is propogate from Service classes when an business
 * logic exception occurred.
 * 
 * @author Sadaf
 * @version 1.0
 * 
 */
public class ApplicationException extends Exception{


    /**
     * @param msg
     *            : Error message
     */
	public ApplicationException(String msg){
		super(msg);
	}
}
