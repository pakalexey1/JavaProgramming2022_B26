package classes_self_review.day55_polymorphism.shopping;

public interface ConsumerApp extends Shipping,AllowUserToSell{

}

abstract class TestA implements Shipping, AllowUserToSell{} //you can implement two original interfaces in a class directly
                                                // OR
abstract class TestB implements ConsumerApp{} //you can create a class where these two interfaces are grouped and then implemented it instead.