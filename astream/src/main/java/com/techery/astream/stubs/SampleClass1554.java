package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1554 {

    @Ignore    private SampleClass1555 sampleClass;

    public SampleClass1554(){
        sampleClass = new SampleClass1555();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}