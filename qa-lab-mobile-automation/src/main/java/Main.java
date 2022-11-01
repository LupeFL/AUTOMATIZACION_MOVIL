import java.io.File;

public class Main {
    public static void main(String[] args){
        File app = new File("app\\Android.SauceLabs.Mobile.Sample.app.2.7.1.apk");
        System.out.println("RUTA: " + app.getAbsolutePath().replace("\\", "/"));
    }
}
