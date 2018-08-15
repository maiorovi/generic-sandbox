package app.domain.txrate;

public class TaxRate {
    private String ittcode;
    private String date;
    private String name;

    public String getIttcode() {
        return ittcode;
    }

    public void setIttcode(String ittcode) {
        this.ittcode = ittcode;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //    ittcode: 123
//    date: 2018-01-01
//    name: somename
}
