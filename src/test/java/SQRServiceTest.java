import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.squareroot.services.SQRService;


public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/sqrtroot.csv")
    public void testSquareRootInBounds(int expected, int lowerLimit, int upperLimit) {
        SQRService service = new SQRService();
        int actual = service.calcSqrtRoot(lowerLimit, upperLimit);
        Assertions.assertEquals(expected, actual);
    }
}
