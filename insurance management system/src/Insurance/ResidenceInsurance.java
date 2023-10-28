package Insurance;

import java.time.LocalDate;

public class ResidenceInsurance extends Insurance {
    private double buildingValue;
    private double contentValue;

    public ResidenceInsurance(double buildingValue, double contentValue) {
        super("Konut Sigortası", 980, LocalDate.now(), LocalDate.now().plusMonths(4));
        this.buildingValue = buildingValue;
        this.contentValue = contentValue;
    }

    public double getBuildingValue() {
        return buildingValue;
    }

    public void setBuildingValue(double buildingValue) {
        this.buildingValue = buildingValue;
    }

    public double getContentValue() {
        return contentValue;
    }

    public void setContentValue(double contentValue) {
        this.contentValue = contentValue;
    }

    @Override
    public void calculate() {
        double basePrice = getPrice();
        double buildingValue = getBuildingValue();
        double contentValue = getContentValue();
        // calculate the premium based on the base price, building value, and content
        // value
        double premium = basePrice + (buildingValue * 0.002) + (contentValue * 0.001);
        setPrice(premium);
    }

    @Override
    public String toString() {
        return "Konut Sigortası [İsim=" + getName() + ", Ücret=" + getPrice() + ", Başlangıç tarihi=" + getStartDate()
                + ", Bitiş Tarihi=" + getEndDate() + ", Bina Değeri=" + buildingValue + ", demirbaş değeri =" + contentValue
                + "]";
    }
}