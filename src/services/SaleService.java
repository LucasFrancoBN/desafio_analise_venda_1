package services;

import entities.Sale;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class SaleService {
  public List<Sale> getHighestPriceAverages(Integer year, Integer limit, List<Sale> sales) {
    Stream<Sale> filteredStreamByYear = sales
        .stream()
        .filter(sale -> sale.getYear().equals(year))
        .sorted(Comparator.comparing(Sale::averagePrice).reversed())
        .limit(limit);

    return filteredStreamByYear.toList();
  }

  public Double totalValueSoldBetweenMonths(List<Sale> sales, String seller, Integer firstMonth, Integer secondMonth) throws IllegalArgumentException {
    if(firstMonth >= secondMonth) {
      throw new IllegalArgumentException("O primeiro mês deve ser maior que o segundo");
    }

    return sales.stream()
        .filter(sale -> sale.getSeller().equals(seller) && (sale.getMonth().equals(firstMonth) || sale.getMonth().equals(secondMonth)))
        .mapToDouble(Sale::getTotal).sum();
  }
}
