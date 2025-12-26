import br.com.dio.desafio.domain.Course;
import br.com.dio.desafio.domain.Mentoring;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Course curso1 = new Course();
        curso1.setTitle("Java course");
        curso1.setDescription("java course description");
        curso1.setWorkload(8);

        Course curso2 = new Course();
        curso2.setTitle("Js course");
        curso2.setDescription("js course description");
        curso2.setWorkload(4);

        Mentoring mentoria1 = new Mentoring();
        mentoria1.setTitle("Java mentoring");
        mentoria1.setDescription("java mentoring Description");
        mentoria1.setDate(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
    }
}