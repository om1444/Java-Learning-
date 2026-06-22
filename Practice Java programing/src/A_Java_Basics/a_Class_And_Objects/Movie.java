package A_Java_Basics.a_Class_And_Objects;

public class Movie {

    String name;
    String genre;
    double rating;

    void display() {
        System.out.println("Movie Name : " + name);
        System.out.println("Genre      : " + genre);
        System.out.println("Rating     : " + rating);
        System.out.println();
    }

    public static void main(String[] args) {

        Movie m1 = new Movie();
        m1.name = "Inception";
        m1.genre = "Sci-Fi";
        m1.rating = 9.0;

        Movie m2 = new Movie();
        m2.name = "Avengers";
        m2.genre = "Action";
        m2.rating = 8.5;

        Movie m3 = new Movie();
        m3.name = "Interstellar";
        m3.genre = "Sci-Fi";
        m3.rating = 9.2;

        Movie m4 = new Movie();
        m4.name = "Titanic";
        m4.genre = "Romance";
        m4.rating = 8.8;

        Movie m5 = new Movie();
        m5.name = "Dangal";
        m5.genre = "Sports";
        m5.rating = 8.9;

        m1.display();
        m2.display();
        m3.display();
        m4.display();
        m5.display();
    }
}