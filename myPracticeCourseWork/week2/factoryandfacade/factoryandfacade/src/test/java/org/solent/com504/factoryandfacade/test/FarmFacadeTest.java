package org.solent.com504.factoryandfacade.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.solent.com504.factoryandfacade.model.Animal;
import org.solent.com504.factoryandfacade.model.AnimalObjectFactory;
import org.solent.com504.factoryandfacade.model.FarmFacade;
import org.solent.com504.factoryandfacade.model.FarmFacadeImpl;

/**
 *
 * @author cgallen
 */
public class FarmFacadeTest {

    @Test
    public void FarmFacadeTest() {

        FarmFacade farmFacade = AnimalObjectFactory.createFarmFacade();
        assertNotNull(farmFacade);
        
        // WHAT TESTS WOULD YOU CREATE HERE TO SET UP AND TEST THE FARM FACADE?


        // Add animals
        farmFacade.addCat("Kaya");
        farmFacade.addCow("Betty");
        farmFacade.addDog("Doge");

        //Test attributes without casting
        for(Animal animal: farmFacade.getAllAnimals()){
            System.out.println("animal '" + animal.getName()
                    + "' makes this sound '" + animal.getSound()
                    + "' because it is a '" + animal.getClass().getSimpleName()
                    + "' implemented by " + animal.getClass().getTypeName());
        }

        // Test attributes with casting
        for(Object object: farmFacade.getAllAnimals()){
            Animal animal = (Animal) object;
            System.out.println("animal '" + animal.getName()
                    + "' makes this sound '" + animal.getSound()
                    + "' because it is a '" + animal.getClass().getSimpleName()
                    + "' implemented by " + animal.getClass().getTypeName());
        }

    }
}
