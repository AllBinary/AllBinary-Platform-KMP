
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
        package org.allbinary.input.automation.module.generic.configuration.profile.actions




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
                    
        
import org.allbinary.input.automation.actions.script.JTreeInterfaceFactory
import org.allbinary.input.automation.actions.script.condition.AlwaysActionScriptCondition
import org.allbinary.input.automation.actions.script.condition.ColorAtActionScriptCondition
import org.allbinary.input.automation.actions.script.condition.ProfileActionScriptConditionInterface
import org.allbinary.input.automation.actions.script.condition.TimeIntervalActionScriptCondition
import org.allbinary.input.automation.module.generic.configuration.profile.actions.script.GenericProfileActionScriptJPanel
import org.allbinary.logic.communication.log.LogUtil
import java.awt.Dimension
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import javax.swing.GroupLayout
import javax.swing.JButton
import javax.swing.JLabel
import javax.swing.JPanel
import javax.swing.JScrollPane
import javax.swing.LayoutStyle

open public class GenericProfileActionJPanel : JPanel {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private var genericProfileAction: GenericProfileAction

    private var genericProfileActionScriptJPanel: GenericProfileActionScriptJPanel
public constructor (){
this.initComponents()
}


    open fun updateProfileActionUI()
        //nullable = true from not(false or (false and true)) = true
{
this.blankProfileActionScriptJPanel!!.removeAll()

    var genericProfileActionScriptJPanel: GenericProfileActionScriptJPanel = GenericProfileActionScriptJPanel()

JTreeInterfaceFactory.getInstance()!!.set(genericProfileActionScriptJPanel)
this.setGenericProfileActionScriptJPanel(genericProfileActionScriptJPanel)
this.getGenericProfileActionScriptJPanel()!!.setGenericProfileActionScript(this.getGenericProfileAction()!!.getGenericProfileActionScript())
this.getGenericProfileActionScriptJPanel()!!.updateJTree()

    var layout: GroupLayout = this.blankProfileActionScriptJPanel!!.getLayout() as GroupLayout

layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGap(0, 395, Short.MAX_VALUE)!!.addComponent(this.getGenericProfileActionScriptJPanel(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGap(0, 256, Short.MAX_VALUE)!!.addComponent(this.getGenericProfileActionScriptJPanel(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
this.logUtil!!.putF("Updated UI", this, "updateUI")
}


    open fun getGenericProfileAction()
        //nullable = true from not(false or (false and true)) = true
: GenericProfileAction{

                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.genericProfileAction
}


    open fun setGenericProfileAction(genericProfileAction: GenericProfileAction)
        //nullable = true from not(false or (false and false)) = true
{
var genericProfileAction = genericProfileAction
this.genericProfileAction= genericProfileAction
}


    open fun getGenericProfileActionScriptJPanel()
        //nullable = true from not(false or (false and true)) = true
: GenericProfileActionScriptJPanel{

                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.genericProfileActionScriptJPanel
}


    open fun setGenericProfileActionScriptJPanel(genericProfileActionScriptJPanel: GenericProfileActionScriptJPanel)
        //nullable = true from not(false or (false and false)) = true
{
var genericProfileActionScriptJPanel = genericProfileActionScriptJPanel
this.genericProfileActionScriptJPanel= genericProfileActionScriptJPanel
}


    open fun initComponents()
        //nullable = true from not(false or (false and true)) = true
{
this.genericProfileActionScriptJScrollPane= JScrollPane()
this.blankProfileActionScriptJPanel= JPanel()
this.ifJLabel= JLabel()
this.newColorAtJButton= JButton()
this.newTimeIntervalJButton= JButton()
this.newAlwaysJButton= JButton()
setMinimumSize(Dimension(440, 275))
setPreferredSize(Dimension(440, 275))
this.genericProfileActionScriptJScrollPane!!.setPreferredSize(Dimension(474, 270))
this.blankProfileActionScriptJPanel!!.setMinimumSize(Dimension(400, 200))

    var blankProfileActionScriptJPanelLayout: GroupLayout = GroupLayout(this.blankProfileActionScriptJPanel)

this.blankProfileActionScriptJPanel!!.setLayout(blankProfileActionScriptJPanelLayout)
blankProfileActionScriptJPanelLayout!!.setHorizontalGroup(blankProfileActionScriptJPanelLayout!!.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGap(0, 9996, Short.MAX_VALUE))
blankProfileActionScriptJPanelLayout!!.setVerticalGroup(blankProfileActionScriptJPanelLayout!!.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGap(0, 9967, Short.MAX_VALUE))
this.genericProfileActionScriptJScrollPane!!.setViewportView(this.blankProfileActionScriptJPanel)
this.ifJLabel!!.setText("Conditions:")
this.newColorAtJButton!!.setText("Color Range At")
this.newColorAtJButton!!.addActionListener(object: ActionListener()
                                {
                                
                                
    open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
newColorAtJButtonActionPerformed(evt)
}

                                }
                            )
this.newTimeIntervalJButton!!.setText("Time Interval")
this.newTimeIntervalJButton!!.addActionListener(object: ActionListener()
                                {
                                
                                
    open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
newTimeIntervalJButtonActionPerformed(evt)
}

                                }
                            )
this.newAlwaysJButton!!.setText("Always On/Off")
this.newAlwaysJButton!!.addActionListener(object: ActionListener()
                                {
                                
                                
    open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
newAlwaysJButtonActionPerformed(evt)
}

                                }
                            )

    var layout: GroupLayout = GroupLayout(this)

this.setLayout(layout)
layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGroup(layout.createSequentialGroup()!!.addComponent(ifJLabel)!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(newColorAtJButton)!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(newTimeIntervalJButton)!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(newAlwaysJButton)!!.addContainerGap(61, Short.MAX_VALUE))!!.addComponent(genericProfileActionScriptJScrollPane, GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE))
layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGroup(layout.createSequentialGroup()!!.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)!!.addComponent(ifJLabel, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)!!.addComponent(newColorAtJButton)!!.addComponent(newTimeIntervalJButton)!!.addComponent(newAlwaysJButton))!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(genericProfileActionScriptJScrollPane, GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)))
}


    open fun newTimeIntervalJButtonActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
this.logUtil!!.putF("New Time Interval Action Condition", this, "newTimeIntervalJButtonActionPerformed")
this.getGenericProfileAction()!!.getGenericProfileActionScript()!!.addCondition(TimeIntervalActionScriptCondition() as ProfileActionScriptConditionInterface)
this.updateProfileActionUI()
}


    open fun newAlwaysJButtonActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
this.logUtil!!.putF("New EveryTime Action Condition", this, "newEveryTimeJButtonActionPerformed")
this.getGenericProfileAction()!!.getGenericProfileActionScript()!!.addCondition(AlwaysActionScriptCondition() as ProfileActionScriptConditionInterface)
this.updateProfileActionUI()
}


    open fun newColorAtJButtonActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
this.logUtil!!.putF("New Color At Action Condition", this, "newColorAtJButtonActionPerformed")
this.getGenericProfileAction()!!.getGenericProfileActionScript()!!.addCondition(ColorAtActionScriptCondition() as ProfileActionScriptConditionInterface)
this.updateProfileActionUI()
}


    private var blankProfileActionScriptJPanel: JPanel

    private var genericProfileActionScriptJScrollPane: JScrollPane

    private var ifJLabel: JLabel

    private var newAlwaysJButton: JButton

    private var newColorAtJButton: JButton

    private var newTimeIntervalJButton: JButton

}
                
            

