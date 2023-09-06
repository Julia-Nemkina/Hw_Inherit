import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TasksTest {
    @Test
    public void testWhenSimpleTaskMatches() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean actual = simpleTask.matches("Позвонить");
        //boolean expected = true; - 1й вариант

        //Assertions.assertEquals(expected, actual); - 1й вариант
        Assertions.assertTrue(actual); // - 2й вариант
    }
    @Test
    public void testWhenSimpleTaskNotMatches() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean actual = simpleTask.matches("Написать");
        //boolean expected = false; - 1й вариант

        //Assertions.assertEquals(expected, actual); - 1й вариант
        Assertions.assertFalse(actual); // - 2й вариант
    }
    @Test
    public void testWhenEpicMatches() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);
        boolean actual = epic.matches("Хлеб");
        //boolean expected = true; - 1й вариант

        //Assertions.assertEquals(expected, actual); - 1й вариант
        Assertions.assertTrue(actual); // - 2й вариант
    }
    @Test
    public void testWhenEpicNotMatches() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);
        boolean actual = epic.matches("Шоколад");
        //boolean expected = false; - 1й вариант

        //Assertions.assertEquals(expected, actual); - 1й вариант
        Assertions.assertFalse(actual); // - 2й вариант
    }
    @Test
    public void testWhenTopicMatches() {
        String topic = "Выкатка 3й версии приложения";
        Meeting meeting = new Meeting(555, topic,"Приложение НетоБанка","Во вторник после обеда");

        boolean actual = meeting.matches("Выкатка 3й версии приложения");
        //boolean expected = true; - 1й вариант

        //Assertions.assertEquals(expected, actual); - 1й вариант
        Assertions.assertTrue(actual); // - 2й вариант
    }
    @Test
    public void testWhenProjectMatches() {
        String project = "Приложение НетоБанка";
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                project,
                "Во вторник после обеда"
        );

        boolean actual = meeting.matches("Приложение НетоБанка");
        //boolean expected = true; - 1й вариант

        //Assertions.assertEquals(expected, actual); - 1й вариант
        Assertions.assertTrue(actual); // - 2й вариант
    }
    @Test
    public void testWhenMeetingNotMatches() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean actual = meeting.matches("Привет, Тимур!");
        //boolean expected = false; - 1й вариант

        //Assertions.assertEquals(expected, actual); - 1й вариант
        Assertions.assertFalse(actual); // - 2й вариант
    }

}
