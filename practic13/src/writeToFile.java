import java.io.*;

public class writeToFile {
    public void write() {
        BufferedReader reader = null;
        PrintWriter writer = null;

        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
            writer = new PrintWriter(new FileWriter("test.txt"));

            System.out.println("Введите текст (для выхода введите 'exit'):");

            String line;
            while (!(line = reader.readLine()).equals("exit")) {
                writer.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
