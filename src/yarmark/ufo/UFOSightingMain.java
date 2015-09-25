package yarmark.ufo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.google.gson.Gson;

public class UFOSightingMain {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new FileReader("./ufo_awesom.json"));

		Gson gson = new Gson();

		in.close();
	}

}
