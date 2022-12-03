package Abstraction;
abstract class Phon {
    String version;
    abstract public void playMusic();
}


class Iphon extends Phon
{
    public void playMusic()
    {
        this.version="ihon13";
        System.out.println( version + " play music");
    }
}


class Andrioid extends Phon
{
    public void playMusic()
    {
        this.version="Redmi 9 prime";
        System.out.println( version + " play music");
    }
}


public class AbsteactionClass extends Phon {
    public  void playMusic(){
        AbsteactionClass obj=new AbsteactionClass();
        obj.version="realme 13";
        System.out.println(obj.version +"play the music ");
    }
    public static void main(String[] args) {

        Iphon Iphon13=new Iphon();
        Iphon13.playMusic();

        Andrioid redmephon=new Andrioid();
        redmephon.playMusic();

        AbsteactionClass realme9=new AbsteactionClass();
        realme9.playMusic();
    }
}
