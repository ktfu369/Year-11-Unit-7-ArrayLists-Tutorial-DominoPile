public class Domino {
    private int top;
    private int bottom;
    public Domino(){
        top = 0;
        bottom = 0;
    }
    public Domino(int a, int b){
        top = a;
        bottom = b;
    }
    public int getTop(){
        return top;
    }
    public int getBottom(){
        return bottom;
    }
    public void setTop(int t){
        top = t;
    }
    public void setBottom(int t){
         bottom = t;
    }
    public String toString(){
        return top + "/" + bottom;
    }
    public void flip(){
        int temp = top;
        top = bottom;
        bottom = temp;
    }
    public void settle(){
        if(bottom < top) flip();
    }
    public int compareTo(Domino other){
        int s1 = Math.min(top,bottom);
        int s2 = Math.min(other.top,other.bottom);
        if(s1<s2){
            return -1;
        }else if(s1>s2){
            return 1;
        }
        s1 = Math.max(top,bottom);
        s2 = Math.max(other.top,other.bottom);
        if(s1<s2){
            return -1;
        }else if(s1>s2){
            return 1;
        }
        return 0;
    }
    public int compareToWeight(Domino other){
        int sum1 = top + bottom;
        int sum2 = other.top + other.bottom;
        if(sum1<sum2){
            return -1;
        }
        if(sum1>sum2){
            return 1;
        }
        return 0;
    }
    public boolean canConnect(Domino other){
        return top == other.top || top == other.bottom || bottom == other.top || bottom == other.bottom;
    }
}
