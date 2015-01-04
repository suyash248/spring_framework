package springPrj;

public class CustomerService {
    private String name;
    private String url;
    
    public void setName(String name){
        this.name=name;
    }
    public void setUrl(String url){
        this.url=url;
    }
    public void printName(){
        System.out.println("Customer name : "+this.name);
    }
    public void showUrl(){
        System.out.println("Customer's website : "+this.url);
    }
    public void printThrowException(){
        throw new IllegalArgumentException();
    }
}
