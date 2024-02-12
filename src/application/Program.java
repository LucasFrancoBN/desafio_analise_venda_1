package application;

import entities.Sale;
import services.SaleService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Stream;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Entre o caminho do arquivo: ");
    String path = sc.nextLine();
    System.out.println();

    SaleService saleService = new SaleService();

    try (BufferedReader br = new BufferedReader(new FileReader(path))) {
      List<Sale> sales = br.lines().map(line -> {
        String[] splitLine = line.split(",");
        return new Sale(
            Integer.parseInt(splitLine[0]),
            Integer.parseInt(splitLine[1]),
            splitLine[2],
            Integer.parseInt(splitLine[3]),
            Double.parseDouble(splitLine[4])
        );
      }).toList();

      List<Sale> fiveHighestSalesIn2016 = saleService.getHighestPriceAverages(2016, 5, sales);

      Double totalValueSoldByLogan = saleService.totalValueSoldBetweenMonths(sales, "Logan", 1, 7);

      System.out.println("Cinco primeiras vendas de 2016 de maior preço");
      for (Sale sale : fiveHighestSalesIn2016) {
        System.out.println(sale);
      }

      System.out.println();
      System.out.println("Valor total vendido pelo vendedor Logan nos meses 1 e 7 = " + totalValueSoldByLogan);

    } catch (IOException e) {
      System.out.println("Erro: " + e.getMessage());
    }

    sc.close();
  }
}
