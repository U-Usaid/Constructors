package src;

public class Movie {

	String title;
	String director;
	int year;
	
	
	Movie(String movieTitle, String movieDirector, int releaseYear){
		this.title = movieTitle;
		this.director = movieDirector;
		this.year = releaseYear;
	}
	
	
	public String getTitle() {
		return title; 
	}
	
	public String getDirector() {
		return director;
	}
	
	public int getReleaseYear() {
		return year;
	}
}
