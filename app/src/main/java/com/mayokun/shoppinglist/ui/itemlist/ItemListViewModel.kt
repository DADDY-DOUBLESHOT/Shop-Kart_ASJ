package com.mayokun.shoppinglist.ui.itemlist

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.mayokun.shoppinglist.data.database.ShoppingItemDao
import com.mayokun.shoppinglist.data.model.ShoppingItem
import kotlinx.coroutines.*
import android.widget.Button

/**
 * Created by Mayokun Adeniyi on 09/12/2019.
 */

class ItemListViewModel(
    val database: ShoppingItemDao,
    application: Application) : AndroidViewModel(application){

    //Get all items in the DB
    val shoppingItems = database.getAllItems()


    /**
     * This is triggered when the edit button is pressed and then the save button on the popup dialog is pressed.
     * Takes in an edited item and sends it to the [update] function to be updated in
     * the database on a coroutine.
     * @param item the edited item to be sent to the [update] function
     */
    fun onEditButtonClicked(item: ShoppingItem){
        viewModelScope.launch {
            update(item)

        }
    }

    /**
     * This is a coroutine friendly method that updates an item in the database.
     * It takes in an [item] and calls the update function of the [database] DAO.
     * @param item the edited item whose values are to be updated
     */
    private suspend fun update(item: ShoppingItem){
        withContext(Dispatchers.IO){
            database.update(item)
        }
    }


    /**
     * This is called when the delete button is pressed. It takes in an [item]
     * to be deleted and sends it to the [delete] function below.
     * @param item the item to be deleted.
     */
    fun onDeleteButtonPressed(item: ShoppingItem){
        viewModelScope.launch {
                delete(item)
        }
    }

    /**
     * This is a coroutine friendly method that takes in an [item] and deletes it from
     * the database on a background thread.
     * @param item the item to be deleted.
     */
    private suspend fun delete(item: ShoppingItem){
        withContext(Dispatchers.IO){
            database.deleteItem(item)
        }
    }

}