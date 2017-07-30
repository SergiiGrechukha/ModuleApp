package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1571 {

    @Ignore    private SampleClass1572 sampleClass;

    public SampleClass1571(){
        sampleClass = new SampleClass1572();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}