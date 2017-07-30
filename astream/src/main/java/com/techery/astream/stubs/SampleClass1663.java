package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1663 {

    @Ignore    private SampleClass1664 sampleClass;

    public SampleClass1663(){
        sampleClass = new SampleClass1664();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}