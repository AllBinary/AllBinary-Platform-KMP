
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
import org.allbinary.logic.string.StringUtil

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

    private val basicColorUtil: BasicColorUtil = BasicColorUtil.getInstance()!!
public constructor        (value: Int)                        

                            : this(value, StringUtil.getInstance()!!.EMPTY_STRING){

                    var value = value


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (alphaValue: Int, value: Int)                        

                            : this(alphaValue, value, StringUtil.getInstance()!!.EMPTY_STRING){

                    var alphaValue = alphaValue


                    var value = value


                            //For kotlin this is before the body of the constructor.
                    
}

 constructor        (value: Int, name: String)                        

                            : this(BasicColorUtil.getInstance()!!.ALPHA, value, name){

                    var value = value


                    var name = name


                            //For kotlin this is before the body of the constructor.
                    
}

 constructor        (alphaValue: Int, value: Int, name: String)
            : super()
        {

                    var alphaValue = alphaValue


                    var value = value


                    var name = name
this.name= name

    var tempValue: Int= 0


    
                        if(this.basicColorUtil!!.isAlpha)
                        
                                    {
                                    
    
                        if(this.basicColorUtil!!.ffOpaque)
                        
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

public constructor        (alphaValue: Int, r: Int, g: Int, b: Int, name: String)
            : super()
        {

                    var alphaValue = alphaValue


                    var r = r


                    var g = g


                    var b = b


                    var name = name
this.name= name
this.alpha= alphaValue.toShort()
this.alphaComponent= (alphaValue.toFloat()) /255

    var redInt: Int = r

this.red= redInt.toShort()
this.redComponent= (redInt.toFloat()) /255

    var greenInt: Int = g

this.green= greenInt.toShort()
this.greenComponent= (greenInt.toFloat()) /255

    var blueInt: Int = b

this.blue= blueInt.toShort()
this.blueComponent= (blueInt.toFloat()) /255

    var ALPHA_MASK: Int = 0xFF000000.toInt()

this.value= ((alphaValue shl 24) and ALPHA_MASK) +((redInt shl 16) and 0x00FF0000) +((greenInt shl 8) and 0x0000FF00) +(blueInt and 0x000000FF)
}


open fun intValue()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return value
}


open fun toInt()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return value
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("BasicColor: ")
stringBuffer!!.append("Alpha: ")
stringBuffer!!.append(this.alpha)
stringBuffer!!.append(" Red: ")
stringBuffer!!.append(this.red)
stringBuffer!!.append(" Green: ")
stringBuffer!!.append(this.green)
stringBuffer!!.append(" Blue: ")
stringBuffer!!.append(this.blue)
stringBuffer!!.append(" Value: ")
stringBuffer!!.append(this.value)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return name
}


open fun getRedComponent()
        //nullable = true from not(false or (false and true)) = true
: Float{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return redComponent
}


open fun getGreenComponent()
        //nullable = true from not(false or (false and true)) = true
: Float{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return greenComponent
}


open fun getBlueComponent()
        //nullable = true from not(false or (false and true)) = true
: Float{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return blueComponent
}


open fun getAlphaComponent()
        //nullable = true from not(false or (false and true)) = true
: Float{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return alphaComponent
}


}
                
            

