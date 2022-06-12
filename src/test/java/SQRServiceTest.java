import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.sqr.SQRService;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/sqrt.csv")
    public void shouldCalcTheAmount(int expected, int left, int right) {
        SQRService service = new SQRService();

        int actual = service.calcSqrtAmount(left, right);

        Assertions.assertEquals(expected, actual);
    }
}
