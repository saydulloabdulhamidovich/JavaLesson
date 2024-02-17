public class MethodOverloadingLesson {
    public void display(){
        System.out.println("method1");
    }
    public void display(int a){
        System.out.println("method"+ a);
    }
    public void display(double d){
        System.out.println("method"+ d);
    }
    public static void main(String[] args){
        MethodOverloadingLesson lesson=new MethodOverloadingLesson();
        lesson.display();
        lesson.display(10);
        lesson.display(15.0);
    }
}
