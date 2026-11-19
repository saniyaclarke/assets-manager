import java.math.BigDecimal;

public class House extends Asset {
    private String address;
    private int condition;
    private BigDecimal price;
    private int sqft;
    private int lotSize;

    public House(String description, String dateAcquired, BigDecimal originalCost, String address, int condition, int sqft, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.sqft = sqft;
        this.lotSize = lotSize;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return this.condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSqft() {
        return this.sqft;
    }

    public void setSqft(int sqft) {
        this.sqft = sqft;
    }

    public int getLotSize() {
        return this.lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    @Override
    public BigDecimal getValue() {

       // PLUS 25 cents per square foot of lot size
       BigDecimal rate = BigDecimal.ZERO;

        switch (this.condition) {
            case 1:  //Excellent
                rate = new BigDecimal(180);
                break;

            case 2:  //Good
                rate = new BigDecimal(130);
                break;

            case 3: //Fair
                rate = new BigDecimal(90);
                break;

            case 4:  //Poor
               rate = new BigDecimal(80);
               break;

            default:
                throw new RuntimeException("Option 1-4 was never chosen");

        }
        return rate.multiply(BigDecimal.valueOf(sqft)).add(BigDecimal.valueOf(lotSize).multiply(BigDecimal.valueOf(0.25)));

    }//ask how or why this whole block autopopulated when I typed override
    //use string when introducing floating point

}


