interface Toy{
    void talk();
}

class Dog implements Toy{
    public void talk(){
        System.out.println("Wow");
    }
}

class Cat implements Toy{
    public void talk(){
        System.out.println("Meow");
    }
}

public class ToyFactory{
    public Toy getToy(String type){
        if(type == null){
            return null;
        }

        if(type.equalsIgnoreCase("Dog")){
            return new Dog();
        }else if(type.equalsIgnoreCase("Cat")){
            return new Cat();
        }
        return null;
    }

}