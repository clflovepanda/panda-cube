package com.panda.cube.core.cube;

public abstract class AbstractCube {

    protected AbstractCube lastCube;

    protected AbstractCube nextCube;

    protected AbstractCube subCubeHead;

    protected AbstractCube parentCube;

    public void mountCube(AbstractCube cube) {
        this.mountNextCube(cube);
        cube.mountLastCube(this);
    }

    public void mountNextCube(AbstractCube cube) {
        this.nextCube = cube;
    }

    public void mountLastCube(AbstractCube cube) {
        this.lastCube = cube;
    }

}
