package alinux78;

public class Duplicated 
{

public Position WalkNorth()
{
   var player = GetPlayer();
   player.Move("N");
   return player.NewPosition;
}

public Position WalkSouth()
{
   var player = GetPlayer();
   player.Move("S");
   return player.NewPosition;
}

public Position WalkEast()
{
   var player = GetPlayer();
   player.Move("E");
   return player.NewPosition;
}

 public Position WalkWest()
{
   var player = GetPlayer();
   player.Move("W");
   return player.NewPosition;
}

Player GetPlayer() {
	return new Player();
}

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}

class Position {
}

class Player {
	Position NewPosition;
	void Move(String d) {}
}




