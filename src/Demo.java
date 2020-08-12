import java.util.LinkedList;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Question 2");
        LinkedList<Person> linkedList = new LinkedList<>();
        linkedList.add(new Person("Ali"));
        linkedList.add(new Person("Muzammal"));
        linkedList.add(new Person("Uzair"));
        linkedList.add(new Person("Awaiz"));
        PersonListClass list = new PersonListClass(linkedList);
        PersonIterator<Person> iterator = list.getIterator();

        while (iterator.hasNext())
        {
            Person currentperson = iterator.next();
            System.out.println(currentperson.getName());
        }

        System.out.println("Question No 4");
        Bouteqe bouteqe = new RoseBouteqe();
        bouteqe= new PaperWrapper(bouteqe);
        System.out.println(bouteqe.getDescription());
        System.out.println(bouteqe.cost());
        bouteqe= new LillyBouteqe();
        bouteqe=new RibbomBow(bouteqe);
        System.out.println(bouteqe.getDescription());
        System.out.println(bouteqe.cost());
        bouteqe= new OrchidBouteqe();
        bouteqe= new GlitterOrnamental(bouteqe);
        System.out.println(bouteqe.cost());
        System.out.println(bouteqe.getDescription());
//
        System.out.println("Question 1");
         Robot r1 = new Robot("Hamza");
         r1.setBehaviour(new Normal());
         r1.move();
        Robot r2 = new Robot("Ali Raza");
        r2.setBehaviour(new DefensiveBehaviour());
        r2.move();
        Robot r3 = new Robot("Arslan");
        r3.setBehaviour(new AggresiveBehiour());
        r3.move();



//
        System.out.println("Question No 3");
        SQLServer sqlServer = new PdfFormat();

        sqlServer.dataFormat();
        sqlServer= new ExcelFormat();
        sqlServer.dataFormat();
    }
}
