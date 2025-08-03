
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
        package org.allbinary.business.user.commerce.money



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.io.path.AbPathData
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.string.StringValidationUtil
import org.allbinary.string.CommonPhoneStrings

open public class Money
            : Object
         {
        

    private var units: Long

    private val DEFAULT_CURRENCY: String = "USD"
public constructor        (money: Money)
            : super()
        {

                    var money = money
this.units= money!!.getUnits() as Long
}

public constructor        ()
            : super()
        {this.units= 0 as Long
}

public constructor        (usDollarStr: String)
            : super()
        {

                    var usDollarStr = usDollarStr

    
                        if(usDollarStr != 
                                    null
                                 && StringValidationUtil.getInstance()!!.isNumber(usDollarStr))
                        
                                    {
                                    this.units= convertUsdToUnits(usDollarStr) as Long

                                    }
                                
}

public constructor        (units: Long)
            : super()
        {

                    var units = units
this.units= units as Long
}


open fun isValid()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
    
                        if(this.units != 
                                    null
                                 && this.units!!.longValue() > 0 && this.units!!.longValue() < Long.MAX_VALUE)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                        }
                            
}


open fun add(moreMoney: Money)
        //nullable = true from not(false or (false and false)) = true
{

                    var moreMoney = moreMoney
this.add(moreMoney!!.toString())
}


open fun add(usDollarStr: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var usDollarStr = usDollarStr
this.units= this.units!!.longValue() +convertUsdToUnits(usDollarStr) as Long
}


open fun subtract(usDollarStr: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var usDollarStr = usDollarStr
this.units= this.units!!.longValue() -convertUsdToUnits(usDollarStr) as Long
}


open fun multiply(multiplier: Float)
        //nullable = true from not(false or (false and false)) = true
{

                    var multiplier = multiplier
this.units= Float(this.units!!.longValue() *multiplier!!.floatValue()).
                            longValue() as Long
}


open fun multiply(multiplier: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var multiplier = multiplier
this.units= this.units!!.longValue() *multiplier as Long
}


open fun convertUnitsTo(currency: String)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var currency = currency

    var stringBuffer: StringMaker = StringMaker()


    
                        if(currency!!.compareTo(DEFAULT_CURRENCY) == 0)
                        
                                    {
                                    
    var dollar: Long = units!!.longValue() /100


    var cents: Long = units!!.longValue() -(dollar *100)

stringBuffer!!.append(Long(dollar).
                            toString())
stringBuffer!!.append(AbPathData.getInstance()!!.EXTENSION_SEP)

    
                        if(cents < 10)
                        
                                    {
                                    stringBuffer!!.append(CommonPhoneStrings.getInstance()!!.ZERO)

                                    }
                                
stringBuffer!!.append(Long(cents).
                            toString())

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


open fun convertUsdToUnits(usDollarStr: String)
        //nullable = true from not(false or (false and false)) = true
: Long{

                    var usDollarStr = usDollarStr

    var localUnit: Long = 0


    var index: Int = usDollarStr!!.indexOf(AbPathData.getInstance()!!.EXTENSION_SEP)!!
            


    var stringUtil: StringUtil = StringUtil.getInstance()!!
            


    var dollarStr: String = stringUtil!!.EMPTY_STRING


    var centsStr: String = stringUtil!!.EMPTY_STRING


    
                        if(index < 1)
                        
                                    {
                                    dollarStr= usDollarStr.toCharArray().concatToString()
centsStr= 
                                    //Otherwise - expression - AssignExpr - value - StringLiteralExpr


                                    }
                                
                        else {
                            dollarStr= substring.toCharArray().concatToString()
centsStr= substring.toCharArray().concatToString()

                        }
                            
localUnit= Long(Long(dollarStr).
                            longValue() *100).
                            longValue()
localUnit += Long(centsStr).
                            longValue()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return localUnit
}


open fun getUnits()
        //nullable = true from not(false or (false and true)) = true
: Long{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return units!!.longValue()
}


open fun getUnitsLong()
        //nullable = true from not(false or (false and true)) = true
: Long{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return units
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return convertUnitsTo.toCharArray().concatToString()
}


}
                
            

