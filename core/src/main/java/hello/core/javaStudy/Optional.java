package hello.core.javaStudy;

public class Optional {
    public void opTest(){
        java.util.Optional<String> optVal = java.util.Optional.ofNullable("이거지롱");
        String str2 = optVal.orElse("에러지롱");
        String str1 = optVal.get();
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);

    }
}
