package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1432 {

    @Ignore    private SampleClass1433 sampleClass;

    public SampleClass1432(){
        sampleClass = new SampleClass1433();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}