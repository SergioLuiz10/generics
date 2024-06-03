package frist;

import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        List<one> list = new ArrayList<>();

        System.out.println("Digite a quantidade de produtos que deseja inserir:");
        int quantidadeProdutos = 0;
        try {
            quantidadeProdutos = ler.nextInt();
            ler.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
            return;
        }

        String pasta = "c:\\Generics\\teste.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(pasta))) {
            for (int i = 0; i < quantidadeProdutos; i++) {
                System.out.println("Digite o nome e depois o preço de um produto (exemplo: Iphone,500):");
                String linha = ler.nextLine();
                bw.write(linha);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader br = new BufferedReader(new FileReader(pasta))) {
            String line = br.readLine();
            while (line != null) {
                try {
                    String[] campos = line.split(",");
                    list.add(new one(campos[0], Double.parseDouble(campos[1])));
                } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                    System.out.println("Erro ao processar linha: " + line);
                }
                line = br.readLine();
            }
            one x = Calcular.max(list);
            System.out.println("Máximo:");
            System.out.println(x);
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
