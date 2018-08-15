package app.domain.txrate;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class TaxRateItem implements Serializable {
    private String cconsole;
    private List<TaxRate> taxrate;

    public String getCconsole() {
        return cconsole;
    }

    public void setCconsole(String cconsole) {
        this.cconsole = cconsole;
    }

    public List<TaxRate> getTaxrate() {
        return taxrate;
    }

    public void setTaxrate(List<TaxRate> taxrate) {
        this.taxrate = taxrate;
    }

    @Override
    public String toString() {
        return "TaxRateItem{" +
                "cconsole='" + cconsole + '\'' +
                ", item=" + taxrate +
                '}';
    }
}
