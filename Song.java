/*
 
	Dewansh Gautam 2015025
	Mayank Kumar   2015055
	
*/

package lab5;

public class Song extends Media
{
	private String movieName;
	
	
	public Song(String[] temp)
	{
		this.setTitle(temp[0]);
		this.setArtist(temp[2]);
		this.setmovieName(temp[1]);
		
		this.setYear(temp[3]);
		this.setGenre(temp[4]);
		this.setSize(temp[5]);
		this.setRating(temp[6]);
		this.setDuration(temp[7]);
	}
	
	public String getmovieName()
	{
		return this.movieName;
	}
	
	//setter
	
	public void setmovieName(String movie)
	{
		this.movieName = movie;
	}
}
