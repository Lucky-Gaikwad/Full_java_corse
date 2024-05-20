class CarFinal {
    // we cant change on any value of these instances because these are final that means constt.
    final int noOfWheels;
    final String model;
    final String engineInLiters;

    public CarFinal(int noOfWheels, String model, String engineInLiters) {
        this.noOfWheels = noOfWheels;
        this.model = model;
        this.engineInLiters = engineInLiters;
    }
}
