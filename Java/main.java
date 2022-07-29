class main{
    public static void main(String[] args) {

        UberX ubertoX = new UberX("223322", new Account("Pedro", "23232323"), "Toyota", "prios");
        ubertoX.setPassenger(4);
        ubertoX.printDataCar();

        UberVan uberVan = new UberVan("123abc", new Account("Andres Herrrera", "1234"));
        uberVan.setPassenger(6);
        uberVan.printDataCar();

    }
}
