package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.LibraryItem;
import com.twu.biblioteca.model.User;

import java.util.List;

public class Library {
    private List<LibraryItem> availableItems;
    private List<LibraryItem> checkedOutItems;


    public Library(List<LibraryItem> availableItems, List<LibraryItem> checkedOutItems) {
        this.availableItems = availableItems;
        this.checkedOutItems = checkedOutItems;
    }

    public String listAvailableItems() {
        String itemList = "";
        for (LibraryItem item : availableItems) {
            itemList += item;
        }
        return itemList;
    }

    public String  listCheckedOutItems() {
        String itemList = "";
        for (LibraryItem item : checkedOutItems) {
            itemList += item;
        }
        return itemList;
    }

    public boolean performCheckOut(String itemName, User user) {
        LibraryItem requiredItem = this.searchItemByName(itemName, availableItems);
        if (requiredItem == null || (checkedOutItems.contains(requiredItem))) {
            return false;
        }
        requiredItem.issueTo(user);
        return (checkedOutItems.add(requiredItem) && availableItems.remove(requiredItem));
    }

    public boolean performReturn(String itemName, User user) {
        LibraryItem requiredItem = this.searchItemByName(itemName, checkedOutItems);
        if (requiredItem == null || availableItems.contains(requiredItem)) {
            return false;
        }
        if (requiredItem.resetOwnership(user)) {
            return (availableItems.add(requiredItem) && checkedOutItems.remove(requiredItem));
        }
        return false;
    }

    private LibraryItem searchItemByName(String itemName, List<LibraryItem> availableItems) {
        LibraryItem searchedItem = null;
        for (LibraryItem item : availableItems) {
            if (item.hasTitle(itemName)) {
                searchedItem = item;
                break;
            }
        }
        return searchedItem;
    }

    public String returnUsersHavingBooks() {
        String users = "";
        for (LibraryItem item : checkedOutItems) {
            users += item.getCurrentHolder() + item.toString();
        }
        return users;
    }
}
