package oca.samples;

public class OCAQuestions {

}


/**
 * Question 1
 * @author miguel.a.sosa
 *
 */

 class MakeVertebrates {
    public static void main(String[] args) {
       Vertebrate whiteCat = new Cat();
       Cat blackCat = new Cat();
       Cat strayCat = new Cat();
      // strayCat = whiteCat;
      // Add casting
       strayCat = (Cat)whiteCat;
       // No need casting 
       Vertebrate strayCat2 = new Cat();
       blackCat = strayCat;
    }
 }
 class Vertebrate { }
 class Cat extends Vertebrate { }

 //Question 2
 
//Which method tell stringBuilder amount of storage available
 
 
 
 