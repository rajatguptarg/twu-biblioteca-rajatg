package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.LibraryItem;

import java.util.List;

public class Library {
    private List<LibraryItem> availableItems;
    private List<LibraryItem> checkedOutItems;


    public Library(List<LibraryItem> availableItems, List<LibraryItem> checkedOutItems) {
        this.availableItems = availableItems;
        this.checkedOutItems = checkedOutItems;
    }

    public List<LibraryItem> listAvailableItems() {
        return availableItems;
    }

    public List<LibraryItem> listCheckedOutItems() {
        return checkedOutItems;
    }

    public boolean performCheckOut(String itemName) {
        LibraryItem requiredItem = this.searchItemByName(itemName, availableItems);
        if (requiredItem == null || (checkedOutItems.contains(requiredItem))) {
            return false;
        }
        return (checkedOutItems.add(requiredItem) && availableItems.remove(requiredItem));
    }

    public boolean performReturn(String itemName) {
        LibraryItem requiredItem = this.searchItemByName(itemName, checkedOutItems);
        if (requiredItem == null || availableItems.contains(requiredItem)) {
            return false;
        }
        return (availableItems.add(requiredItem) && checkedOutItems.remove(requiredItem));
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
}
