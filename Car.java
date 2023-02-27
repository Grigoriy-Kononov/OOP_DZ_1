public class Car {
    private String model;
    private int year;
    private double price;
    private String color;
    private int power;
    boolean status;

    Car(String model, int year, double price, String color, int power){
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
        this.power = power;
        this.status = false;
    }

    Car(){
        this.model = null;
        this.year = 0;
        this.price = 0.0;
        this.color = null;
        this.power = 0;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
    
    public void statusCar() {
        if (status == false) {
            System.out.println("Двигатель - заглушен");
        } else {
            System.out.println("Двигатель - заведен");
        }
    }

    public String toString() {
        return "Автомобиль " + model + " " + year + " года выпуска, стоимостью " + price + " рублей, цвет - " + color + ", объем двигателя - " + power + " куб. см";
    }

    public String getInfo() {
        return "\nCar\n" +
                "Марка автомобиля - " + model + "\n" +
                "Год выпуска - " + year + "\n" +
                "Стоимость - " + price + " рублей\n" +
                "Объем двигателя - " + power + "\n" +
                "Двигатель - " + status;
    }

    public void startCare() {
        this.status = true;
        System.out.println("Автомобиль " + model + " заведен");
    }

    public void stopCare() {
        this.status = false;
        System.out.println("Автомобиль " + model + " заглушен");
    }

    public void road(String adres) {
        if (status == false) {
            System.out.println("Автомобиль " + model + " заглушен, мы не можем ехать");
        } else {
            System.out.println("Мы едем по адресу: " + adres);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Car)) {
            return false;
        }
        Car car = (Car) obj;
        if (model.equals(car.model) && year == car.year && price == car.price
                && color.equals(car.color) && power == car.power) {
            return true;
        } else {
            return false;
        }
    }

    public boolean equalsModel(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Car)) {
            return false;
        }
        Car car = (Car) obj;
        if (model.equals(car.model)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean equalsYear(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Car)) {
            return false;
        }
        Car car = (Car) obj;
        if (year == car.year) {
            return true;
        } else {
            return false;
        }
    }

    public boolean equalsPrise(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Car)) {
            return false;
        }
        Car car = (Car) obj;
        if (price == car.price) {
            return true;
        } else {
            return false;
        }
    }

    public boolean equalsColor(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Car)) {
            return false;
        }
        Car car = (Car) obj;
        if (color.equals(car.color)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean equalsPower(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Car)) {
            return false;
        }
        Car car = (Car) obj;
        if (power == car.power) {
            return true;
        } else {
            return false;
        }
    }
}