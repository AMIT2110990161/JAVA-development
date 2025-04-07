import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GradeTest {
    @Test
    void AcheckMarks99(){
        Grade gr = new Grade();
        assertEquals('A', gr.getResult(99));
    }
    @Test
    void BcheckMarks99(){
        Grade gr = new Grade();
        assertEquals('B', gr.getResult(89));
    }
    @Test
    void CcheckMarks99(){
        Grade gr = new Grade();
        assertEquals('C', gr.getResult(79));
    }
    @Test
    void DcheckMarks99(){
        Grade gr = new Grade();
        assertEquals('D', gr.getResult(69));
    }
}
