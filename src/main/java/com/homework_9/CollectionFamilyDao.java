package com.homework_9;

import java.util.ArrayList;
import java.util.List;

public class CollectionFamilyDao implements FamilyDao {

    private List<Family> families = new ArrayList<>(0);

    @Override
    public List<Family> getAllFamilies() {
        return families;
    }

    @Override
    public Family getFamilyByIndex(int index) {
        return null;
    }

    @Override
    public boolean deleteFamily(int index) {
        return false;
    }

    @Override
    public boolean deleteFamily(Family family) {
        return false;
    }

    @Override
    public void saveFamily(Family family) {
        families.add(family);
    }
}
