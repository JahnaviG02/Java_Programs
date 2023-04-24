import java.util.*;
class Movies {
// Declare Properties here
	String movie_name,actor,actress,director,producer;
	int budget;
	float rating;
	Scanner sc=new Scanner(System.in);
	public void getMovieDetails()
	{
		movie_name=sc.nextLine();
		actor=sc.nextLine();
		actress=sc.nextLine();
		director=sc.nextLine();
		producer=sc.nextLine();
		budget=sc.nextInt();
		rating=sc.nextFloat();
	}
	public void showMovieDetails()
	{
		System.out.println("Movie Name: "+movie_name);
		System.out.println("Actor: "+actor);
		System.out.println("Actress: "+actress);
		System.out.println("Director: "+director);
		System.out.println("Producer: "+producer);
		System.out.println("Budget: "+budget);
		System.out.println("Rating: "+rating);
	}
	public String getActor()
	{
		return actor;
	}
	public int getBudget()
	{
		return budget;
	}
	public float getRating()
	{
		return rating;
	}
	public String toString()
	{
		return actor+" "+actress+" "+movie_name;
	}
	public String getActress()
	{
		return actress;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*Movies m1=new Movies();
        m1.getMovieDetails();
        m1.showMovieDetails();
        System.out.println(m1);*/
            String heroine;
		float mrating;
            int mbudget;
            String mactor;
            String mactress;
            String hero1;
            String hero2;
            String hero3;
		Scanner sc=new Scanner(System.in);

		
		Movies m[]=new Movies[2];
		for(int i=0;i<m.length;i++)
			m[i]=new Movies();
		for(int i=0;i<m.length;i++)
			m[i].getMovieDetails();
		
		for(int i=0;i<m.length;i++)
			m[i].showMovieDetails();
		
		heroine=sc.nextLine();
		mrating=sc.nextFloat();
            mbudget=sc.nextInt();
            mactor=sc.nextLine();
             mactress=sc.nextLine();
             hero1=sc.nextLine();
		  hero2=sc.nextLine();
              hero3=sc.nextLine();
            for(int i=0;i<m.length;i++)
            {
              if(heroine.equalsIgnoreCase(m[i].getActress()))
			{
				System.out.println(m[i].movie_name);
			}

               if(m[i].getRating() > 7.5)
               {
                  System.out.println(m[i].movie_name);
                }
               
               if(mactor.equalsIgnoreCase(m[i].getActor()) && mactress.equalsIgnoreCase(m[i].getActress()))
			{
			System.out.println(m[i].movie_name);
		 	}
                if(hero1.equalsIgnoreCase(m[i].getActor()) || hero2.equalsIgnoreCase(m[i].getActor()) || hero3.equalsIgnoreCase(m[i].getActor()))
			{
				System.out.println(m[i].movie_name);
			}
		}
	}

}