package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1676 {

    @Ignore    private SampleClass1677 sampleClass;

    public SampleClass1676(){
        sampleClass = new SampleClass1677();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}