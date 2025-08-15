
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
        
import java.awt
import org.allbinary.logic.string.StringMaker

open public class ColorRange
            : Object
        
                , ColorRangeInterface {
        

    private var minRed: Int

    private var maxRed: Int

    private var minGreen: Int

    private var maxGreen: Int

    private var minBlue: Int

    private var maxBlue: Int
public constructor        ()
            : super()
        {this.minRed= 0
this.maxRed= 0
this.minGreen= 0
this.maxGreen= 0
this.minBlue= 0
this.maxBlue= 0
}


open fun getMinRed()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return minRed
}


open fun setMinRed(minRed: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var minRed = minRed
this.minRed= minRed
}


open fun getMaxRed()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return maxRed
}


open fun setMaxRed(maxRed: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var maxRed = maxRed
this.maxRed= maxRed
}


open fun getMinGreen()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return minGreen
}


open fun setMinGreen(minGreen: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var minGreen = minGreen
this.minGreen= minGreen
}


open fun getMaxGreen()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return maxGreen
}


open fun setMaxGreen(maxGreen: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var maxGreen = maxGreen
this.maxGreen= maxGreen
}


open fun getMinBlue()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return minBlue
}


open fun setMinBlue(minBlue: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var minBlue = minBlue
this.minBlue= minBlue
}


open fun getMaxBlue()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return maxBlue
}


open fun setMaxBlue(maxBlue: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var maxBlue = maxBlue
this.maxBlue= maxBlue
}


open fun isInRange(color: Color)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var color = color

    
                        if(color.getRed() >= this.getMinRed() && color.getRed() <= this.getMaxRed() && color.getGreen() >= this.getMinGreen() && color.getGreen() <= this.getMaxGreen() && color.getBlue() >= this.getMinBlue() && color.getBlue() <= this.getMaxBlue())
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                        }
                            
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("getMinRed(): ")
stringBuffer!!.append(this.getMinRed())
stringBuffer!!.append("\n")
stringBuffer!!.append("getMaxRed(): ")
stringBuffer!!.append(this.getMaxRed())
stringBuffer!!.append("\n")
stringBuffer!!.append("getMinGreen(): ")
stringBuffer!!.append(this.getMinGreen())
stringBuffer!!.append("\n")
stringBuffer!!.append("getMaxGreen(): ")
stringBuffer!!.append(this.getMaxGreen())
stringBuffer!!.append("\n")
stringBuffer!!.append("getMinBlue(): ")
stringBuffer!!.append(this.getMinGreen())
stringBuffer!!.append("\n")
stringBuffer!!.append("getMaxBlue(): ")
stringBuffer!!.append(this.getMaxBlue())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


}
                
            

