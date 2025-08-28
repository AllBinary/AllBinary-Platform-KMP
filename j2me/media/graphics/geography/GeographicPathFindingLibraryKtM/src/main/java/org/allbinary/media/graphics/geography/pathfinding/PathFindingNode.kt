
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
        package org.allbinary.media.graphics.geography.pathfinding




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.string.CommonSeps
import org.allbinary.logic.string.StringMaker
import org.allbinary.media.graphics.geography.map.GeographicMapCellPosition
import org.allbinary.string.CommonLabels

open public class PathFindingNode
            : Object
         {
        

    var parent: PathFindingNode

    var geographicMapCellPosition: GeographicMapCellPosition
public constructor        (parent: PathFindingNode, geographicMapCellPosition: GeographicMapCellPosition)
            : super()
        {
var parent = parent
var geographicMapCellPosition = geographicMapCellPosition
this.setParent(parent)
this.setGeographicMapCellPosition(geographicMapCellPosition)

    
                        if(this.geographicMapCellPosition == 
                                    null
                                )
                        
                                    {
                                    


                            throw Exception("No GeographicMapCellPosition")

                                    }
                                
}


open fun setParent(parent: PathFindingNode)
        //nullable = true from not(false or (false and false)) = true
{
var parent = parent
this.parent= parent
}


open fun setGeographicMapCellPosition(geographicMapCellPosition: GeographicMapCellPosition)
        //nullable = true from not(false or (false and false)) = true
{
var geographicMapCellPosition = geographicMapCellPosition
this.geographicMapCellPosition= geographicMapCellPosition
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(this::class.toString()!!)
stringBuffer!!.append(CommonLabels.getInstance()!!.COLON_SEP)
stringBuffer!!.append(" Path: ")
stringBuffer!!.append(this.geographicMapCellPosition!!.toString())

    var pathFindingNode: PathFindingNode = this.parent


        while(pathFindingNode != 
                                    null
                                )
        {
stringBuffer!!.append(pathFindingNode!!.geographicMapCellPosition!!.toString())
stringBuffer!!.append(CommonSeps.getInstance()!!.SPACE)
pathFindingNode= pathFindingNode!!.parent
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


}
                
            

