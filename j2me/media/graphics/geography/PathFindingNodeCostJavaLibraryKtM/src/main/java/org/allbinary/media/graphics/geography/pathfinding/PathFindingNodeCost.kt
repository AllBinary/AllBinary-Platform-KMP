
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
        package org.allbinary.media.graphics.geography.pathfinding




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.string.StringMaker
import org.allbinary.string.CommonSeps
import org.allbinary.media.graphics.geography.map.GeographicMapCellPosition
import org.allbinary.string.CommonLabels

open public class PathFindingNodeCost : PathFindingNode
                , Comparable<PathFindingNodeCost> {
        
companion object {
            
    val NULL_PATH_FINDING_NODE_COST_ARRAY_ARRAY: Array<Array<PathFindingNodeCost?>?> = Array(0) { arrayOfNulls<PathFindingNodeCost?>(0) }
                                                            

        }
            
    private val commonSeps: CommonSeps = CommonSeps.getInstance()!!

    var pathFindingNodeCostInfoP: PathFindingNodeCostInfo
public constructor (parent: Any, geographicMapCellPosition: GeographicMapCellPosition, pathFindingNodeCostInfo: PathFindingNodeCostInfo)                        

                            : super(parent, geographicMapCellPosition){
    //var parent = parent
    //var geographicMapCellPosition = geographicMapCellPosition
    //var pathFindingNodeCostInfo = pathFindingNodeCostInfo


                            //For kotlin this is before the body of the constructor.
                    
this.pathFindingNodeCostInfoP= pathFindingNodeCostInfo

    
                        if(this.geographicMapCellPosition == 
                                    null
                                )
                        
                                    {
                                    


                            throw Exception("No GeographicMapCellPosition")

                                    }
                                

    
                        if(this.getPathFindingNodeCostInfo() == 
                                    null
                                )
                        
                                    {
                                    


                            throw Exception("No PathFindingNodeCostInfo")

                                    }
                                
}


    open fun getPathFindingNodeCostInfo()
        //nullable = true from not(false or (false and true)) = true
: PathFindingNodeCostInfo{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return pathFindingNodeCostInfoP
}


    open fun setPathFindingNodeCostInfo(pathFindingNodeCostInfo: PathFindingNodeCostInfo)
        //nullable = true from not(false or (false and false)) = true
{
var pathFindingNodeCostInfo = pathFindingNodeCostInfo
this.pathFindingNodeCostInfoP= pathFindingNodeCostInfo
}


    override fun compareTo(pathFindingNodeCost: PathFindingNodeCost)
        //nullable = true from not(false or (false and false)) = true
: Int{
var pathFindingNodeCost = pathFindingNodeCost



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.pathFindingNodeCostInfoP!!.compareTo(pathFindingNodeCost!!.pathFindingNodeCostInfoP)
}


    override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(this::class.toString()!!)
stringBuffer!!.append(CommonLabels.getInstance()!!.COLON_SEP)
stringBuffer!!.append(this.getPathFindingNodeCostInfo()!!.toString())
stringBuffer!!.append(" Path: ")
stringBuffer!!.append(this.geographicMapCellPosition!!.toString())

    var pathFindingNode: PathFindingNode = this.parent as PathFindingNode


        while(pathFindingNode != 
                                    null
                                )
        {
stringBuffer!!.append(pathFindingNode!!.geographicMapCellPosition!!.toString())
stringBuffer!!.append(commonSeps!!.SPACE)
pathFindingNode= pathFindingNode!!.parent as PathFindingNode
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


}
                
            

