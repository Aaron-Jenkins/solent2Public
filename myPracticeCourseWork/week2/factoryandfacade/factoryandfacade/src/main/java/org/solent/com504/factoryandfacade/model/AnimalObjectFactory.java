package org.solent.com504.factoryandfacade.model;

public class AnimalObjectFactory{

    private FarmFacadeImpl farmFacadeImpl;

    public AnimalObjectFactory(FarmFacadeImpl farmFacadeImpl) {
        this.farmFacadeImpl = farmFacadeImpl;
    }

    public static Animal createCat() {

        return new Cat();
    }

    public static Animal createDog() {

        return new Dog();
    }

    public static Animal createCow() {

        return new Cow();
    }

    public static FarmFacade createFarmFacade() {
        return new FarmFacadeImpl();
    }
}
