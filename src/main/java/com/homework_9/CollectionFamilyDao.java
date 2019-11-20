package com.homework_9;

import java.util.ArrayList;
import java.util.List;

public final class CollectionFamilyDao implements FamilyDao {

    private List<Family> families = new ArrayList<>(0);

    @Override
    public List<Family> getAllFamilies() {
        return families;
    }

    @Override
    public Family getFamilyByIndex(int index) {
        try {
            return families.get(index);
        } catch (Exception e) {
            System.out.println("No family found " + e.getMessage());
            return null;
        }
    }

    @Override
    public boolean deleteFamily(int index) {
        try {
            families.remove(index);
            return true;
        } catch (Exception e) {
            System.out.println("No family found " + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean deleteFamily(Family family) {
        int index = 0;
        for (Family item : families) {
            if (item.equals(family)) {
                deleteFamily(index);
                return true;
            }
            index++;
        }

        return false;

    }

    @Override
    public void saveFamily(Family family) {
        int index = 0;
        for (Family item : families) {
            if (item.equals(family)) {
                families.set(index, family);
                System.out.println("One family was updated");
                return;
            }
            index++;
        }
        families.add(family);
        System.out.println("One family was added");
    }

    @Override
    public void deleteAllFamilies(){
        families.clear();
    }
}
