package net.anglewyrm.pixies;

import java.util.Random;
import java.lang.StrictMath;

public class RNG extends Random {
	
	public static RNG rng;
	RNG(){
		rng = new RNG();
	}
	
	public float nextRadian(){
		return nextFloat()*2.0f * (float)StrictMath.PI;
	}

	public static int getLootCategory(){
		return getLootCategory(4);
	}
	public static int getLootCategory(int numCategories){
		return (int) StrictMath.round(
				     StrictMath.sqrt(2.0) *
				     StrictMath.sqrt( -1 * StrictMath.log(rng.nextFloat()) )
				); // round
	} // getLootCategory

} // RNG class
