import java.math.BigDecimal;
import java.time.LocalDate;

public class Vehicle extends Assets {
    private String makeModel;
    private int year;
    private int odometer;


    public Vehicle(String description, String dateAcquired, BigDecimal originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    @Override
    public BigDecimal getValue() {
    BigDecimal rate = BigDecimal.valueOf(0);
    BigDecimal value;
    int currentYear = LocalDate.now().getYear();
    int carAge = currentYear - this.year;

    if(carAge < 4){
       rate = new BigDecimal("0.03");
    }
    else if(carAge < 7){
        rate = new BigDecimal("0.06");
    }
    else if(carAge < 11){
        rate = new BigDecimal("0.08");
    }
    if(carAge > 10 ){
        value = BigDecimal.valueOf(1000);
    }
    else {
        BigDecimal deduction = rate.multiply(BigDecimal.valueOf(carAge).multiply(this.getOriginaCost()));
        value = getOriginaCost().subtract(deduction);
    }
    if(this.odometer > 100_000){
        if( ! (this.makeModel.contains("Honda") || this.makeModel.contains("Toyota")));
            value = value.multiply(new BigDecimal("0.25"));
    }

     return getValue();
    }
}
///getValue() : BigDecimal (override)
/// // A car's value is determined as
/// // 0-3 years old - 3% reduced value of cost per year
/// // 4-6 years old - 6% reduced value of cost per year
/// // 7-10 years old - 8% reduced value of cost per year
/// // over 10 years old - $1000.00
/// // MINUS reduce final value by 25% if over 100,000 miles
/// // unless makeModel contains word Honda or Toyota