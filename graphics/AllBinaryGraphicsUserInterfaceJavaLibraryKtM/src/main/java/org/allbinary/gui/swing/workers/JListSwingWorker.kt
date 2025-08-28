
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
        package org.allbinary.gui.swing.workers




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.swing

open public class JListSwingWorker : SwingWorker {
        

    private var jList: JList

    private var listModel: ListModel
public constructor        (jList: JList, listModel: ListModel)

        Updates for KMP build        
        {
var jList = jList
var listModel = listModel
this.setJList(jList)
this.setListModel(listModel)
}


open fun doInBackground()
        //nullable = true from not(false or (false and true)) = true
: Any

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


open fun done()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
this.getJList()!!.setModel(this.getListModel())
}


open fun getJList()
        //nullable = true from not(false or (false and true)) = true
: JList

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return jList
}


open fun setJList(jList: JList)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var jList = jList
this.jList= jList
}


open fun getListModel()
        //nullable = true from not(false or (false and true)) = true
: ListModel

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return listModel
}


open fun setListModel(listModel: ListModel)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var listModel = listModel
this.listModel= listModel
}


}
                
            

