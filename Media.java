/*
 
	Dewansh Gautam 2015025
	Mayank Kumar   2015055
	
*/

package lab5;

import java.io.*;

import javax.crypto.SealedObject;
public class Media implements Serializable
{
	private String title;
	private String artist;
	private String year;
	private String size;
	private String rating;
	private String duration;
	private String genre;
	
	//setter
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	public void setArtist(String artist)
	{
		this.artist = artist;
	}
	public void setYear(String year)
	{
		this.year = year;
	}
	public void setSize(String size)
	{
		this.size = size;
	}
	public void setRating(String rating)
	{
		this.rating = rating;
	}
	public void setDuration(String duration)
	{
		this.duration = duration;
	}
	public void setGenre(String genre)
	{
		this.genre = genre;
	}
	
	//getter
	public String getTitle()
	{
		return this.title;
	}
	public String getArtist()
	{
		return this.artist;
	}
	public String getYear()
	{
		return this.year;
	}
	public String getSize()
	{
		return this.size;
	}
	public String getRating()
	{
		return this.rating;
	}
	public String getDuration()
	{
		return this.duration;
	}
	public String getGenre()
	{
		return this.genre;
	}
	
	
	public static void Serial(int z)
	{
		new Database();
		FileOutputStream fOut1;
		ObjectOutputStream out1;
		FileOutputStream fout2;
		ObjectOutputStream out2;
		
		try
		{
			fOut1 = new FileOutputStream("song.dat",false);
			out1 = new ObjectOutputStream(fOut1);
			
			fout2 = new FileOutputStream("movie.dat");
			out2 = new ObjectOutputStream(fout2);
			
			for(int i=0;i< Database.countSong ;i++)
			{
				Media music = Database.song[i];
				out1.writeObject(music);
				
			}
			
			for(int i = 0; i< Database.countMovie;i++)
			{
				Media movie = Database.movie[i];
				
					out2.writeObject(movie);
				
				
			}
			
			fOut1.close();
			out1.close();
			
			fout2.close();
			out2.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
			
			Deserealize();
		
	}
	
	public static void Deserealize()
	{
		Media[] music = new Song[31];
		Media[] movie = new Movie[30];
		
		try
		{
			FileInputStream fIn = new FileInputStream("song.dat");
			ObjectInputStream in = new ObjectInputStream(fIn);
		
			FileInputStream fin = new FileInputStream("movie.dat");
			ObjectInputStream inn = new ObjectInputStream(fin);
			for(int i=0 ; i < Database.countSong ; i ++)
			{		music[i] = (Song) in.readObject();
				
			}
			
			for(int i =0 ; i<Database.countMovie ; i++)
			{
				
					movie[i] = (Movie) inn.readObject();
				
			}
			
		fIn.close();
		in.close();
		
		fin.close();
		inn.close();
		
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("The Media class has been serealized and deserealized back.");
	}
	
}
