package padroes.behavioral.strategy.ex2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
	private Recorder recorder;
	public Logger(Recorder recorder) {
		this.recorder = recorder;
	}
	public void log(String message) {
		DateFormat format = new SimpleDateFormat("MM/dd/yyyy kk:mm:ss.SSS");
		Date now = new Date();
		String prefix = format.format(now);
		recorder.record(prefix + " " + message);
	}
}