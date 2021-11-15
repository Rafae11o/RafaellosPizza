package com.company.Wrapper;

public class WrapperAdapter implements Wrapper{

    private SpecialGlovoWrapper specialGlovoWrapper;

    public WrapperAdapter(SpecialGlovoWrapper specialGlovoWrapper) {
        this.specialGlovoWrapper = specialGlovoWrapper;
    }

    @Override
    public void wrap() {
        specialGlovoWrapper.wrapInSpecialGlovoWrapper();
    }
}
