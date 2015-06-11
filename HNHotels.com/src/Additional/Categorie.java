package Additional;

public class Categorie {
    
    private final String taxPercentage;
    private final String description;

    public Categorie(String taxPercentage, String description) {
        this.taxPercentage = taxPercentage;
        this.description = description;
    }

    public String getTaxPercentage() {
        return taxPercentage;
    }

    public String getDescription() {
        return description;
    }
}
