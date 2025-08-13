
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
        package org.allbinary.logic.string



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class StringValidationUtil
            : Object
         {
        

        companion object {
            
    private val instance: StringValidationUtil = StringValidationUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: StringValidationUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    private val stringUtil: StringUtil = StringUtil.getInstance()!!
            
private constructor        ()
            : super()
        {}


open fun containsSpaces(value: String)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var value = value

    
                        if(value.indexOf(
                            ' ') >= 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


open fun isNumber(value: String)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var value = value

    var numberOfDecimalPoints: Int = 0





                        for (index in 0 until value.length!!)


        {
    var digit: Char = value[index]!!
            


    
                        if(!isNumber(digit) && digit != '.')
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                                    }
                                

    
                        if(digit == '.')
                        
                                    {
                                    numberOfDecimalPoints++

    
                        if(numberOfDecimalPoints > 1)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                                    }
                                

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}


open fun isNumber(digit: Char)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var digit = digit

    
                        if(digit != '0' && digit != '1' && digit != '2' && digit != '3' && digit != '4' && digit != '5' && digit != '6' && digit != '7' && digit != '8' && digit != '9')
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}


open fun isValidRequired(value: String, min: Int, max: Int)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var value = value


                    var min = min


                    var max = max

    
                        if(value == 
                                    null
                                 || value.length < min || value.length > max)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}


open fun isValidRequiredNumber(value: String, min: Int, max: Int)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var value = value


                    var min = min


                    var max = max

    
                        if(this.isEmpty(value) || value.length < min || value.length > max)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                                    }
                                

    
                        if(!this.isNumber(value))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}


open fun isValidNotRequired(value: String, min: Int, max: Int)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var value = value


                    var min = min


                    var max = max

    
                        if(value != 
                                    null
                                )
                        
                                    {
                                    
    
                        if(value.length < min || value.length > max)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                                    }
                                

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}


open fun isValidNotRequiredNumber(value: String, min: Int, max: Int)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var value = value


                    var min = min


                    var max = max

    
                        if(value != 
                                    null
                                )
                        
                                    {
                                    
    
                        if(value.compareTo(stringUtil!!.NULL_STRING) == 0 || value.length < min || value.length > max)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                                    }
                                

    
                        if(!this.isNumber(value))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                                    }
                                

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}


open fun isEmpty(string: String)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var string = string

    
                        if(string != 
                                    null
                                 && string.compareTo(stringUtil!!.NULL_STRING) != 0 && string.compareTo(stringUtil!!.EMPTY_STRING) != 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                        }
                            
}


}
                
            

