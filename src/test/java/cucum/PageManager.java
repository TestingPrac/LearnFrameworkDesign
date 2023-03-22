package cucum;

public class PageManager {
    Pageclass pageclass;
    public Pageclass getPageclass(){
        return (pageclass==null) ? pageclass =new Pageclass(BaseClass.driver): pageclass;
    }
}
