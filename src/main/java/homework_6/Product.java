package homework_6;

public class Product {
    String name;
    int article;
    double price;
    String description;
    boolean availability;

    public String getName() {
        return name;
    }

    public int getArticle() {
        return article;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArticle(int article) {
        this.article = article;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
}