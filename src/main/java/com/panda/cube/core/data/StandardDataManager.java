package com.panda.cube.core.data;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class StandardDataManager {

    private Map<String, Class<? extends StandardData>> standardDataDefineMapping = new HashMap<String, Class<? extends StandardData>>();

    public static final StandardDataManager instance = new StandardDataManager();

    private StandardDataManager() {}

    public void init() {

    }

    public void register(Class<? extends StandardData> standardDataClass) {
        DefData defData = standardDataClass.getAnnotation(DefData.class);
        if (defData == null) {
            throw new IllegalArgumentException("This param standardDataClass without annotation of DefData.");
        }
        String standardDataName = defData.value();
        standardDataDefineMapping.put(standardDataName, standardDataClass);
    }

}
