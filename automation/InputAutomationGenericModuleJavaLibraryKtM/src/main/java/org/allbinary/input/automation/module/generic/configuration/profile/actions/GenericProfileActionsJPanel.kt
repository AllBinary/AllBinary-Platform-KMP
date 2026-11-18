
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
                    
        
import org.allbinary.input.automation.module.DefaultListModelHelper
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings
import java.awt.Dimension
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import javax.swing.GroupLayout
import javax.swing.JButton
import javax.swing.JDialog
import javax.swing.JLabel
import javax.swing.JList
import javax.swing.JPanel
import javax.swing.JScrollPane
import javax.swing.JTextField
import javax.swing.LayoutStyle
import javax.swing.event.ListSelectionEvent
import javax.swing.event.ListSelectionListener

open public class GenericProfileActionsJPanel : JPanel {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private var genericProfileActions: GenericProfileActions

    private var genericProfileActionJPanel: GenericProfileActionJPanel
public constructor (){
this.initComponents()
}


    open fun initComponents()
        //nullable = true from not(false or (false and true)) = true
{
this.newProfileActionJDialog= JDialog()
this.newProfileActionJLabel= JLabel()
this.okNewProfileActionJButton= JButton()
this.newProfileActionJTextField= JTextField()
this.genericProfileActionsJPanel= JPanel()
this.genericProfileActionsJScrollPane= JScrollPane()
this.genericProfileActionsJList= JList()
this.newActionJButton= JButton()
this.deleteActionJButton= JButton()
this.saveJButton= JButton()
this.blankGenericProfileActionJPanel= JPanel()
this.newProfileActionJDialog!!.setMinimumSize(Dimension(250, 150))
this.newProfileActionJDialog!!.setResizable(false)
this.newProfileActionJLabel!!.setText("New Action Name")
this.okNewProfileActionJButton!!.setText("Ok")
this.okNewProfileActionJButton!!.addActionListener(object: ActionListener()
                                {
                                
                                
    open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
okNewProfileActionJButtonActionPerformed(evt)
}

                                }
                            )

    var newProfileActionJDialogLayout: GroupLayout = GroupLayout(this.newProfileActionJDialog!!.getContentPane())

this.newProfileActionJDialog!!.getContentPane()!!.setLayout(newProfileActionJDialogLayout)
newProfileActionJDialogLayout!!.setHorizontalGroup(newProfileActionJDialogLayout!!.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGroup(newProfileActionJDialogLayout!!.createSequentialGroup()!!.addGroup(newProfileActionJDialogLayout!!.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGroup(newProfileActionJDialogLayout!!.createSequentialGroup()!!.addGap(93, 93, 93)!!.addComponent(okNewProfileActionJButton))!!.addGroup(newProfileActionJDialogLayout!!.createSequentialGroup()!!.addGap(75, 75, 75)!!.addComponent(newProfileActionJLabel))!!.addGroup(newProfileActionJDialogLayout!!.createSequentialGroup()!!.addGap(29, 29, 29)!!.addComponent(newProfileActionJTextField, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE)))!!.addContainerGap(34, Short.MAX_VALUE)))
newProfileActionJDialogLayout!!.setVerticalGroup(newProfileActionJDialogLayout!!.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGroup(GroupLayout.Alignment.TRAILING, newProfileActionJDialogLayout!!.createSequentialGroup()!!.addContainerGap()!!.addComponent(newProfileActionJLabel)!!.addGap(21, 21, 21)!!.addComponent(newProfileActionJTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)!!.addComponent(okNewProfileActionJButton)!!.addContainerGap()))
this.genericProfileActionsJPanel!!.setPreferredSize(Dimension(10000, 10000))
this.genericProfileActionsJList!!.addListSelectionListener(object: ListSelectionListener()
                                {
                                
                                
    open override fun valueChanged(evt: ListSelectionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
genericProfileActionsJListValueChanged(evt)
}

                                }
                            )
this.genericProfileActionsJScrollPane!!.setViewportView(this.genericProfileActionsJList)
this.newActionJButton!!.setText("New")
this.newActionJButton!!.addActionListener(object: ActionListener()
                                {
                                
                                
    open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
newActionJButtonActionPerformed(evt)
}

                                }
                            )
this.deleteActionJButton!!.setText("Delete")
this.deleteActionJButton!!.addActionListener(object: ActionListener()
                                {
                                
                                
    open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
deleteActionJButtonActionPerformed(evt)
}

                                }
                            )
this.saveJButton!!.setText("Save")
this.saveJButton!!.addActionListener(object: ActionListener()
                                {
                                
                                
    open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
saveJButtonActionPerformed(evt)
}

                                }
                            )
this.blankGenericProfileActionJPanel!!.setMinimumSize(Dimension(500, 300))

    var blankGenericProfileActionJPanelLayout: GroupLayout = GroupLayout(this.blankGenericProfileActionJPanel)

this.blankGenericProfileActionJPanel!!.setLayout(blankGenericProfileActionJPanelLayout)
blankGenericProfileActionJPanelLayout!!.setHorizontalGroup(blankGenericProfileActionJPanelLayout!!.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGap(0, 500, Short.MAX_VALUE))
blankGenericProfileActionJPanelLayout!!.setVerticalGroup(blankGenericProfileActionJPanelLayout!!.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGap(0, 296, Short.MAX_VALUE))

    var genericProfileActionsJPanelLayout: GroupLayout = GroupLayout(this.genericProfileActionsJPanel)

this.genericProfileActionsJPanel!!.setLayout(genericProfileActionsJPanelLayout)
genericProfileActionsJPanelLayout!!.setHorizontalGroup(genericProfileActionsJPanelLayout!!.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGroup(genericProfileActionsJPanelLayout!!.createSequentialGroup()!!.addComponent(genericProfileActionsJScrollPane, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(blankGenericProfileActionJPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))!!.addGroup(genericProfileActionsJPanelLayout!!.createSequentialGroup()!!.addComponent(newActionJButton)!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(deleteActionJButton)!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(saveJButton)!!.addContainerGap()))
genericProfileActionsJPanelLayout!!.setVerticalGroup(genericProfileActionsJPanelLayout!!.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGroup(genericProfileActionsJPanelLayout!!.createSequentialGroup()!!.addGroup(genericProfileActionsJPanelLayout!!.createParallelGroup(GroupLayout.Alignment.BASELINE)!!.addComponent(newActionJButton)!!.addComponent(deleteActionJButton)!!.addComponent(saveJButton))!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(genericProfileActionsJPanelLayout!!.createParallelGroup(GroupLayout.Alignment.LEADING, false)!!.addComponent(blankGenericProfileActionJPanel, 0, 296, Short.MAX_VALUE)!!.addComponent(genericProfileActionsJScrollPane, GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE))!!.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))

    var layout: GroupLayout = GroupLayout(this)

this.setLayout(layout)
layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGroup(layout.createSequentialGroup()!!.addComponent(genericProfileActionsJPanel, GroupLayout.PREFERRED_SIZE, 596, GroupLayout.PREFERRED_SIZE)!!.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addComponent(genericProfileActionsJPanel, GroupLayout.PREFERRED_SIZE, 336, GroupLayout.PREFERRED_SIZE))
}


    open fun setModel()
        //nullable = true from not(false or (false and true)) = true
{

    var defaultListModelHelper: DefaultListModelHelper = this.getGenericProfileActions()!!.getDefaultListModelHelper()!!


    
                        if(defaultListModelHelper!!.getListModel()!!.getSize() > 0)
                        
                                    {
                                    this.genericProfileActionsJList!!.setModel(defaultListModelHelper!!.getListModel())

                                    }
                                
}


    open fun saveJButtonActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt

        try {
            this.getGenericProfileActions()!!.save()
} catch(e: Exception)
            {
this.logUtil!!.put(this.commonStrings!!.EXCEPTION, this, "saveJButtonActionPerformed", e)
}

}


    open fun updateProfileActionUI(profileActionNameString: String)
        //nullable = true from not(false or (false and false)) = true
{
var profileActionNameString = profileActionNameString
this.blankGenericProfileActionJPanel!!.removeAll()

    
                        if(profileActionNameString != 
                                    null
                                )
                        
                                    {
                                    
    var genericProfileAction: GenericProfileAction = this.getGenericProfileActions()!!.getAction(profileActionNameString)!!

this.setGenericProfileActionJPanel(GenericProfileActionJPanel())
this.getGenericProfileActionJPanel()!!.setGenericProfileAction(genericProfileAction)
this.getGenericProfileActionJPanel()!!.updateProfileActionUI()

    var layout: GroupLayout = this.blankGenericProfileActionJPanel!!.getLayout() as GroupLayout

layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGap(0, 395, Short.MAX_VALUE)!!.addComponent(this.getGenericProfileActionJPanel(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGap(0, 256, Short.MAX_VALUE)!!.addComponent(this.getGenericProfileActionJPanel(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
this.logUtil!!.putF("Setting Configuration Profile Actions JPanel", this, "genericProfileActionsJListValueChanged")

                                    }
                                
}


    open fun genericProfileActionsJListValueChanged(evt: ListSelectionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt

        try {
            
    var profileActionNameString: String = this.genericProfileActionsJList!!.getSelectedValue() as String

this.updateProfileActionUI(profileActionNameString)
} catch(e: Exception)
            {
this.logUtil!!.put(this.commonStrings!!.EXCEPTION, this, "genericProfileActionsJListValueChanged", e)
}

}


    open fun okNewProfileActionJButtonActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt

        try {
            
    var newActionName: String = this.newProfileActionJTextField!!.getText()!!

this.getGenericProfileActions()!!.add(newActionName)
this.setModel()
this.genericProfileActionsJList!!.setSelectedValue(newActionName, true)
this.newProfileActionJDialog!!.setVisible(false)
this.updateProfileActionUI(newActionName)
} catch(e: Exception)
            {
this.logUtil!!.put(this.commonStrings!!.EXCEPTION, this, "okNewProfileActionJButtonActionPerformed", e)
}

}


    open fun deleteActionJButtonActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt

        try {
            
    var anyType: Array<Any?> = this.genericProfileActionsJList!!.getSelectedValues()!!





                        for (index in 0 until anyType!!.size)

        {

    var nextSelectedValueString: String = anyType[index]!! as String

this.getGenericProfileActions()!!.remove(nextSelectedValueString)
}

this.selectFirstElement()
} catch(e: Exception)
            {
this.logUtil!!.put(this.commonStrings!!.EXCEPTION, this, "deleteActionJButtonActionPerformed", e)
}

}


                @Throws(Exception::class)
            
    open fun selectFirstElement()
        //nullable = true from not(false or (false and true)) = true
{
this.setModel()

    
                        if(this.genericProfileActionsJList!!.getModel()!!.getSize() > 0)
                        
                                    {
                                    this.genericProfileActionsJList!!.setSelectedValue(this.genericProfileActionsJList!!.getModel()!!.getElementAt(0), true)
this.updateProfileActionUI(this.genericProfileActionsJList!!.getModel()!!.getElementAt(0) as String)

                                    }
                                
                        else {
                            this.blankGenericProfileActionJPanel!!.removeAll()
this.blankGenericProfileActionJPanel!!.repaint()

                        }
                            
}


    open fun getGenericProfileActionJPanel()
        //nullable = true from not(false or (false and true)) = true
: GenericProfileActionJPanel{

                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.genericProfileActionJPanel
}


    open fun setGenericProfileActionJPanel(genericProfileActionJPanel: GenericProfileActionJPanel)
        //nullable = true from not(false or (false and false)) = true
{
var genericProfileActionJPanel = genericProfileActionJPanel
this.genericProfileActionJPanel= genericProfileActionJPanel
}


    open fun getGenericProfileActions()
        //nullable = true from not(false or (false and true)) = true
: GenericProfileActions{

                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.genericProfileActions
}


    open fun setGenericProfileActions(genericProfileActions: GenericProfileActions)
        //nullable = true from not(false or (false and false)) = true
{
var genericProfileActions = genericProfileActions
this.genericProfileActions= genericProfileActions
}


    open fun newActionJButtonActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
this.newProfileActionJDialog!!.setVisible(true)
}


    private var blankGenericProfileActionJPanel: JPanel

    private var deleteActionJButton: JButton

    private var genericProfileActionsJList: JList

    private var genericProfileActionsJPanel: JPanel

    private var genericProfileActionsJScrollPane: JScrollPane

    private var newActionJButton: JButton

    private var newProfileActionJDialog: JDialog

    private var newProfileActionJLabel: JLabel

    private var newProfileActionJTextField: JTextField

    private var okNewProfileActionJButton: JButton

    private var saveJButton: JButton

}
                
            

