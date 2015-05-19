package Ark;

import Classes.FlyingAnimal;
import Classes.LandAnimal;
import Classes.OverAnimal;
import Classes.SwimmingAnimal;

/**
 * Created by ubcg49ac on 06/12/2014.
 */
public class Ark {

    public static void main(String[] args) {




            FlyingAnimal Fly = new FlyingAnimal("Fly", "EggLaying", "Buzz");
            FlyingAnimal Eagle = new FlyingAnimal("Eagle", "EggLaying", "Sqwauk");
            FlyingAnimal Pigeon = new FlyingAnimal("Pigeon", "EggLaying", "Coo");
            FlyingAnimal[] ListFA = {Fly, Eagle, Pigeon};

            for (int i = 0; i<3; i++){
                    ListFA[i].call();
                    ListFA[i].Strategy();
                    ListFA[i].MakeSound();
            }


            LandAnimal Bear = new LandAnimal("Bear", "LiveBirth", "Grrr");
            LandAnimal Beetle = new LandAnimal("Beetle", "EggLaying", "Clickclick");
            LandAnimal Cat = new LandAnimal("Cat", "LiveBirth","Meow");
            LandAnimal Crocodile = new LandAnimal("Crocodile", "EggLaying", "Snap");
            LandAnimal Dog = new LandAnimal("Dog", "LiveBirth", "Woof");
            LandAnimal Frog = new LandAnimal("Frog", "EggLaying", "Ribbit");
            LandAnimal Lizard = new LandAnimal("Lizard", "EggLaying", "???");
            LandAnimal Monkey = new LandAnimal("Monkey", "LiveBirth", "ook");
            LandAnimal Snake = new LandAnimal("Snake", "EggLaying", "Hiss");
            LandAnimal[] ListLA = {Bear, Beetle, Cat, Crocodile, Dog, Frog, Lizard, Monkey, Snake};

            for (int i = 0; i<9; i++){
                 ListLA[i].call();
                 ListLA[i].Strategy();
                 ListLA[i].MakeSound();
            }

            SwimmingAnimal Salmon = new SwimmingAnimal("Salmon", "EggLaying","????");
            SwimmingAnimal Shark = new SwimmingAnimal("Shark", "EggLaying", "????");
            SwimmingAnimal Whale = new SwimmingAnimal("Whale", "LiveBirth", "OOOOOooooMMMMM");
            SwimmingAnimal[] ListSA = {Salmon, Shark, Whale};

            for (int i = 0; i<3; i++){
                    ListSA[i].call();
                    ListSA[i].Strategy();
                    ListSA[i].MakeSound();
            }


    }
}
