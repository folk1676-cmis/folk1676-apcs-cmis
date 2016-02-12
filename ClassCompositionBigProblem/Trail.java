import java.util.ArrayList;
public class Trail
{
    ArrayList<Integer> markers = new ArrayList<Integer>();
    int sum = 0;
    int sumtwo = 0;
    int sumthree = 0;

    public Trail()
    {
        markers.add( 100 );
        markers.add( 150 );
        markers.add( 105 );
        markers.add( 120 );
        markers.add( 90 );
        markers.add( 80 );
        markers.add( 50 );
        markers.add( 75 );
        markers.add( 75 );
        markers.add( 70 );
        markers.add( 80 );
        markers.add( 90 );
        markers.add( 100 );
    }

    public Trail(ArrayList<Integer> markers )
    {
        this.markers = markers;
    } 

    public void addMarker(int marker)
    {
        markers.add( marker );
    }

    public int getLength()
    {
        for( int i = 0; i < markers.size(); i++ )
        {
            sum += markers.get( i );
        }
        return sum;
    }

    public boolean isLevelTrailSegment( int begin, int end )
    { 
        boolean level = true;
        for( int i = 0; i < markers.size(); i++ )
        {
            if( i != 0 )
            {
                if( sumtwo == markers.get( i ) - markers.get( i-1 ))
                {
                    level = false;
                }
            }
        }
        if( begin != end || level == false )
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    public boolean isDifficult( int begin, int end )
    {
        for( int i = 0; begin < end; i++ )
        {
            if( i != 0 )
            {
                if( markers.get( i ) - markers.get( i-1 ) > 0 )
                {
                    sumthree += markers.get( i ) - markers.get( i-1 );
                }
            }
        }
        if( isLevelTrailSegment( begin, end ))
        {
            if( sumthree > 100 )
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }

    public String toString ( )
    {
        String output = "Index\tElevation\n";
        int x = 0;
        for ( Integer y : markers )
        {
            x++;
            output += x+"\t"+"x"+"\n";
        }
        output += "Total Distance: " + getLength();
        output += isLevelTrailSegment( 0, markers.size()-1 );
        output += isDifficult( 0, markers.size()-1 );
        output += sumthree;        
        return output;
    }
}