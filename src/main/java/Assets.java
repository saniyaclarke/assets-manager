import java.math.BigDecimal;

public class Assets {

    String description;
    String dateAcquired;
    BigDecimal originalCost;


    public Assets(String description, String dateAcquired, BigDecimal originaCosst) {
        this.description = description;
        this.dateAcquired = dateAcquired;
        this.originalCost = originalCost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateAcquired() {
        return dateAcquired;
    }

    public void setDateAcquired(String dateAcquired) {
        this.dateAcquired = dateAcquired;
    }

    public BigDecimal getOriginaCost() {
        return getOriginaCost();

    }

    public void setOriginalCost(BigDecimal originalCost) {
        this.originalCost = originalCost;
    }

    public BigDecimal getValue() {
        return originalCost;
    }

}