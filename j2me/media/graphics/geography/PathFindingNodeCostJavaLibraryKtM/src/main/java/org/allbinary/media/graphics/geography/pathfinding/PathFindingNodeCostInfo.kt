
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
import org.allbinary.string.CommonLabels

open public class PathFindingNodeCostInfo
            : Object
        
                , Comparable<PathFindingNodeCostInfo> {
        

    private val pathFindingNodeCostInfoData: PathFindingNodeCostInfoData = PathFindingNodeCostInfoData.getInstance()!!

    var costFromStartP: Long

    var costToEndP: Long

    var totalCostP: Long= 0
public constructor (costFromStart: Long, costToGoal: Long)
            : super()
        {
    //var costFromStart = costFromStart
    //var costToGoal = costToGoal
this.costFromStartP= costFromStart
this.costToEndP= costToGoal
this.setTotalCost()
}


    open fun setCostToEnd(costToEnd: Long)
        //nullable = true from not(false or (false and false)) = true
{
    //var costToEnd = costToEnd
this.costToEndP= costToEnd
}


    open fun setTotalCost(totalCost: Long)
        //nullable = true from not(false or (false and false)) = true
{
    //var totalCost = totalCost
this.totalCostP= totalCost
}


                @Throws(Exception::class)
            
    open fun setTotalCost()
        //nullable = true from not(false or (false and true)) = true
{
this.totalCostP= costFromStartP +costToEndP

    
                        if(this.totalCostP > pathFindingNodeCostInfoData!!.MAX_NODE_COST)
                        
                                    {
                                    


                            throw Exception("Max Cost Exceeded")

                                    }
                                
}


    open fun setCostFromStart(cost: Long)
        //nullable = true from not(false or (false and false)) = true
{
    //var cost = cost
this.costFromStartP= cost
}


    open fun addCostFromStart(cost: Long)
        //nullable = true from not(false or (false and false)) = true
{
    //var cost = cost
this.costFromStartP += cost
}


    override fun compareTo(pathFindingNodeCostInfo: PathFindingNodeCostInfo)
        //nullable = true from not(false or (false and false)) = true
: Int{
var pathFindingNodeCostInfo = pathFindingNodeCostInfo



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return java.lang.Long.compare(this.totalCostP, pathFindingNodeCostInfo!!.totalCostP)
}


    override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(this::class.toString()!!)
stringBuffer!!.append(CommonLabels.getInstance()!!.COLON_SEP)
stringBuffer!!.append("CostFromStart: ")
stringBuffer!!.append(this.costFromStartP)
stringBuffer!!.append(" CostToEnd: ")
stringBuffer!!.append(this.costToEndP)
stringBuffer!!.append(" TotalCost: ")
stringBuffer!!.append(this.totalCostP)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


}
                
            

