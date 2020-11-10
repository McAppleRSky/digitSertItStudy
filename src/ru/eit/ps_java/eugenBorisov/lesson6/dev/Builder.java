package ru.eit.ps_java.eugenBorisov.lesson6.dev;

import ru.eit.ps_java.eugenBorisov.lesson6.dev.shape.BuildMaterial;
import ru.eit.ps_java.eugenBorisov.lesson6.dev.type.plaine.Suply;

public class Builder{

    private BuildMaterial[] buildMaterials;

    public Builder(Suply suply) {
        buildMaterials = new BuildMaterial[] {suply.getCircle(), suply.getSquare(), suply.getTriangle()};
    }
    public void build(){
        for(BuildMaterial buildMaterial:buildMaterials)
            buildMaterial.build();
    }
}
