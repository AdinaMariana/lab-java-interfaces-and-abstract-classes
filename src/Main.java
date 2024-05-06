public class Main {
    public static void main(String[] args) {
        TvSeries series = new TvSeries("Stranger Things", 50, 25);
        Movie movie = new Movie("Inception", 148, 8.8);

        System.out.println(series.getInfo());
        System.out.println(movie.getInfo());
    }
}