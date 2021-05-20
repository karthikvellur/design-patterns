package creational.factory;

public class Shop extends Website{

    @Override
    public void createWebsite(){
        pages.add(new PostPage());
        pages.add(new CartPage());
        pages.add(new SearchPage());
    }
}
