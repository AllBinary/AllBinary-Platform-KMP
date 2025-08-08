
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
        package org.allbinary.graphics.form.item.validation



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Vector
import org.allbinary.graphics.form.item.TextFieldItem
import org.allbinary.logic.control.validate.ValidatorBase
import org.allbinary.logic.java.bool.BooleanFactory
import org.allbinary.logic.math.SmallIntegerSingletonFactory
import org.allbinary.logic.string.StringMaker
import org.allbinary.util.BasicArrayList

open public class NumberTextFieldItemValidator : ValidatorBase {
        

    private val textFieldItem: TextFieldItem

    private val min: Int

    private val max: Int

    private val maxChars: Int
public constructor        (textFieldItem: TextFieldItem, maxChars: Int, min: Int, max: Int){

                    var textFieldItem = textFieldItem


                    var maxChars = maxChars


                    var min = min


                    var max = max
this.textFieldItem= textFieldItem
this.min= min
this.max= max
this.maxChars= maxChars
}


open fun isNumberValid(value: Integer)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var value = value



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return BooleanFactory.getInstance()!!.TRUE
}


open fun toNumberVector(value: Integer)
        //nullable = true from not(false or (false and false)) = true
: Vector<Any>{

                    var value = value



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Vector<Any>()
}

override fun isValid()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
    var result: Boolean = BooleanFactory.getInstance()!!.TRUE


    var string: String = this.textFieldItem!!.getString()!!
            


    var textLength: Int = string.length!!
            


    
                        if(textLength > 0 && textLength < maxChars)
                        
                                    {
                                    
        try {
            Integer.parseInt(this.textFieldItem!!.getString())
} catch(e: NumberFormatException)
            {result= BooleanFactory.getInstance()!!.FALSE
}


                                    }
                                
                        else {
                            
    
                        if(textLength < 1)
                        
                                    {
                                    result= BooleanFactory.getInstance()!!.FALSE

                                    }
                                
                             else 
    
                        if(textLength > maxChars)
                        
                                    {
                                    result= BooleanFactory.getInstance()!!.FALSE

                                    }
                                

                        }
                            



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return result
}

override fun toList()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{
    var list: BasicArrayList = BasicArrayList()


    var string: String = this.textFieldItem!!.getString()!!
            


    var textLength: Int = string.length!!
            


    var name: String = this.textFieldItem!!.getLabel()!!.substring(0, this.textFieldItem!!.getLabel()!!.length -2)!!
            


    var smallIntegerSingletonFactory: SmallIntegerSingletonFactory = SmallIntegerSingletonFactory.getInstance()!!
            


    var stringMaker: StringMaker = StringMaker()


    
                        if(textLength > 0 && textLength < maxChars)
                        
                                    {
                                    
        try {
            
    var number: Integer = smallIntegerSingletonFactory!!.createInstance(Integer.parseInt(this.textFieldItem!!.getString()))!!
            


    
                        if(number.toInt() > min)
                        
                                    {
                                    stringMaker!!.delete(0, stringMaker!!.length())
list.add(stringMaker!!.append(name)!!.append(
                            " is to small")!!.toString())

                                    }
                                
                             else 
    
                        if(number.toInt() > max)
                        
                                    {
                                    stringMaker!!.delete(0, stringMaker!!.length())
list.add(stringMaker!!.append(name)!!.append(
                            " is to large")!!.toString())

                                    }
                                
} catch(e: NumberFormatException)
            {stringMaker!!.delete(0, stringMaker!!.length())
list.add(stringMaker!!.append(name)!!.append(
                            " is not a number")!!.toString())
}


                                    }
                                
                        else {
                            
    
                        if(textLength < 1)
                        
                                    {
                                    stringMaker!!.delete(0, stringMaker!!.length())
list.add(stringMaker!!.append(name)!!.append(
                            " is to short")!!.toString())

                                    }
                                
                             else 
    
                        if(textLength > maxChars)
                        
                                    {
                                    stringMaker!!.delete(0, stringMaker!!.length())
list.add(stringMaker!!.append(name)!!.append(
                            " is to long")!!.toString())

                                    }
                                

                        }
                            



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return list
}


}
                
            

