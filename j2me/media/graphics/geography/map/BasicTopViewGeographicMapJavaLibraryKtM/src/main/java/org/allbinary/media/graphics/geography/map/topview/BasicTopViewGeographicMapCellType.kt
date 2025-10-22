
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
        package org.allbinary.media.graphics.geography.map.topview




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonSeps
import org.allbinary.string.CommonStrings
import org.allbinary.logic.string.StringMaker
import org.allbinary.media.graphics.geography.map.GeographicMapCellType
import org.allbinary.media.graphics.geography.map.GeographicMapCellTypeFactory
import org.allbinary.media.graphics.geography.map.racetrack.RaceTrackGeographicMapCellType
import org.allbinary.util.BasicArrayList

open public class BasicTopViewGeographicMapCellType
            : Object
         {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    val name: String

    val cost: Int

    private val types: IntArray
public constructor (name: String, type: Int, cost: Int)
            : super()
        {
    //var name = name
    //var type = type
    //var cost = cost

    
                        if(GeographicMapCellTypeFactory.getInstance()!!.getGeographicMapCellTypeArray()[type] == 
                                    null
                                )
                        
                                    {
                                    RaceTrackGeographicMapCellType(name, type, cost)

                                    }
                                
                        else {
                            
                        }
                            
this.name= name
this.cost= cost
this.types= IntArray(1)
this.types[0]= type
}

public constructor (name: String, types: IntArray, cost: Int)
            : super()
        {
    //var name = name
    //var types = types
    //var cost = cost

    var size: Int = types.size
                


    var type: Int= 0





                        for (index in 0 until size)

        {
type= types[index]!!

    
                        if(GeographicMapCellTypeFactory.getInstance()!!.getGeographicMapCellTypeArray()[type] == 
                                    null
                                )
                        
                                    {
                                    RaceTrackGeographicMapCellType(name, type, cost)

                                    }
                                
                        else {
                            
                        }
                            
}

this.name= name
this.types= types
this.cost= cost
}

public constructor (name: String, types: BasicArrayList, cost: Int)
            : super()
        {
    //var name = name
    //var types = types
    //var cost = cost

    var size: Int = types.size()!!


    var typeArray: IntArray = IntArray(size)


    var type: Int= 0





                        for (index in 0 until size)

        {
type= get = types.get(index)get as Integer
get.
                    toInt()

    
                        if(GeographicMapCellTypeFactory.getInstance()!!.getGeographicMapCellTypeArray()[type] == 
                                    null
                                )
                        
                                    {
                                    RaceTrackGeographicMapCellType(name, type, cost)

                                    }
                                
                        else {
                            
                        }
                            
typeArray[index]= type
}

this.name= name
this.cost= cost
this.types= typeArray
}


    open fun isType(type: GeographicMapCellType)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
    //var type = type



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.isType(type.getType())
}


    open fun isType(type: Int)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
    //var type = type

    var size: Int = types.size
                





                        for (index in 0 until size)

        {

    
                        if(types[index] == type)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


    open fun getTypes()
        //nullable = true from not(false or (false and true)) = true
: IntArray{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.types
}


    override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{

    var stringMaker: StringMaker = StringMaker()


    var size: Int = types.size
                





                        for (index in 0 until size)

        {
stringMaker!!.append(types[index]!!)!!.append(CommonSeps.getInstance()!!.COMMA)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringMaker!!.toString()
}


}
                
            

