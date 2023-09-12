public class CarLot{
    public static void main(String[]args){
        Car[] availableCars = new Car[6];
        availableCars[0] = new Car("Ford", "Focus", 2006, 12123.43);
        availableCars[1] = new Car("Ford", "Escape", 2019, 25687.00);
        availableCars[2] = new Car("Toyota", "Rav-4", 2011, 16874.98);
        availableCars[3] = new Car("Tesla", "Model 3", 2023, 42990.77);
        availableCars[4] = new Car("Honda", "Passport", 2019, 55981.23);
        availableCars[5] = new Car("Honda", "Accord", 2021, 34000.99);
        int currentYear = 2023;

        viewLot(availableCars, currentYear);
        averageValue(availableCars,currentYear);
        Car keyCar = new Car("Ford", "Escape", 2019, 14500);
        searchLot(availableCars,keyCar);
    }

    public static void viewLot(Car[]array, int year){
        for (int i = 0; i < array.length;i++){
            System.out.printf("Car #%d: Make: %s; Model: %s; Year: %d;\n\tPurchase Price: $%.2f; Current Value: $%.2f", (i+1), array[i].getMake(),array[i].getModel(),array[i].getYear(), array[i].getPurchasePrice(), array[i].getValue(year));
        }
    }
    public static double averageValue(Car[]list, int year){
        double sum = 0;
        for (int i = 0; i <list.length;i++){
            sum += list[i].getValue(year);
        }
        double average = sum / list.length;
        System.out.printf("\n\nThe average value of the cars in the lot is: $%.2f\n\n", average);
        return average;
        }

    public static void searchLot(Car[]list, Car keyCar){
        boolean found  = false;
        for (int i = 0; i < list.length;i++){
            if (list[i].getMake().equals(keyCar.getMake()) && list[i].getModel().equals(keyCar.getModel()) && list[i].getYear() == keyCar.getYear()) {
            System.out.printf("\n\nCar found at index %d:\nMake: %s\nModel: %s\nYear: %d\nPurchase Price: $%.2f\nCurrent Value: $%.2f\n\n",
                                i, list[i].getMake(), list[i].getModel(), list[i].getYear(),
                                list[i].getPurchasePrice(), list[i].getValue(2023));
            found = true;
}
    }
    if (!found) {
        System.out.println("\n\nCar not found in the lot.\n\n");
    }
}
}



