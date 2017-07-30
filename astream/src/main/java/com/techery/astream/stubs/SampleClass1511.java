package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1511 {

    @Ignore    private SampleClass1512 sampleClass;

    public SampleClass1511(){
        sampleClass = new SampleClass1512();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}