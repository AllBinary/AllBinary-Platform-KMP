
        /* Generated Code Do Not Modify */
        package org.allbinary.game.input.analog




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.util.BasicArrayList

open public class AnalogLocationInputFactory
            : Object
         {
        
companion object {
            
    private val instance: AnalogLocationInputFactory = AnalogLocationInputFactory()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: AnalogLocationInputFactory{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    private val list: BasicArrayList = BasicArrayList()
private constructor ()
            : super()
        {
}


    open fun addPlayer(playerInputId: Int)
        //nullable = true from not(false or (false and false)) = true
{
var playerInputId = playerInputId

    var analogLocationInput: AnalogLocationInput = AnalogLocationInput.NULL_ANALOG_LOCATION_INPUT


    
                        if(playerInputId < list.size())
                        
                                    {
                                    analogLocationInput= list.get(playerInputId) as AnalogLocationInput

                                    }
                                

    
                        if(analogLocationInput == AnalogLocationInput.NULL_ANALOG_LOCATION_INPUT)
                        
                                    {
                                    analogLocationInput= AnalogLocationInput(playerInputId)
list.add(analogLocationInput)

                                    }
                                
}


    open fun getInstance(playerInputId: Int)
        //nullable =  from not(true or (false and false)) = 
: AnalogLocationInput{
var playerInputId = playerInputId



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return list.get(playerInputId) as AnalogLocationInput
}


    open fun getList()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return list
}


}
                
            

