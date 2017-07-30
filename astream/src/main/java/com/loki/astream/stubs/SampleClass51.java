package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass51 {

    @Ignore    private SampleClass52 sampleClass;

    public SampleClass51(){
        sampleClass = new SampleClass52();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}