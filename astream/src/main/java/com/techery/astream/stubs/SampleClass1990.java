package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1990 {

    @Ignore    private SampleClass1991 sampleClass;

    public SampleClass1990(){
        sampleClass = new SampleClass1991();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}