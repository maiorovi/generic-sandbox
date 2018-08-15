package app.domain;

public class PhoneNumber {
    private String description;
    private String number;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PhoneNumber{");
        sb.append("description='").append(description).append('\'');
        sb.append(", number='").append(number).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
