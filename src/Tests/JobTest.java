package Tests;

import org.junit.Test;


import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;


public class JobTest {
    @Before
    public void twoJobObjects(){
       Job firstJobObject = new Job();
       Job secondJobObject = new Job();
    }

    @Test
    public void testSettingJobId(){
        Job firstJobObject = new Job();
        Job secondJobObject = new Job();

        assertFalse(firstJobObject.getId() == secondJobObject.getId());
        assertEquals(1,secondJobObject.getId() - firstJobObject.getId(),1 );

    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job constructorTest = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        //id test
        assertTrue(constructorTest.getId() > 0);

        //name test
        assertEquals("Product tester", constructorTest.getName());

        //class tests
        assertEquals(true, constructorTest.getEmployer() instanceof Employer);
        assertEquals(true, constructorTest.getLocation() instanceof Location);
        assertEquals(true, constructorTest.getPositionType() instanceof PositionType);
        assertEquals(true, constructorTest.getCoreCompetency() instanceof CoreCompetency);

        //value tests
        assertEquals("ACME", constructorTest.getEmployer().toString());
        assertEquals("Desert", constructorTest.getLocation().toString());
        assertEquals("Quality control", constructorTest.getPositionType().toString());
        assertEquals("Persistence", constructorTest.getCoreCompetency().toString());
    }

    @Test
    public void testJobsForEquality(){
        Job objectWithFirstId = new Job("Software Developer", new Employer("Booz Allen Hamilton"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("Angular"));
        Job objectWithSecondId = new Job("Software Developer", new Employer("Booz Allen Hamilton"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("Angular"));

        assertEquals(false, objectWithFirstId.equals(objectWithSecondId));



    }
}
