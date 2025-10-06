package org.example;

import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;

import org.apache.http.HttpException;
import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Client client = new Client();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a question for the model:");
        String query = scanner.nextLine();

        GenerateContentResponse response = client.models.generateContent(
                "gemini-2.0-flash-001",
                query,
                null
        );

        System.out.println(response.text());
    }
}