
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
        
import org.allbinary.graphics.form.item.TextFieldItem
import org.allbinary.logic.control.validate.ValidatorBase
import org.allbinary.logic.java.bool.BooleanFactory
import org.allbinary.logic.string.StringMaker
import org.allbinary.util.BasicArrayList

open public class TextFieldItemValidator : ValidatorBase {
        

    private val textFieldItem: TextFieldItem

    private var min: Int

    private var max: Int

    private var allowOnEmpty: Boolean
public constructor        (textFieldItem: TextFieldItem, min: Int, max: Int, allowOnEmpty: Boolean){

                    var textFieldItem = textFieldItem


                    var min = min


                    var max = max


                    var allowOnEmpty = allowOnEmpty
this.textFieldItem= textFieldItem
this.min= min
this.max= max
this.allowOnEmpty= allowOnEmpty
}

override fun isValid()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
    var booleanFactory: BooleanFactory = BooleanFactory.getInstance()!!
            


    var result: Boolean = booleanFactory!!.TRUE


    var string: String = this.textFieldItem!!.getString()!!
            


    var textLength: Int = string.length!!
            


    
                        if((textLength == 0 && this.allowOnEmpty) || textLength > this.min && textLength < this.max)
                        
                                    {
                                    
                                    }
                                
                        else {
                            
    
                        if(textLength < this.min)
                        
                                    {
                                    result= booleanFactory!!.FALSE

                                    }
                                
                             else 
    
                        if(textLength > this.max)
                        
                                    {
                                    result= booleanFactory!!.FALSE

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
            


    
                        if(textLength > this.min && textLength < this.max)
                        
                                    {
                                    
                                    }
                                
                        else {
                            
    var label: String = this.textFieldItem!!.getLabel()!!
            


    var name: String = label.substring(0, label.length -2)!!
            


    
                        if(textLength < this.min)
                        
                                    {
                                    list.add(StringMaker().
                            append(name)!!.append(
                            " is to short")!!.toString())

                                    }
                                
                             else 
    
                        if(textLength > this.max)
                        
                                    {
                                    list.add(StringMaker().
                            append(name)!!.append(
                            " is to long")!!.toString())

                                    }
                                

                        }
                            



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return list
}


}
                
            

