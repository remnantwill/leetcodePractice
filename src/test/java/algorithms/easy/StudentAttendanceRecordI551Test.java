package algorithms.easy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@SpringBootTest(classes = StudentAttendanceRecordI551.class)
@RunWith(SpringRunner.class)
public class StudentAttendanceRecordI551Test {

    @Resource
    StudentAttendanceRecordI551 instance;

    @Test
    public void checkRecordTest() {
        String s = "PPALLL";
        boolean ans = instance.checkRecord(s);
        System.out.println(ans);
    }
}
