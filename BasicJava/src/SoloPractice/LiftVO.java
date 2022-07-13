package SoloPractice;

public class LiftVO {

     private int liCost;


    public LiftVO(int liCost) {
		this.liCost = liCost;
	}

    public LiftVO() {
		
	}
	
    public int getLiCost() {
		return liCost;
	}

	public void setLiCost(int liCost) {
		this.liCost = liCost;
	}

	@Override
    public String toString() {
	    return String.format("%s\t \n", liCost);
    }
}

