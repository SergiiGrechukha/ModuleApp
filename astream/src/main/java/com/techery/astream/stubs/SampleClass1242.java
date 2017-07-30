package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1242 {

    @Ignore    private SampleClass1243 sampleClass;

    public SampleClass1242(){
        sampleClass = new SampleClass1243();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}