import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Factory.HondaMaker;

public class FactoryTest {
    HondaMaker m = new HondaMaker();
    HondaMaker n = new HondaMaker();

    @Before
    public void setUp1() {
        this.m = new HondaMaker();
    }

    @Test
    public void checkNullConstructor() {
        assertNotNull("object is null", this.m);
    }

    @Before
    public void setUp2() {
        this.m = new HondaMaker("Perry Honda", "Accord");
        this.n = new HondaMaker("Perry Honda", "RAV4");
    }

    @Test
    public void checkNotEqualModel() {
        assertNotEquals("Objects equal", m, n);
    }

    @Before
    public void setUp3() {
        this.m.setModel("RAV4");
    }

    @Test
    public void checkEqualModel() {
        assertEquals("Objects not equals", m.getModel(), n.getModel());
    }

}
