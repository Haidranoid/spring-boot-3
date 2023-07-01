package business;

import com.example.myfirstwebapp.business.DataService;
import com.example.myfirstwebapp.business.SomeBusinessImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class SomeBusinessImplMockTest {
    @Mock
    private DataService dataServiceMock;
    @InjectMocks
    private SomeBusinessImpl business;

    @Test
    void findTheGreatestFromAllData_basicScenario() {
        //DataService dataServiceMock = mock(DataService.class);
        //dataServiceMock.retrieveAllData() => new int[]{25,15,5}
        when(dataServiceMock.retrieveAllData())
                .thenReturn(new int[]{25, 15, 5});

        // SomeBusinessImpl business = new SomeBusinessImpl(dataServiceMock);

        int result = business.findTheGreatestFromAllData();
        assertEquals(25, result);
    }

    @Test
    void findTheGreatestFromAllData_OneValue() {
        //DataService dataServiceMock = mock(DataService.class);
        //dataServiceMock.retrieveAllData() => new int[]{35}
        when(dataServiceMock.retrieveAllData())
                .thenReturn(new int[]{35});

        //SomeBusinessImpl business = new SomeBusinessImpl(dataServiceMock);

        int result = business.findTheGreatestFromAllData();
        assertEquals(35, result);
    }

    @Test
    void findTheGreatestFromAllData_EmptyArray() {
        when(dataServiceMock.retrieveAllData())
                .thenReturn(new int[]{});

        int result = business.findTheGreatestFromAllData();
        assertEquals(Integer.MIN_VALUE, result);
    }
}

