public class BonusMilesService {
    public int calculate(int price) {
        int miles = price / 20;
        if (miles <= 0) ;
        {
            System.out.println("Начисленные милли не могут быть дробными числами, отрицательными или равными нулю.");

        }
        return miles;
    }
}
