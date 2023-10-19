import java.io.*;

public class replaceInFile extends writeToFile {

    public void Replace() {
        BufferedReader reader = null;
        PrintWriter writer = null;

        try {
            // Шаг 1: Считывание информации с клавиатуры
            reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите новый текст для файла (для завершения введите 'exit'):");

            StringBuilder inputText = new StringBuilder();
            String line;
            while (!(line = reader.readLine()).equals("exit")) {
                inputText.append(line).append(System.lineSeparator());
            }

            // Шаг 2: Запись введенной информации в файл
            writer = new PrintWriter(new FileWriter("test.txt"));
            writer.print(inputText.toString());

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
