
        /*
                * 
                *  AllBinary Open License Version 1
                *  Copyright (c) 2011 AllBinary
                *  
                *  By agreeing to this license you and any business entity you represent are
                *  legally bound to the AllBinary Open License Version 1 legal agreement.
                *  
                *  You may obtain the AllBinary Open License Version 1 legal agreement from
                *  AllBinary or the root directory of AllBinary's AllBinary Platform repository.
                *  
                *  Created By: Travis Berthelot  
        */
        
        /* Generated Code Do Not Modify */
        package org.allbinary.media.image.analysis




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.string.StringMaker

open public class ColorAverage
            : Object
         {
        

    private var avgRed: Float= 0.0f

    private var avgGreen: Float= 0.0f

    private var avgBlue: Float= 0.0f
public constructor ()
            : super()
        {
this.setAvgRed(0)
this.setAvgGreen(0)
this.setAvgBlue(0)
}


    override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("getAvgRed(): ")
stringBuffer!!.append(this.getAvgRed())
stringBuffer!!.append("\n")
stringBuffer!!.append("getAvgRed(): ")
stringBuffer!!.append(this.getAvgRed())
stringBuffer!!.append("\n")
stringBuffer!!.append("getAvgGreen(): ")
stringBuffer!!.append(this.getAvgGreen())
stringBuffer!!.append("\n")



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


    open fun getAvgRed()
        //nullable = true from not(false or (false and true)) = true
: Float{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return avgRed
}


    open fun setAvgRed(avgRed: Float)
        //nullable = true from not(false or (false and false)) = true
{
var avgRed = avgRed
this.avgRed= avgRed
}


    open fun getAvgGreen()
        //nullable = true from not(false or (false and true)) = true
: Float{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return avgGreen
}


    open fun setAvgGreen(avgGreen: Float)
        //nullable = true from not(false or (false and false)) = true
{
var avgGreen = avgGreen
this.avgGreen= avgGreen
}


    open fun getAvgBlue()
        //nullable = true from not(false or (false and true)) = true
: Float{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return avgBlue
}


    open fun setAvgBlue(avgBlue: Float)
        //nullable = true from not(false or (false and false)) = true
{
var avgBlue = avgBlue
this.avgBlue= avgBlue
}


}
                
            

