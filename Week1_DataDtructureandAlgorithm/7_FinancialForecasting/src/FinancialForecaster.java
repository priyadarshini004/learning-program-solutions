public class FinancialForecaster {

    // Recursive approach
    public static double calculateFutureValueRecursive(double presentValue, double growthRate, int years) {
        if (years == 0) {
            return presentValue;
        }
        return calculateFutureValueRecursive(presentValue, growthRate, years - 1) * (1 + growthRate);
    }

    // Iterative approach (recommended for large input)
    public static double calculateFutureValueIterative(double presentValue, double growthRate, int years) {
        double result = presentValue;
        for (int i = 0; i < years; i++) {
            result *= (1 + growthRate);
        }
        return result;
    }

    // Formula-based approach (most efficient)
    public static double calculateFutureValueFormula(double presentValue, double growthRate, int years) {
        return presentValue * Math.pow(1 + growthRate, years);
    }
}
