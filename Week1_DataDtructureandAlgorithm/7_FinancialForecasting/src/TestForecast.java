public class TestForecast {
    public static void main(String[] args) {
        double presentValue = 10000.0;     // Initial investment
        double annualGrowthRate = 0.08;    // 8% annual growth
        int years = 5;

        double resultRecursive = FinancialForecaster.calculateFutureValueRecursive(presentValue, annualGrowthRate, years);
        double resultIterative = FinancialForecaster.calculateFutureValueIterative(presentValue, annualGrowthRate, years);
        double resultFormula = FinancialForecaster.calculateFutureValueFormula(presentValue, annualGrowthRate, years);

        System.out.printf("Recursive Result: %.2f%n", resultRecursive);
        System.out.printf("Iterative Result: %.2f%n", resultIterative);
        System.out.printf("Formula Result:   %.2f%n", resultFormula);
    }
}
