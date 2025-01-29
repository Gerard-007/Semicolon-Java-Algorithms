import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestGoePoliticalZones {

    @Test
    public void testThatGeopoliticalZoneExists() {
        String actual = "Anambra";
        String expected = "";

        for (var zone : GeoPoliticalZones.values() ) {
            for (String state : zone.getGeoZones()) {
                if (state.equals(actual)) {
                    expected = zone.name();
                    break;
                }
            }
        }
        assertEquals("SOUTHEAST", expected);
    }
}