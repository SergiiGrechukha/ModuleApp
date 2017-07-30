package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1695 {

    @Ignore    private SampleClass1696 sampleClass;

    public SampleClass1695(){
        sampleClass = new SampleClass1696();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}