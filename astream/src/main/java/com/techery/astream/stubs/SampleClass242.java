package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass242 {

    @Ignore    private SampleClass243 sampleClass;

    public SampleClass242(){
        sampleClass = new SampleClass243();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}