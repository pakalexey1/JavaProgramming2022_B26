package classes_self_review.day51_inheritance.app;

public class AppStore {
    public static void main(String[] args) {

        Instagram app1 = new Instagram(3.2);
        app1.download();
        app1.postPicture();

        YouTube app2 = new YouTube(3.0);
        app2.download();
        app2.watchVideo();

    }
}
