package com.foulkes.model;

/**
 * Created by danfoulkes on 08/07/2017.
 * Project: carFactory
 * Package: com.foulkes.model
 */
public class Engine {

    Double engineSize;

    public void setEngineSize(Double engineSize) {
        this.engineSize = engineSize;
    }

    public Double getEngineSize() {
        return engineSize;
    }

    public static class Builder {
        Double engineSize;

        public Builder withEngineSize(Double size){
            this.engineSize = size;
            return this;
        }

        public Engine build(){
            Engine engine = new Engine();
            engine.setEngineSize(engineSize);
            return engine;
        }
    }
}
