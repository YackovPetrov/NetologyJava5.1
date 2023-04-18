import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.services.ScheduleService;



public class ScheduleServiceTest {
    @ParameterizedTest
    @CsvFileSource (files="src/test/resources/ Schedule.csv")
    public void testScheduleService(int income, int expense, int threshold){
        int = service.calcSchedule(income, expense, threshold);
        Assertions.assertEquals();

    };



}
