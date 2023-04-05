package pl.mmiskiewicz;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws IOException {

        Gson gson = new Gson();
        URL url = new URL("https://api.chucknorris.io/jokes/random");
        String json;
        InputStream inputStream;
        BufferedReader bufferedReader;
        try{
            inputStream = url.openStream();
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while ((json = bufferedReader.readLine()) != null) {
                Joke joke = gson.fromJson(json, Joke.class);
                System.out.println(joke.getValue());
            }
            bufferedReader.close();
            inputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}