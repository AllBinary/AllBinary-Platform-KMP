
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
        package org.allbinary.input.automation.module.generic.configuration.profile.actions.script




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
                    
        
import java.awt.Dimension
import java.awt.GridLayout
import javax.swing.GroupLayout
import javax.swing.JPanel
import javax.swing.LayoutStyle

open public class ActionScriptItemJPanel : JPanel {
        
public constructor (){
this.initComponents()
}


    open fun getNewActionScriptInputJPanel()
        //nullable = true from not(false or (false and true)) = true
: JPanel{

                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.newActionScriptInputJPanel
}


    open fun setNewActionScriptInputJPanel(newActionScriptInputJPanel: JPanel)
        //nullable = true from not(false or (false and false)) = true
{
var newActionScriptInputJPanel = newActionScriptInputJPanel
this.newActionScriptInputJPanel= newActionScriptInputJPanel
}


    open fun getRemoveJPanel()
        //nullable = true from not(false or (false and true)) = true
: JPanel{

                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.removeJPanel
}


    open fun setRemoveJPanel(removeJPanel: JPanel)
        //nullable = true from not(false or (false and false)) = true
{
var removeJPanel = removeJPanel
this.removeJPanel= removeJPanel
}


    open fun getScriptItemJPanel()
        //nullable = true from not(false or (false and true)) = true
: JPanel{

                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.scriptItemJPanel
}


    open fun setScriptItemJPanel(scriptItemJPanel: JPanel)
        //nullable = true from not(false or (false and false)) = true
{
var scriptItemJPanel = scriptItemJPanel
this.scriptItemJPanel= scriptItemJPanel
}


    open fun getNewActionScriptConditionJPanel()
        //nullable = true from not(false or (false and true)) = true
: JPanel{

                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.newActionScriptConditionJPanel
}


    open fun setNewActionScriptConditionJPanel(newActionScriptConditionJPanel: JPanel)
        //nullable = true from not(false or (false and false)) = true
{
var newActionScriptConditionJPanel = newActionScriptConditionJPanel
this.newActionScriptConditionJPanel= newActionScriptConditionJPanel
}


    open fun getChildActionScriptConditionJPanel()
        //nullable = true from not(false or (false and true)) = true
: JPanel{

                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.childActionScriptConditionJPanel
}


    open fun setChildActionScriptConditionJPanel(childActionScriptConditionJPanel: JPanel)
        //nullable = true from not(false or (false and false)) = true
{
var childActionScriptConditionJPanel = childActionScriptConditionJPanel
this.childActionScriptConditionJPanel= childActionScriptConditionJPanel
}


    open fun initComponents()
        //nullable = true from not(false or (false and true)) = true
{
this.newActionScriptInputJPanel= JPanel()
this.childActionScriptConditionJPanel= JPanel()
this.newActionScriptConditionJPanel= JPanel()
this.scriptItemJPanel= JPanel()
this.removeJPanel= JPanel()
this.newActionScriptInputJPanel!!.setLayout(GridLayout(1, 0))

    var childActionScriptConditionJPanelLayout: GroupLayout = GroupLayout(this.childActionScriptConditionJPanel)

this.childActionScriptConditionJPanel!!.setLayout(childActionScriptConditionJPanelLayout)
childActionScriptConditionJPanelLayout!!.setHorizontalGroup(childActionScriptConditionJPanelLayout!!.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGap(0, 229, Short.MAX_VALUE))
childActionScriptConditionJPanelLayout!!.setVerticalGroup(childActionScriptConditionJPanelLayout!!.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGap(0, 8, Short.MAX_VALUE))
this.newActionScriptConditionJPanel!!.setLayout(GridLayout(1, 0))
this.scriptItemJPanel!!.setLayout(GridLayout(1, 1))
this.removeJPanel!!.setLayout(GridLayout(1, 1))
this.removeJPanel!!.setMinimumSize(Dimension(30, 20))

    var layout: GroupLayout = GroupLayout(this)

this.setLayout(layout)
layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGroup(layout.createSequentialGroup()!!.addComponent(scriptItemJPanel, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(removeJPanel, GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))!!.addComponent(newActionScriptInputJPanel, GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)!!.addComponent(newActionScriptConditionJPanel, GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)!!.addComponent(childActionScriptConditionJPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGroup(layout.createSequentialGroup()!!.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addComponent(scriptItemJPanel, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)!!.addComponent(removeJPanel, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(childActionScriptConditionJPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(newActionScriptConditionJPanel, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(newActionScriptInputJPanel, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))
}


    private var childActionScriptConditionJPanel: JPanel

    private var newActionScriptConditionJPanel: JPanel

    private var newActionScriptInputJPanel: JPanel

    private var removeJPanel: JPanel

    private var scriptItemJPanel: JPanel

}
                
            

