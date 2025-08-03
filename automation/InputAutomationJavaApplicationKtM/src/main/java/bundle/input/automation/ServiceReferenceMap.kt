
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
        package bundle.input.automation



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Collection
import java.util.Map
import java.util.Set
import org.osgi.framework.ServiceReference
import org.allbinary.logic.string.StringMaker

open public class ServiceReferenceMap
            : Object
        
                , Map {
        

        companion object {


open fun toString(map: Map)
        //nullable = true from not(false or (true and false)) = true
: String{

                    var map = map

    var stringBuffer: StringMaker = StringMaker()




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}



        }
            
    private var serviceReference: ServiceReference
public constructor        (serviceReference: ServiceReference)
            : super()
        {

                    var serviceReference = serviceReference
this.serviceReference= serviceReference
}


open fun size()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return  -1
}


open fun isEmpty()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


open fun containsKey(key: Any)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var key = key



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


open fun containsValue(value: Any)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var value = value



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


open fun get(key: Any)
        //nullable = true from not(false or (false and false)) = true
: Any{

                    var key = key



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.serviceReference!!.getProperty(key as String)
}


open fun put(key: Any, value: Any)
        //nullable = true from not(false or (false and false)) = true
: Any{

                    var key = key


                    var value = value



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


open fun remove(key: Any)
        //nullable = true from not(false or (false and false)) = true
: Any{

                    var key = key



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


open fun putAll(m: Map)
        //nullable = true from not(false or (false and false)) = true
{

                    var m = m
}


open fun clear()
        //nullable = true from not(false or (false and true)) = true
{}


open fun keySet()
        //nullable = true from not(false or (false and true)) = true
: Set{
    var keyStringArray: Array<String?> = serviceReference!!.getPropertyKeys()!!
            




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


open fun values()
        //nullable = true from not(false or (false and true)) = true
: Collection<Any>{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


open fun entrySet()
        //nullable = true from not(false or (false and true)) = true
: Set{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


}
                
            

