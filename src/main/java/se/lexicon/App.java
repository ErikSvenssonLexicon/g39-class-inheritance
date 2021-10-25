package se.lexicon;

import se.lexicon.model.Animal;
import se.lexicon.model.Dog;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Dog fido = new Dog(
                "Fido",
                60,
                4,
                1,
                20
        );

        Object fifi = new Dog(
                "Fifi", 16, 4, 1, 20
        );

        Animal koko = new Dog("Koko", 10, 4, 1, 20);

        Object [] objects = new Object[10];
        objects[0] = koko;
        objects[1] = fifi;
        objects[2] = fido;
        objects[3] = "Nisse";
        objects[4] = 1;
        objects[5] = LocalDate.now();

        Integer integer = 1;
        Double d = 2.43;
        Byte b = 41;
        Float f = 23F;
        Short s = 2345;
        Long l = 4342342L;
        Character charObject = 's';
        Boolean bool = true;




        for(Object obj : objects){
            System.out.println(obj);
        }




    }
}
