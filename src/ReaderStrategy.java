import java.lang.reflect.Type;
import java.util.ArrayList;

public class ReaderStrategy {

	private String code;
	private Type target;
	private ArrayList<FieldExtractor> extractors = new ArrayList<FieldExtractor>();

	/**
	 * 
	 * @param code
	 * @param target
	 */
	public void ReaderStrategy(String code, Type target) {
		// TODO - implement Reader_Strategy.ReaderStrategy
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param begin
	 * @param end
	 * @param target
	 */
	public void addFieldExtractor(int begin, int end, String target) {
		// TODO - implement Reader_Strategy.addFieldExtractor
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param line
	 */
	public Object process(String line) {
		// TODO - implement Reader_Strategy.process
		throw new UnsupportedOperationException();
	}

}