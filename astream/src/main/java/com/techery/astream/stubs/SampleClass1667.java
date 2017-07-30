package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1667 {

    @Ignore    private SampleClass1668 sampleClass;

    public SampleClass1667(){
        sampleClass = new SampleClass1668();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}