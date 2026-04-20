
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
        package org.allbinary.graphics.color




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.string.StringMaker

open public class BasicColor
            : Object
         {
        

    private val name: String

    private val value: Int

    private val redComponent: Float

    private val greenComponent: Float

    private val blueComponent: Float

    private val alphaComponent: Float

    val red: Short

    val green: Short

    val blue: Short

    val alpha: Short
 constructor (alphaValue: Int, value: Int, name: String)
            : super()
        {
    //var alphaValue = alphaValue
    //var value = value
    //var name = name
this.name= name

    var tempValue: Int= 0


    var basicColorUtil: BasicColorUtil = BasicColorUtil.getInstance()!!


    
                        if(basicColorUtil!!.isAlpha)
                        
                                    {
                                    
    
                        if(basicColorUtil!!.ffOpaque)
                        
                                    {
                                    tempValue= alphaValue or value

                                    }
                                
                        else {
                            tempValue= 0x00000000 or value

                        }
                            

                                    }
                                
                        else {
                            tempValue= value

                        }
                            

    var alphaInt: Int = ((tempValue shr 24) and 255)

this.alpha= alphaInt.toShort()
this.alphaComponent= (alphaInt.toFloat()) /255

    var redInt: Int = ((tempValue shr 16) and 255)

this.red= redInt.toShort()
this.redComponent= (redInt.toFloat()) /255

    var greenInt: Int = ((tempValue shr 8) and 255)

this.green= greenInt.toShort()
this.greenComponent= (greenInt.toFloat()) /255

    var blueInt: Int = ((tempValue) and 255)

this.blue= blueInt.toShort()
this.blueComponent= (blueInt.toFloat()) /255
this.value= tempValue
}


    open fun intValue()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.value
}


    open fun toInt()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.value
}


    override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("BasicColor: ")
stringBuffer!!.append("Alpha: ")
stringBuffer!!.appendshort(this.alpha)
stringBuffer!!.append(" Red: ")
stringBuffer!!.appendshort(this.red)
stringBuffer!!.append(" Green: ")
stringBuffer!!.appendshort(this.green)
stringBuffer!!.append(" Blue: ")
stringBuffer!!.appendshort(this.blue)
stringBuffer!!.append(" Value: ")
stringBuffer!!.appendint(this.value)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


    open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.name
}


    open fun getRedComponent()
        //nullable = true from not(false or (false and true)) = true
: Float{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.redComponent
}


    open fun getGreenComponent()
        //nullable = true from not(false or (false and true)) = true
: Float{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.greenComponent
}


    open fun getBlueComponent()
        //nullable = true from not(false or (false and true)) = true
: Float{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.blueComponent
}


    open fun getAlphaComponent()
        //nullable = true from not(false or (false and true)) = true
: Float{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.alphaComponent
}


}
                
            

