public class TransactionValidator {
    // объявите константы
    static final double MIN_AMOUNT = 1, MAX_AMOUNT = 5000 ;
    // объявите метод isValidAmount()
    // внутри метода добавьте проверки на минимальную и максимальную сумму перевода
    public static boolean isValidAmount(double moneyValue){
        if(moneyValue >= MIN_AMOUNT && moneyValue <= 5000){
            return true;
        }
        else{
            System.out.println("Минимальная сумма перевода: " + MIN_AMOUNT + " р. Попробуйте ещё раз!");
            System.out.println("Максимальная сумма перевода: " + MAX_AMOUNT + " р. Попробуйте ещё раз!");
            return false;
        }
    }
}
