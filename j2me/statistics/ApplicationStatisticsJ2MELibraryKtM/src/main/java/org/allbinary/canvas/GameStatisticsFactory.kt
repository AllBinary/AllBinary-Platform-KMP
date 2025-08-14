
        /* Generated Code Do Not Modify */
        package org.allbinary.canvas



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.string.StringMaker

open public class GameStatisticsFactory : BaseGameStatistics {
        

        companion object {
            
    private val instance: GameStatisticsFactory = GameStatisticsFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: GameStatisticsFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
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
this.stringBuffer!!.append(
                            "Old Stats Cleared")

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
                
            

