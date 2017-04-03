/*
 
	Dewansh Gautam 2015025
	Mayank Kumar   2015055
	
*/

package lab5;

import java.io.*;

public class Database 
{
	public static Movie[] movie = new Movie[30];
	public static Song[] song = new Song[31];
	protected static int countSong = 31;
	protected static int countMovie = 30;
	
	
	public Database()
	{
		try
		{
			FileReader f1 = new FileReader("movie.txt");
			BufferedReader file = new BufferedReader(f1);
			
			String row = null;
			int i = 0;
			
			while((row = file.readLine()) != null)
			{
				if(!(((row.split(","))[0]).equals("Movie")))
				{
					String[] temp = new String[10];
					temp = row.split(",");
					movie[i] = new Movie(temp); 
					i++;
				}
			}
			
			i = 0;
			row = null;
			
			FileReader f2 = new FileReader("song.txt");
			BufferedReader file2 = new BufferedReader(f2);
			
			while((row = file2.readLine()) != null)
			{
				if(!(((row.split(","))[0]).equals("Song")))
				{
					String[] temp = new String[8];
					temp = row.split(",");
					song[i] = new Song(temp);
					i++;
				}
			}
			
			
			f1.close();
			f2.close();
			
		}
		
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}
	
	

	public static void write(int i)
	{
		if(i == 1)
		{
			File f1 = new File("song.txt");
			FileOutputStream foo;
			try
			{
				foo = new FileOutputStream(f1,false);
				
				String a = "Song,Movie Name,Artist,Year of Release,Genre,Size,Rating,Duration";
				byte[] b = a.getBytes();
				foo.write(b);
				String z = "\r\n";
				byte[] zoom = z.getBytes();
				foo.write(zoom);
				
				for(int j = 0 ; j < countSong; j++)
				{
					String s = "";
					s += song[j].getTitle();
					s += ",";
					s += song[j].getmovieName();
					s += ",";
					s += song[j].getArtist();
					s += ",";
					s += song[j].getYear();
					s += ",";
					s += song[j].getGenre();
					s += ",";
					s += song[j].getSize();
					s += ",";
					s += song[j].getRating();
					s += ",";
					s += song[j].getDuration();
				
					byte[] my = s.getBytes();
					foo.write(my);
					s = "\r\n";
					my = s.getBytes();
					foo.write(my);
					
				}
				
		foo.close();		
		}
		catch(IOException e)
		{
				e.printStackTrace();
				
		}
		
			
	}
		else
		{
			File f1 = new File("movie.txt");
			FileOutputStream foo;
			try
			{
				foo = new FileOutputStream(f1,false);;
				
				String a = "Movie,Artist,Year of Release,Genre,Size,Rating,Duration,Director,Producer,Certificate";
				byte[] b = a.getBytes();
				foo.write(b);
				String z = "\r\n";
				byte[] zoom = z.getBytes();
				foo.write(zoom);
				
				for(int j = 0 ; j < countMovie; j++)
				{
					String s = "";
					s += movie[j].getTitle();
					s += ",";
					s += movie[j].getArtist();
					s += ",";
			
					s += movie[j].getYear();
					s += ",";
					s += movie[j].getGenre();
					s += ",";
					s += movie[j].getSize();
					s += ",";
					s += movie[j].getRating();
					s += ",";
					s += movie[j].getDuration();
					s +=",";
					s += movie[j].getDirector();
					s +=",";
					s += movie[j].getProducer();
					s += ",";
					s += movie[j].getCertification();
					
					byte[] my = s.getBytes();
					foo.write(my);
					s = "\r\n";
					my = s.getBytes();
					foo.write(my);
					
				}
				
		foo.close();		
		}
		catch(IOException e)
		{
				e.printStackTrace();
				
		}
		
	
		}
		
}
}