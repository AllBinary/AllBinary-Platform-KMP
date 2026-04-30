
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

open public class GenericProfileActionJPanel : javax.swing.JPanel {
        

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

    var layout: javax.swing.GroupLayout = this.blankProfileActionScriptJPanel!!.getLayout() as javax.swing.GroupLayout

layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGap(0, 395, Short.MAX_VALUE)!!.addComponent(this.getGenericProfileActionScriptJPanel(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGap(0, 256, Short.MAX_VALUE)!!.addComponent(this.getGenericProfileActionScriptJPanel(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
this.genericProfileActionScriptJScrollPane= javax.swing.JScrollPane()
this.blankProfileActionScriptJPanel= javax.swing.JPanel()
this.ifJLabel= javax.swing.JLabel()
this.newColorAtJButton= javax.swing.JButton()
this.newTimeIntervalJButton= javax.swing.JButton()
this.newAlwaysJButton= javax.swing.JButton()
setMinimumSize(java.awt.Dimension(440, 275))
setPreferredSize(java.awt.Dimension(440, 275))
this.genericProfileActionScriptJScrollPane!!.setPreferredSize(java.awt.Dimension(474, 270))
this.blankProfileActionScriptJPanel!!.setMinimumSize(java.awt.Dimension(400, 200))

    var blankProfileActionScriptJPanelLayout: javax.swing.GroupLayout = javax.swing.GroupLayout(this.blankProfileActionScriptJPanel)

this.blankProfileActionScriptJPanel!!.setLayout(blankProfileActionScriptJPanelLayout)
blankProfileActionScriptJPanelLayout!!.setHorizontalGroup(blankProfileActionScriptJPanelLayout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGap(0, 9996, Short.MAX_VALUE))
blankProfileActionScriptJPanelLayout!!.setVerticalGroup(blankProfileActionScriptJPanelLayout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGap(0, 9967, Short.MAX_VALUE))
this.genericProfileActionScriptJScrollPane!!.setViewportView(this.blankProfileActionScriptJPanel)
this.ifJLabel!!.setText("Conditions:")
this.newColorAtJButton!!.setText("Color Range At")
this.newColorAtJButton!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
    open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
newColorAtJButtonActionPerformed(evt)
}

                                }
                            )
this.newTimeIntervalJButton!!.setText("Time Interval")
this.newTimeIntervalJButton!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
    open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
newTimeIntervalJButtonActionPerformed(evt)
}

                                }
                            )
this.newAlwaysJButton!!.setText("Always On/Off")
this.newAlwaysJButton!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
    open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
newAlwaysJButtonActionPerformed(evt)
}

                                }
                            )

    var layout: javax.swing.GroupLayout = javax.swing.GroupLayout(this)

this.setLayout(layout)
layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGroup(layout.createSequentialGroup()!!.addComponent(ifJLabel)!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(newColorAtJButton)!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(newTimeIntervalJButton)!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(newAlwaysJButton)!!.addContainerGap(61, Short.MAX_VALUE))!!.addComponent(genericProfileActionScriptJScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE))
layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGroup(layout.createSequentialGroup()!!.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)!!.addComponent(ifJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)!!.addComponent(newColorAtJButton)!!.addComponent(newTimeIntervalJButton)!!.addComponent(newAlwaysJButton))!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(genericProfileActionScriptJScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)))
}


    open fun newTimeIntervalJButtonActionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
this.logUtil!!.putF("New Time Interval Action Condition", this, "newTimeIntervalJButtonActionPerformed")
this.getGenericProfileAction()!!.getGenericProfileActionScript()!!.addCondition(TimeIntervalActionScriptCondition() as ProfileActionScriptConditionInterface)
this.updateProfileActionUI()
}


    open fun newAlwaysJButtonActionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
this.logUtil!!.putF("New EveryTime Action Condition", this, "newEveryTimeJButtonActionPerformed")
this.getGenericProfileAction()!!.getGenericProfileActionScript()!!.addCondition(AlwaysActionScriptCondition() as ProfileActionScriptConditionInterface)
this.updateProfileActionUI()
}


    open fun newColorAtJButtonActionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
this.logUtil!!.putF("New Color At Action Condition", this, "newColorAtJButtonActionPerformed")
this.getGenericProfileAction()!!.getGenericProfileActionScript()!!.addCondition(ColorAtActionScriptCondition() as ProfileActionScriptConditionInterface)
this.updateProfileActionUI()
}


    private var blankProfileActionScriptJPanel: javax.swing.JPanel

    private var genericProfileActionScriptJScrollPane: javax.swing.JScrollPane

    private var ifJLabel: javax.swing.JLabel

    private var newAlwaysJButton: javax.swing.JButton

    private var newColorAtJButton: javax.swing.JButton

    private var newTimeIntervalJButton: javax.swing.JButton

}
                
            

