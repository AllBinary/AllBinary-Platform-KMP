
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
        package org.allbinary.graphics.j2me.workarea




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.dom.DomHelper
import org.allbinary.util.BasicArrayList
import org.w3c.dom.Document
import org.w3c.dom.Node
import org.w3c.dom.NodeList

open public class WorkAreaDom
            : Object
         {
        
companion object {
            
    val WORKAREA: String = "workArea"

    val NAME: String = "name"

    val FRAMES: String = "frames"

        }
            
    private var name: String

    private var canvasNodeList: BasicArrayList
public constructor (document: Document)
            : super()
        {
var document = document

    var workAreaNodeList: NodeList = document.getElementsByTagName(this.WORKAREA)!!


    
                        if(workAreaNodeList != 
                                    null
                                )
                        
                                    {
                                    
    var numberOfworkAreas: Int = workAreaNodeList!!.getLength()!!


    
                        if(numberOfworkAreas == 1)
                        
                                    {
                                    
    var numberOfNodes: Int = workAreaNodeList!!.getLength()!!


    var nameNode: Node = DomHelper.getInstance()!!.searchNodeList(this.NAME, workAreaNodeList!!.item(0)!!.getChildNodes())!!


    var nameTextNode: Node = nameNode!!.getFirstChild()!!

this.name= nameTextNode!!.getNodeValue()

                                    }
                                
                        else {
                            


                            throw Exception("Wrong Number of WorkAreas: " +numberOfworkAreas)

                        }
                            
this.canvasNodeList= DomHelper.getInstance()!!.getChildrenWithoutTextNodes(this.FRAMES, workAreaNodeList!!.item(0)!!.getChildNodes())

                                    }
                                
                        else {
                            


                            throw Exception("workArea Node Not Found")

                        }
                            
}


    open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.name
}


    open fun getCanvasNodes()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.canvasNodeList
}


}
                
            

