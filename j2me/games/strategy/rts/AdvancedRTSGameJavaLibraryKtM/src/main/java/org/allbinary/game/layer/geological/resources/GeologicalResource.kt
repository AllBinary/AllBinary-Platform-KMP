
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2006 AllBinary 
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
        package org.allbinary.game.layer.geological.resources




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class GeologicalResource
            : Object
         {
        

    private var total: Int= 0

    private var initTotal: Int
public constructor        (initTotal: Int)
            : super()
        {
var initTotal = initTotal
this.initTotal= initTotal
this.init()
}


open fun init()
        //nullable = true from not(false or (false and true)) = true
{
this.setTotal(this.initTotal)
}


open fun add(value: Int)
        //nullable = true from not(false or (false and false)) = true
{
var value = value

    
                        if(this.getTotal() +value > Integer.MAX_VALUE)
                        
                                    {
                                    this.setTotal(.MAX_VALUE())

                                    }
                                
                        else {
                            this.setTotal(this.getTotal() +value)

                        }
                            
}


open fun remove(value: Int)
        //nullable = true from not(false or (false and false)) = true
{
var value = value

    
                        if(this.getTotal() -value < 0)
                        
                                    {
                                    this.setTotal(0)

                                    }
                                
                        else {
                            this.setTotal(this.getTotal() -value)

                        }
                            
}


open fun getTotal()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return total
}


open fun setTotal(total: Int)
        //nullable = true from not(false or (false and false)) = true
{
var total = total
this.total= total
}


}
                
            

