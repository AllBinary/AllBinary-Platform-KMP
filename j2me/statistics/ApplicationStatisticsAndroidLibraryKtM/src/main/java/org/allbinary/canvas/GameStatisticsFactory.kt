
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
        package org.allbinary.canvas




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.string.StringMaker

open public class GameStatisticsFactory : AndroidGameStatistics {
        

        companion object {
            
    private val SINGLETON: AndroidGameStatistics = GameStatisticsFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: AndroidGameStatistics{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SINGLETON
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    private var stringBuffer: StringMaker = StringMaker()
override fun add(string: String)
        //nullable = true from not(false or (false and false)) = true
{
var string = string

    
                        if(this.stringBuffer!!.length() > 12000)
                        
                                    {
                                    this.stringBuffer!!.delete(0, this.stringBuffer!!.length())
this.stringBuffer!!.append("Old Stats Cleared")

                                    }
                                
this.stringBuffer!!.append(string)
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StringMaker().
                            append(super.toString())!!.append(this.stringBuffer!!.toString())!!.toString()
}


}
                
            

