package interfacebuba;

public interface buba2 {

    public void pishka();
    public void dupe();

}
interface polovakt{
    public String momche();
    public String milf();
}
interface bj extends polovakt{      //interface naslqdqva drug interface (extends)

    }


class Jenskipolovorgan implements buba2{  // normalen class implementira interface(implements) .
    public void pishka(){
        System.out.println("Vliza i izliza");
    }

    @Override
    public void dupe() {
        System.out.println("izhojda se");
    }
}




//class nemoje da extendva interface no moje da go implementira(da mu prenapisva methodite )