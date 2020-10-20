public class People {
    double height;
    int age;
    int sex;

    void cry(){
        System.out.println("cry");
    }
    void laugh(){
        System.out.println("laugh");
    }
    void printBaseMes(){
        System.out.println("height");
        if(this.sex==0)
            System.out.println("man");
        else
            System.out.println("female");
    }
}