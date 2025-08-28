
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
        package org.allbinary.game.input




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil

open public class Input
            : Object
         {
        

    private var id: Int= 0

    private var name: String = StringUtil.getInstance()!!.EMPTY_STRING
public constructor        (id: Int, name: String)
            : super()
        

        Updates for KMP build        
        {
var id = id
var name = name
this.setId(id)
this.setName(name)
}


open fun getId()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return id
}


open fun setId(key: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var key = key
this.id= key
}


open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return name
}


open fun setName(keyName: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var keyName = keyName
this.name= keyName
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String

        Updates for KMP build        
        {

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("Name: ")
stringBuffer!!.append(this.getName())
stringBuffer!!.append(" Id: ")
stringBuffer!!.append(this.getId())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


}
                
            

