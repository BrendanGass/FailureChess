public class Logic {

    private int points;

  public int getPoints() {
    return points;
  }


  
    public int rollTheDice() {
      return (int) (Math.random() * 6 +1);
    }
}