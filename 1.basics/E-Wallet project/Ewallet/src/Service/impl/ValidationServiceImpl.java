package Service.impl;

import Service.ValidationServices;

public class ValidationServiceImpl implements ValidationServices {

    @Override
    public boolean isAgeValid(float age) {
        return age >= 18;
    }

}
