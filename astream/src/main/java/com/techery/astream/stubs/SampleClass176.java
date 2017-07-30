package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass176 {

    @Ignore    private SampleClass177 sampleClass;

    public SampleClass176(){
        sampleClass = new SampleClass177();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}