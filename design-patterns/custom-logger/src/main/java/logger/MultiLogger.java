package logger;

import java.util.Arrays;
import java.util.List;

public class MultiFileLogger implements Logger {

    List<FileLogger> fileLoggers;

    public MultiFileLogger(FileLogger ...args) {
       this.fileLoggers = Arrays.asList(args);

    }


    @Override
    public void info(String message) {
        for (FileLogger logger: fileLoggers) {
            logger.info(message);
        }
    }
}
