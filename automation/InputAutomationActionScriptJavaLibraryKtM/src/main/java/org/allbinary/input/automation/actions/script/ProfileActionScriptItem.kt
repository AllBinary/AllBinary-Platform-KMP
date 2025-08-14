
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
        package org.allbinary.input.automation.actions.script




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import javax.swing
import javax.swing.tree.DefaultMutableTreeNode
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings
import org.w3c.dom.Node

open public class ProfileActionScriptItem : DefaultMutableTreeNode
                , ProfileActionScriptItemInterface
                , ActionListener {
        

        companion object {
            
    private val EDIT: String = "Edit"

    val DELETE: String = "Delete"

    val NEW_CONDITION: String = "New Condition"

    val NEW_INPUT: String = "New Input"

    val NEW_OUTPUT: String = "New Output"

    val NEW_COLOR_AT: String = "Color At"

    val NEW_TIME_INTERVAL: String = "Time Interval"

    val NEW_ALWAYS: String = "Always On/Off"

    val NEW_KEY_INPUT: String = "Key"

    val NEW_MOUSE_INPUT: String = "Mouse"

    val NEW_JOYSTICK_INPUT: String = "Joystick"

    val NEW_IMAGE_OUTPUT: String = "Image"

        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    private var jPopupMenu: JPopupMenu
public constructor        (label: String, node: Node)                        

                            : super(label){

                    var label = label


                    var node = node


                            //For kotlin this is before the body of the constructor.
                    
this.init()
logUtil!!.put("Label: " +label, this, this.commonStrings!!.CONSTRUCTOR)
}

public constructor        (label: String)                        

                            : super(label){

                    var label = label


                            //For kotlin this is before the body of the constructor.
                    
this.init()
logUtil!!.put("Label: " +label, this, this.commonStrings!!.CONSTRUCTOR)
}


open fun init()
        //nullable = true from not(false or (false and true)) = true
{setJPopupMenu(JPopupMenu())

    var jMenuItemEdit: JMenuItem = JMenuItem(EDIT)


    var jMenuItemDelete: JMenuItem = JMenuItem(DELETE)

jMenuItemEdit!!.addActionListener(this)
jMenuItemDelete!!.addActionListener(this)
getJPopupMenu()!!.add(jMenuItemEdit)
getJPopupMenu()!!.add(jMenuItemDelete)
}


                @Throws(Exception::class)
            
open fun process(frame: Long)
        //nullable = true from not(false or (false and false)) = true
{

                    var frame = frame



                            throw RuntimeException()
}


open fun getJPopupMenu()
        //nullable = true from not(false or (false and true)) = true
: JPopupMenu{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return jPopupMenu
}


open fun showDialog()
        //nullable = true from not(false or (false and true)) = true
{


                            throw RuntimeException()
}


open fun actionPerformed(actionEvent: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var actionEvent = actionEvent

    
                        if(actionEvent!!.getActionCommand()!!.compareTo(EDIT) == 0)
                        
                                    {
                                    this.showDialog()

                                    }
                                
}


open fun setJPopupMenu(jPopupMenu: JPopupMenu)
        //nullable = true from not(false or (false and false)) = true
{

                    var jPopupMenu = jPopupMenu
this.jPopupMenu= jPopupMenu
}


}
                
            

