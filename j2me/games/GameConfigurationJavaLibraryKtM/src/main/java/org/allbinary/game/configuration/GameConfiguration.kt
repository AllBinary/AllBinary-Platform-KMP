
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
        package org.allbinary.game.configuration




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.configuration.event.GameFeatureEvent
import org.allbinary.game.configuration.event.GameFeatureEventHandler
import org.allbinary.logic.java.bool.BooleanFactory
import org.allbinary.logic.math.SmallIntegerSingletonFactory
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil

open public class GameConfiguration
            : Object
         {
        

    private var name: String = StringUtil.getInstance()!!.EMPTY_STRING

    private var defaultValue: Integer = SmallIntegerSingletonFactory.getInstance()!!.getInstance(0)!!

    private var value: Integer

    private var minValue: Integer = defaultValue

    private var maxValue: Integer = defaultValue

    private var modifiable: Boolean = BooleanFactory.getInstance()!!.TRUE
public constructor        (name: String, defaultValue: Integer, minValue: Integer, maxValue: Integer)
            : super()
        {

                    var name = name


                    var defaultValue = defaultValue


                    var minValue = minValue


                    var maxValue = maxValue
this.setName(name)
this.setDefaultValue(defaultValue)
this.value= this.getDefaultValue()
this.setMinValue(minValue)
this.setMaxValue(maxValue)
GameConfigurationSingleton.getInstance()!!.getHashtable()!!.put(this.getName(), this)
}


                @Throws(Exception::class)
            
open fun setValue(value: Integer)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value

    
                        if(this.value != value)
                        
                                    {
                                    
    var oldValue: Integer = this.value

this.value= value
GameFeatureEventHandler.getInstance()!!.fireEvent(GameFeatureEvent(this, StringMaker().
                            append(this.name)!!.append(" value: from: ")!!.append(oldValue!!.toInt())!!.append(" to ")!!.append(this.value.toInt())!!.toString()))

                                    }
                                
}


open fun getValue()
        //nullable = true from not(false or (false and true)) = true
: Integer{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return value
}


open fun setMaxValue(maxValue: Integer)
        //nullable = true from not(false or (false and false)) = true
{

                    var maxValue = maxValue
this.maxValue= maxValue
}


open fun getMaxValue()
        //nullable = true from not(false or (false and true)) = true
: Integer{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return maxValue
}


open fun setMinValue(minValue: Integer)
        //nullable = true from not(false or (false and false)) = true
{

                    var minValue = minValue
this.minValue= minValue
}


open fun getMinValue()
        //nullable = true from not(false or (false and true)) = true
: Integer{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return minValue
}


open fun setName(name: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var name = name
this.name= name
}


open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return name
}


open fun setDefaultValue(defaultValue: Integer)
        //nullable = true from not(false or (false and false)) = true
{

                    var defaultValue = defaultValue
this.defaultValue= defaultValue
}


open fun getDefaultValue()
        //nullable = true from not(false or (false and true)) = true
: Integer{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return defaultValue
}


                @Throws(Exception::class)
            
open fun setDefault()
        //nullable = true from not(false or (false and true)) = true
{this.setValue(this.getDefaultValue())
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("Name: ")
stringBuffer!!.append(this.name)
stringBuffer!!.append(" Min: ")
stringBuffer!!.append(this.getMinValue()!!.toInt())
stringBuffer!!.append(" Max: ")
stringBuffer!!.append(this.getMaxValue()!!.toInt())
stringBuffer!!.append(" Value: ")
stringBuffer!!.append(this.getValue()!!.toInt())
stringBuffer!!.append(" Default: ")
stringBuffer!!.append(this.getDefaultValue()!!.toInt())
stringBuffer!!.append(" Modifiable: ")
stringBuffer!!.append(this.isModifiable())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


open fun setModifiable(modifiable: Boolean)
        //nullable = true from not(false or (false and false)) = true
{

                    var modifiable = modifiable
this.modifiable= modifiable
}


open fun isModifiable()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return modifiable
}


}
                
            

