package JUnitTest;

import controller.UniversityCreator;
import model.University;

import org.junit.Test;
import org.junit.Assert;

public class JsonTest {
    @Test
    public void testFileWriteJsonToFile() {

        String filePath = "./src/myUniversity.json";

        JsonManager jsonManager = new JsonManager();
        UniversityCreator universityCreator = new UniversityCreator();

        University oldUniversity = universityCreator.typicalUniversity();
        System.out.println(oldUniversity.toString());

        jsonManager.writeToJson(oldUniversity, filePath);
        University newUniversity = (University) jsonManager.readFromJson(filePath);
        System.out.println(newUniversity.toString());

        Assert.assertEquals(newUniversity, oldUniversity);
    }
}
