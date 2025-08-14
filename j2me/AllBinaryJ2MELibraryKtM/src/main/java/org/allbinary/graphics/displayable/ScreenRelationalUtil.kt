
        /* Generated Code Do Not Modify */
        package org.allbinary.graphics.displayable




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Image

open public class ScreenRelationalUtil
            : Object
         {
        

        companion object {
            
    private val instance: ScreenRelationalUtil = ScreenRelationalUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: ScreenRelationalUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
open fun getScale(image: Image)
        //nullable = true from not(false or (false and false)) = true
: Float{

                    var image = image



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getScale(image.getWidth(), image.getHeight())
}


open fun getScale(aWidth: Int, aHeight: Int)
        //nullable = true from not(false or (false and false)) = true
: Float{

                    var aWidth = aWidth


                    var aHeight = aHeight



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getScale(aWidth, aHeight, 20)
}


open fun getScale(aWidth: Int, aHeight: Int, add: Int)
        //nullable = true from not(false or (false and false)) = true
: Float{

                    var aWidth = aWidth


                    var aHeight = aHeight


                    var add = add

    var displayInfoSingleton: DisplayInfoSingleton = DisplayInfoSingleton.getInstance()!!
            


    var last: IntArray = displayInfoSingleton!!.getLast()!!
            


    var width: Float = last[displayInfoSingleton!!.WIDTH]!!.toFloat()


    var height: Float = last[displayInfoSingleton!!.HEIGHT]!!.toFloat()


    var largestSize: Float = width


    
                        if(largestSize < height)
                        
                                    {
                                    largestSize= height

                                    }
                                

    var scale: Float = (largestSize) /aWidth




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return scale
}


open fun getScaledHeight(aWidth: Int, aHeight: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{

                    var aWidth = aWidth


                    var aHeight = aHeight



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return (this.getScale(aWidth, aHeight) *aHeight).toInt()
}


open fun getScaledHeight(aWidth: Int, aHeight: Int, add: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{

                    var aWidth = aWidth


                    var aHeight = aHeight


                    var add = add



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return (this.getScale(aWidth, aHeight, add) *aHeight).toInt()
}


}
                
            

