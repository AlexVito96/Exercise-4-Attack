public class Example{
    public static void main(String args[]){

        Student s1=new Student("Alex", 29, 7);
        Student s2= new Student("Nicole", 24, 7);
        Student s3=new Student("Kyle", 27,9);

        User u1= new User("Alex", 23);


        Animal a1= new Animal("Machiato", "Dog");
        Animal a2= new Animal("Baby", "Shark");
        Animal a3= new Animal("Killer", "Whale");
        Animal a4= new Animal ("Big", "Wolf");



        s1.studentDisplay();
        System.out.println(u1.name);
        System.out.println(a1.name);
        
        
        a2.attack(s1);

        a3.attack(s2);
        a4.attack(s3);
        
    }

   

}