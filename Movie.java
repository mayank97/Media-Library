/*
 
	Dewansh Gautam 2015025
	Mayank Kumar   2015055
	
*/

package lab5;

public class Movie extends Media
{
	private String director;
	private String producer;
	private String certification;
	
	public Movie(String[] temp)
	{
		this.setTitle(temp[0]);
		this.setArtist(temp[1]);
		this.setYear(temp[2]);
		this.setSize(temp[4]);
		this.setGenre(temp[3]);
		this.setRating(temp[5]);
		this.setDuration(temp[6]);
		
		this.setDirector(temp[7]);
		this.setProducer(temp[8]);
		this.setCertification(temp[9]);
		
	}
	//getter
	
	public String getDirector()
	{
		return this.director;
	}
	public String getProducer()
	{
		return this.producer;
	}
	public String getCertification()
	{
		return this.certification;
	}
	
	//setters
	
	public void setDirector(String director)
	{
		this.director = director;
	}
	public void setProducer(String producer)
	{
		this.producer = producer;
	}
	public void setCertification(String certification)
	{
		this.certification = certification;
	}
	
	
}
