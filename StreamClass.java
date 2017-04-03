/*
 
	Dewansh Gautam 2015025
	Mayank Kumar   2015055
	
*/


package lab5;
import java.io.*;


public class StreamClass extends FileWriter
{

	

	
	public StreamClass(File file) throws IOException 
	{
		super(new File("EncryptedSong.txt"));
		Encrypt();
	}

	public void write(int c)
	{
		try 
		{
			super.write(c);
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	
	public void write(char[] cbuf, int off, int len) throws IOException
	{
		super.write(cbuf, off, len);
		
	}
	
	public void write(String str, int off,int len) throws IOException
	{
		super.write(str, off, len);
	}


	public void Encrypt()
	{
		new Database();
		File f1 = new File("EncryptedSong.txt");
		
		
		try
		{
			FileWriter out = new FileWriter(f1);
			
			String a = "Song,Movie Name,Artist,Year of Release,Genre,Size,Rating,Duration";
			
			for(int i = 0; i<a.length();i++)
			{
				char c = a.charAt(i);
				int temp  = (int)c;
				temp +=2;
				c = (char)temp;
				out.write(c);
				
				
			}
			out.write(-2);
			out.write("\r\n");
			
			for(int j = 0 ; j <Database.countSong;j++)
			{
				String s = "";
				s += Database.song[j].getTitle();
				s += ",";
				s += Database.song[j].getmovieName();
				s += ",";
				s += Database.song[j].getArtist();
				s += ",";
				s += Database.song[j].getYear();
				s += ",";
				s += Database.song[j].getGenre();
				s += ",";
				s += Database.song[j].getSize();
				s += ",";
				s += Database.song[j].getRating();
				s += ",";
				s += Database.song[j].getDuration();

				for(int i = 0 ; i<s.length();i++)
				{
					char c = s.charAt(i);
					int temp = (int)c;
					temp +=2;
					c = (char)temp;
					out.write(c);
				}
				out.write(-2);
				out.write("\r\n");
			}
		out.close();

		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	EncryptMovie();		
	}
	
	
	public void EncryptMovie()
	{
		new Database();
		File f1 = new File("EncryptedMovie.txt");
		
		try
		{
			FileWriter out = new FileWriter(f1);
			
			String a = "Movie,Artist,Year of Release,Genre,Size,Rating,Duration,Director,Producer,Certificate";
						
			for(int i = 0; i<a.length();i++)
			{
				char c = a.charAt(i);
				int temp  = (int)c;
				temp +=2;
				c = (char)temp;
				out.write(c);
			}
			
			out.write(-2);
			out.write("\r\n");
			
			for(int j = 0 ; j <Database.countMovie;j++)
			{
				String s = "";
				s += Database.movie[j].getTitle();
				s += ",";
				s += Database.movie[j].getArtist();
				s += ",";
		
				s += Database.movie[j].getYear();
				s += ",";
				s += Database.movie[j].getGenre();
				s += ",";
				s += Database.movie[j].getSize();
				s += ",";
				s += Database.movie[j].getRating();
				s += ",";
				s += Database.movie[j].getDuration();
				s +=",";
				s += Database.movie[j].getDirector();
				s +=",";
				s += Database.movie[j].getProducer();
				s += ",";
				s += Database.movie[j].getCertification();
		
				for(int i = 0 ; i<s.length();i++)
				{
					char c = s.charAt(i);
					int temp = (int)c;
					temp +=2;
					c = (char)temp;
					out.write(c);
				}
				out.write(-2);
				out.write("\r\n");
			}
		out.close();

		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	
	Decrypt();
	}
	


	public void Decrypt()
	{
		
		FileReader in = null;
		FileWriter out = null;
		File f1 = new File("DecryptedSong.txt");
		try
		{
			in = new FileReader("EncryptedSong.txt");
			out = new FileWriter(f1);
			int c;
			while((c = in.read()) != -1)
			{
				if((char)c == '?')
				{
					out.write("\r\n");
				}
				else
				{
				
					c -=2;
					char a = (char)c;
					out.write(a);	
				}
			}
			
		out.close();
		}
			catch(IOException e)
			{
				e.printStackTrace();
				
			}
		DecryptMovie();
	
	}
		
	public void DecryptMovie()
	{
			
			FileReader in = null;
			FileWriter out = null;
			File f2 = new File("DecryptedMovie.txt");
			try
			{
				in = new FileReader("EncryptedMovie.txt");
				out = new FileWriter(f2);
				int c;
				while((c = in.read()) != -1)
				{
					if((char)c == '?')
					{
						out.write("\r\n");
					}
					else
					{
						
						c -=2;
						char a = (char)c;
						out.write(a);	
					}
				}
				
			out.close();
			}
				catch(IOException e)
				{
					e.printStackTrace();
					
				}
		
		}
	
		
		
	
	
}
