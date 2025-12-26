import br.com.dio.desafio.domain.Bootcamp;
import br.com.dio.desafio.domain.Course;
import br.com.dio.desafio.domain.Dev;
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

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp java developer");
        bootcamp.setDescription("Bootcamp java developer description");
        bootcamp.getContents().add(curso1);
        bootcamp.getContents().add(curso2);
        bootcamp.getContents().add(mentoria1);

        System.out.println("-----Camila------");
        Dev devCamila = new Dev();
        devCamila.setName("Camila");
        devCamila.registerBootcamp(bootcamp);
        System.out.println("Camila's registered content: " + devCamila.getRegisteredContents());
        System.out.println("XP: " + devCamila.calculateXP());


        devCamila.progress();
        devCamila.progress();
        System.out.println("----- after progress ------");
        System.out.println("Camila's registered content: " + devCamila.getRegisteredContents());
        System.out.println("Camila's completed content: " + devCamila.getCompletedContents());
        System.out.println("XP: " + devCamila.calculateXP());


        System.out.println("\n");
        System.out.println("-----Joao------");

        Dev devJoao = new Dev();
        devJoao.setName("joao");
        devJoao.registerBootcamp(bootcamp);
        System.out.println("joao's registered content: " + devJoao.getRegisteredContents());
        System.out.println("XP: " + devJoao.calculateXP());

        devJoao.progress();
        System.out.println("----- after progress ------");
        System.out.println("joao's registered content: " + devJoao.getRegisteredContents());
        System.out.println("joao's completed content: " + devJoao.getCompletedContents());
        System.out.println("XP: " + devJoao.calculateXP());
    }
}