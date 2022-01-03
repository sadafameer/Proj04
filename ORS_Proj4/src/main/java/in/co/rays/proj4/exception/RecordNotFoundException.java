package in.co.rays.proj4.exception;

/**
 * RecordNotFoundException thrown when a record not found occurred
 * 
 * @author Sadaf
 * @version 1.0
 * 
 */
public class RecordNotFoundException extends Exception {

    /**
     * @param msg
     *            error message
     */
	public RecordNotFoundException(String msg){
		super(msg);
	}
}
