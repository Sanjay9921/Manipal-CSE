package l7q7;

public class ByTwos implements Series{
    
    private int start;
    
    public ByTwos(){
        this.start=0;
    }

    @Override
    public void setStart(int start){
        this.start = start;
    }
    
    @Override
    public int getNext(){
        this.start+=2;
        return this.start;
    }

    @Override
    public void reset(){
        this.start=0;
    }
}
