package padroes.behavioral.strategy.ex2;

import java.util.regex.Pattern;

public class LoggerTest extends TestCase {
	private String recordedMessage;
	protected String message;
	public void testLogger() throws Exception {
		Logger logger = new Logger(new Recorder() {
			public void record(String message) {
				recordedMessage = message;
			}
		});
		message = "myMessage";
		logger.log(message);
		checkFormat();
	}
	private void checkFormat() {
		String datePattern = "\\d{2}/\\d{2}/\\d{4} \\d{2}:\\d{2}:\\d{2}.\\d{3}";
		String messagePattern = datePattern + " " + message;
		if(!Pattern.matches(messagePattern, recordedMessage)) {
			fail(recordedMessage + " does not match pattern");
		}
	}
	private void fail(String string) {
		// TODO Auto-generated method stub
		System.out.println(string);
		
	}
}