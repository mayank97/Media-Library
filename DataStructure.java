/*
 
	Dewansh Gautam 2015025
	Mayank Kumar   2015055
	
*/

package lab5;

import java.util.*;

public class DataStructure 
{
	
	public static void TreeSetSong(int k) throws MyException
	{
		if(k>(Database.countSong)||k<=0)
		{
			//System.out.println("Enter a number between 1-31 as the number of songs in the library are 31");
			throw new MyException("(Exception)Enter a number between 1-31 as the number of songs in the library are 31");
			
		}
		else{
		
		
		System.out.println();
		new Database();
		SortedSet<String> tree = new TreeSet<>();
		int i;
		for( i =0; i< Database.countSong ; i++)
		{
			
			String s = Database.song[i].getRating();
			s += Database.song[i].getTitle();
			
			tree.add(s);
		}
		i=30;
		String[] array = new String[31];
		
		
		for(String s : tree)
		{
			String temp = s.substring(0,1);
			
			array[i] = s;
			i--;
		}
		System.out.printf("Top %d song titles are : ", k);
		System.out.println();
		System.out.println();
		System.out.printf("Rating");
		System.out.printf("    ");
		System.out.println("Song Title");
		for(int j = 0 ;j<k;j++)
		{
			System.out.printf("  ");
			String s  = array[j];
			String temp1 = s.substring(0,1);
			System.out.printf(temp1);
			System.out.printf("         ");
			
			String temp2 = s.substring(1,s.length());
			System.out.printf(temp2);
			System.out.println();
		}
		}
	System.out.println();
	}
	
	
	public static void TreeSetMovie(int k)
	{
		if(k>(Database.countMovie)||k<=0)
		{
			//System.out.println("Enter a number between 1-30 as the number of movies in the library is 30");
			try {
				throw new MyException("(Exception)Enter a number between 1-30 as the number of movies in the library is 30");
			} catch (MyException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		}
		else
		{
		SortedSet<String> tree = new TreeSet<>();
		int i;
		new Database();
		for( i =0; i< Database.countMovie ; i++)
		{
			
			String s = Database.movie[i].getRating();
			s += Database.movie[i].getTitle();
			
			tree.add(s);
		}
		i=29;
		String[] array = new String[30];
		
		
		for(String s : tree)
		{
			String temp = s.substring(0,1);
		
			if((temp).equals("1"))
			{
				array[i] = s;
			}
			else if((temp).equals("2"))
			{
				array[i] = s;
			}
			else if((temp).equals("3"))
			{
				array[i] = s;
			}
			else if((temp).equals("4"))
			{
				array[i] = s;
			}
			else
			{
				array[i] = s;
			}
			i--;
		}
		System.out.printf("Top %d movie titles are : ", k);
		System.out.println();
		System.out.println();
		System.out.printf("Rating");
		System.out.printf("    ");
		System.out.println("Movie Title");
		
		for(int j = 0 ;j<k;j++)
		{
			System.out.printf("  ");
			String s  = array[j];
			String temp1 = s.substring(0,1);
			System.out.printf(temp1);
			System.out.printf("        ");
			String temp2 = s.substring(1,s.length());
			System.out.println(temp2);
		}
		}
		System.out.println();
	}
	
	
	
	public static void HashMap()
	{
		new Database();
		Map<String, Song> songMap = new HashMap<>();
		Map<String, Movie> movieMap = new HashMap<>();
		
		for(int i = 0; i<Database.countSong ; i++)
		{
			songMap.put(Database.song[i].getTitle(), Database.song[i]);
			
		}
		for(int i = 0; i< Database.countMovie ; i++)
		{
			movieMap.put(Database.movie[i].getTitle(), Database.movie[i]);
		}
		
		System.out.println("List of all songs in the library : ");
		System.out.println();
		
		for(int i = 0 ; i < Database.countSong; i++)
		{
			String s = Database.song[i].getTitle();
			Song e = songMap.get(s);
			
			System.out.printf("	Song Title 	: ");
			System.out.println(e.getTitle());
			System.out.printf("	Movie 		: ");
			System.out.println(e.getmovieName());
			System.out.printf("	Artist 		: ");
			System.out.println(e.getArtist());
			System.out.printf("	Year of Release : ");
			System.out.println(e.getYear());
			System.out.printf("	Genre 		: ");
			System.out.println(e.getGenre());
			System.out.printf("	Size 		: ");
			System.out.printf(e.getSize());
			System.out.println(" MB");
			System.out.printf("	Rating 		: ");
			System.out.println(e.getRating());
			System.out.printf("	Duration (mins) : ");
			System.out.println(e.getDuration());
			
			System.out.println();
		}
		
		

		System.out.println("List of all movies in the library : ");
		System.out.println();
		for(int i = 0 ; i < Database.countMovie; i++)
		{
			String s = Database.movie[i].getTitle();
			Movie e = movieMap.get(s);
			
			System.out.printf("	Movie name 	: ");
			System.out.println(e.getTitle());
			System.out.printf("	Artist 		: ");
			System.out.println(e.getArtist());
			System.out.printf("	Year of Release : ");
			System.out.println(e.getYear());
			System.out.printf("	Genre 		: ");
			System.out.println(e.getGenre());
			System.out.printf("	Size 		: ");
			System.out.printf(e.getSize());
			System.out.println(" GB");
			System.out.printf("	Rating 		: ");
			System.out.println(e.getRating());
			System.out.printf("	Duration (hrs)  : ");
			System.out.println(e.getDuration());
			System.out.printf("	Director        : ");
			System.out.println(e.getDirector());
			System.out.printf("	Producer 	: ");
			System.out.println(e.getProducer());
			System.out.printf("	Certification 	: ");
			System.out.println(e.getCertification());
			
			System.out.println();
		}
	}
	
public static void HashTable(String movie)
{
	new Database();
	Map<String,LinkedList<String>> movieSong = new HashMap<>();
	String s;
	if(movie.compareTo("Movie29")<=0)
	{
		for(int i = 0 ; i < Database.countMovie ; i++)
		{
			s = Database.movie[i].getTitle();
			LinkedList<String> songList = new LinkedList<>();
		
		int count = 0;
			for(int j = 0; j< Database.countSong ; j++)
			{
				if((Database.song[j].getmovieName()).equals(s))
				{
					songList.add(Database.song[j].getTitle());
					count++;
				}
			}
			if(count == 0)
			{
				songList.add("	No song");
			}
		
		
			movieSong.put(s, songList);
		}

	}
	else
	{
		LinkedList<String> lis = new LinkedList<>();
		lis.add("No Song");
		movieSong.put(movie, lis);
	}
		
	
	
	LinkedList<String> e = movieSong.get(movie);
	ListIterator<String> iter = e.listIterator();
	
	System.out.printf("The list of songs of %s are :", movie);
	System.out.println();
	
	while(iter.hasNext())
	{
		System.out.printf("	");
		System.out.println(iter.next());
	}
}


public static void HashDirector(String director)
{
	new Database();
	Map<String,LinkedList<String>> movieDirector = new HashMap<>();
	String s;
	
		for(int i = 0 ; i < Database.countMovie ; i++)
		{
			s = Database.movie[i].getDirector();
			LinkedList<String> movieList = new LinkedList<>();
		
			int count = 0;
			for(int j = 0; j< Database.countMovie ; j++)
			{
				if((Database.movie[j].getDirector()).equals(s))
				{
					movieList.add(Database.movie[j].getTitle());
					count++;
				}
			}
			if(count == 0)
			{
				movieList.add("No Director");
				try{
					throw new MyException("(Exception)");
				}
				catch(MyException e){
					System.out.println(e.getMessage());
				}
			}
		
		
			movieDirector.put(s, movieList);
		}

		if(!(movieDirector.containsKey(director)))
		{
			LinkedList<String> lis = new LinkedList<>();
			lis.add("No Movie");
			
			movieDirector.put(director, lis);
		}
		
	
	
	LinkedList<String> e = movieDirector.get(director);
	ListIterator<String> iter = e.listIterator();
	
	System.out.printf("The list of movies of %s are :", director);
	System.out.println();
	
	while(iter.hasNext())
	{
		System.out.printf("	");
		System.out.println(iter.next());
	}
}


public static void FindGenre(String genre)
{
	new Database();
	Map<String,LinkedList<String>> genreMapping = new HashMap<>();
	String s;
	
		for(int i = 0 ; i < Database.countSong ; i++)
		{
			s = Database.song[i].getGenre();
			LinkedList<String> songList = new LinkedList<>();
		
			int count = 0;
			for(int j = 0; j< Database.countSong ; j++)
			{
				if((Database.song[j].getGenre()).equals(s))
				{
					songList.add(Database.song[j].getTitle());
					count++;
				}
			}
			if(count == 0)
			{
				songList.add("No Song");
				
			}
		
		
			genreMapping.put(s, songList);
		}

		if(!(genreMapping.containsKey(genre)))
		{
			LinkedList<String> lis = new LinkedList<>();
			lis.add("No Genre");
			genreMapping.put(genre, lis);
			try{
				throw new MyException("(Exception)");
			}
			catch(MyException e){
				System.out.println(e.getMessage());
			}
		}
		
	
	
	LinkedList<String> e = genreMapping.get(genre);
	ListIterator<String> iter = e.listIterator();
	
	System.out.printf("The list of songs of type %s are :", genre);
	System.out.println();
	
	while(iter.hasNext())
	{
		System.out.printf("	");
		System.out.println(iter.next());
	}
}


}
