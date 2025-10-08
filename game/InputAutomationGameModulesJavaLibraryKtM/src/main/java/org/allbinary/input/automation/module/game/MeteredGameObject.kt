
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
        package org.allbinary.input.automation.module.game




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.awt.image.BufferedImage
import org.allbinary.logic.string.StringMaker
import org.allbinary.string.CommonSeps

open public class MeteredGameObject
            : Object
        
                , MeteredGameObjectInterface {
        

    private var ratios: Array<Double?>

    private var good: Boolean = false

    private var dropping: Boolean = false

    private var minX: Integer

    private var maxX: Integer

    private var y: Integer

    private var size: Integer

    private val RATIOS_LABEL: String = "Ratios: "

    private val IS_GOOD_LABEL: String = "isGood: "

    private val IS_DROPPPING_LABEL: String = "isDropping: "
public constructor (bufferedImage: Array<BufferedImage?>, minX: Object, maxX: Object, y: Object)
            : super()
        {
var bufferedImage = bufferedImage
var minX = minX
var maxX = maxX
var y = y
this.setRatios(arrayOfNulls(bufferedImage!!.size))
this.setMinX(minX)
this.setMaxX(maxX)
this.setY(y)
this.setSize(maxX -minX)




                        for (index in 0 until bufferedImage!!.size)

        {

    var nominator: Double = GraphicsAnalysisUtil.getNominator(bufferedImage[index]!!, this.getMinX(), this.getMaxX(), this.getY())!!

this.getRatios()[index]= Double(nominator /this.getSize())
}


    
                        if(this.getRatios()[bufferedImage!!.size -1]!!.doubleValue() > 0.93F)
                        
                                    {
                                    this.setGood(true)

                                    }
                                
                        else {
                            this.setGood(false)

                        }
                            

    
                        if(this.getRatios()[bufferedImage!!.size -1]!!.doubleValue() < this.getRatios()[0]!!.doubleValue())
                        
                                    {
                                    this.setDropping(true)

                                    }
                                
                        else {
                            this.setDropping(false)

                        }
                            
}


    open fun isGood()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return good
}


    open fun setGood(good: Boolean)
        //nullable = true from not(false or (false and false)) = true
{
var good = good
this.good= good
}


    open fun isDropping()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return dropping
}


    open fun setDropping(dropping: Boolean)
        //nullable = true from not(false or (false and false)) = true
{
var dropping = dropping
this.dropping= dropping
}


    open fun getRatios()
        //nullable = true from not(false or (false and true)) = true
: Array<Double?>{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.ratios
}


    override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(CommonSeps.getInstance()!!.NEW_LINE)
stringBuffer!!.append(RATIOS_LABEL)




                        for (index in 0 until this.getRatios()!!.length)

        {
stringBuffer!!.append(this.getRatios()[index]!!.toString())

    
                        if(index < this.getRatios()!!.length -1)
                        
                                    {
                                    stringBuffer!!.append(CommonSeps.getInstance()!!.COMMA_SEP)

                                    }
                                
}

stringBuffer!!.append(CommonSeps.getInstance()!!.NEW_LINE)
stringBuffer!!.append(IS_GOOD_LABEL)
stringBuffer!!.append(this.isGood())
stringBuffer!!.append(CommonSeps.getInstance()!!.NEW_LINE)
stringBuffer!!.append(IS_DROPPPING_LABEL)
stringBuffer!!.append(this.isDropping())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


    open fun setRatios(ratios: Array<Double?>)
        //nullable = true from not(false or (false and false)) = true
{
var ratios = ratios
this.ratios= ratios
}


    open fun getMinX()
        //nullable = true from not(false or (false and true)) = true
: Integer{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return minX
}


    open fun setMinX(minX: Integer)
        //nullable = true from not(false or (false and false)) = true
{
var minX = minX
this.minX= minX
}


    open fun getMaxX()
        //nullable = true from not(false or (false and true)) = true
: Integer{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return maxX
}


    open fun setMaxX(maxX: Integer)
        //nullable = true from not(false or (false and false)) = true
{
var maxX = maxX
this.maxX= maxX
}


    open fun getY()
        //nullable = true from not(false or (false and true)) = true
: Integer{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return y
}


    open fun setY(y: Integer)
        //nullable = true from not(false or (false and false)) = true
{
var y = y
this.y= y
}


    open fun getSize()
        //nullable = true from not(false or (false and true)) = true
: Integer{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return size
}


    open fun setSize(size: Integer)
        //nullable = true from not(false or (false and false)) = true
{
var size = size
this.size= size
}


}
                
            

