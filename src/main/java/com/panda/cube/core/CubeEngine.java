package com.panda.cube.core;

import com.panda.cube.core.data.StandardDataManager;

public class CubeEngine {

    public static final CubeEngine instance = new CubeEngine();

    private CubeEngine() {}

    public void init() {
        StandardDataManager.instance.init();
    }

}
