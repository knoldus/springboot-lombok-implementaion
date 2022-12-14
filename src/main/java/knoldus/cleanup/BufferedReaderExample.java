package knoldus.cleanup;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * The type Buffered reader example.
 */
public class BufferedReaderExample {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 * @throws IOException the io exception
	 */
	public static void main(String[] args) throws IOException {
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader("sample.txt");
			br = new BufferedReader(fr);
			String sCurrentLine;

			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fr != null) {
				fr.close();
			}

			if (br != null) {
				br.close();
			}
		}
	}
}
