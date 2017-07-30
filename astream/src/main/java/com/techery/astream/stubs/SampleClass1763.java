package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1763 {

    @Ignore    private SampleClass1764 sampleClass;

    public SampleClass1763(){
        sampleClass = new SampleClass1764();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}