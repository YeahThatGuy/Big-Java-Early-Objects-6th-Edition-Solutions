package worked_example_1;

/**
   This class describes pyramids with a square base.
*/
public class Pyramid
{
   private double height;
   private double baseLength;

   /**
      Constructs a pyramid with a given height and baselength.
      @param height the height
      @param baseLength the length of one of the sides of the square base
   */
   public Pyramid(double height, double baseLength)
   {
      this.height = height;
      this.baseLength = baseLength;
   }

   /**
      Gets the volume of this pyramid.
      @return the volume
   */
   public double getVolume()
   {
      return height * baseLength * baseLength / 3;
   }

   /**
      Gets the surface area of this pyramid.
      @return the surface area, not including the base
   */
   public double getSurfaceArea()
   {
      double sideLength = Math.sqrt(height * height 
         + baseLength * baseLength / 4);
      //YeahThatGuy's notes: there was a typo before, as "(baseLength * baseLength) + ..." has been missed by the author
      return (baseLength * baseLength) + 2 * baseLength * sideLength;
   }
}
