import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Classname : LogManages
 * LogManages class that manages logs in file "log.txt"
 *
 * Created on 24 June 2020
 *
 * @author Alyona Sviridova NTU KhPI
 *
 * TASK: Mulithreading
 */

public class LogManages {

    public void findLogBySpecificDate(String date) throws IOException {

        // red the logs file from the previous task
        String text = new String(Files
                .readAllBytes(Paths.get("logs.txt")));

        // logs file to lower case
        String logs = text.toLowerCase();

        // find logs with error by specific date
        List<String> errorLines = Files.lines(Paths.get(logs))
                .filter(line -> line.contains(date))
                .filter(line -> line.contains("error"))
                .collect(Collectors.toList());

        // amount of logs
        int linesCount = errorLines.size();
    }
}
