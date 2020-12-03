package movieReservation;

public class MovieVo {
	private String movieName;
	private int runtime;
	private String genre;
	private String director;
	private int audience;
	
	public MovieVo(String movieName, int runtime, 
			String genre, String director, int audience) {
		super();
		this.movieName= movieName;
		this.runtime = runtime;
		this.genre = genre;
		this.director = director;
		this.audience = audience;
	}
	
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public int getRuntime() {
		return runtime;
	}
	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre= genre;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director= director;
	}
	public int getAudience() {
		return audience;
	}
	public void setAudience(int audience) {
		this.audience = audience;
	}
	
	public String toString() {
		return movieName +"\t"+runtime
				+"분\t"+genre+"\t"+director+"\t"+audience+"명";
	}
}
