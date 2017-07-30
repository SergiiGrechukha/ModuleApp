package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1726 {

    @Ignore    private SampleClass1727 sampleClass;

    public SampleClass1726(){
        sampleClass = new SampleClass1727();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}