
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
        
import org.allbinary.logic.NullUtil
import org.allbinary.string.CommonSeps
import org.allbinary.logic.string.StringMaker
import org.allbinary.media.graphics.geography.map.GeographicMapCellPosition
import org.allbinary.media.graphics.geography.map.SimpleGeographicMapCellPositionFactory
import org.allbinary.string.CommonLabels

open public class PathFindingNode
            : Object
         {
        

    var parent: Any = NullUtil.getInstance()!!.NULL_OBJECT

    var geographicMapCellPosition: GeographicMapCellPosition = SimpleGeographicMapCellPositionFactory.NULL_GEOGRAPHIC_MAP_CELL_POSITION
public constructor (parent: Any, geographicMapCellPosition: GeographicMapCellPosition)
            : super()
        {
    //var parent = parent
    //var geographicMapCellPosition = geographicMapCellPosition
this.parent= parent
this.setGeographicMapCellPositionP(geographicMapCellPosition)

    
                        if(this.geographicMapCellPosition == SimpleGeographicMapCellPositionFactory.NULL_GEOGRAPHIC_MAP_CELL_POSITION)
                        
                                    {
                                    


                            throw Exception("No GeographicMapCellPosition")

                                    }
                                
}


    open fun getParentP()
        //nullable = true from not(false or (false and true)) = true
: PathFindingNode{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return parent as PathFindingNode
}


    open fun setGeographicMapCellPositionP(geographicMapCellPosition: GeographicMapCellPosition)
        //nullable = true from not(false or (false and false)) = true
{
    //var geographicMapCellPosition = geographicMapCellPosition
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

    var pathFindingNode: PathFindingNode = this.getParentP()!!


        while(pathFindingNode != 
                                    null
                                )
        {
stringBuffer!!.append(pathFindingNode!!.geographicMapCellPosition!!.toString())
stringBuffer!!.append(CommonSeps.getInstance()!!.SPACE)
pathFindingNode= pathFindingNode!!.getParentP()
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


}
                
            

