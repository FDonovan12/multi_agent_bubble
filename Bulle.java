

public class Bulle 
{
	public double 					x;
	public double 					y;
	
	public final static int 		COL_DEBUT = 3;
	public final static int 		LIN_DEBUT = 3;
	public final static int 		TABLEAU = 50;
	public final static int 		NB_ETAPE = 5;
	public static int 				BULLE_SAUVE = 0;
	public static int 				BULLE_KILL = 0;
	public static int 				BULLE_ECLATE = 0;
	public final static char 		BULLE = 'o';
	
	public Bulle()
	{
		
	}
	
	public Bulle(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public void initBulle()
	{
		this.x = uniformSpawn((double) COL_DEBUT, (double) 0);
		this.y = uniformSpawn((double) (double) 0, LIN_DEBUT);
	}
	
	public int uniformSpawn(double x, double y)
	{
		int i = 0;
		MersenneTwisterFast random = new MersenneTwisterFast();
		random.getMT();
		i = (int) (0 +((x-0)*(random.nextDouble())));
		return i;
	}
	
	public void moveBulle()
	{
		for(int i = 0 ; i < NB_ETAPE ; i++)
		{
			this.y++;
			this.x = this.x + uniformSpawn((double) -1, (double) 1);
		}
	}
	
	public void finMove()
	{
		this.x = Math.round(this.x);
		if(this.x > TABLEAU - COL_DEBUT)
		{
			this.x = TABLEAU - COL_DEBUT;
		}
		if(this.x < COL_DEBUT)
		{
			this.x = COL_DEBUT;
		}
		this.y = Math.round(this.y);
		if(this.y > TABLEAU)
		{
			BULLE_SAUVE++;
		}
	}
	
	
	
}
